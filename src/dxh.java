import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dxh {
   public static final Codec<dxh> e = jy.aj.q().dispatch("element_type", dxh::a, dxi::codec);
   private static final ib<dzr> a = ib.a(new dzr(List.of()));
   @Nullable
   private volatile dxj.a b;

   protected static <E extends dxh> RecordCodecBuilder<E, dxj.a> d() {
      return dxj.a.c.fieldOf("projection").forGetter(dxh::e);
   }

   protected dxh(dxj.a $$0) {
      this.b = $$0;
   }

   public abstract iw a(dzu var1, dal var2);

   public abstract List<dzt.c> a(dzu var1, ht var2, dal var3, ate var4);

   public abstract dvs a(dzu var1, ht var2, dal var3);

   public abstract boolean a(dzu var1, crt var2, crr var3, dhy var4, ht var5, ht var6, dal var7, dvs var8, ate var9, boolean var10);

   public abstract dxi<?> a();

   public void a(cra $$0, dzt.c $$1, ht $$2, dal $$3, ate $$4, dvs $$5) {
   }

   public dxh a(dxj.a $$0) {
      this.b = $$0;
      return this;
   }

   public dxj.a e() {
      dxj.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dxj.a, dxa> g() {
      return $$0 -> dxa.b;
   }

   public static Function<dxj.a, dxe> a(String $$0) {
      return $$1 -> new dxe(Either.left(new afw($$0)), a, $$1);
   }

   public static Function<dxj.a, dxe> a(String $$0, ib<dzr> $$1) {
      return $$2 -> new dxe(Either.left(new afw($$0)), $$1, $$2);
   }

   public static Function<dxj.a, dxg> b(String $$0) {
      return $$1 -> new dxg(Either.left(new afw($$0)), a, $$1);
   }

   public static Function<dxj.a, dxg> b(String $$0, ib<dzr> $$1) {
      return $$2 -> new dxg(Either.left(new afw($$0)), $$1, $$2);
   }

   public static Function<dxj.a, dxb> a(ib<dve> $$0) {
      return $$1 -> new dxb($$0, $$1);
   }

   public static Function<dxj.a, dxf> a(List<Function<dxj.a, ? extends dxh>> $$0) {
      return $$1 -> new dxf($$0.stream().map($$1x -> (dxh)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
