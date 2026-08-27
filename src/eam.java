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

public class eam extends ean {
   private static final Codec<Either<ahg, edg>> a = Codec.of(eam::a, ahg.a.map(Either::left));
   public static final Codec<eam> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eam::new));
   protected final Either<ahg, edg> c;
   protected final ih<ede> d;

   private static <T> DataResult<T> a(Either<ahg, edg> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ahg> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ahg.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eam> RecordCodecBuilder<E, ih<ede>> b() {
      return edf.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eam> RecordCodecBuilder<E, Either<ahg, edg>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eam(Either<ahg, edg> $$0, ih<ede> $$1, eap.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jb a(edh $$0, ddc $$1) {
      edg $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private edg a(edh $$0) {
      return (edg)this.c.map($$0::a, Function.identity());
   }

   public List<edg.c> a(edh $$0, hx $$1, ddc $$2, boolean $$3) {
      edg $$4 = this.a($$0);
      List<edg.c> $$5 = $$4.a($$1, new edc().a($$2), cws.pa, $$3);
      List<edg.c> $$6 = Lists.newArrayList();

      for (edg.c $$7 : $$5) {
         sn $$8 = $$7.c();
         if ($$8 != null) {
            dkr $$9 = dkr.valueOf($$8.l("mode"));
            if ($$9 == dkr.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<edg.c> a(edh $$0, hx $$1, ddc $$2, auv $$3) {
      edg $$4 = this.a($$0);
      ObjectArrayList<edg.c> $$5 = $$4.a($$1, new edc().a($$2), cws.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<edg.c> $$0) {
      $$0.sort(Comparator.<edg.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public dyy a(edh $$0, hx $$1, ddc $$2) {
      edg $$3 = this.a($$0);
      return $$3.b(new edc().a($$2), $$1);
   }

   @Override
   public boolean a(edh $$0, cuk $$1, cui $$2, dle $$3, hx $$4, hx $$5, ddc $$6, dyy $$7, auv $$8, boolean $$9) {
      edg $$10 = this.a($$0);
      edc $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (edg.c $$13 : edg.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected edc a(ddc $$0, dyy $$1, boolean $$2) {
      edc $$3 = new edc();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(eci.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(eco.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eao<?> a() {
      return eao.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
