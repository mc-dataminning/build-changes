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

public class eqn extends eqo {
   private static final Comparator<eti.a> a = Comparator.comparingInt(eti.a::g).reversed();
   private static final Codec<Either<ald, eti>> g = Codec.of(eqn::a, ald.a.map(Either::left));
   public static final MapCodec<eqn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eqn::new));
   protected final Either<ald, eti> c;
   protected final js<etg> d;
   protected final Optional<ess> e;

   private static <T> DataResult<T> a(Either<ald, eti> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ald> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ald.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eqn> RecordCodecBuilder<E, js<etg>> b() {
      return eth.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eqn> RecordCodecBuilder<E, Optional<ess>> c() {
      return ess.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends eqn> RecordCodecBuilder<E, Either<ald, eti>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eqn(Either<ald, eti> $$0, js<etg> $$1, eqq.a $$2, Optional<ess> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kn a(etj $$0, drm $$1) {
      eti $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private eti a(etj $$0) {
      return (eti)this.c.map($$0::a, Function.identity());
   }

   public List<eti.d> a(etj $$0, jj $$1, drm $$2, boolean $$3) {
      eti $$4 = this.a($$0);
      List<eti.d> $$5 = $$4.a($$1, new ete().a($$2), dkw.pC, $$3);
      List<eti.d> $$6 = Lists.newArrayList();

      for (eti.d $$7 : $$5) {
         tw $$8 = $$7.c();
         if ($$8 != null) {
            dzw $$9 = dzw.valueOf($$8.l("mode"));
            if ($$9 == dzw.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<eti.a> a(etj $$0, jj $$1, drm $$2, azs $$3) {
      List<eti.a> $$4 = this.a($$0).a($$1, $$2);
      af.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<eti.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public eoy a(etj $$0, jj $$1, drm $$2) {
      eti $$3 = this.a($$0);
      return $$3.b(new ete().a($$2), $$1);
   }

   @Override
   public boolean a(etj $$0, dio $$1, dil $$2, eak $$3, jj $$4, jj $$5, drm $$6, eoy $$7, azs $$8, ess $$9, boolean $$10) {
      eti $$11 = this.a($$0);
      ete $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (eti.d $$14 : eti.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ete a(drm $$0, eoy $$1, ess $$2, boolean $$3) {
      ete $$4 = new ete();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(esj.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(esp.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public eqp<?> a() {
      return eqp.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
