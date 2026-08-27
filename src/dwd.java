import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dwd extends dwe {
   private static final Codec<Either<aep, dyq>> a = Codec.of(dwd::a, aep.a.map(Either::left));
   public static final Codec<dwd> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwd::new));
   protected final Either<aep, dyq> c;
   protected final hf<dyo> d;

   private static <T> DataResult<T> a(Either<aep, dyq> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aep> $$3 = $$0.left();
      return !$$3.isPresent() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aep.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dwd> RecordCodecBuilder<E, hf<dyo>> b() {
      return dyp.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dwd> RecordCodecBuilder<E, Either<aep, dyq>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dwd(Either<aep, dyq> $$0, hf<dyo> $$1, dwg.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public ia a(dyr $$0, cyw $$1) {
      dyq $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dyq a(dyr $$0) {
      return (dyq)this.c.map($$0::a, Function.identity());
   }

   public List<dyq.c> a(dyr $$0, gv $$1, cyw $$2, boolean $$3) {
      dyq $$4 = this.a($$0);
      List<dyq.c> $$5 = $$4.a($$1, new dym().a($$2), csl.pa, $$3);
      List<dyq.c> $$6 = Lists.newArrayList();

      for (dyq.c $$7 : $$5) {
         qs $$8 = $$7.c();
         if ($$8 != null) {
            dgi $$9 = dgi.valueOf($$8.l("mode"));
            if ($$9 == dgi.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dyq.c> a(dyr $$0, gv $$1, cyw $$2, art $$3) {
      dyq $$4 = this.a($$0);
      ObjectArrayList<dyq.c> $$5 = $$4.a($$1, new dym().a($$2), csl.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public dup a(dyr $$0, gv $$1, cyw $$2) {
      dyq $$3 = this.a($$0);
      return $$3.b(new dym().a($$2), $$1);
   }

   @Override
   public boolean a(dyr $$0, cqe $$1, cqc $$2, dgv $$3, gv $$4, gv $$5, cyw $$6, dup $$7, art $$8, boolean $$9) {
      dyq $$10 = this.a($$0);
      dym $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (dyq.c $$13 : dyq.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dym a(cyw $$0, dup $$1, boolean $$2) {
      dym $$3 = new dym();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dxs.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dxy.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dwf<?> a() {
      return dwf.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
