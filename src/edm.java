import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class edm extends edn {
   private static final Codec<Either<ajc, egg>> a = Codec.of(edm::a, ajc.a.map(Either::left));
   public static final Codec<edm> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, edm::new));
   protected final Either<ajc, egg> c;
   protected final il<ege> d;

   private static <T> DataResult<T> a(Either<ajc, egg> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ajc> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ajc.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends edm> RecordCodecBuilder<E, il<ege>> b() {
      return egf.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends edm> RecordCodecBuilder<E, Either<ajc, egg>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected edm(Either<ajc, egg> $$0, il<ege> $$1, edp.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jf a(egh $$0, dfr $$1) {
      egg $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private egg a(egh $$0) {
      return (egg)this.c.map($$0::a, Function.identity());
   }

   public List<egg.c> a(egh $$0, ib $$1, dfr $$2, boolean $$3) {
      egg $$4 = this.a($$0);
      List<egg.c> $$5 = $$4.a($$1, new egc().a($$2), czh.pa, $$3);
      List<egg.c> $$6 = Lists.newArrayList();

      for (egg.c $$7 : $$5) {
         sy $$8 = $$7.c();
         if ($$8 != null) {
            dno $$9 = dno.valueOf($$8.l("mode"));
            if ($$9 == dno.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<egg.c> a(egh $$0, ib $$1, dfr $$2, awt $$3) {
      egg $$4 = this.a($$0);
      ObjectArrayList<egg.c> $$5 = $$4.a($$1, new egc().a($$2), czh.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<egg.c> $$0) {
      $$0.sort(Comparator.<egg.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eby a(egh $$0, ib $$1, dfr $$2) {
      egg $$3 = this.a($$0);
      return $$3.b(new egc().a($$2), $$1);
   }

   @Override
   public boolean a(egh $$0, cwz $$1, cwx $$2, dob $$3, ib $$4, ib $$5, dfr $$6, eby $$7, awt $$8, boolean $$9) {
      egg $$10 = this.a($$0);
      egc $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (egg.c $$13 : egg.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected egc a(dfr $$0, eby $$1, boolean $$2) {
      egc $$3 = new egc();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(efi.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(efo.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public edo<?> a() {
      return edo.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
