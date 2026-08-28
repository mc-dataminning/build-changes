import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class fnx {
   public static final fnx.a a = a(fnv::a, fnu.c);
   public static final fnx.a b = a(fnv::a, fnu.d);
   public static final fnx.a c = a(fnv::a, fnu.e);
   public static final fnx.a d = a(fnv::n, fnu.j);
   public static final fnx.a e = a(fnv::n, fnu.k);
   public static final fnx.a f = a(fnv::t, fnu.n);
   public static final fnx.a g = a(fnv::o, fnu.m);
   public static final fnx.a h = a(fnv::E, fnu.p);
   public static final fnx.a i = a(fnv::D, fnu.q);
   public static final fnx.a j = a(fnv::i, fnu.ay);
   public static final fnx.a k = a(fnv::d, fnu.az);
   public static final fnx.a l = a(fnv::j, fnu.aA);
   public static final fnx.a m = a(fnv::j, fnu.aB);
   public static final fnx.a n = a(fnv::j, fnu.aC);
   public static final fnx.a o = a(fnv::j, fnu.aD);
   public static final fnx.a p = a(fnv::l, fnu.aG);
   public static final fnx.a q = a(fnv::m, fnu.aE);
   public static final fnx.a r = a(fnv::G, fnu.aV);
   public static final fnx.a s = a(fnv::a, fnu.ad);
   public static final fnx.a t = a(fnv::A, fnu.bg);
   public static final fnx.a u = a(fnv::A, fnu.bh);
   public static final fnx.a v = a(fnv::b, fnu.br);
   public static final fnx.a w = a(fnv::q, fnu.j);
   public static final fnx.a x = a(fnv::q, fnu.k);
   public static final fnx.a y = a(fnv::u, fnu.n);
   public static final fnx.a z = a(fnv::v, fnu.j);
   private final fnv A;
   private final fnt B;

   private fnx(fnv $$0, fnt $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public fnt a() {
      return this.B;
   }

   public fnv b() {
      return this.A;
   }

   public fnx a(Consumer<fnv> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public akv a(djn $$0, BiConsumer<akv, fnr> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public akv a(djn $$0, String $$1, BiConsumer<akv, fnr> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static fnx.a a(Function<djn, fnv> $$0, fnt $$1) {
      return $$2 -> new fnx($$0.apply($$2), $$1);
   }

   public static fnx a(akv $$0) {
      return new fnx(fnv.b($$0), fnu.c);
   }

   @FunctionalInterface
   public interface a {
      fnx get(djn var1);

      default akv create(djn $$0, BiConsumer<akv, fnr> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default akv createWithSuffix(djn $$0, String $$1, BiConsumer<akv, fnr> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default fnx.a updateTexture(Consumer<fnv> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
