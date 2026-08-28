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

public class ene extends enf {
   private static final Codec<Either<ali, epz>> a = Codec.of(ene::a, ali.a.map(Either::left));
   public static final MapCodec<ene> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, ene::new));
   protected final Either<ali, epz> c;
   protected final jq<epx> d;
   protected final Optional<epj> e;

   private static <T> DataResult<T> a(Either<ali, epz> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ali> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ali.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ene> RecordCodecBuilder<E, jq<epx>> b() {
      return epy.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ene> RecordCodecBuilder<E, Optional<epj>> c() {
      return epj.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends ene> RecordCodecBuilder<E, Either<ali, epz>> d() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ene(Either<ali, epz> $$0, jq<epx> $$1, enh.a $$2, Optional<epj> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kl a(eqa $$0, dor $$1) {
      epz $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private epz a(eqa $$0) {
      return (epz)this.c.map($$0::a, Function.identity());
   }

   public List<epz.c> a(eqa $$0, jh $$1, dor $$2, boolean $$3) {
      epz $$4 = this.a($$0);
      List<epz.c> $$5 = $$4.a($$1, new epv().a($$2), dig.pa, $$3);
      List<epz.c> $$6 = Lists.newArrayList();

      for (epz.c $$7 : $$5) {
         uk $$8 = $$7.c();
         if ($$8 != null) {
            dwt $$9 = dwt.valueOf($$8.l("mode"));
            if ($$9 == dwt.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<epz.c> a(eqa $$0, jh $$1, dor $$2, azs $$3) {
      epz $$4 = this.a($$0);
      ObjectArrayList<epz.c> $$5 = $$4.a($$1, new epv().a($$2), dig.pb, true);
      ae.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<epz.c> $$0) {
      $$0.sort(Comparator.<epz.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public elp a(eqa $$0, jh $$1, dor $$2) {
      epz $$3 = this.a($$0);
      return $$3.b(new epv().a($$2), $$1);
   }

   @Override
   public boolean a(eqa $$0, dfy $$1, dfw $$2, dxg $$3, jh $$4, jh $$5, dor $$6, elp $$7, azs $$8, epj $$9, boolean $$10) {
      epz $$11 = this.a($$0);
      epv $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (epz.c $$14 : epz.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected epv a(dor $$0, elp $$1, epj $$2, boolean $$3) {
      epv $$4 = new epv();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(epa.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(epg.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public eng<?> a() {
      return eng.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
