import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class fnw {
   public static final fnw.a a = a(fnu::a, fnt.c);
   public static final fnw.a b = a(fnu::a, fnt.d);
   public static final fnw.a c = a(fnu::a, fnt.e);
   public static final fnw.a d = a(fnu::n, fnt.j);
   public static final fnw.a e = a(fnu::n, fnt.k);
   public static final fnw.a f = a(fnu::t, fnt.n);
   public static final fnw.a g = a(fnu::o, fnt.m);
   public static final fnw.a h = a(fnu::E, fnt.p);
   public static final fnw.a i = a(fnu::D, fnt.q);
   public static final fnw.a j = a(fnu::i, fnt.ay);
   public static final fnw.a k = a(fnu::d, fnt.az);
   public static final fnw.a l = a(fnu::j, fnt.aA);
   public static final fnw.a m = a(fnu::j, fnt.aB);
   public static final fnw.a n = a(fnu::j, fnt.aC);
   public static final fnw.a o = a(fnu::j, fnt.aD);
   public static final fnw.a p = a(fnu::l, fnt.aG);
   public static final fnw.a q = a(fnu::m, fnt.aE);
   public static final fnw.a r = a(fnu::G, fnt.aV);
   public static final fnw.a s = a(fnu::a, fnt.ad);
   public static final fnw.a t = a(fnu::A, fnt.bg);
   public static final fnw.a u = a(fnu::A, fnt.bh);
   public static final fnw.a v = a(fnu::b, fnt.br);
   public static final fnw.a w = a(fnu::q, fnt.j);
   public static final fnw.a x = a(fnu::q, fnt.k);
   public static final fnw.a y = a(fnu::u, fnt.n);
   public static final fnw.a z = a(fnu::v, fnt.j);
   private final fnu A;
   private final fns B;

   private fnw(fnu $$0, fns $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public fns a() {
      return this.B;
   }

   public fnu b() {
      return this.A;
   }

   public fnw a(Consumer<fnu> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public akv a(djm $$0, BiConsumer<akv, fnq> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public akv a(djm $$0, String $$1, BiConsumer<akv, fnq> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static fnw.a a(Function<djm, fnu> $$0, fns $$1) {
      return $$2 -> new fnw($$0.apply($$2), $$1);
   }

   public static fnw a(akv $$0) {
      return new fnw(fnu.b($$0), fnt.c);
   }

   @FunctionalInterface
   public interface a {
      fnw get(djm var1);

      default akv create(djm $$0, BiConsumer<akv, fnq> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default akv createWithSuffix(djm $$0, String $$1, BiConsumer<akv, fnq> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default fnw.a updateTexture(Consumer<fnu> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
