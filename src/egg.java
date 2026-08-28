import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class egg {
   public static final Codec<egg> c = lp.X.q().dispatch(egg::a, egh::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends egg> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public egg(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract egh<?> a();

   public abstract List<eeo.a> a(dce var1, BiConsumer<iz, dsc> var2, azh var3, int var4, iz var5, edy var6);

   public int a(azh $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dce $$0, iz $$1) {
      return $$0.a($$1, $$0x -> eay.b($$0x) && !$$0x.a(dfb.i) && !$$0x.a(dfb.fl));
   }

   protected static void a(dce $$0, BiConsumer<iz, dsc> $$1, azh $$2, iz $$3, edy $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dce $$0, BiConsumer<iz, dsc> $$1, azh $$2, iz $$3, edy $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dce $$0, BiConsumer<iz, dsc> $$1, azh $$2, iz $$3, edy $$4, Function<dsc, dsc> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dce $$0, BiConsumer<iz, dsc> $$1, azh $$2, iz.a $$3, edy $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dce $$0, iz $$1) {
      return eck.c($$0, $$1);
   }

   public boolean b(dce $$0, iz $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(awp.t));
   }
}
