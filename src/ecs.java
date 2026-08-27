import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ecs {
   public static final Codec<ecs> e = kf.ai.q().dispatch("element_type", ecs::a, ect::codec);
   private static final ij<efj> a = ij.a(new efj(List.of()));
   @Nullable
   private volatile ecu.a b;

   protected static <E extends ecs> RecordCodecBuilder<E, ecu.a> d() {
      return ecu.a.c.fieldOf("projection").forGetter(ecs::e);
   }

   protected ecs(ecu.a $$0) {
      this.b = $$0;
   }

   public abstract jd a(efm var1, dfe var2);

   public abstract List<efl.c> a(efm var1, hz var2, dfe var3, awp var4);

   public abstract ebd a(efm var1, hz var2, dfe var3);

   public abstract boolean a(efm var1, cwm var2, cwk var3, dng var4, hz var5, hz var6, dfe var7, ebd var8, awp var9, boolean var10);

   public abstract ect<?> a();

   public void a(cvs $$0, efl.c $$1, hz $$2, dfe $$3, awp $$4, ebd $$5) {
   }

   public ecs a(ecu.a $$0) {
      this.b = $$0;
      return this;
   }

   public ecu.a e() {
      ecu.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ecu.a, ecl> g() {
      return $$0 -> ecl.b;
   }

   public static Function<ecu.a, ecp> a(String $$0) {
      return $$1 -> new ecp(Either.left(new aiy($$0)), a, $$1);
   }

   public static Function<ecu.a, ecp> a(String $$0, ij<efj> $$1) {
      return $$2 -> new ecp(Either.left(new aiy($$0)), $$1, $$2);
   }

   public static Function<ecu.a, ecr> b(String $$0) {
      return $$1 -> new ecr(Either.left(new aiy($$0)), a, $$1);
   }

   public static Function<ecu.a, ecr> b(String $$0, ij<efj> $$1) {
      return $$2 -> new ecr(Either.left(new aiy($$0)), $$1, $$2);
   }

   public static Function<ecu.a, ecm> a(ij<eap> $$0) {
      return $$1 -> new ecm($$0, $$1);
   }

   public static Function<ecu.a, ecq> b(List<Function<ecu.a, ? extends ecs>> $$0) {
      return $$1 -> new ecq($$0.stream().map($$1x -> (ecs)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
