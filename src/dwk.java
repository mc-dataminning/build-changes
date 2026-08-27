import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class dwk {
   public static final Codec<dwk> c = kb.X.q().dispatch(dwk::a, dwl::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends dwk> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public dwk(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dwl<?> a();

   public abstract List<dus.a> a(cte var1, BiConsumer<hv, dip> var2, auf var3, int var4, hv var5, duc var6);

   public int a(auf $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(cte $$0, hv $$1) {
      return $$0.a($$1, $$0x -> drc.b($$0x) && !$$0x.a(cwb.i) && !$$0x.a(cwb.fl));
   }

   protected static void a(cte $$0, BiConsumer<hv, dip> $$1, auf $$2, hv $$3, duc $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(cte $$0, BiConsumer<hv, dip> $$1, auf $$2, hv $$3, duc $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(cte $$0, BiConsumer<hv, dip> $$1, auf $$2, hv $$3, duc $$4, Function<dip, dip> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(cte $$0, BiConsumer<hv, dip> $$1, auf $$2, hv.a $$3, duc $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(cte $$0, hv $$1) {
      return dso.c($$0, $$1);
   }

   public boolean b(cte $$0, hv $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(arr.t));
   }
}
