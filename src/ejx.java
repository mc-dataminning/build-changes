import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class ejx {
   public static final Codec<ejx> c = lz.V.q().dispatch(ejx::a, ejy::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends ejx> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public ejx(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ejy<?> a();

   public abstract List<eif.a> a(dfl var1, BiConsumer<jh, dvo> var2, azv var3, int var4, jh var5, ehp var6);

   public int a(azv $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dfl $$0, jh $$1) {
      return $$0.a($$1, $$0x -> eep.b($$0x) && !$$0x.a(dil.i) && !$$0x.a(dil.fl));
   }

   protected static void a(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, jh $$3, ehp $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, jh $$3, ehp $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, jh $$3, ehp $$4, Function<dvo, dvo> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, jh.a $$3, ehp $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dfl $$0, jh $$1) {
      return egb.c($$0, $$1);
   }

   public boolean b(dfl $$0, jh $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(axd.u));
   }
}
