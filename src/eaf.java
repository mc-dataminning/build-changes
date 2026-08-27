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

public class eaf extends eag {
   private static final Codec<Either<ahd, ecz>> a = Codec.of(eaf::a, ahd.a.map(Either::left));
   public static final Codec<eaf> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eaf::new));
   protected final Either<ahd, ecz> c;
   protected final ih<ecx> d;

   private static <T> DataResult<T> a(Either<ahd, ecz> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ahd> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ahd.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eaf> RecordCodecBuilder<E, ih<ecx>> b() {
      return ecy.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eaf> RecordCodecBuilder<E, Either<ahd, ecz>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eaf(Either<ahd, ecz> $$0, ih<ecx> $$1, eai.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jb a(eda $$0, dcv $$1) {
      ecz $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ecz a(eda $$0) {
      return (ecz)this.c.map($$0::a, Function.identity());
   }

   public List<ecz.c> a(eda $$0, hx $$1, dcv $$2, boolean $$3) {
      ecz $$4 = this.a($$0);
      List<ecz.c> $$5 = $$4.a($$1, new ecv().a($$2), cwl.pa, $$3);
      List<ecz.c> $$6 = Lists.newArrayList();

      for (ecz.c $$7 : $$5) {
         sl $$8 = $$7.c();
         if ($$8 != null) {
            dkk $$9 = dkk.valueOf($$8.l("mode"));
            if ($$9 == dkk.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ecz.c> a(eda $$0, hx $$1, dcv $$2, aup $$3) {
      ecz $$4 = this.a($$0);
      ObjectArrayList<ecz.c> $$5 = $$4.a($$1, new ecv().a($$2), cwl.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ecz.c> $$0) {
      $$0.sort(Comparator.<ecz.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public dyr a(eda $$0, hx $$1, dcv $$2) {
      ecz $$3 = this.a($$0);
      return $$3.b(new ecv().a($$2), $$1);
   }

   @Override
   public boolean a(eda $$0, cud $$1, cub $$2, dkx $$3, hx $$4, hx $$5, dcv $$6, dyr $$7, aup $$8, boolean $$9) {
      ecz $$10 = this.a($$0);
      ecv $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ecz.c $$13 : ecz.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ecv a(dcv $$0, dyr $$1, boolean $$2) {
      ecv $$3 = new ecv();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ecb.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ech.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eah<?> a() {
      return eah.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
