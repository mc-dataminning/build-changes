import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class ftr {
   public static final ftr.a a = a(ftp::a, fto.c);
   public static final ftr.a b = a(ftp::a, fto.d);
   public static final ftr.a c = a(ftp::a, fto.e);
   public static final ftr.a d = a(ftp::n, fto.j);
   public static final ftr.a e = a(ftp::n, fto.k);
   public static final ftr.a f = a(ftp::t, fto.n);
   public static final ftr.a g = a(ftp::o, fto.m);
   public static final ftr.a h = a(ftp::E, fto.p);
   public static final ftr.a i = a(ftp::D, fto.q);
   public static final ftr.a j = a(ftp::i, fto.ay);
   public static final ftr.a k = a(ftp::d, fto.az);
   public static final ftr.a l = a(ftp::j, fto.aA);
   public static final ftr.a m = a(ftp::j, fto.aB);
   public static final ftr.a n = a(ftp::j, fto.aC);
   public static final ftr.a o = a(ftp::j, fto.aD);
   public static final ftr.a p = a(ftp::b, fto.aE);
   public static final ftr.a q = a(ftp::b, fto.aF);
   public static final ftr.a r = a(ftp::b, fto.aG);
   public static final ftr.a s = a(ftp::b, fto.aH);
   public static final ftr.a t = a(ftp::l, fto.aK);
   public static final ftr.a u = a(ftp::m, fto.aI);
   public static final ftr.a v = a(ftp::G, fto.aZ);
   public static final ftr.a w = a(ftp::a, fto.ad);
   public static final ftr.a x = a(ftp::A, fto.bk);
   public static final ftr.a y = a(ftp::A, fto.bl);
   public static final ftr.a z = a(ftp::b, fto.bv);
   public static final ftr.a A = a(ftp::q, fto.j);
   public static final ftr.a B = a(ftp::q, fto.k);
   public static final ftr.a C = a(ftp::u, fto.n);
   public static final ftr.a D = a(ftp::v, fto.j);
   private final ftp E;
   private final ftn F;

   private ftr(ftp $$0, ftn $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public ftn a() {
      return this.F;
   }

   public ftp b() {
      return this.E;
   }

   public ftr a(Consumer<ftp> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public alk a(dne $$0, BiConsumer<alk, ftl> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public alk a(dne $$0, String $$1, BiConsumer<alk, ftl> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static ftr.a a(Function<dne, ftp> $$0, ftn $$1) {
      return $$2 -> new ftr($$0.apply($$2), $$1);
   }

   public static ftr a(alk $$0) {
      return new ftr(ftp.b($$0), fto.c);
   }

   @FunctionalInterface
   public interface a {
      ftr get(dne var1);

      default alk create(dne $$0, BiConsumer<alk, ftl> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alk createWithSuffix(dne $$0, String $$1, BiConsumer<alk, ftl> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ftr.a updateTexture(Consumer<ftp> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
