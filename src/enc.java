import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class enc {
   public static final Codec<enc> c = md.V.q().dispatch(enc::a, end::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends enc> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public enc(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract end<?> a();

   public abstract List<elh.a> a(dhv var1, BiConsumer<jj, dym> var2, azs var3, int var4, jj var5, ekr var6);

   public int a(azs $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dhv $$0, jj $$1) {
      return $$0.a($$1, $$0x -> ehr.b($$0x) && !$$0x.a(dkw.i) && !$$0x.a(dkw.fA));
   }

   protected static void a(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, jj $$3, ekr $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, jj $$3, ekr $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, jj $$3, ekr $$4, Function<dym, dym> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, jj.a $$3, ekr $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dhv $$0, jj $$1) {
      return ejd.d($$0, $$1);
   }

   public boolean b(dhv $$0, jj $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(awz.u));
   }
}
