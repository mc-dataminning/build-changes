import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class eiy {
   public static final Codec<eiy> c = lu.V.q().dispatch(eiy::a, eiz::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends eiy> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public eiy(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eiz<?> a();

   public abstract List<ehg.a> a(dem var1, BiConsumer<je, duo> var2, azl var3, int var4, je var5, egq var6);

   public int a(azl $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dem $$0, je $$1) {
      return $$0.a($$1, $$0x -> edq.b($$0x) && !$$0x.a(dhl.i) && !$$0x.a(dhl.fl));
   }

   protected static void a(dem $$0, BiConsumer<je, duo> $$1, azl $$2, je $$3, egq $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dem $$0, BiConsumer<je, duo> $$1, azl $$2, je $$3, egq $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dem $$0, BiConsumer<je, duo> $$1, azl $$2, je $$3, egq $$4, Function<duo, duo> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dem $$0, BiConsumer<je, duo> $$1, azl $$2, je.a $$3, egq $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dem $$0, je $$1) {
      return efc.c($$0, $$1);
   }

   public boolean b(dem $$0, je $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(awt.u));
   }
}
