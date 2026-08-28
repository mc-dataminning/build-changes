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

public class epq extends epr {
   private static final Comparator<esl.a> a = Comparator.comparingInt(esl.a::g).reversed();
   private static final Codec<Either<alz, esl>> g = Codec.of(epq::a, alz.a.map(Either::left));
   public static final MapCodec<epq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, epq::new));
   protected final Either<alz, esl> c;
   protected final jq<esj> d;
   protected final Optional<erv> e;

   private static <T> DataResult<T> a(Either<alz, esl> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alz> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alz.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends epq> RecordCodecBuilder<E, jq<esj>> b() {
      return esk.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends epq> RecordCodecBuilder<E, Optional<erv>> c() {
      return erv.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends epq> RecordCodecBuilder<E, Either<alz, esl>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected epq(Either<alz, esl> $$0, jq<esj> $$1, ept.a $$2, Optional<erv> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kl a(esm $$0, drb $$1) {
      esl $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private esl a(esm $$0) {
      return (esl)this.c.map($$0::a, Function.identity());
   }

   public List<esl.d> a(esm $$0, jh $$1, drb $$2, boolean $$3) {
      esl $$4 = this.a($$0);
      List<esl.d> $$5 = $$4.a($$1, new esh().a($$2), dkn.pv, $$3);
      List<esl.d> $$6 = Lists.newArrayList();

      for (esl.d $$7 : $$5) {
         ux $$8 = $$7.c();
         if ($$8 != null) {
            dzd $$9 = dzd.valueOf($$8.l("mode"));
            if ($$9 == dzd.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<esl.a> a(esm $$0, jh $$1, drb $$2, bam $$3) {
      List<esl.a> $$4 = this.a($$0).a($$1, $$2);
      ae.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<esl.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public eob a(esm $$0, jh $$1, drb $$2) {
      esl $$3 = this.a($$0);
      return $$3.b(new esh().a($$2), $$1);
   }

   @Override
   public boolean a(esm $$0, dif $$1, did $$2, dzq $$3, jh $$4, jh $$5, drb $$6, eob $$7, bam $$8, erv $$9, boolean $$10) {
      esl $$11 = this.a($$0);
      esh $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (esl.d $$14 : esl.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected esh a(drb $$0, eob $$1, erv $$2, boolean $$3) {
      esh $$4 = new esh();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(erm.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(ers.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public eps<?> a() {
      return eps.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
