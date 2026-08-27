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

public class eau extends eav {
   private static final Codec<Either<ahh, edo>> a = Codec.of(eau::a, ahh.a.map(Either::left));
   public static final Codec<eau> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eau::new));
   protected final Either<ahh, edo> c;
   protected final ih<edm> d;

   private static <T> DataResult<T> a(Either<ahh, edo> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ahh> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ahh.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eau> RecordCodecBuilder<E, ih<edm>> b() {
      return edn.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eau> RecordCodecBuilder<E, Either<ahh, edo>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eau(Either<ahh, edo> $$0, ih<edm> $$1, eax.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jb a(edp $$0, ddk $$1) {
      edo $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private edo a(edp $$0) {
      return (edo)this.c.map($$0::a, Function.identity());
   }

   public List<edo.c> a(edp $$0, hx $$1, ddk $$2, boolean $$3) {
      edo $$4 = this.a($$0);
      List<edo.c> $$5 = $$4.a($$1, new edk().a($$2), cxa.pa, $$3);
      List<edo.c> $$6 = Lists.newArrayList();

      for (edo.c $$7 : $$5) {
         so $$8 = $$7.c();
         if ($$8 != null) {
            dkz $$9 = dkz.valueOf($$8.l("mode"));
            if ($$9 == dkz.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<edo.c> a(edp $$0, hx $$1, ddk $$2, auw $$3) {
      edo $$4 = this.a($$0);
      ObjectArrayList<edo.c> $$5 = $$4.a($$1, new edk().a($$2), cxa.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<edo.c> $$0) {
      $$0.sort(Comparator.<edo.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public dzg a(edp $$0, hx $$1, ddk $$2) {
      edo $$3 = this.a($$0);
      return $$3.b(new edk().a($$2), $$1);
   }

   @Override
   public boolean a(edp $$0, cus $$1, cuq $$2, dlm $$3, hx $$4, hx $$5, ddk $$6, dzg $$7, auw $$8, boolean $$9) {
      edo $$10 = this.a($$0);
      edk $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (edo.c $$13 : edo.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected edk a(ddk $$0, dzg $$1, boolean $$2) {
      edk $$3 = new edk();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ecq.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ecw.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eaw<?> a() {
      return eaw.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
