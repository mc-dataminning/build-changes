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

public class egn extends ego {
   private static final Codec<Either<ajt, ejh>> a = Codec.of(egn::a, ajt.a.map(Either::left));
   public static final Codec<egn> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, egn::new));
   protected final Either<ajt, ejh> c;
   protected final il<ejf> d;

   private static <T> DataResult<T> a(Either<ajt, ejh> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ajt> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ajt.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends egn> RecordCodecBuilder<E, il<ejf>> b() {
      return ejg.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends egn> RecordCodecBuilder<E, Either<ajt, ejh>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected egn(Either<ajt, ejh> $$0, il<ejf> $$1, egq.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jg a(eji $$0, dik $$1) {
      ejh $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ejh a(eji $$0) {
      return (ejh)this.c.map($$0::a, Function.identity());
   }

   public List<ejh.c> a(eji $$0, ib $$1, dik $$2, boolean $$3) {
      ejh $$4 = this.a($$0);
      List<ejh.c> $$5 = $$4.a($$1, new ejd().a($$2), dca.pa, $$3);
      List<ejh.c> $$6 = Lists.newArrayList();

      for (ejh.c $$7 : $$5) {
         tm $$8 = $$7.c();
         if ($$8 != null) {
            dqj $$9 = dqj.valueOf($$8.l("mode"));
            if ($$9 == dqj.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ejh.c> a(eji $$0, ib $$1, dik $$2, axr $$3) {
      ejh $$4 = this.a($$0);
      ObjectArrayList<ejh.c> $$5 = $$4.a($$1, new ejd().a($$2), dca.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ejh.c> $$0) {
      $$0.sort(Comparator.<ejh.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eez a(eji $$0, ib $$1, dik $$2) {
      ejh $$3 = this.a($$0);
      return $$3.b(new ejd().a($$2), $$1);
   }

   @Override
   public boolean a(eji $$0, czs $$1, czq $$2, dqw $$3, ib $$4, ib $$5, dik $$6, eez $$7, axr $$8, boolean $$9) {
      ejh $$10 = this.a($$0);
      ejd $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ejh.c $$13 : ejh.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ejd a(dik $$0, eez $$1, boolean $$2) {
      ejd $$3 = new ejd();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(eij.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(eip.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public egp<?> a() {
      return egp.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
