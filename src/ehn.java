import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ehn {
   public static final Codec<ehn> e = lc.ai.q().dispatch("element_type", ehn::a, eho::codec);
   private static final iv<eke> a = iv.a(new eke(List.of()));
   @Nullable
   private volatile ehp.a b;

   protected static <E extends ehn> RecordCodecBuilder<E, ehp.a> d() {
      return ehp.a.c.fieldOf("projection").forGetter(ehn::e);
   }

   protected ehn(ehp.a $$0) {
      this.b = $$0;
   }

   public abstract jq a(ekh var1, dji var2);

   public abstract List<ekg.c> a(ekh var1, im var2, dji var3, ayd var4);

   public abstract efy a(ekh var1, im var2, dji var3);

   public abstract boolean a(ekh var1, dap var2, dan var3, drv var4, im var5, im var6, dji var7, efy var8, ayd var9, boolean var10);

   public abstract eho<?> a();

   public void a(czv $$0, ekg.c $$1, im $$2, dji $$3, ayd $$4, efy $$5) {
   }

   public ehn a(ehp.a $$0) {
      this.b = $$0;
      return this;
   }

   public ehp.a e() {
      ehp.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ehp.a, ehg> g() {
      return $$0 -> ehg.b;
   }

   public static Function<ehp.a, ehk> a(String $$0) {
      return $$1 -> new ehk(Either.left(new akf($$0)), a, $$1);
   }

   public static Function<ehp.a, ehk> a(String $$0, iv<eke> $$1) {
      return $$2 -> new ehk(Either.left(new akf($$0)), $$1, $$2);
   }

   public static Function<ehp.a, ehm> b(String $$0) {
      return $$1 -> new ehm(Either.left(new akf($$0)), a, $$1);
   }

   public static Function<ehp.a, ehm> b(String $$0, iv<eke> $$1) {
      return $$2 -> new ehm(Either.left(new akf($$0)), $$1, $$2);
   }

   public static Function<ehp.a, ehh> a(iv<efk> $$0) {
      return $$1 -> new ehh($$0, $$1);
   }

   public static Function<ehp.a, ehl> b(List<Function<ehp.a, ? extends ehn>> $$0) {
      return $$1 -> new ehl($$0.stream().map($$1x -> (ehn)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
