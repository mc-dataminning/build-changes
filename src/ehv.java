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

public class ehv extends ehw {
   private static final Codec<Either<akh, ekp>> a = Codec.of(ehv::a, akh.a.map(Either::left));
   public static final Codec<ehv> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, ehv::new));
   protected final Either<akh, ekp> c;
   protected final iw<ekn> d;

   private static <T> DataResult<T> a(Either<akh, ekp> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akh> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akh.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ehv> RecordCodecBuilder<E, iw<ekn>> b() {
      return eko.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ehv> RecordCodecBuilder<E, Either<akh, ekp>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ehv(Either<akh, ekp> $$0, iw<ekn> $$1, ehy.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jr a(ekq $$0, djr $$1) {
      ekp $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ekp a(ekq $$0) {
      return (ekp)this.c.map($$0::a, Function.identity());
   }

   public List<ekp.c> a(ekq $$0, in $$1, djr $$2, boolean $$3) {
      ekp $$4 = this.a($$0);
      List<ekp.c> $$5 = $$4.a($$1, new ekl().a($$2), ddg.pa, $$3);
      List<ekp.c> $$6 = Lists.newArrayList();

      for (ekp.c $$7 : $$5) {
         ua $$8 = $$7.c();
         if ($$8 != null) {
            drr $$9 = drr.valueOf($$8.l("mode"));
            if ($$9 == drr.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ekp.c> a(ekq $$0, in $$1, djr $$2, ayg $$3) {
      ekp $$4 = this.a($$0);
      ObjectArrayList<ekp.c> $$5 = $$4.a($$1, new ekl().a($$2), ddg.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ekp.c> $$0) {
      $$0.sort(Comparator.<ekp.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public egh a(ekq $$0, in $$1, djr $$2) {
      ekp $$3 = this.a($$0);
      return $$3.b(new ekl().a($$2), $$1);
   }

   @Override
   public boolean a(ekq $$0, day $$1, daw $$2, dse $$3, in $$4, in $$5, djr $$6, egh $$7, ayg $$8, boolean $$9) {
      ekp $$10 = this.a($$0);
      ekl $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ekp.c $$13 : ekp.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ekl a(djr $$0, egh $$1, boolean $$2) {
      ekl $$3 = new ekl();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ejr.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ejx.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ehx<?> a() {
      return ehx.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
