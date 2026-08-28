import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class elh {
   public static final Codec<elh> c = mb.V.q().dispatch(elh::a, eli::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends elh> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public elh(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eli<?> a();

   public abstract List<ejn.a> a(dgn var1, BiConsumer<ji, dww> var2, azh var3, int var4, ji var5, eix var6);

   public int a(azh $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dgn $$0, ji $$1) {
      return $$0.a($$1, $$0x -> efx.b($$0x) && !$$0x.a(djn.i) && !$$0x.a(djn.fA));
   }

   protected static void a(dgn $$0, BiConsumer<ji, dww> $$1, azh $$2, ji $$3, eix $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dgn $$0, BiConsumer<ji, dww> $$1, azh $$2, ji $$3, eix $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dgn $$0, BiConsumer<ji, dww> $$1, azh $$2, ji $$3, eix $$4, Function<dww, dww> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dgn $$0, BiConsumer<ji, dww> $$1, azh $$2, ji.a $$3, eix $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dgn $$0, ji $$1) {
      return ehj.c($$0, $$1);
   }

   public boolean b(dgn $$0, ji $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(awp.u));
   }
}
