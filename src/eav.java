import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eav {
   public static final Codec<eav> e = kd.ai.q().dispatch("element_type", eav::a, eaw::codec);
   private static final ih<edm> a = ih.a(new edm(List.of()));
   @Nullable
   private volatile eax.a b;

   protected static <E extends eav> RecordCodecBuilder<E, eax.a> d() {
      return eax.a.c.fieldOf("projection").forGetter(eav::e);
   }

   protected eav(eax.a $$0) {
      this.b = $$0;
   }

   public abstract jb a(edp var1, ddk var2);

   public abstract List<edo.c> a(edp var1, hx var2, ddk var3, auw var4);

   public abstract dzg a(edp var1, hx var2, ddk var3);

   public abstract boolean a(edp var1, cus var2, cuq var3, dlm var4, hx var5, hx var6, ddk var7, dzg var8, auw var9, boolean var10);

   public abstract eaw<?> a();

   public void a(cty $$0, edo.c $$1, hx $$2, ddk $$3, auw $$4, dzg $$5) {
   }

   public eav a(eax.a $$0) {
      this.b = $$0;
      return this;
   }

   public eax.a e() {
      eax.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<eax.a, eao> g() {
      return $$0 -> eao.b;
   }

   public static Function<eax.a, eas> a(String $$0) {
      return $$1 -> new eas(Either.left(new ahh($$0)), a, $$1);
   }

   public static Function<eax.a, eas> a(String $$0, ih<edm> $$1) {
      return $$2 -> new eas(Either.left(new ahh($$0)), $$1, $$2);
   }

   public static Function<eax.a, eau> b(String $$0) {
      return $$1 -> new eau(Either.left(new ahh($$0)), a, $$1);
   }

   public static Function<eax.a, eau> b(String $$0, ih<edm> $$1) {
      return $$2 -> new eau(Either.left(new ahh($$0)), $$1, $$2);
   }

   public static Function<eax.a, eap> a(ih<dys> $$0) {
      return $$1 -> new eap($$0, $$1);
   }

   public static Function<eax.a, eat> b(List<Function<eax.a, ? extends eav>> $$0) {
      return $$1 -> new eat($$0.stream().map($$1x -> (eav)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
