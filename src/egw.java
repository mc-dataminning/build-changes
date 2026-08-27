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

public class egw extends egx {
   private static final Codec<Either<ajv, ejq>> a = Codec.of(egw::a, ajv.a.map(Either::left));
   public static final Codec<egw> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, egw::new));
   protected final Either<ajv, ejq> c;
   protected final in<ejo> d;

   private static <T> DataResult<T> a(Either<ajv, ejq> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ajv> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ajv.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends egw> RecordCodecBuilder<E, in<ejo>> b() {
      return ejp.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends egw> RecordCodecBuilder<E, Either<ajv, ejq>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected egw(Either<ajv, ejq> $$0, in<ejo> $$1, egz.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public ji a(ejr $$0, dit $$1) {
      ejq $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ejq a(ejr $$0) {
      return (ejq)this.c.map($$0::a, Function.identity());
   }

   public List<ejq.c> a(ejr $$0, id $$1, dit $$2, boolean $$3) {
      ejq $$4 = this.a($$0);
      List<ejq.c> $$5 = $$4.a($$1, new ejm().a($$2), dcj.pa, $$3);
      List<ejq.c> $$6 = Lists.newArrayList();

      for (ejq.c $$7 : $$5) {
         to $$8 = $$7.c();
         if ($$8 != null) {
            dqs $$9 = dqs.valueOf($$8.l("mode"));
            if ($$9 == dqs.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ejq.c> a(ejr $$0, id $$1, dit $$2, axt $$3) {
      ejq $$4 = this.a($$0);
      ObjectArrayList<ejq.c> $$5 = $$4.a($$1, new ejm().a($$2), dcj.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ejq.c> $$0) {
      $$0.sort(Comparator.<ejq.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public efi a(ejr $$0, id $$1, dit $$2) {
      ejq $$3 = this.a($$0);
      return $$3.b(new ejm().a($$2), $$1);
   }

   @Override
   public boolean a(ejr $$0, dab $$1, czz $$2, drf $$3, id $$4, id $$5, dit $$6, efi $$7, axt $$8, boolean $$9) {
      ejq $$10 = this.a($$0);
      ejm $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ejq.c $$13 : ejq.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ejm a(dit $$0, efi $$1, boolean $$2) {
      ejm $$3 = new ejm();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(eis.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(eiy.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public egy<?> a() {
      return egy.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
