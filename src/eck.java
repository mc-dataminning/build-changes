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

public class eck extends ecl {
   private static final Codec<Either<aiy, efe>> a = Codec.of(eck::a, aiy.a.map(Either::left));
   public static final Codec<eck> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eck::new));
   protected final Either<aiy, efe> c;
   protected final ij<efc> d;

   private static <T> DataResult<T> a(Either<aiy, efe> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aiy> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aiy.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eck> RecordCodecBuilder<E, ij<efc>> b() {
      return efd.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eck> RecordCodecBuilder<E, Either<aiy, efe>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eck(Either<aiy, efe> $$0, ij<efc> $$1, ecn.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jd a(eff $$0, dfa $$1) {
      efe $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private efe a(eff $$0) {
      return (efe)this.c.map($$0::a, Function.identity());
   }

   public List<efe.c> a(eff $$0, hz $$1, dfa $$2, boolean $$3) {
      efe $$4 = this.a($$0);
      List<efe.c> $$5 = $$4.a($$1, new efa().a($$2), cyq.pa, $$3);
      List<efe.c> $$6 = Lists.newArrayList();

      for (efe.c $$7 : $$5) {
         sw $$8 = $$7.c();
         if ($$8 != null) {
            dmp $$9 = dmp.valueOf($$8.l("mode"));
            if ($$9 == dmp.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<efe.c> a(eff $$0, hz $$1, dfa $$2, awo $$3) {
      efe $$4 = this.a($$0);
      ObjectArrayList<efe.c> $$5 = $$4.a($$1, new efa().a($$2), cyq.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<efe.c> $$0) {
      $$0.sort(Comparator.<efe.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eaw a(eff $$0, hz $$1, dfa $$2) {
      efe $$3 = this.a($$0);
      return $$3.b(new efa().a($$2), $$1);
   }

   @Override
   public boolean a(eff $$0, cwi $$1, cwg $$2, dnc $$3, hz $$4, hz $$5, dfa $$6, eaw $$7, awo $$8, boolean $$9) {
      efe $$10 = this.a($$0);
      efa $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (efe.c $$13 : efe.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected efa a(dfa $$0, eaw $$1, boolean $$2) {
      efa $$3 = new efa();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(eeg.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(eem.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ecm<?> a() {
      return ecm.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
