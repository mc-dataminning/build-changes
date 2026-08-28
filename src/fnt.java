import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class fnt {
   public static final fnt.a a = a(fnr::a, fnq.c);
   public static final fnt.a b = a(fnr::a, fnq.d);
   public static final fnt.a c = a(fnr::a, fnq.e);
   public static final fnt.a d = a(fnr::n, fnq.j);
   public static final fnt.a e = a(fnr::n, fnq.k);
   public static final fnt.a f = a(fnr::t, fnq.n);
   public static final fnt.a g = a(fnr::o, fnq.m);
   public static final fnt.a h = a(fnr::E, fnq.p);
   public static final fnt.a i = a(fnr::D, fnq.q);
   public static final fnt.a j = a(fnr::i, fnq.ay);
   public static final fnt.a k = a(fnr::d, fnq.az);
   public static final fnt.a l = a(fnr::j, fnq.aA);
   public static final fnt.a m = a(fnr::j, fnq.aB);
   public static final fnt.a n = a(fnr::j, fnq.aC);
   public static final fnt.a o = a(fnr::j, fnq.aD);
   public static final fnt.a p = a(fnr::l, fnq.aG);
   public static final fnt.a q = a(fnr::m, fnq.aE);
   public static final fnt.a r = a(fnr::G, fnq.aV);
   public static final fnt.a s = a(fnr::a, fnq.ad);
   public static final fnt.a t = a(fnr::A, fnq.bg);
   public static final fnt.a u = a(fnr::A, fnq.bh);
   public static final fnt.a v = a(fnr::b, fnq.br);
   public static final fnt.a w = a(fnr::q, fnq.j);
   public static final fnt.a x = a(fnr::q, fnq.k);
   public static final fnt.a y = a(fnr::u, fnq.n);
   public static final fnt.a z = a(fnr::v, fnq.j);
   private final fnr A;
   private final fnp B;

   private fnt(fnr $$0, fnp $$1) {
      this.A = $$0;
      this.B = $$1;
   }

   public fnp a() {
      return this.B;
   }

   public fnr b() {
      return this.A;
   }

   public fnt a(Consumer<fnr> $$0) {
      $$0.accept(this.A);
      return this;
   }

   public aku a(djk $$0, BiConsumer<aku, fnn> $$1) {
      return this.B.a($$0, this.A, $$1);
   }

   public aku a(djk $$0, String $$1, BiConsumer<aku, fnn> $$2) {
      return this.B.a($$0, $$1, this.A, $$2);
   }

   private static fnt.a a(Function<djk, fnr> $$0, fnp $$1) {
      return $$2 -> new fnt($$0.apply($$2), $$1);
   }

   public static fnt a(aku $$0) {
      return new fnt(fnr.b($$0), fnq.c);
   }

   @FunctionalInterface
   public interface a {
      fnt get(djk var1);

      default aku create(djk $$0, BiConsumer<aku, fnn> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default aku createWithSuffix(djk $$0, String $$1, BiConsumer<aku, fnn> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default fnt.a updateTexture(Consumer<fnr> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
