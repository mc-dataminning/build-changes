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

public class emy extends emz {
   private static final Codec<Either<alh, ept>> a = Codec.of(emy::a, alh.a.map(Either::left));
   public static final MapCodec<emy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, emy::new));
   protected final Either<alh, ept> c;
   protected final jp<epr> d;
   protected final Optional<epd> e;

   private static <T> DataResult<T> a(Either<alh, ept> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alh> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alh.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends emy> RecordCodecBuilder<E, jp<epr>> b() {
      return eps.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends emy> RecordCodecBuilder<E, Optional<epd>> c() {
      return epd.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends emy> RecordCodecBuilder<E, Either<alh, ept>> d() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected emy(Either<alh, ept> $$0, jp<epr> $$1, enb.a $$2, Optional<epd> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kk a(epu $$0, dol $$1) {
      ept $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ept a(epu $$0) {
      return (ept)this.c.map($$0::a, Function.identity());
   }

   public List<ept.c> a(epu $$0, jg $$1, dol $$2, boolean $$3) {
      ept $$4 = this.a($$0);
      List<ept.c> $$5 = $$4.a($$1, new epp().a($$2), dia.pa, $$3);
      List<ept.c> $$6 = Lists.newArrayList();

      for (ept.c $$7 : $$5) {
         uj $$8 = $$7.c();
         if ($$8 != null) {
            dwn $$9 = dwn.valueOf($$8.l("mode"));
            if ($$9 == dwn.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ept.c> a(epu $$0, jg $$1, dol $$2, azr $$3) {
      ept $$4 = this.a($$0);
      ObjectArrayList<ept.c> $$5 = $$4.a($$1, new epp().a($$2), dia.pb, true);
      ad.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ept.c> $$0) {
      $$0.sort(Comparator.<ept.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public elj a(epu $$0, jg $$1, dol $$2) {
      ept $$3 = this.a($$0);
      return $$3.b(new epp().a($$2), $$1);
   }

   @Override
   public boolean a(epu $$0, dfs $$1, dfq $$2, dxa $$3, jg $$4, jg $$5, dol $$6, elj $$7, azr $$8, epd $$9, boolean $$10) {
      ept $$11 = this.a($$0);
      epp $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (ept.c $$14 : ept.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected epp a(dol $$0, elj $$1, epd $$2, boolean $$3) {
      epp $$4 = new epp();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eou.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(epa.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public ena<?> a() {
      return ena.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
