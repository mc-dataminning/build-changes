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

public class epr extends eps {
   private static final Comparator<esm.a> a = Comparator.comparingInt(esm.a::g).reversed();
   private static final Codec<Either<alz, esm>> g = Codec.of(epr::a, alz.a.map(Either::left));
   public static final MapCodec<epr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, epr::new));
   protected final Either<alz, esm> c;
   protected final jq<esk> d;
   protected final Optional<erw> e;

   private static <T> DataResult<T> a(Either<alz, esm> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alz> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alz.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends epr> RecordCodecBuilder<E, jq<esk>> b() {
      return esl.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends epr> RecordCodecBuilder<E, Optional<erw>> c() {
      return erw.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends epr> RecordCodecBuilder<E, Either<alz, esm>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected epr(Either<alz, esm> $$0, jq<esk> $$1, epu.a $$2, Optional<erw> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kl a(esn $$0, drc $$1) {
      esm $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private esm a(esn $$0) {
      return (esm)this.c.map($$0::a, Function.identity());
   }

   public List<esm.d> a(esn $$0, jh $$1, drc $$2, boolean $$3) {
      esm $$4 = this.a($$0);
      List<esm.d> $$5 = $$4.a($$1, new esi().a($$2), dko.pv, $$3);
      List<esm.d> $$6 = Lists.newArrayList();

      for (esm.d $$7 : $$5) {
         ux $$8 = $$7.c();
         if ($$8 != null) {
            dze $$9 = dze.valueOf($$8.l("mode"));
            if ($$9 == dze.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<esm.a> a(esn $$0, jh $$1, drc $$2, bam $$3) {
      List<esm.a> $$4 = this.a($$0).a($$1, $$2);
      ae.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<esm.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public eoc a(esn $$0, jh $$1, drc $$2) {
      esm $$3 = this.a($$0);
      return $$3.b(new esi().a($$2), $$1);
   }

   @Override
   public boolean a(esn $$0, dig $$1, die $$2, dzr $$3, jh $$4, jh $$5, drc $$6, eoc $$7, bam $$8, erw $$9, boolean $$10) {
      esm $$11 = this.a($$0);
      esi $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (esm.d $$14 : esm.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected esi a(drc $$0, eoc $$1, erw $$2, boolean $$3) {
      esi $$4 = new esi();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(ern.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(ert.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public ept<?> a() {
      return ept.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
