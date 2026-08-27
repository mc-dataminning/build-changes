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

public class eei extends eej {
   private static final Codec<Either<ajh, ehc>> a = Codec.of(eei::a, ajh.a.map(Either::left));
   public static final Codec<eei> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eei::new));
   protected final Either<ajh, ehc> c;
   protected final il<eha> d;

   private static <T> DataResult<T> a(Either<ajh, ehc> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ajh> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ajh.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eei> RecordCodecBuilder<E, il<eha>> b() {
      return ehb.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eei> RecordCodecBuilder<E, Either<ajh, ehc>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eei(Either<ajh, ehc> $$0, il<eha> $$1, eel.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jg a(ehd $$0, dgm $$1) {
      ehc $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ehc a(ehd $$0) {
      return (ehc)this.c.map($$0::a, Function.identity());
   }

   public List<ehc.c> a(ehd $$0, ib $$1, dgm $$2, boolean $$3) {
      ehc $$4 = this.a($$0);
      List<ehc.c> $$5 = $$4.a($$1, new egy().a($$2), dac.pa, $$3);
      List<ehc.c> $$6 = Lists.newArrayList();

      for (ehc.c $$7 : $$5) {
         ta $$8 = $$7.c();
         if ($$8 != null) {
            doj $$9 = doj.valueOf($$8.l("mode"));
            if ($$9 == doj.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ehc.c> a(ehd $$0, ib $$1, dgm $$2, axd $$3) {
      ehc $$4 = this.a($$0);
      ObjectArrayList<ehc.c> $$5 = $$4.a($$1, new egy().a($$2), dac.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ehc.c> $$0) {
      $$0.sort(Comparator.<ehc.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ecu a(ehd $$0, ib $$1, dgm $$2) {
      ehc $$3 = this.a($$0);
      return $$3.b(new egy().a($$2), $$1);
   }

   @Override
   public boolean a(ehd $$0, cxu $$1, cxs $$2, dow $$3, ib $$4, ib $$5, dgm $$6, ecu $$7, axd $$8, boolean $$9) {
      ehc $$10 = this.a($$0);
      egy $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ehc.c $$13 : ehc.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected egy a(dgm $$0, ecu $$1, boolean $$2) {
      egy $$3 = new egy();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ege.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(egk.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eek<?> a() {
      return eek.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
