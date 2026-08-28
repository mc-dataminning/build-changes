import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class ftc {
   public static final ftc.a a = a(fta::a, fsz.c);
   public static final ftc.a b = a(fta::a, fsz.d);
   public static final ftc.a c = a(fta::a, fsz.e);
   public static final ftc.a d = a(fta::n, fsz.j);
   public static final ftc.a e = a(fta::n, fsz.k);
   public static final ftc.a f = a(fta::t, fsz.n);
   public static final ftc.a g = a(fta::o, fsz.m);
   public static final ftc.a h = a(fta::E, fsz.p);
   public static final ftc.a i = a(fta::D, fsz.q);
   public static final ftc.a j = a(fta::i, fsz.ay);
   public static final ftc.a k = a(fta::d, fsz.az);
   public static final ftc.a l = a(fta::j, fsz.aA);
   public static final ftc.a m = a(fta::j, fsz.aB);
   public static final ftc.a n = a(fta::j, fsz.aC);
   public static final ftc.a o = a(fta::j, fsz.aD);
   public static final ftc.a p = a(fta::b, fsz.aE);
   public static final ftc.a q = a(fta::b, fsz.aF);
   public static final ftc.a r = a(fta::b, fsz.aG);
   public static final ftc.a s = a(fta::b, fsz.aH);
   public static final ftc.a t = a(fta::l, fsz.aK);
   public static final ftc.a u = a(fta::m, fsz.aI);
   public static final ftc.a v = a(fta::G, fsz.aZ);
   public static final ftc.a w = a(fta::a, fsz.ad);
   public static final ftc.a x = a(fta::A, fsz.bk);
   public static final ftc.a y = a(fta::A, fsz.bl);
   public static final ftc.a z = a(fta::b, fsz.bv);
   public static final ftc.a A = a(fta::q, fsz.j);
   public static final ftc.a B = a(fta::q, fsz.k);
   public static final ftc.a C = a(fta::u, fsz.n);
   public static final ftc.a D = a(fta::v, fsz.j);
   private final fta E;
   private final fsy F;

   private ftc(fta $$0, fsy $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public fsy a() {
      return this.F;
   }

   public fta b() {
      return this.E;
   }

   public ftc a(Consumer<fta> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public alr a(dno $$0, BiConsumer<alr, fsw> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public alr a(dno $$0, String $$1, BiConsumer<alr, fsw> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static ftc.a a(Function<dno, fta> $$0, fsy $$1) {
      return $$2 -> new ftc($$0.apply($$2), $$1);
   }

   public static ftc a(alr $$0) {
      return new ftc(fta.b($$0), fsz.c);
   }

   @FunctionalInterface
   public interface a {
      ftc get(dno var1);

      default alr create(dno $$0, BiConsumer<alr, fsw> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default alr createWithSuffix(dno $$0, String $$1, BiConsumer<alr, fsw> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default ftc.a updateTexture(Consumer<fta> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
