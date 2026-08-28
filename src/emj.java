import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class emj extends emk {
   private static final Codec<Either<alc, epe>> a = Codec.of(emj::a, alc.a.map(Either::left));
   public static final MapCodec<emj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, emj::new));
   protected final Either<alc, epe> c;
   protected final jn<epc> d;
   protected final Optional<eoo> e;

   private static <T> DataResult<T> a(Either<alc, epe> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alc> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alc.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends emj> RecordCodecBuilder<E, jn<epc>> b() {
      return epd.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends emj> RecordCodecBuilder<E, Optional<eoo>> c() {
      return eoo.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends emj> RecordCodecBuilder<E, Either<alc, epe>> d() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected emj(Either<alc, epe> $$0, jn<epc> $$1, emm.a $$2, Optional<eoo> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public ki a(epf $$0, dnx $$1) {
      epe $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private epe a(epf $$0) {
      return (epe)this.c.map($$0::a, Function.identity());
   }

   public List<epe.c> a(epf $$0, je $$1, dnx $$2, boolean $$3) {
      epe $$4 = this.a($$0);
      List<epe.c> $$5 = $$4.a($$1, new epa().a($$2), dhl.pa, $$3);
      List<epe.c> $$6 = Lists.newArrayList();

      for (epe.c $$7 : $$5) {
         uf $$8 = $$7.c();
         if ($$8 != null) {
            dvy $$9 = dvy.valueOf($$8.l("mode"));
            if ($$9 == dvy.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<epe.c> a(epf $$0, je $$1, dnx $$2, azl $$3) {
      epe $$4 = this.a($$0);
      ObjectArrayList<epe.c> $$5 = $$4.a($$1, new epa().a($$2), dhl.pb, true);
      ad.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<epe.c> $$0) {
      $$0.sort(Comparator.<epe.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eku a(epf $$0, je $$1, dnx $$2) {
      epe $$3 = this.a($$0);
      return $$3.b(new epa().a($$2), $$1);
   }

   @Override
   public boolean a(epf $$0, dfd $$1, dfb $$2, dwl $$3, je $$4, je $$5, dnx $$6, eku $$7, azl $$8, eoo $$9, boolean $$10) {
      epe $$11 = this.a($$0);
      epa $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (epe.c $$14 : epe.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected epa a(dnx $$0, eku $$1, eoo $$2, boolean $$3) {
      epa $$4 = new epa();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eof.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(eol.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public eml<?> a() {
      return eml.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
