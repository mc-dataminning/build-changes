import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class fqu {
   public static final fqu.a a = a(fqs::a, fqr.c);
   public static final fqu.a b = a(fqs::a, fqr.d);
   public static final fqu.a c = a(fqs::a, fqr.e);
   public static final fqu.a d = a(fqs::n, fqr.j);
   public static final fqu.a e = a(fqs::n, fqr.k);
   public static final fqu.a f = a(fqs::t, fqr.n);
   public static final fqu.a g = a(fqs::o, fqr.m);
   public static final fqu.a h = a(fqs::E, fqr.p);
   public static final fqu.a i = a(fqs::D, fqr.q);
   public static final fqu.a j = a(fqs::i, fqr.ay);
   public static final fqu.a k = a(fqs::d, fqr.az);
   public static final fqu.a l = a(fqs::j, fqr.aA);
   public static final fqu.a m = a(fqs::j, fqr.aB);
   public static final fqu.a n = a(fqs::j, fqr.aC);
   public static final fqu.a o = a(fqs::j, fqr.aD);
   public static final fqu.a p = a(fqs::b, fqr.aE);
   public static final fqu.a q = a(fqs::b, fqr.aF);
   public static final fqu.a r = a(fqs::b, fqr.aG);
   public static final fqu.a s = a(fqs::b, fqr.aH);
   public static final fqu.a t = a(fqs::l, fqr.aK);
   public static final fqu.a u = a(fqs::m, fqr.aI);
   public static final fqu.a v = a(fqs::G, fqr.aZ);
   public static final fqu.a w = a(fqs::a, fqr.ad);
   public static final fqu.a x = a(fqs::A, fqr.bk);
   public static final fqu.a y = a(fqs::A, fqr.bl);
   public static final fqu.a z = a(fqs::b, fqr.bv);
   public static final fqu.a A = a(fqs::q, fqr.j);
   public static final fqu.a B = a(fqs::q, fqr.k);
   public static final fqu.a C = a(fqs::u, fqr.n);
   public static final fqu.a D = a(fqs::v, fqr.j);
   private final fqs E;
   private final fqq F;

   private fqu(fqs $$0, fqq $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public fqq a() {
      return this.F;
   }

   public fqs b() {
      return this.E;
   }

   public fqu a(Consumer<fqs> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public ale a(dlu $$0, BiConsumer<ale, fqo> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public ale a(dlu $$0, String $$1, BiConsumer<ale, fqo> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static fqu.a a(Function<dlu, fqs> $$0, fqq $$1) {
      return $$2 -> new fqu($$0.apply($$2), $$1);
   }

   public static fqu a(ale $$0) {
      return new fqu(fqs.b($$0), fqr.c);
   }

   @FunctionalInterface
   public interface a {
      fqu get(dlu var1);

      default ale create(dlu $$0, BiConsumer<ale, fqo> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ale createWithSuffix(dlu $$0, String $$1, BiConsumer<ale, fqo> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default fqu.a updateTexture(Consumer<fqs> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
