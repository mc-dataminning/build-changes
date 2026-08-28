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

public class eke extends ekf {
   private static final Codec<Either<akk, emy>> a = Codec.of(eke::a, akk.a.map(Either::left));
   public static final MapCodec<eke> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, eke::new));
   protected final Either<akk, emy> c;
   protected final jj<emw> d;

   private static <T> DataResult<T> a(Either<akk, emy> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akk> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akk.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eke> RecordCodecBuilder<E, jj<emw>> b() {
      return emx.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eke> RecordCodecBuilder<E, Either<akk, emy>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eke(Either<akk, emy> $$0, jj<emw> $$1, ekh.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public ke a(emz $$0, dlv $$1) {
      emy $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private emy a(emz $$0) {
      return (emy)this.c.map($$0::a, Function.identity());
   }

   public List<emy.c> a(emz $$0, ja $$1, dlv $$2, boolean $$3) {
      emy $$4 = this.a($$0);
      List<emy.c> $$5 = $$4.a($$1, new emu().a($$2), dfk.pa, $$3);
      List<emy.c> $$6 = Lists.newArrayList();

      for (emy.c $$7 : $$5) {
         tx $$8 = $$7.c();
         if ($$8 != null) {
            dtv $$9 = dtv.valueOf($$8.l("mode"));
            if ($$9 == dtv.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<emy.c> a(emz $$0, ja $$1, dlv $$2, ayo $$3) {
      emy $$4 = this.a($$0);
      ObjectArrayList<emy.c> $$5 = $$4.a($$1, new emu().a($$2), dfk.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<emy.c> $$0) {
      $$0.sort(Comparator.<emy.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eip a(emz $$0, ja $$1, dlv $$2) {
      emy $$3 = this.a($$0);
      return $$3.b(new emu().a($$2), $$1);
   }

   @Override
   public boolean a(emz $$0, ddc $$1, dda $$2, dui $$3, ja $$4, ja $$5, dlv $$6, eip $$7, ayo $$8, boolean $$9) {
      emy $$10 = this.a($$0);
      emu $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (emy.c $$13 : emy.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected emu a(dlv $$0, eip $$1, boolean $$2) {
      emu $$3 = new emu();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ema.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(emg.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ekg<?> a() {
      return ekg.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
