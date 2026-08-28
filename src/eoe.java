import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class eoe {
   public static final Codec<eoe> c = mf.V.q().dispatch(eoe::a, eof::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends eoe> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public eoe(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eof<?> a();

   public abstract List<emj.a> a(div var1, BiConsumer<iu, dzo> var2, azt var3, int var4, iu var5, elt var6);

   public int a(azt $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(div $$0, iu $$1) {
      return $$0.a($$1, $$0x -> eit.b($$0x) && !$$0x.a(dlw.i) && !$$0x.a(dlw.fA));
   }

   protected static void a(div $$0, BiConsumer<iu, dzo> $$1, azt $$2, iu $$3, elt $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(div $$0, BiConsumer<iu, dzo> $$1, azt $$2, iu $$3, elt $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(div $$0, BiConsumer<iu, dzo> $$1, azt $$2, iu $$3, elt $$4, Function<dzo, dzo> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(div $$0, BiConsumer<iu, dzo> $$1, azt $$2, iu.a $$3, elt $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(div $$0, iu $$1) {
      return ekf.d($$0, $$1);
   }

   public boolean b(div $$0, iu $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(axa.u));
   }
}
