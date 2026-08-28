import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class fse {
   public static final fse.a a = a(fsc::a, fsb.c);
   public static final fse.a b = a(fsc::a, fsb.d);
   public static final fse.a c = a(fsc::a, fsb.e);
   public static final fse.a d = a(fsc::n, fsb.j);
   public static final fse.a e = a(fsc::n, fsb.k);
   public static final fse.a f = a(fsc::t, fsb.n);
   public static final fse.a g = a(fsc::o, fsb.m);
   public static final fse.a h = a(fsc::E, fsb.p);
   public static final fse.a i = a(fsc::D, fsb.q);
   public static final fse.a j = a(fsc::i, fsb.ay);
   public static final fse.a k = a(fsc::d, fsb.az);
   public static final fse.a l = a(fsc::j, fsb.aA);
   public static final fse.a m = a(fsc::j, fsb.aB);
   public static final fse.a n = a(fsc::j, fsb.aC);
   public static final fse.a o = a(fsc::j, fsb.aD);
   public static final fse.a p = a(fsc::b, fsb.aE);
   public static final fse.a q = a(fsc::b, fsb.aF);
   public static final fse.a r = a(fsc::b, fsb.aG);
   public static final fse.a s = a(fsc::b, fsb.aH);
   public static final fse.a t = a(fsc::l, fsb.aK);
   public static final fse.a u = a(fsc::m, fsb.aI);
   public static final fse.a v = a(fsc::G, fsb.aZ);
   public static final fse.a w = a(fsc::a, fsb.ad);
   public static final fse.a x = a(fsc::A, fsb.bk);
   public static final fse.a y = a(fsc::A, fsb.bl);
   public static final fse.a z = a(fsc::b, fsb.bv);
   public static final fse.a A = a(fsc::q, fsb.j);
   public static final fse.a B = a(fsc::q, fsb.k);
   public static final fse.a C = a(fsc::u, fsb.n);
   public static final fse.a D = a(fsc::v, fsb.j);
   private final fsc E;
   private final fsa F;

   private fse(fsc $$0, fsa $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public fsa a() {
      return this.F;
   }

   public fsc b() {
      return this.E;
   }

   public fse a(Consumer<fsc> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public alg a(dmr $$0, BiConsumer<alg, fry> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public alg a(dmr $$0, String $$1, BiConsumer<alg, fry> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static fse.a a(Function<dmr, fsc> $$0, fsa $$1) {
      return $$2 -> new fse($$0.apply($$2), $$1);
   }

   public static fse a(alg $$0) {
      return new fse(fsc.b($$0), fsb.c);
   }

   @FunctionalInterface
   public interface a {
      fse get(dmr var1);

      default alg create(dmr $$0, BiConsumer<alg, fry> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alg createWithSuffix(dmr $$0, String $$1, BiConsumer<alg, fry> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default fse.a updateTexture(Consumer<fsc> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
