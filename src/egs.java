import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class egs {
   public static final Codec<egs> c = lq.V.r().dispatch(egs::a, egt::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends egs> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public egs(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract egt<?> a();

   public abstract List<efa.a> a(dcl var1, BiConsumer<ja, dsk> var2, ayo var3, int var4, ja var5, eek var6);

   public int a(ayo $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dcl $$0, ja $$1) {
      return $$0.a($$1, $$0x -> ebk.b($$0x) && !$$0x.a(dfj.i) && !$$0x.a(dfj.fl));
   }

   protected static void a(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, ja $$3, eek $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, ja $$3, eek $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, ja $$3, eek $$4, Function<dsk, dsk> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, ja.a $$3, eek $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dcl $$0, ja $$1) {
      return ecw.c($$0, $$1);
   }

   public boolean b(dcl $$0, ja $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(avw.t));
   }
}
