import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class frg {
   public static final frg.a a = a(fre::a, frd.c);
   public static final frg.a b = a(fre::a, frd.d);
   public static final frg.a c = a(fre::a, frd.e);
   public static final frg.a d = a(fre::n, frd.j);
   public static final frg.a e = a(fre::n, frd.k);
   public static final frg.a f = a(fre::t, frd.n);
   public static final frg.a g = a(fre::o, frd.m);
   public static final frg.a h = a(fre::E, frd.p);
   public static final frg.a i = a(fre::D, frd.q);
   public static final frg.a j = a(fre::i, frd.ay);
   public static final frg.a k = a(fre::d, frd.az);
   public static final frg.a l = a(fre::j, frd.aA);
   public static final frg.a m = a(fre::j, frd.aB);
   public static final frg.a n = a(fre::j, frd.aC);
   public static final frg.a o = a(fre::j, frd.aD);
   public static final frg.a p = a(fre::b, frd.aE);
   public static final frg.a q = a(fre::b, frd.aF);
   public static final frg.a r = a(fre::b, frd.aG);
   public static final frg.a s = a(fre::b, frd.aH);
   public static final frg.a t = a(fre::l, frd.aK);
   public static final frg.a u = a(fre::m, frd.aI);
   public static final frg.a v = a(fre::G, frd.aZ);
   public static final frg.a w = a(fre::a, frd.ad);
   public static final frg.a x = a(fre::A, frd.bk);
   public static final frg.a y = a(fre::A, frd.bl);
   public static final frg.a z = a(fre::b, frd.bv);
   public static final frg.a A = a(fre::q, frd.j);
   public static final frg.a B = a(fre::q, frd.k);
   public static final frg.a C = a(fre::u, frd.n);
   public static final frg.a D = a(fre::v, frd.j);
   private final fre E;
   private final frc F;

   private frg(fre $$0, frc $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public frc a() {
      return this.F;
   }

   public fre b() {
      return this.E;
   }

   public frg a(Consumer<fre> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public alg a(dma $$0, BiConsumer<alg, fra> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public alg a(dma $$0, String $$1, BiConsumer<alg, fra> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static frg.a a(Function<dma, fre> $$0, frc $$1) {
      return $$2 -> new frg($$0.apply($$2), $$1);
   }

   public static frg a(alg $$0) {
      return new frg(fre.b($$0), frd.c);
   }

   @FunctionalInterface
   public interface a {
      frg get(dma var1);

      default alg create(dma $$0, BiConsumer<alg, fra> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alg createWithSuffix(dma $$0, String $$1, BiConsumer<alg, fra> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default frg.a updateTexture(Consumer<fre> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
