import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class egx {
   public static final Codec<egx> e = kt.ai.q().dispatch("element_type", egx::a, egy::codec);
   private static final in<ejo> a = in.a(new ejo(List.of()));
   @Nullable
   private volatile egz.a b;

   protected static <E extends egx> RecordCodecBuilder<E, egz.a> d() {
      return egz.a.c.fieldOf("projection").forGetter(egx::e);
   }

   protected egx(egz.a $$0) {
      this.b = $$0;
   }

   public abstract ji a(ejr var1, dit var2);

   public abstract List<ejq.c> a(ejr var1, id var2, dit var3, axt var4);

   public abstract efi a(ejr var1, id var2, dit var3);

   public abstract boolean a(ejr var1, dab var2, czz var3, drf var4, id var5, id var6, dit var7, efi var8, axt var9, boolean var10);

   public abstract egy<?> a();

   public void a(czh $$0, ejq.c $$1, id $$2, dit $$3, axt $$4, efi $$5) {
   }

   public egx a(egz.a $$0) {
      this.b = $$0;
      return this;
   }

   public egz.a e() {
      egz.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<egz.a, egq> g() {
      return $$0 -> egq.b;
   }

   public static Function<egz.a, egu> a(String $$0) {
      return $$1 -> new egu(Either.left(new ajv($$0)), a, $$1);
   }

   public static Function<egz.a, egu> a(String $$0, in<ejo> $$1) {
      return $$2 -> new egu(Either.left(new ajv($$0)), $$1, $$2);
   }

   public static Function<egz.a, egw> b(String $$0) {
      return $$1 -> new egw(Either.left(new ajv($$0)), a, $$1);
   }

   public static Function<egz.a, egw> b(String $$0, in<ejo> $$1) {
      return $$2 -> new egw(Either.left(new ajv($$0)), $$1, $$2);
   }

   public static Function<egz.a, egr> a(in<eeu> $$0) {
      return $$1 -> new egr($$0, $$1);
   }

   public static Function<egz.a, egv> b(List<Function<egz.a, ? extends egx>> $$0) {
      return $$1 -> new egv($$0.stream().map($$1x -> (egx)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
