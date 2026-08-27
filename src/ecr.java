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

public class ecr extends ecs {
   private static final Codec<Either<aiy, efl>> a = Codec.of(ecr::a, aiy.a.map(Either::left));
   public static final Codec<ecr> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, ecr::new));
   protected final Either<aiy, efl> c;
   protected final ij<efj> d;

   private static <T> DataResult<T> a(Either<aiy, efl> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aiy> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aiy.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ecr> RecordCodecBuilder<E, ij<efj>> b() {
      return efk.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ecr> RecordCodecBuilder<E, Either<aiy, efl>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ecr(Either<aiy, efl> $$0, ij<efj> $$1, ecu.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jd a(efm $$0, dfe $$1) {
      efl $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private efl a(efm $$0) {
      return (efl)this.c.map($$0::a, Function.identity());
   }

   public List<efl.c> a(efm $$0, hz $$1, dfe $$2, boolean $$3) {
      efl $$4 = this.a($$0);
      List<efl.c> $$5 = $$4.a($$1, new efh().a($$2), cyu.pa, $$3);
      List<efl.c> $$6 = Lists.newArrayList();

      for (efl.c $$7 : $$5) {
         sw $$8 = $$7.c();
         if ($$8 != null) {
            dmt $$9 = dmt.valueOf($$8.l("mode"));
            if ($$9 == dmt.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<efl.c> a(efm $$0, hz $$1, dfe $$2, awp $$3) {
      efl $$4 = this.a($$0);
      ObjectArrayList<efl.c> $$5 = $$4.a($$1, new efh().a($$2), cyu.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<efl.c> $$0) {
      $$0.sort(Comparator.<efl.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ebd a(efm $$0, hz $$1, dfe $$2) {
      efl $$3 = this.a($$0);
      return $$3.b(new efh().a($$2), $$1);
   }

   @Override
   public boolean a(efm $$0, cwm $$1, cwk $$2, dng $$3, hz $$4, hz $$5, dfe $$6, ebd $$7, awp $$8, boolean $$9) {
      efl $$10 = this.a($$0);
      efh $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (efl.c $$13 : efl.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected efh a(dfe $$0, ebd $$1, boolean $$2) {
      efh $$3 = new efh();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(een.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(eet.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ect<?> a() {
      return ect.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
