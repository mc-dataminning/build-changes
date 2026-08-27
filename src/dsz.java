import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class dsz {
   public static final Codec<dsz> c = jd.Y.q().dispatch(dsz::a, dta::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends dsz> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public dsz(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dta<?> a();

   public abstract List<drh.a> a(cpw var1, BiConsumer<gw, dfe> var2, arx var3, int var4, gw var5, dqr var6);

   public int a(arx $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(cpw $$0, gw $$1) {
      return $$0.a($$1, $$0x -> dnr.b($$0x) && !$$0x.a(csr.i) && !$$0x.a(csr.fl));
   }

   protected static void a(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, gw $$3, dqr $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, gw $$3, dqr $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, gw $$3, dqr $$4, Function<dfe, dfe> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, gw.a $$3, dqr $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(cpw $$0, gw $$1) {
      return dpd.c($$0, $$1);
   }

   public boolean b(cpw $$0, gw $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(apo.t));
   }
}
