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

public class eti extends etj {
   private static final Comparator<ewd.a> a = Comparator.comparingInt(ewd.a::g).reversed();
   private static final Codec<Either<ali, ewd>> g = Codec.of(eti::a, ali.a.map(Either::left));
   public static final MapCodec<eti> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, eti::new));
   protected final Either<ali, ewd> c;
   protected final jf<ewb> d;
   protected final Optional<evn> e;

   private static <T> DataResult<T> a(Either<ali, ewd> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ali> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ali.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eti> RecordCodecBuilder<E, jf<ewb>> b() {
      return ewc.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eti> RecordCodecBuilder<E, Optional<evn>> c() {
      return evn.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends eti> RecordCodecBuilder<E, Either<ali, ewd>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eti(Either<ali, ewd> $$0, jf<ewb> $$1, etl.a $$2, Optional<evn> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public ka a(ewe $$0, dtw $$1) {
      ewd $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ewd a(ewe $$0) {
      return (ewd)this.c.map($$0::a, Function.identity());
   }

   public List<ewd.d> a(ewe $$0, iv $$1, dtw $$2, boolean $$3) {
      ewd $$4 = this.a($$0);
      List<ewd.d> $$5 = $$4.a($$1, new evz().a($$2), dne.pG, $$3);
      List<ewd.d> $$6 = Lists.newArrayList();

      for (ewd.d $$7 : $$5) {
         tz $$8 = $$7.c();
         if ($$8 != null) {
            eco $$9 = $$8.<eco>a("mode", eco.e).orElseThrow();
            if ($$9 == eco.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ewd.a> a(ewe $$0, iv $$1, dtw $$2, azx $$3) {
      List<ewd.a> $$4 = this.a($$0).a($$1, $$2);
      ag.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<ewd.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public ert a(ewe $$0, iv $$1, dtw $$2) {
      ewd $$3 = this.a($$0);
      return $$3.b(new evz().a($$2), $$1);
   }

   @Override
   public boolean a(ewe $$0, dkw $$1, dkt $$2, edc $$3, iv $$4, iv $$5, dtw $$6, ert $$7, azx $$8, evn $$9, boolean $$10) {
      ewd $$11 = this.a($$0);
      evz $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (ewd.d $$14 : ewd.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected evz a(dtw $$0, ert $$1, evn $$2, boolean $$3) {
      evz $$4 = new evz();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eve.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(evk.b);
      }

      this.d.a().a().forEach($$4::a);
      this.g().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public etk<?> a() {
      return etk.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }

   @VisibleForTesting
   public ali e() {
      return (ali)this.c.orThrow();
   }
}
