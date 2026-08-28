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

public class etu extends etv {
   private static final Comparator<ewp.a> a = Comparator.comparingInt(ewp.a::g).reversed();
   private static final Codec<Either<alr, ewp>> g = Codec.of(etu::a, alr.a.map(Either::left));
   public static final MapCodec<etu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, etu::new));
   protected final Either<alr, ewp> c;
   protected final jg<ewn> d;
   protected final Optional<evz> e;

   private static <T> DataResult<T> a(Either<alr, ewp> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alr> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alr.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends etu> RecordCodecBuilder<E, jg<ewn>> b() {
      return ewo.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends etu> RecordCodecBuilder<E, Optional<evz>> c() {
      return evz.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends etu> RecordCodecBuilder<E, Either<alr, ewp>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected etu(Either<alr, ewp> $$0, jg<ewn> $$1, etx.a $$2, Optional<evz> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kb a(ewq $$0, dui $$1) {
      ewp $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ewp a(ewq $$0) {
      return (ewp)this.c.map($$0::a, Function.identity());
   }

   public List<ewp.d> a(ewq $$0, iw $$1, dui $$2, boolean $$3) {
      ewp $$4 = this.a($$0);
      List<ewp.d> $$5 = $$4.a($$1, new ewl().a($$2), dnq.pG, $$3);
      List<ewp.d> $$6 = Lists.newArrayList();

      for (ewp.d $$7 : $$5) {
         ua $$8 = $$7.c();
         if ($$8 != null) {
            eda $$9 = $$8.<eda>a("mode", eda.e).orElseThrow();
            if ($$9 == eda.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ewp.a> a(ewq $$0, iw $$1, dui $$2, bai $$3) {
      List<ewp.a> $$4 = this.a($$0).a($$1, $$2);
      ag.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<ewp.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public esf a(ewq $$0, iw $$1, dui $$2) {
      ewp $$3 = this.a($$0);
      return $$3.b(new ewl().a($$2), $$1);
   }

   @Override
   public boolean a(ewq $$0, dli $$1, dlf $$2, edo $$3, iw $$4, iw $$5, dui $$6, esf $$7, bai $$8, evz $$9, boolean $$10) {
      ewp $$11 = this.a($$0);
      ewl $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (ewp.d $$14 : ewp.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ewl a(dui $$0, esf $$1, evz $$2, boolean $$3) {
      ewl $$4 = new ewl();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(evq.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(evw.b);
      }

      this.d.a().a().forEach($$4::a);
      this.g().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public etw<?> a() {
      return etw.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }

   @VisibleForTesting
   public alr e() {
      return (alr)this.c.orThrow();
   }
}
