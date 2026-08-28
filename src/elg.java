import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class elg {
   public static final Codec<elg> c = mb.V.q().dispatch(elg::a, elh::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends elg> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public elg(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract elh<?> a();

   public abstract List<ejm.a> a(dgm var1, BiConsumer<ji, dwv> var2, azg var3, int var4, ji var5, eiw var6);

   public int a(azg $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dgm $$0, ji $$1) {
      return $$0.a($$1, $$0x -> efw.b($$0x) && !$$0x.a(djm.i) && !$$0x.a(djm.fA));
   }

   protected static void a(dgm $$0, BiConsumer<ji, dwv> $$1, azg $$2, ji $$3, eiw $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dgm $$0, BiConsumer<ji, dwv> $$1, azg $$2, ji $$3, eiw $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dgm $$0, BiConsumer<ji, dwv> $$1, azg $$2, ji $$3, eiw $$4, Function<dwv, dwv> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dgm $$0, BiConsumer<ji, dwv> $$1, azg $$2, ji.a $$3, eiw $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dgm $$0, ji $$1) {
      return ehi.c($$0, $$1);
   }

   public boolean b(dgm $$0, ji $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(awo.u));
   }
}
