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

public class esu extends esv {
   private static final Comparator<evp.a> a = Comparator.comparingInt(evp.a::g).reversed();
   private static final Codec<Either<alg, evp>> g = Codec.of(esu::a, alg.a.map(Either::left));
   public static final MapCodec<esu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, esu::new));
   protected final Either<alg, evp> c;
   protected final jf<evn> d;
   protected final Optional<euz> e;

   private static <T> DataResult<T> a(Either<alg, evp> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alg> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alg.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends esu> RecordCodecBuilder<E, jf<evn>> b() {
      return evo.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends esu> RecordCodecBuilder<E, Optional<euz>> c() {
      return euz.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends esu> RecordCodecBuilder<E, Either<alg, evp>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected esu(Either<alg, evp> $$0, jf<evn> $$1, esx.a $$2, Optional<euz> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public ka a(evq $$0, dtl $$1) {
      evp $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private evp a(evq $$0) {
      return (evp)this.c.map($$0::a, Function.identity());
   }

   public List<evp.d> a(evq $$0, iv $$1, dtl $$2, boolean $$3) {
      evp $$4 = this.a($$0);
      List<evp.d> $$5 = $$4.a($$1, new evl().a($$2), dmt.pG, $$3);
      List<evp.d> $$6 = Lists.newArrayList();

      for (evp.d $$7 : $$5) {
         tz $$8 = $$7.c();
         if ($$8 != null) {
            ecd $$9 = $$8.<ecd>a("mode", ecd.e).orElseThrow();
            if ($$9 == ecd.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<evp.a> a(evq $$0, iv $$1, dtl $$2, azv $$3) {
      List<evp.a> $$4 = this.a($$0).a($$1, $$2);
      ag.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<evp.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public erf a(evq $$0, iv $$1, dtl $$2) {
      evp $$3 = this.a($$0);
      return $$3.b(new evl().a($$2), $$1);
   }

   @Override
   public boolean a(evq $$0, dkl $$1, dki $$2, ecr $$3, iv $$4, iv $$5, dtl $$6, erf $$7, azv $$8, euz $$9, boolean $$10) {
      evp $$11 = this.a($$0);
      evl $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (evp.d $$14 : evp.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected evl a(dtl $$0, erf $$1, euz $$2, boolean $$3) {
      evl $$4 = new evl();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(euq.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(euw.b);
      }

      this.d.a().a().forEach($$4::a);
      this.g().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public esw<?> a() {
      return esw.a;
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
