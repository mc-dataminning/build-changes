import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class ftp {
   public static final ftp.a a = a(ftn::a, ftm.c);
   public static final ftp.a b = a(ftn::a, ftm.d);
   public static final ftp.a c = a(ftn::a, ftm.e);
   public static final ftp.a d = a(ftn::n, ftm.j);
   public static final ftp.a e = a(ftn::n, ftm.k);
   public static final ftp.a f = a(ftn::t, ftm.n);
   public static final ftp.a g = a(ftn::o, ftm.m);
   public static final ftp.a h = a(ftn::E, ftm.p);
   public static final ftp.a i = a(ftn::D, ftm.q);
   public static final ftp.a j = a(ftn::i, ftm.ay);
   public static final ftp.a k = a(ftn::d, ftm.az);
   public static final ftp.a l = a(ftn::j, ftm.aA);
   public static final ftp.a m = a(ftn::j, ftm.aB);
   public static final ftp.a n = a(ftn::j, ftm.aC);
   public static final ftp.a o = a(ftn::j, ftm.aD);
   public static final ftp.a p = a(ftn::b, ftm.aE);
   public static final ftp.a q = a(ftn::b, ftm.aF);
   public static final ftp.a r = a(ftn::b, ftm.aG);
   public static final ftp.a s = a(ftn::b, ftm.aH);
   public static final ftp.a t = a(ftn::l, ftm.aK);
   public static final ftp.a u = a(ftn::m, ftm.aI);
   public static final ftp.a v = a(ftn::G, ftm.aZ);
   public static final ftp.a w = a(ftn::a, ftm.ad);
   public static final ftp.a x = a(ftn::A, ftm.bk);
   public static final ftp.a y = a(ftn::A, ftm.bl);
   public static final ftp.a z = a(ftn::b, ftm.bv);
   public static final ftp.a A = a(ftn::q, ftm.j);
   public static final ftp.a B = a(ftn::q, ftm.k);
   public static final ftp.a C = a(ftn::u, ftm.n);
   public static final ftp.a D = a(ftn::v, ftm.j);
   private final ftn E;
   private final ftl F;

   private ftp(ftn $$0, ftl $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public ftl a() {
      return this.F;
   }

   public ftn b() {
      return this.E;
   }

   public ftp a(Consumer<ftn> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public ali a(dnc $$0, BiConsumer<ali, ftj> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public ali a(dnc $$0, String $$1, BiConsumer<ali, ftj> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static ftp.a a(Function<dnc, ftn> $$0, ftl $$1) {
      return $$2 -> new ftp($$0.apply($$2), $$1);
   }

   public static ftp a(ali $$0) {
      return new ftp(ftn.b($$0), ftm.c);
   }

   @FunctionalInterface
   public interface a {
      ftp get(dnc var1);

      default ali create(dnc $$0, BiConsumer<ali, ftj> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ali createWithSuffix(dnc $$0, String $$1, BiConsumer<ali, ftj> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ftp.a updateTexture(Consumer<ftn> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
