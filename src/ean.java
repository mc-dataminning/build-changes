import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ean {
   public static final Codec<ean> e = kd.ai.q().dispatch("element_type", ean::a, eao::codec);
   private static final ih<ede> a = ih.a(new ede(List.of()));
   @Nullable
   private volatile eap.a b;

   protected static <E extends ean> RecordCodecBuilder<E, eap.a> d() {
      return eap.a.c.fieldOf("projection").forGetter(ean::e);
   }

   protected ean(eap.a $$0) {
      this.b = $$0;
   }

   public abstract jb a(edh var1, ddc var2);

   public abstract List<edg.c> a(edh var1, hx var2, ddc var3, auv var4);

   public abstract dyy a(edh var1, hx var2, ddc var3);

   public abstract boolean a(edh var1, cuk var2, cui var3, dle var4, hx var5, hx var6, ddc var7, dyy var8, auv var9, boolean var10);

   public abstract eao<?> a();

   public void a(ctq $$0, edg.c $$1, hx $$2, ddc $$3, auv $$4, dyy $$5) {
   }

   public ean a(eap.a $$0) {
      this.b = $$0;
      return this;
   }

   public eap.a e() {
      eap.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<eap.a, eag> g() {
      return $$0 -> eag.b;
   }

   public static Function<eap.a, eak> a(String $$0) {
      return $$1 -> new eak(Either.left(new ahg($$0)), a, $$1);
   }

   public static Function<eap.a, eak> a(String $$0, ih<ede> $$1) {
      return $$2 -> new eak(Either.left(new ahg($$0)), $$1, $$2);
   }

   public static Function<eap.a, eam> b(String $$0) {
      return $$1 -> new eam(Either.left(new ahg($$0)), a, $$1);
   }

   public static Function<eap.a, eam> b(String $$0, ih<ede> $$1) {
      return $$2 -> new eam(Either.left(new ahg($$0)), $$1, $$2);
   }

   public static Function<eap.a, eah> a(ih<dyk> $$0) {
      return $$1 -> new eah($$0, $$1);
   }

   public static Function<eap.a, eal> b(List<Function<eap.a, ? extends ean>> $$0) {
      return $$1 -> new eal($$0.stream().map($$1x -> (ean)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
