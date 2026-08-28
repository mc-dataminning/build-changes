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

public class ekc extends ekd {
   private static final Codec<Either<akk, emw>> a = Codec.of(ekc::a, akk.a.map(Either::left));
   public static final MapCodec<ekc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ekc::new));
   protected final Either<akk, emw> c;
   protected final jj<emu> d;

   private static <T> DataResult<T> a(Either<akk, emw> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akk> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akk.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ekc> RecordCodecBuilder<E, jj<emu>> b() {
      return emv.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ekc> RecordCodecBuilder<E, Either<akk, emw>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ekc(Either<akk, emw> $$0, jj<emu> $$1, ekf.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public ke a(emx $$0, dlu $$1) {
      emw $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private emw a(emx $$0) {
      return (emw)this.c.map($$0::a, Function.identity());
   }

   public List<emw.c> a(emx $$0, ja $$1, dlu $$2, boolean $$3) {
      emw $$4 = this.a($$0);
      List<emw.c> $$5 = $$4.a($$1, new ems().a($$2), dfj.pa, $$3);
      List<emw.c> $$6 = Lists.newArrayList();

      for (emw.c $$7 : $$5) {
         tx $$8 = $$7.c();
         if ($$8 != null) {
            dtu $$9 = dtu.valueOf($$8.l("mode"));
            if ($$9 == dtu.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<emw.c> a(emx $$0, ja $$1, dlu $$2, ayo $$3) {
      emw $$4 = this.a($$0);
      ObjectArrayList<emw.c> $$5 = $$4.a($$1, new ems().a($$2), dfj.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<emw.c> $$0) {
      $$0.sort(Comparator.<emw.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eio a(emx $$0, ja $$1, dlu $$2) {
      emw $$3 = this.a($$0);
      return $$3.b(new ems().a($$2), $$1);
   }

   @Override
   public boolean a(emx $$0, ddb $$1, dcz $$2, duh $$3, ja $$4, ja $$5, dlu $$6, eio $$7, ayo $$8, boolean $$9) {
      emw $$10 = this.a($$0);
      ems $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (emw.c $$13 : emw.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ems a(dlu $$0, eio $$1, boolean $$2) {
      ems $$3 = new ems();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ely.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(eme.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eke<?> a() {
      return eke.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
