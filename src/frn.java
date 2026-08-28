import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class frn {
   public static final frn.a a = a(frl::a, frk.c);
   public static final frn.a b = a(frl::a, frk.d);
   public static final frn.a c = a(frl::a, frk.e);
   public static final frn.a d = a(frl::n, frk.j);
   public static final frn.a e = a(frl::n, frk.k);
   public static final frn.a f = a(frl::t, frk.n);
   public static final frn.a g = a(frl::o, frk.m);
   public static final frn.a h = a(frl::E, frk.p);
   public static final frn.a i = a(frl::D, frk.q);
   public static final frn.a j = a(frl::i, frk.ay);
   public static final frn.a k = a(frl::d, frk.az);
   public static final frn.a l = a(frl::j, frk.aA);
   public static final frn.a m = a(frl::j, frk.aB);
   public static final frn.a n = a(frl::j, frk.aC);
   public static final frn.a o = a(frl::j, frk.aD);
   public static final frn.a p = a(frl::b, frk.aE);
   public static final frn.a q = a(frl::b, frk.aF);
   public static final frn.a r = a(frl::b, frk.aG);
   public static final frn.a s = a(frl::b, frk.aH);
   public static final frn.a t = a(frl::l, frk.aK);
   public static final frn.a u = a(frl::m, frk.aI);
   public static final frn.a v = a(frl::G, frk.aZ);
   public static final frn.a w = a(frl::a, frk.ad);
   public static final frn.a x = a(frl::A, frk.bk);
   public static final frn.a y = a(frl::A, frk.bl);
   public static final frn.a z = a(frl::b, frk.bv);
   public static final frn.a A = a(frl::q, frk.j);
   public static final frn.a B = a(frl::q, frk.k);
   public static final frn.a C = a(frl::u, frk.n);
   public static final frn.a D = a(frl::v, frk.j);
   private final frl E;
   private final frj F;

   private frn(frl $$0, frj $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public frj a() {
      return this.F;
   }

   public frl b() {
      return this.E;
   }

   public frn a(Consumer<frl> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public alg a(dmf $$0, BiConsumer<alg, frh> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public alg a(dmf $$0, String $$1, BiConsumer<alg, frh> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static frn.a a(Function<dmf, frl> $$0, frj $$1) {
      return $$2 -> new frn($$0.apply($$2), $$1);
   }

   public static frn a(alg $$0) {
      return new frn(frl.b($$0), frk.c);
   }

   @FunctionalInterface
   public interface a {
      frn get(dmf var1);

      default alg create(dmf $$0, BiConsumer<alg, frh> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alg createWithSuffix(dmf $$0, String $$1, BiConsumer<alg, frh> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default frn.a updateTexture(Consumer<frl> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
