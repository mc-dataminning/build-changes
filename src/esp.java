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

public class esp extends esq {
   private static final Comparator<evk.a> a = Comparator.comparingInt(evk.a::g).reversed();
   private static final Codec<Either<alg, evk>> g = Codec.of(esp::a, alg.a.map(Either::left));
   public static final MapCodec<esp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, esp::new));
   protected final Either<alg, evk> c;
   protected final jf<evi> d;
   protected final Optional<euu> e;

   private static <T> DataResult<T> a(Either<alg, evk> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alg> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alg.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends esp> RecordCodecBuilder<E, jf<evi>> b() {
      return evj.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends esp> RecordCodecBuilder<E, Optional<euu>> c() {
      return euu.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends esp> RecordCodecBuilder<E, Either<alg, evk>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected esp(Either<alg, evk> $$0, jf<evi> $$1, ess.a $$2, Optional<euu> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public ka a(evl $$0, dtg $$1) {
      evk $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private evk a(evl $$0) {
      return (evk)this.c.map($$0::a, Function.identity());
   }

   public List<evk.d> a(evl $$0, iv $$1, dtg $$2, boolean $$3) {
      evk $$4 = this.a($$0);
      List<evk.d> $$5 = $$4.a($$1, new evg().a($$2), dmo.pG, $$3);
      List<evk.d> $$6 = Lists.newArrayList();

      for (evk.d $$7 : $$5) {
         tz $$8 = $$7.c();
         if ($$8 != null) {
            eby $$9 = $$8.<eby>a("mode", eby.e).orElseThrow();
            if ($$9 == eby.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<evk.a> a(evl $$0, iv $$1, dtg $$2, azv $$3) {
      List<evk.a> $$4 = this.a($$0).a($$1, $$2);
      ag.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<evk.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public era a(evl $$0, iv $$1, dtg $$2) {
      evk $$3 = this.a($$0);
      return $$3.b(new evg().a($$2), $$1);
   }

   @Override
   public boolean a(evl $$0, dkg $$1, dkd $$2, ecm $$3, iv $$4, iv $$5, dtg $$6, era $$7, azv $$8, euu $$9, boolean $$10) {
      evk $$11 = this.a($$0);
      evg $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (evk.d $$14 : evk.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected evg a(dtg $$0, era $$1, euu $$2, boolean $$3) {
      evg $$4 = new evg();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eul.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(eur.b);
      }

      this.d.a().a().forEach($$4::a);
      this.g().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public esr<?> a() {
      return esr.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }

   @VisibleForTesting
   public alg e() {
      return (alg)this.c.orThrow();
   }
}
