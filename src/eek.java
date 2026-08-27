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

public class eek extends eel {
   private static final Codec<Either<ajh, ehe>> a = Codec.of(eek::a, ajh.a.map(Either::left));
   public static final Codec<eek> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eek::new));
   protected final Either<ajh, ehe> c;
   protected final il<ehc> d;

   private static <T> DataResult<T> a(Either<ajh, ehe> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ajh> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ajh.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eek> RecordCodecBuilder<E, il<ehc>> b() {
      return ehd.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eek> RecordCodecBuilder<E, Either<ajh, ehe>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eek(Either<ajh, ehe> $$0, il<ehc> $$1, een.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jg a(ehf $$0, dgo $$1) {
      ehe $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ehe a(ehf $$0) {
      return (ehe)this.c.map($$0::a, Function.identity());
   }

   public List<ehe.c> a(ehf $$0, ib $$1, dgo $$2, boolean $$3) {
      ehe $$4 = this.a($$0);
      List<ehe.c> $$5 = $$4.a($$1, new eha().a($$2), dae.pa, $$3);
      List<ehe.c> $$6 = Lists.newArrayList();

      for (ehe.c $$7 : $$5) {
         ta $$8 = $$7.c();
         if ($$8 != null) {
            dol $$9 = dol.valueOf($$8.l("mode"));
            if ($$9 == dol.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ehe.c> a(ehf $$0, ib $$1, dgo $$2, axd $$3) {
      ehe $$4 = this.a($$0);
      ObjectArrayList<ehe.c> $$5 = $$4.a($$1, new eha().a($$2), dae.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ehe.c> $$0) {
      $$0.sort(Comparator.<ehe.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ecw a(ehf $$0, ib $$1, dgo $$2) {
      ehe $$3 = this.a($$0);
      return $$3.b(new eha().a($$2), $$1);
   }

   @Override
   public boolean a(ehf $$0, cxw $$1, cxu $$2, doy $$3, ib $$4, ib $$5, dgo $$6, ecw $$7, axd $$8, boolean $$9) {
      ehe $$10 = this.a($$0);
      eha $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ehe.c $$13 : ehe.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected eha a(dgo $$0, ecw $$1, boolean $$2) {
      eha $$3 = new eha();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(egg.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(egm.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eem<?> a() {
      return eem.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
