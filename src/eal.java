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

public class eal extends eam {
   private static final Codec<Either<ahg, edf>> a = Codec.of(eal::a, ahg.a.map(Either::left));
   public static final Codec<eal> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eal::new));
   protected final Either<ahg, edf> c;
   protected final ih<edd> d;

   private static <T> DataResult<T> a(Either<ahg, edf> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ahg> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ahg.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eal> RecordCodecBuilder<E, ih<edd>> b() {
      return ede.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eal> RecordCodecBuilder<E, Either<ahg, edf>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eal(Either<ahg, edf> $$0, ih<edd> $$1, eao.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jb a(edg $$0, ddb $$1) {
      edf $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private edf a(edg $$0) {
      return (edf)this.c.map($$0::a, Function.identity());
   }

   public List<edf.c> a(edg $$0, hx $$1, ddb $$2, boolean $$3) {
      edf $$4 = this.a($$0);
      List<edf.c> $$5 = $$4.a($$1, new edb().a($$2), cwr.pa, $$3);
      List<edf.c> $$6 = Lists.newArrayList();

      for (edf.c $$7 : $$5) {
         sn $$8 = $$7.c();
         if ($$8 != null) {
            dkq $$9 = dkq.valueOf($$8.l("mode"));
            if ($$9 == dkq.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<edf.c> a(edg $$0, hx $$1, ddb $$2, auu $$3) {
      edf $$4 = this.a($$0);
      ObjectArrayList<edf.c> $$5 = $$4.a($$1, new edb().a($$2), cwr.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<edf.c> $$0) {
      $$0.sort(Comparator.<edf.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public dyx a(edg $$0, hx $$1, ddb $$2) {
      edf $$3 = this.a($$0);
      return $$3.b(new edb().a($$2), $$1);
   }

   @Override
   public boolean a(edg $$0, cuj $$1, cuh $$2, dld $$3, hx $$4, hx $$5, ddb $$6, dyx $$7, auu $$8, boolean $$9) {
      edf $$10 = this.a($$0);
      edb $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (edf.c $$13 : edf.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected edb a(ddb $$0, dyx $$1, boolean $$2) {
      edb $$3 = new edb();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ech.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ecn.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ean<?> a() {
      return ean.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
