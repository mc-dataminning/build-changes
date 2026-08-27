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

public class eir extends eis {
   private static final Codec<Either<akn, ell>> a = Codec.of(eir::a, akn.a.map(Either::left));
   public static final MapCodec<eir> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, eir::new));
   protected final Either<akn, ell> c;
   protected final ix<elj> d;

   private static <T> DataResult<T> a(Either<akn, ell> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akn> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akn.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eir> RecordCodecBuilder<E, ix<elj>> b() {
      return elk.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eir> RecordCodecBuilder<E, Either<akn, ell>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eir(Either<akn, ell> $$0, ix<elj> $$1, eiu.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public js a(elm $$0, dkn $$1) {
      ell $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ell a(elm $$0) {
      return (ell)this.c.map($$0::a, Function.identity());
   }

   public List<ell.c> a(elm $$0, io $$1, dkn $$2, boolean $$3) {
      ell $$4 = this.a($$0);
      List<ell.c> $$5 = $$4.a($$1, new elh().a($$2), dec.pa, $$3);
      List<ell.c> $$6 = Lists.newArrayList();

      for (ell.c $$7 : $$5) {
         ud $$8 = $$7.c();
         if ($$8 != null) {
            dsn $$9 = dsn.valueOf($$8.l("mode"));
            if ($$9 == dsn.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ell.c> a(elm $$0, io $$1, dkn $$2, aym $$3) {
      ell $$4 = this.a($$0);
      ObjectArrayList<ell.c> $$5 = $$4.a($$1, new elh().a($$2), dec.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ell.c> $$0) {
      $$0.sort(Comparator.<ell.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ehd a(elm $$0, io $$1, dkn $$2) {
      ell $$3 = this.a($$0);
      return $$3.b(new elh().a($$2), $$1);
   }

   @Override
   public boolean a(elm $$0, dbu $$1, dbs $$2, dta $$3, io $$4, io $$5, dkn $$6, ehd $$7, aym $$8, boolean $$9) {
      ell $$10 = this.a($$0);
      elh $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ell.c $$13 : ell.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected elh a(dkn $$0, ehd $$1, boolean $$2) {
      elh $$3 = new elh();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ekn.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ekt.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eit<?> a() {
      return eit.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
