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

public class dwe extends dwf {
   private static final Codec<Either<aer, dyr>> a = Codec.of(dwe::a, aer.a.map(Either::left));
   public static final Codec<dwe> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwe::new));
   protected final Either<aer, dyr> c;
   protected final he<dyp> d;

   private static <T> DataResult<T> a(Either<aer, dyr> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aer> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aer.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dwe> RecordCodecBuilder<E, he<dyp>> b() {
      return dyq.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dwe> RecordCodecBuilder<E, Either<aer, dyr>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dwe(Either<aer, dyr> $$0, he<dyp> $$1, dwh.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public hz a(dys $$0, cyx $$1) {
      dyr $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dyr a(dys $$0) {
      return (dyr)this.c.map($$0::a, Function.identity());
   }

   public List<dyr.c> a(dys $$0, gu $$1, cyx $$2, boolean $$3) {
      dyr $$4 = this.a($$0);
      List<dyr.c> $$5 = $$4.a($$1, new dyn().a($$2), csm.pa, $$3);
      List<dyr.c> $$6 = Lists.newArrayList();

      for (dyr.c $$7 : $$5) {
         qr $$8 = $$7.c();
         if ($$8 != null) {
            dgj $$9 = dgj.valueOf($$8.l("mode"));
            if ($$9 == dgj.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dyr.c> a(dys $$0, gu $$1, cyx $$2, aru $$3) {
      dyr $$4 = this.a($$0);
      ObjectArrayList<dyr.c> $$5 = $$4.a($$1, new dyn().a($$2), csm.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public duq a(dys $$0, gu $$1, cyx $$2) {
      dyr $$3 = this.a($$0);
      return $$3.b(new dyn().a($$2), $$1);
   }

   @Override
   public boolean a(dys $$0, cqf $$1, cqd $$2, dgw $$3, gu $$4, gu $$5, cyx $$6, duq $$7, aru $$8, boolean $$9) {
      dyr $$10 = this.a($$0);
      dyn $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (dyr.c $$13 : dyr.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dyn a(cyx $$0, duq $$1, boolean $$2) {
      dyn $$3 = new dyn();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dxt.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dxz.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dwg<?> a() {
      return dwg.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
