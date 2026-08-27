import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class dxk {
   public static final Codec<dxk> c = kd.X.q().dispatch(dxk::a, dxl::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends dxk> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public dxk(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dxl<?> a();

   public abstract List<dvs.a> a(cud var1, BiConsumer<hx, djp> var2, auw var3, int var4, hx var5, dvc var6);

   public int a(auw $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(cud $$0, hx $$1) {
      return $$0.a($$1, $$0x -> dsc.b($$0x) && !$$0x.a(cxa.i) && !$$0x.a(cxa.fl));
   }

   protected static void a(cud $$0, BiConsumer<hx, djp> $$1, auw $$2, hx $$3, dvc $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(cud $$0, BiConsumer<hx, djp> $$1, auw $$2, hx $$3, dvc $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(cud $$0, BiConsumer<hx, djp> $$1, auw $$2, hx $$3, dvc $$4, Function<djp, djp> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(cud $$0, BiConsumer<hx, djp> $$1, auw $$2, hx.a $$3, dvc $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(cud $$0, hx $$1) {
      return dto.c($$0, $$1);
   }

   public boolean b(cud $$0, hx $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(asi.t));
   }
}
