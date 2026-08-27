import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class dxc {
   public static final Codec<dxc> c = kd.X.q().dispatch(dxc::a, dxd::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends dxc> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public dxc(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dxd<?> a();

   public abstract List<dvk.a> a(ctv var1, BiConsumer<hx, djh> var2, auv var3, int var4, hx var5, duu var6);

   public int a(auv $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(ctv $$0, hx $$1) {
      return $$0.a($$1, $$0x -> dru.b($$0x) && !$$0x.a(cws.i) && !$$0x.a(cws.fl));
   }

   protected static void a(ctv $$0, BiConsumer<hx, djh> $$1, auv $$2, hx $$3, duu $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(ctv $$0, BiConsumer<hx, djh> $$1, auv $$2, hx $$3, duu $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(ctv $$0, BiConsumer<hx, djh> $$1, auv $$2, hx $$3, duu $$4, Function<djh, djh> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(ctv $$0, BiConsumer<hx, djh> $$1, auv $$2, hx.a $$3, duu $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(ctv $$0, hx $$1) {
      return dtg.c($$0, $$1);
   }

   public boolean b(ctv $$0, hx $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(ash.t));
   }
}
