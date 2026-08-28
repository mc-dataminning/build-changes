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

public class emn extends emo {
   private static final Codec<Either<ale, epi>> a = Codec.of(emn::a, ale.a.map(Either::left));
   public static final MapCodec<emn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, emn::new));
   protected final Either<ale, epi> c;
   protected final jo<epg> d;
   protected final Optional<eos> e;

   private static <T> DataResult<T> a(Either<ale, epi> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ale> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ale.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends emn> RecordCodecBuilder<E, jo<epg>> b() {
      return eph.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends emn> RecordCodecBuilder<E, Optional<eos>> c() {
      return eos.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends emn> RecordCodecBuilder<E, Either<ale, epi>> d() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected emn(Either<ale, epi> $$0, jo<epg> $$1, emq.a $$2, Optional<eos> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kj a(epj $$0, doa $$1) {
      epi $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private epi a(epj $$0) {
      return (epi)this.c.map($$0::a, Function.identity());
   }

   public List<epi.c> a(epj $$0, jf $$1, doa $$2, boolean $$3) {
      epi $$4 = this.a($$0);
      List<epi.c> $$5 = $$4.a($$1, new epe().a($$2), dho.pa, $$3);
      List<epi.c> $$6 = Lists.newArrayList();

      for (epi.c $$7 : $$5) {
         ug $$8 = $$7.c();
         if ($$8 != null) {
            dwc $$9 = dwc.valueOf($$8.l("mode"));
            if ($$9 == dwc.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<epi.c> a(epj $$0, jf $$1, doa $$2, azn $$3) {
      epi $$4 = this.a($$0);
      ObjectArrayList<epi.c> $$5 = $$4.a($$1, new epe().a($$2), dho.pb, true);
      ad.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<epi.c> $$0) {
      $$0.sort(Comparator.<epi.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eky a(epj $$0, jf $$1, doa $$2) {
      epi $$3 = this.a($$0);
      return $$3.b(new epe().a($$2), $$1);
   }

   @Override
   public boolean a(epj $$0, dfg $$1, dfe $$2, dwp $$3, jf $$4, jf $$5, doa $$6, eky $$7, azn $$8, eos $$9, boolean $$10) {
      epi $$11 = this.a($$0);
      epe $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (epi.c $$14 : epi.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected epe a(doa $$0, eky $$1, eos $$2, boolean $$3) {
      epe $$4 = new epe();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eoj.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(eop.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public emp<?> a() {
      return emp.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
