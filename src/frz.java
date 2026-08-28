import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class frz {
   public static final frz.a a = a(frx::a, frw.c);
   public static final frz.a b = a(frx::a, frw.d);
   public static final frz.a c = a(frx::a, frw.e);
   public static final frz.a d = a(frx::n, frw.j);
   public static final frz.a e = a(frx::n, frw.k);
   public static final frz.a f = a(frx::t, frw.n);
   public static final frz.a g = a(frx::o, frw.m);
   public static final frz.a h = a(frx::E, frw.p);
   public static final frz.a i = a(frx::D, frw.q);
   public static final frz.a j = a(frx::i, frw.ay);
   public static final frz.a k = a(frx::d, frw.az);
   public static final frz.a l = a(frx::j, frw.aA);
   public static final frz.a m = a(frx::j, frw.aB);
   public static final frz.a n = a(frx::j, frw.aC);
   public static final frz.a o = a(frx::j, frw.aD);
   public static final frz.a p = a(frx::b, frw.aE);
   public static final frz.a q = a(frx::b, frw.aF);
   public static final frz.a r = a(frx::b, frw.aG);
   public static final frz.a s = a(frx::b, frw.aH);
   public static final frz.a t = a(frx::l, frw.aK);
   public static final frz.a u = a(frx::m, frw.aI);
   public static final frz.a v = a(frx::G, frw.aZ);
   public static final frz.a w = a(frx::a, frw.ad);
   public static final frz.a x = a(frx::A, frw.bk);
   public static final frz.a y = a(frx::A, frw.bl);
   public static final frz.a z = a(frx::b, frw.bv);
   public static final frz.a A = a(frx::q, frw.j);
   public static final frz.a B = a(frx::q, frw.k);
   public static final frz.a C = a(frx::u, frw.n);
   public static final frz.a D = a(frx::v, frw.j);
   private final frx E;
   private final frv F;

   private frz(frx $$0, frv $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public frv a() {
      return this.F;
   }

   public frx b() {
      return this.E;
   }

   public frz a(Consumer<frx> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public alg a(dmm $$0, BiConsumer<alg, frt> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public alg a(dmm $$0, String $$1, BiConsumer<alg, frt> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static frz.a a(Function<dmm, frx> $$0, frv $$1) {
      return $$2 -> new frz($$0.apply($$2), $$1);
   }

   public static frz a(alg $$0) {
      return new frz(frx.b($$0), frw.c);
   }

   @FunctionalInterface
   public interface a {
      frz get(dmm var1);

      default alg create(dmm $$0, BiConsumer<alg, frt> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alg createWithSuffix(dmm $$0, String $$1, BiConsumer<alg, frt> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default frz.a updateTexture(Consumer<frx> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
