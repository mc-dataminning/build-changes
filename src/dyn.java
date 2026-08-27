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

public class dyn extends dyo {
   private static final Codec<Either<agi, ebh>> a = Codec.of(dyn::a, agi.a.map(Either::left));
   public static final Codec<dyn> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dyn::new));
   protected final Either<agi, ebh> c;
   protected final ib<ebf> d;

   private static <T> DataResult<T> a(Either<agi, ebh> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<agi> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : agi.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dyn> RecordCodecBuilder<E, ib<ebf>> b() {
      return ebg.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dyn> RecordCodecBuilder<E, Either<agi, ebh>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dyn(Either<agi, ebh> $$0, ib<ebf> $$1, dyq.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public iw a(ebi $$0, dbm $$1) {
      ebh $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ebh a(ebi $$0) {
      return (ebh)this.c.map($$0::a, Function.identity());
   }

   public List<ebh.c> a(ebi $$0, ht $$1, dbm $$2, boolean $$3) {
      ebh $$4 = this.a($$0);
      List<ebh.c> $$5 = $$4.a($$1, new ebd().a($$2), cvc.pa, $$3);
      List<ebh.c> $$6 = Lists.newArrayList();

      for (ebh.c $$7 : $$5) {
         rz $$8 = $$7.c();
         if ($$8 != null) {
            dis $$9 = dis.valueOf($$8.l("mode"));
            if ($$9 == dis.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ebh.c> a(ebi $$0, ht $$1, dbm $$2, ats $$3) {
      ebh $$4 = this.a($$0);
      ObjectArrayList<ebh.c> $$5 = $$4.a($$1, new ebd().a($$2), cvc.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ebh.c> $$0) {
      $$0.sort(Comparator.<ebh.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public dwz a(ebi $$0, ht $$1, dbm $$2) {
      ebh $$3 = this.a($$0);
      return $$3.b(new ebd().a($$2), $$1);
   }

   @Override
   public boolean a(ebi $$0, csu $$1, css $$2, djf $$3, ht $$4, ht $$5, dbm $$6, dwz $$7, ats $$8, boolean $$9) {
      ebh $$10 = this.a($$0);
      ebd $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ebh.c $$13 : ebh.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ebd a(dbm $$0, dwz $$1, boolean $$2) {
      ebd $$3 = new ebd();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(eaj.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(eap.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dyp<?> a() {
      return dyp.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
