import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class ehi {
   public static final Codec<ehi> c = lt.V.r().dispatch(ehi::a, ehj::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends ehi> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public ehi(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ehj<?> a();

   public abstract List<efq.a> a(dda var1, BiConsumer<jd, dta> var2, ayv var3, int var4, jd var5, efa var6);

   public int a(ayv $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(dda $$0, jd $$1) {
      return $$0.a($$1, $$0x -> eca.b($$0x) && !$$0x.a(dfy.i) && !$$0x.a(dfy.fl));
   }

   protected static void a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, jd $$3, efa $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }
   }

   protected boolean b(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, jd $$3, efa $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, jd $$3, efa $$4, Function<dta, dta> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, jd.a $$3, efa $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected boolean a(dda $$0, jd $$1) {
      return edm.c($$0, $$1);
   }

   public boolean b(dda $$0, jd $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(awd.t));
   }
}
