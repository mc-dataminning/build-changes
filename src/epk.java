import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class epk extends epl {
   private static final Comparator<esf.a> a = Comparator.comparingInt(esf.a::g).reversed();
   private static final Codec<Either<alp, esf>> g = Codec.of(epk::a, alp.a.map(Either::left));
   public static final MapCodec<epk> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, epk::new));
   protected final Either<alp, esf> c;
   protected final jq<esd> d;
   protected final Optional<erp> e;

   private static <T> DataResult<T> a(Either<alp, esf> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alp> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alp.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends epk> RecordCodecBuilder<E, jq<esd>> b() {
      return ese.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends epk> RecordCodecBuilder<E, Optional<erp>> c() {
      return erp.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends epk> RecordCodecBuilder<E, Either<alp, esf>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected epk(Either<alp, esf> $$0, jq<esd> $$1, epn.a $$2, Optional<erp> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kl a(esg $$0, dqv $$1) {
      esf $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private esf a(esg $$0) {
      return (esf)this.c.map($$0::a, Function.identity());
   }

   public List<esf.d> a(esg $$0, jh $$1, dqv $$2, boolean $$3) {
      esf $$4 = this.a($$0);
      List<esf.d> $$5 = $$4.a($$1, new esb().a($$2), dkf.pC, $$3);
      List<esf.d> $$6 = Lists.newArrayList();

      for (esf.d $$7 : $$5) {
         um $$8 = $$7.c();
         if ($$8 != null) {
            dyx $$9 = dyx.valueOf($$8.l("mode"));
            if ($$9 == dyx.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<esf.a> a(esg $$0, jh $$1, dqv $$2, bac $$3) {
      List<esf.a> $$4 = this.a($$0).a($$1, $$2);
      ae.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<esf.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public env a(esg $$0, jh $$1, dqv $$2) {
      esf $$3 = this.a($$0);
      return $$3.b(new esb().a($$2), $$1);
   }

   @Override
   public boolean a(esg $$0, dhx $$1, dhv $$2, dzk $$3, jh $$4, jh $$5, dqv $$6, env $$7, bac $$8, erp $$9, boolean $$10) {
      esf $$11 = this.a($$0);
      esb $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (esf.d $$14 : esf.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected esb a(dqv $$0, env $$1, erp $$2, boolean $$3) {
      esb $$4 = new esb();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(erg.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(erm.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public epm<?> a() {
      return epm.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
