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

public class dzu extends dzv {
   private static final Codec<Either<agt, eco>> a = Codec.of(dzu::a, agt.a.map(Either::left));
   public static final Codec<dzu> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dzu::new));
   protected final Either<agt, eco> c;
   protected final ie<ecm> d;

   private static <T> DataResult<T> a(Either<agt, eco> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<agt> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : agt.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dzu> RecordCodecBuilder<E, ie<ecm>> b() {
      return ecn.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dzu> RecordCodecBuilder<E, Either<agt, eco>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dzu(Either<agt, eco> $$0, ie<ecm> $$1, dzx.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public iz a(ecp $$0, dcl $$1) {
      eco $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private eco a(ecp $$0) {
      return (eco)this.c.map($$0::a, Function.identity());
   }

   public List<eco.c> a(ecp $$0, hv $$1, dcl $$2, boolean $$3) {
      eco $$4 = this.a($$0);
      List<eco.c> $$5 = $$4.a($$1, new eck().a($$2), cwb.pa, $$3);
      List<eco.c> $$6 = Lists.newArrayList();

      for (eco.c $$7 : $$5) {
         sj $$8 = $$7.c();
         if ($$8 != null) {
            djz $$9 = djz.valueOf($$8.l("mode"));
            if ($$9 == djz.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<eco.c> a(ecp $$0, hv $$1, dcl $$2, auf $$3) {
      eco $$4 = this.a($$0);
      ObjectArrayList<eco.c> $$5 = $$4.a($$1, new eck().a($$2), cwb.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<eco.c> $$0) {
      $$0.sort(Comparator.<eco.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public dyg a(ecp $$0, hv $$1, dcl $$2) {
      eco $$3 = this.a($$0);
      return $$3.b(new eck().a($$2), $$1);
   }

   @Override
   public boolean a(ecp $$0, ctt $$1, ctr $$2, dkm $$3, hv $$4, hv $$5, dcl $$6, dyg $$7, auf $$8, boolean $$9) {
      eco $$10 = this.a($$0);
      eck $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (eco.c $$13 : eco.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected eck a(dcl $$0, dyg $$1, boolean $$2) {
      eck $$3 = new eck();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ebq.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ebw.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dzw<?> a() {
      return dzw.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
