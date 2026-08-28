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

public class ejq extends ejr {
   private static final Codec<Either<alf, emk>> a = Codec.of(ejq::a, alf.a.map(Either::left));
   public static final MapCodec<ejq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejq::new));
   protected final Either<alf, emk> c;
   protected final ji<emi> d;

   private static <T> DataResult<T> a(Either<alf, emk> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alf> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alf.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ejq> RecordCodecBuilder<E, ji<emi>> b() {
      return emj.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ejq> RecordCodecBuilder<E, Either<alf, emk>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ejq(Either<alf, emk> $$0, ji<emi> $$1, ejt.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public kd a(eml $$0, dlm $$1) {
      emk $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private emk a(eml $$0) {
      return (emk)this.c.map($$0::a, Function.identity());
   }

   public List<emk.c> a(eml $$0, iz $$1, dlm $$2, boolean $$3) {
      emk $$4 = this.a($$0);
      List<emk.c> $$5 = $$4.a($$1, new emg().a($$2), dfb.pa, $$3);
      List<emk.c> $$6 = Lists.newArrayList();

      for (emk.c $$7 : $$5) {
         us $$8 = $$7.c();
         if ($$8 != null) {
            dtm $$9 = dtm.valueOf($$8.l("mode"));
            if ($$9 == dtm.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<emk.c> a(eml $$0, iz $$1, dlm $$2, azh $$3) {
      emk $$4 = this.a($$0);
      ObjectArrayList<emk.c> $$5 = $$4.a($$1, new emg().a($$2), dfb.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<emk.c> $$0) {
      $$0.sort(Comparator.<emk.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eic a(eml $$0, iz $$1, dlm $$2) {
      emk $$3 = this.a($$0);
      return $$3.b(new emg().a($$2), $$1);
   }

   @Override
   public boolean a(eml $$0, dct $$1, dcr $$2, dtz $$3, iz $$4, iz $$5, dlm $$6, eic $$7, azh $$8, boolean $$9) {
      emk $$10 = this.a($$0);
      emg $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (emk.c $$13 : emk.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected emg a(dlm $$0, eic $$1, boolean $$2) {
      emg $$3 = new emg();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(elm.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(els.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ejs<?> a() {
      return ejs.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
