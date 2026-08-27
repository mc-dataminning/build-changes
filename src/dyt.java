import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dyt {
   public static final Codec<dyt> e = kc.aj.q().dispatch("element_type", dyt::a, dyu::codec);
   private static final ig<ebk> a = ig.a(new ebk(List.of()));
   @Nullable
   private volatile dyv.a b;

   protected static <E extends dyt> RecordCodecBuilder<E, dyv.a> d() {
      return dyv.a.c.fieldOf("projection").forGetter(dyt::e);
   }

   protected dyt(dyv.a $$0) {
      this.b = $$0;
   }

   public abstract ja a(ebn var1, dbr var2);

   public abstract List<ebm.c> a(ebn var1, hx var2, dbr var3, atw var4);

   public abstract dxe a(ebn var1, hx var2, dbr var3);

   public abstract boolean a(ebn var1, csz var2, csx var3, djk var4, hx var5, hx var6, dbr var7, dxe var8, atw var9, boolean var10);

   public abstract dyu<?> a();

   public void a(csg $$0, ebm.c $$1, hx $$2, dbr $$3, atw $$4, dxe $$5) {
   }

   public dyt a(dyv.a $$0) {
      this.b = $$0;
      return this;
   }

   public dyv.a e() {
      dyv.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dyv.a, dym> g() {
      return $$0 -> dym.b;
   }

   public static Function<dyv.a, dyq> a(String $$0) {
      return $$1 -> new dyq(Either.left(new agm($$0)), a, $$1);
   }

   public static Function<dyv.a, dyq> a(String $$0, ig<ebk> $$1) {
      return $$2 -> new dyq(Either.left(new agm($$0)), $$1, $$2);
   }

   public static Function<dyv.a, dys> b(String $$0) {
      return $$1 -> new dys(Either.left(new agm($$0)), a, $$1);
   }

   public static Function<dyv.a, dys> b(String $$0, ig<ebk> $$1) {
      return $$2 -> new dys(Either.left(new agm($$0)), $$1, $$2);
   }

   public static Function<dyv.a, dyn> a(ig<dwq> $$0) {
      return $$1 -> new dyn($$0, $$1);
   }

   public static Function<dyv.a, dyr> b(List<Function<dyv.a, ? extends dyt>> $$0) {
      return $$1 -> new dyr($$0.stream().map($$1x -> (dyt)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
