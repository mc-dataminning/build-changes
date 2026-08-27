import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class eho {
   public static final Codec<eho> c = lh.X.q().dispatch(eho::a, ehp::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends eho> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public eho(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ehp<?> a();

   public abstract List<efw.a> a(dcg var1, BiConsumer<ir, dtc> var2, ayt var3, int var4, ir var5, efg var6);

   public int a(ayt $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dcg $$0, ir $$1) {
      return $$0.a($$1, $$0x -> eca.b($$0x) && !$$0x.a(dfe.j) && !$$0x.a(dfe.k) && !$$0x.a(dfe.l) && !$$0x.a(dfe.gd));
   }

   protected static void a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, ir $$3, efg $$4) {
      if (!$$0.z_()) {
         if ($$4.k || !c($$0, $$3)) {
            $$1.accept($$3, $$4.c.a($$2, $$3));
         }
      }
   }

   protected boolean b(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, ir $$3, efg $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, ir $$3, efg $$4, Function<dtc, dtc> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, ir.a $$3, efg $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dcg $$0, ir $$1) {
      return edr.c($$0, $$1);
   }

   public boolean b(dcg $$0, ir $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(awe.t));
   }
}
