import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class dwv {
   public static final Codec<dwv> c = kd.X.q().dispatch(dwv::a, dww::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends dwv> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public dwv(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dww<?> a();

   public abstract List<dvd.a> a(cto var1, BiConsumer<hx, dja> var2, aup var3, int var4, hx var5, dun var6);

   public int a(aup $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(cto $$0, hx $$1) {
      return $$0.a($$1, $$0x -> drn.b($$0x) && !$$0x.a(cwl.i) && !$$0x.a(cwl.fl));
   }

   protected static void a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, hx $$3, dun $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, hx $$3, dun $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, hx $$3, dun $$4, Function<dja, dja> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, hx.a $$3, dun $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(cto $$0, hx $$1) {
      return dsz.c($$0, $$1);
   }

   public boolean b(cto $$0, hx $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(asb.t));
   }
}
