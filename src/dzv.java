import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dzv {
   public static final Codec<dzv> e = kb.ai.q().dispatch("element_type", dzv::a, dzw::codec);
   private static final ie<ecm> a = ie.a(new ecm(List.of()));
   @Nullable
   private volatile dzx.a b;

   protected static <E extends dzv> RecordCodecBuilder<E, dzx.a> d() {
      return dzx.a.c.fieldOf("projection").forGetter(dzv::e);
   }

   protected dzv(dzx.a $$0) {
      this.b = $$0;
   }

   public abstract iz a(ecp var1, dcl var2);

   public abstract List<eco.c> a(ecp var1, hv var2, dcl var3, auf var4);

   public abstract dyg a(ecp var1, hv var2, dcl var3);

   public abstract boolean a(ecp var1, ctt var2, ctr var3, dkm var4, hv var5, hv var6, dcl var7, dyg var8, auf var9, boolean var10);

   public abstract dzw<?> a();

   public void a(csz $$0, eco.c $$1, hv $$2, dcl $$3, auf $$4, dyg $$5) {
   }

   public dzv a(dzx.a $$0) {
      this.b = $$0;
      return this;
   }

   public dzx.a e() {
      dzx.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dzx.a, dzo> g() {
      return $$0 -> dzo.b;
   }

   public static Function<dzx.a, dzs> a(String $$0) {
      return $$1 -> new dzs(Either.left(new agt($$0)), a, $$1);
   }

   public static Function<dzx.a, dzs> a(String $$0, ie<ecm> $$1) {
      return $$2 -> new dzs(Either.left(new agt($$0)), $$1, $$2);
   }

   public static Function<dzx.a, dzu> b(String $$0) {
      return $$1 -> new dzu(Either.left(new agt($$0)), a, $$1);
   }

   public static Function<dzx.a, dzu> b(String $$0, ie<ecm> $$1) {
      return $$2 -> new dzu(Either.left(new agt($$0)), $$1, $$2);
   }

   public static Function<dzx.a, dzp> a(ie<dxs> $$0) {
      return $$1 -> new dzp($$0, $$1);
   }

   public static Function<dzx.a, dzt> b(List<Function<dzx.a, ? extends dzv>> $$0) {
      return $$1 -> new dzt($$0.stream().map($$1x -> (dzv)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
