import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dyc {
   public static final Codec<dyc> e = jy.aj.q().dispatch("element_type", dyc::a, dyd::codec);
   private static final ib<eat> a = ib.a(new eat(List.of()));
   @Nullable
   private volatile dye.a b;

   protected static <E extends dyc> RecordCodecBuilder<E, dye.a> d() {
      return dye.a.c.fieldOf("projection").forGetter(dyc::e);
   }

   protected dyc(dye.a $$0) {
      this.b = $$0;
   }

   public abstract iw a(eaw var1, dbf var2);

   public abstract List<eav.c> a(eaw var1, ht var2, dbf var3, ato var4);

   public abstract dwn a(eaw var1, ht var2, dbf var3);

   public abstract boolean a(eaw var1, csm var2, csk var3, dit var4, ht var5, ht var6, dbf var7, dwn var8, ato var9, boolean var10);

   public abstract dyd<?> a();

   public void a(crt $$0, eav.c $$1, ht $$2, dbf $$3, ato $$4, dwn $$5) {
   }

   public dyc a(dye.a $$0) {
      this.b = $$0;
      return this;
   }

   public dye.a e() {
      dye.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dye.a, dxv> g() {
      return $$0 -> dxv.b;
   }

   public static Function<dye.a, dxz> a(String $$0) {
      return $$1 -> new dxz(Either.left(new agg($$0)), a, $$1);
   }

   public static Function<dye.a, dxz> a(String $$0, ib<eat> $$1) {
      return $$2 -> new dxz(Either.left(new agg($$0)), $$1, $$2);
   }

   public static Function<dye.a, dyb> b(String $$0) {
      return $$1 -> new dyb(Either.left(new agg($$0)), a, $$1);
   }

   public static Function<dye.a, dyb> b(String $$0, ib<eat> $$1) {
      return $$2 -> new dyb(Either.left(new agg($$0)), $$1, $$2);
   }

   public static Function<dye.a, dxw> a(ib<dvz> $$0) {
      return $$1 -> new dxw($$0, $$1);
   }

   public static Function<dye.a, dya> a(List<Function<dye.a, ? extends dyc>> $$0) {
      return $$1 -> new dya($$0.stream().map($$1x -> (dyc)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
