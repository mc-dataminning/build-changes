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

public class ehm extends ehn {
   private static final Codec<Either<akf, ekg>> a = Codec.of(ehm::a, akf.a.map(Either::left));
   public static final Codec<ehm> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, ehm::new));
   protected final Either<akf, ekg> c;
   protected final iv<eke> d;

   private static <T> DataResult<T> a(Either<akf, ekg> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akf> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akf.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ehm> RecordCodecBuilder<E, iv<eke>> b() {
      return ekf.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ehm> RecordCodecBuilder<E, Either<akf, ekg>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ehm(Either<akf, ekg> $$0, iv<eke> $$1, ehp.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jq a(ekh $$0, dji $$1) {
      ekg $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ekg a(ekh $$0) {
      return (ekg)this.c.map($$0::a, Function.identity());
   }

   public List<ekg.c> a(ekh $$0, im $$1, dji $$2, boolean $$3) {
      ekg $$4 = this.a($$0);
      List<ekg.c> $$5 = $$4.a($$1, new ekc().a($$2), dcx.pa, $$3);
      List<ekg.c> $$6 = Lists.newArrayList();

      for (ekg.c $$7 : $$5) {
         ty $$8 = $$7.c();
         if ($$8 != null) {
            dri $$9 = dri.valueOf($$8.l("mode"));
            if ($$9 == dri.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ekg.c> a(ekh $$0, im $$1, dji $$2, ayd $$3) {
      ekg $$4 = this.a($$0);
      ObjectArrayList<ekg.c> $$5 = $$4.a($$1, new ekc().a($$2), dcx.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ekg.c> $$0) {
      $$0.sort(Comparator.<ekg.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public efy a(ekh $$0, im $$1, dji $$2) {
      ekg $$3 = this.a($$0);
      return $$3.b(new ekc().a($$2), $$1);
   }

   @Override
   public boolean a(ekh $$0, dap $$1, dan $$2, drv $$3, im $$4, im $$5, dji $$6, efy $$7, ayd $$8, boolean $$9) {
      ekg $$10 = this.a($$0);
      ekc $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ekg.c $$13 : ekg.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ekc a(dji $$0, efy $$1, boolean $$2) {
      ekc $$3 = new ekc();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(eji.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ejo.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eho<?> a() {
      return eho.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
