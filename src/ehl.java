import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class ehl {
   public static final Codec<ehl> c = lt.V.r().dispatch(ehl::a, ehm::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends ehl> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public ehl(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ehm<?> a();

   public abstract List<eft.a> a(ddc var1, BiConsumer<jd, dtc> var2, ayw var3, int var4, jd var5, efd var6);

   public int a(ayw $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(ddc $$0, jd $$1) {
      return $$0.a($$1, $$0x -> ecd.b($$0x) && !$$0x.a(dga.i) && !$$0x.a(dga.fl));
   }

   protected static void a(ddc $$0, BiConsumer<jd, dtc> $$1, ayw $$2, jd $$3, efd $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(ddc $$0, BiConsumer<jd, dtc> $$1, ayw $$2, jd $$3, efd $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(ddc $$0, BiConsumer<jd, dtc> $$1, ayw $$2, jd $$3, efd $$4, Function<dtc, dtc> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(ddc $$0, BiConsumer<jd, dtc> $$1, ayw $$2, jd.a $$3, efd $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(ddc $$0, jd $$1) {
      return edp.c($$0, $$1);
   }

   public boolean b(ddc $$0, jd $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(awe.t));
   }
}
