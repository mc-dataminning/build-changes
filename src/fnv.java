import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class fnv {
   public static final fnv.a a = a(fnt::a, fns.c);
   public static final fnv.a b = a(fnt::a, fns.d);
   public static final fnv.a c = a(fnt::a, fns.e);
   public static final fnv.a d = a(fnt::n, fns.j);
   public static final fnv.a e = a(fnt::n, fns.k);
   public static final fnv.a f = a(fnt::t, fns.n);
   public static final fnv.a g = a(fnt::o, fns.m);
   public static final fnv.a h = a(fnt::E, fns.p);
   public static final fnv.a i = a(fnt::D, fns.q);
   public static final fnv.a j = a(fnt::i, fns.ay);
   public static final fnv.a k = a(fnt::d, fns.az);
   public static final fnv.a l = a(fnt::j, fns.aA);
   public static final fnv.a m = a(fnt::j, fns.aB);
   public static final fnv.a n = a(fnt::j, fns.aC);
   public static final fnv.a o = a(fnt::j, fns.aD);
   public static final fnv.a p = a(fnt::l, fns.aG);
   public static final fnv.a q = a(fnt::m, fns.aE);
   public static final fnv.a r = a(fnt::G, fns.aV);
   public static final fnv.a s = a(fnt::a, fns.ad);
   public static final fnv.a t = a(fnt::A, fns.bg);
   public static final fnv.a u = a(fnt::A, fns.bh);
   public static final fnv.a v = a(fnt::b, fns.br);
   public static final fnv.a w = a(fnt::q, fns.j);
   public static final fnv.a x = a(fnt::q, fns.k);
   public static final fnv.a y = a(fnt::u, fns.n);
   public static final fnv.a z = a(fnt::v, fns.j);
   private final fnt A;
   private final fnr B;

   private fnv(fnt $$0, fnr $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public fnr a() {
      return this.B;
   }

   public fnt b() {
      return this.A;
   }

   public fnv a(Consumer<fnt> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public aku a(djm $$0, BiConsumer<aku, fnp> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public aku a(djm $$0, String $$1, BiConsumer<aku, fnp> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static fnv.a a(Function<djm, fnt> $$0, fnr $$1) {
      return $$2 -> new fnv($$0.apply($$2), $$1);
   }

   public static fnv a(aku $$0) {
      return new fnv(fnt.b($$0), fns.c);
   }

   @FunctionalInterface
   public interface a {
      fnv get(djm var1);

      default aku create(djm $$0, BiConsumer<aku, fnp> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default aku createWithSuffix(djm $$0, String $$1, BiConsumer<aku, fnp> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default fnv.a updateTexture(Consumer<fnt> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
