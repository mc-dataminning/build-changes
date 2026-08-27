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

public class dys extends dyt {
   private static final Codec<Either<agm, ebm>> a = Codec.of(dys::a, agm.a.map(Either::left));
   public static final Codec<dys> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dys::new));
   protected final Either<agm, ebm> c;
   protected final ig<ebk> d;

   private static <T> DataResult<T> a(Either<agm, ebm> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<agm> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : agm.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dys> RecordCodecBuilder<E, ig<ebk>> b() {
      return ebl.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dys> RecordCodecBuilder<E, Either<agm, ebm>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dys(Either<agm, ebm> $$0, ig<ebk> $$1, dyv.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public ja a(ebn $$0, dbr $$1) {
      ebm $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ebm a(ebn $$0) {
      return (ebm)this.c.map($$0::a, Function.identity());
   }

   public List<ebm.c> a(ebn $$0, hx $$1, dbr $$2, boolean $$3) {
      ebm $$4 = this.a($$0);
      List<ebm.c> $$5 = $$4.a($$1, new ebi().a($$2), cvh.pa, $$3);
      List<ebm.c> $$6 = Lists.newArrayList();

      for (ebm.c $$7 : $$5) {
         sd $$8 = $$7.c();
         if ($$8 != null) {
            dix $$9 = dix.valueOf($$8.l("mode"));
            if ($$9 == dix.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ebm.c> a(ebn $$0, hx $$1, dbr $$2, atw $$3) {
      ebm $$4 = this.a($$0);
      ObjectArrayList<ebm.c> $$5 = $$4.a($$1, new ebi().a($$2), cvh.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ebm.c> $$0) {
      $$0.sort(Comparator.<ebm.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public dxe a(ebn $$0, hx $$1, dbr $$2) {
      ebm $$3 = this.a($$0);
      return $$3.b(new ebi().a($$2), $$1);
   }

   @Override
   public boolean a(ebn $$0, csz $$1, csx $$2, djk $$3, hx $$4, hx $$5, dbr $$6, dxe $$7, atw $$8, boolean $$9) {
      ebm $$10 = this.a($$0);
      ebi $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ebm.c $$13 : ebm.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ebi a(dbr $$0, dxe $$1, boolean $$2) {
      ebi $$3 = new ebi();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(eao.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(eau.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dyu<?> a() {
      return dyu.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
