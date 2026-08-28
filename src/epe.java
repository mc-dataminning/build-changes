import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class epe {
   public static final Codec<epe> c = mg.V.q().dispatch(epe::a, epf::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends epe> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public epe(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract epf<?> a();

   public abstract List<enj.a> a(djn var1, BiConsumer<iv, eao> var2, azv var3, int var4, iv var5, emt var6);

   public int a(azv $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(djn $$0, iv $$1) {
      return $$0.a($$1, $$0x -> ejt.b($$0x) && !$$0x.a(dmo.i) && !$$0x.a(dmo.fE));
   }

   protected static void a(djn $$0, BiConsumer<iv, eao> $$1, azv $$2, iv $$3, emt $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(djn $$0, BiConsumer<iv, eao> $$1, azv $$2, iv $$3, emt $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(djn $$0, BiConsumer<iv, eao> $$1, azv $$2, iv $$3, emt $$4, Function<eao, eao> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(djn $$0, BiConsumer<iv, eao> $$1, azv $$2, iv.a $$3, emt $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(djn $$0, iv $$1) {
      return elf.d($$0, $$1);
   }

   public boolean b(djn $$0, iv $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(axc.u));
   }
}
