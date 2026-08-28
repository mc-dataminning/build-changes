import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class ely {
   public static final Codec<ely> c = ma.V.q().dispatch(ely::a, elz::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends ely> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public ely(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract elz<?> a();

   public abstract List<eke.a> a(dhg var1, BiConsumer<jh, dxn> var2, bam var3, int var4, jh var5, ejo var6);

   public int a(bam $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dhg $$0, jh $$1) {
      return $$0.a($$1, $$0x -> ego.b($$0x) && !$$0x.a(dkg.i) && !$$0x.a(dkg.fz));
   }

   protected static void a(dhg $$0, BiConsumer<jh, dxn> $$1, bam $$2, jh $$3, ejo $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dhg $$0, BiConsumer<jh, dxn> $$1, bam $$2, jh $$3, ejo $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dhg $$0, BiConsumer<jh, dxn> $$1, bam $$2, jh $$3, ejo $$4, Function<dxn, dxn> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dhg $$0, BiConsumer<jh, dxn> $$1, bam $$2, jh.a $$3, ejo $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dhg $$0, jh $$1) {
      return eia.c($$0, $$1);
   }

   public boolean b(dhg $$0, jh $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(axu.u));
   }
}
