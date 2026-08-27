import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class edn {
   public static final Codec<edn> e = kh.ai.q().dispatch("element_type", edn::a, edo::codec);
   private static final il<ege> a = il.a(new ege(List.of()));
   @Nullable
   private volatile edp.a b;

   protected static <E extends edn> RecordCodecBuilder<E, edp.a> d() {
      return edp.a.c.fieldOf("projection").forGetter(edn::e);
   }

   protected edn(edp.a $$0) {
      this.b = $$0;
   }

   public abstract jf a(egh var1, dfr var2);

   public abstract List<egg.c> a(egh var1, ib var2, dfr var3, awt var4);

   public abstract eby a(egh var1, ib var2, dfr var3);

   public abstract boolean a(egh var1, cwz var2, cwx var3, dob var4, ib var5, ib var6, dfr var7, eby var8, awt var9, boolean var10);

   public abstract edo<?> a();

   public void a(cwf $$0, egg.c $$1, ib $$2, dfr $$3, awt $$4, eby $$5) {
   }

   public edn a(edp.a $$0) {
      this.b = $$0;
      return this;
   }

   public edp.a e() {
      edp.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<edp.a, edg> g() {
      return $$0 -> edg.b;
   }

   public static Function<edp.a, edk> a(String $$0) {
      return $$1 -> new edk(Either.left(new ajc($$0)), a, $$1);
   }

   public static Function<edp.a, edk> a(String $$0, il<ege> $$1) {
      return $$2 -> new edk(Either.left(new ajc($$0)), $$1, $$2);
   }

   public static Function<edp.a, edm> b(String $$0) {
      return $$1 -> new edm(Either.left(new ajc($$0)), a, $$1);
   }

   public static Function<edp.a, edm> b(String $$0, il<ege> $$1) {
      return $$2 -> new edm(Either.left(new ajc($$0)), $$1, $$2);
   }

   public static Function<edp.a, edh> a(il<ebk> $$0) {
      return $$1 -> new edh($$0, $$1);
   }

   public static Function<edp.a, edl> b(List<Function<edp.a, ? extends edn>> $$0) {
      return $$1 -> new edl($$0.stream().map($$1x -> (edn)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
