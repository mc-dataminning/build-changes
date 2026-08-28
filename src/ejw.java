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

public class ejw extends ejx {
   private static final Codec<Either<akk, emq>> a = Codec.of(ejw::a, akk.a.map(Either::left));
   public static final MapCodec<ejw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejw::new));
   protected final Either<akk, emq> c;
   protected final jj<emo> d;

   private static <T> DataResult<T> a(Either<akk, emq> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akk> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akk.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ejw> RecordCodecBuilder<E, jj<emo>> b() {
      return emp.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ejw> RecordCodecBuilder<E, Either<akk, emq>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ejw(Either<akk, emq> $$0, jj<emo> $$1, ejz.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public ke a(emr $$0, dls $$1) {
      emq $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private emq a(emr $$0) {
      return (emq)this.c.map($$0::a, Function.identity());
   }

   public List<emq.c> a(emr $$0, ja $$1, dls $$2, boolean $$3) {
      emq $$4 = this.a($$0);
      List<emq.c> $$5 = $$4.a($$1, new emm().a($$2), dfh.pa, $$3);
      List<emq.c> $$6 = Lists.newArrayList();

      for (emq.c $$7 : $$5) {
         tx $$8 = $$7.c();
         if ($$8 != null) {
            dtr $$9 = dtr.valueOf($$8.l("mode"));
            if ($$9 == dtr.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<emq.c> a(emr $$0, ja $$1, dls $$2, aym $$3) {
      emq $$4 = this.a($$0);
      ObjectArrayList<emq.c> $$5 = $$4.a($$1, new emm().a($$2), dfh.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<emq.c> $$0) {
      $$0.sort(Comparator.<emq.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eii a(emr $$0, ja $$1, dls $$2) {
      emq $$3 = this.a($$0);
      return $$3.b(new emm().a($$2), $$1);
   }

   @Override
   public boolean a(emr $$0, dcz $$1, dcx $$2, due $$3, ja $$4, ja $$5, dls $$6, eii $$7, aym $$8, boolean $$9) {
      emq $$10 = this.a($$0);
      emm $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (emq.c $$13 : emq.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected emm a(dls $$0, eii $$1, boolean $$2) {
      emm $$3 = new emm();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(els.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ely.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ejy<?> a() {
      return ejy.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
