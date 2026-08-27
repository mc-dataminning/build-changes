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

public class dwo extends dwp {
   private static final Codec<Either<aex, dzb>> a = Codec.of(dwo::a, aex.a.map(Either::left));
   public static final Codec<dwo> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwo::new));
   protected final Either<aex, dzb> c;
   protected final hg<dyz> d;

   private static <T> DataResult<T> a(Either<aex, dzb> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aex> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aex.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dwo> RecordCodecBuilder<E, hg<dyz>> b() {
      return dza.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dwo> RecordCodecBuilder<E, Either<aex, dzb>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dwo(Either<aex, dzb> $$0, hg<dyz> $$1, dwr.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public ib a(dzc $$0, czh $$1) {
      dzb $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dzb a(dzc $$0) {
      return (dzb)this.c.map($$0::a, Function.identity());
   }

   public List<dzb.c> a(dzc $$0, gw $$1, czh $$2, boolean $$3) {
      dzb $$4 = this.a($$0);
      List<dzb.c> $$5 = $$4.a($$1, new dyx().a($$2), csw.pa, $$3);
      List<dzb.c> $$6 = Lists.newArrayList();

      for (dzb.c $$7 : $$5) {
         qx $$8 = $$7.c();
         if ($$8 != null) {
            dgt $$9 = dgt.valueOf($$8.l("mode"));
            if ($$9 == dgt.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dzb.c> a(dzc $$0, gw $$1, czh $$2, asc $$3) {
      dzb $$4 = this.a($$0);
      ObjectArrayList<dzb.c> $$5 = $$4.a($$1, new dyx().a($$2), csw.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public dva a(dzc $$0, gw $$1, czh $$2) {
      dzb $$3 = this.a($$0);
      return $$3.b(new dyx().a($$2), $$1);
   }

   @Override
   public boolean a(dzc $$0, cqp $$1, cqn $$2, dhg $$3, gw $$4, gw $$5, czh $$6, dva $$7, asc $$8, boolean $$9) {
      dzb $$10 = this.a($$0);
      dyx $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (dzb.c $$13 : dzb.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dyx a(czh $$0, dva $$1, boolean $$2) {
      dyx $$3 = new dyx();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dyd.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dyj.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dwq<?> a() {
      return dwq.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
