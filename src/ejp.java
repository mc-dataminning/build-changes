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

public class ejp extends ejq {
   private static final Codec<Either<ale, emj>> a = Codec.of(ejp::a, ale.a.map(Either::left));
   public static final MapCodec<ejp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejp::new));
   protected final Either<ale, emj> c;
   protected final ji<emh> d;

   private static <T> DataResult<T> a(Either<ale, emj> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ale> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ale.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ejp> RecordCodecBuilder<E, ji<emh>> b() {
      return emi.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ejp> RecordCodecBuilder<E, Either<ale, emj>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ejp(Either<ale, emj> $$0, ji<emh> $$1, ejs.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public kd a(emk $$0, dll $$1) {
      emj $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private emj a(emk $$0) {
      return (emj)this.c.map($$0::a, Function.identity());
   }

   public List<emj.c> a(emk $$0, iz $$1, dll $$2, boolean $$3) {
      emj $$4 = this.a($$0);
      List<emj.c> $$5 = $$4.a($$1, new emf().a($$2), dfa.pa, $$3);
      List<emj.c> $$6 = Lists.newArrayList();

      for (emj.c $$7 : $$5) {
         ur $$8 = $$7.c();
         if ($$8 != null) {
            dtl $$9 = dtl.valueOf($$8.l("mode"));
            if ($$9 == dtl.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<emj.c> a(emk $$0, iz $$1, dll $$2, azg $$3) {
      emj $$4 = this.a($$0);
      ObjectArrayList<emj.c> $$5 = $$4.a($$1, new emf().a($$2), dfa.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<emj.c> $$0) {
      $$0.sort(Comparator.<emj.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eib a(emk $$0, iz $$1, dll $$2) {
      emj $$3 = this.a($$0);
      return $$3.b(new emf().a($$2), $$1);
   }

   @Override
   public boolean a(emk $$0, dcs $$1, dcq $$2, dty $$3, iz $$4, iz $$5, dll $$6, eib $$7, azg $$8, boolean $$9) {
      emj $$10 = this.a($$0);
      emf $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (emj.c $$13 : emj.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected emf a(dll $$0, eib $$1, boolean $$2) {
      emf $$3 = new emf();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ell.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(elr.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ejr<?> a() {
      return ejr.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
