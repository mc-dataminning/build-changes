import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class fpr {
   public static final fpr.a a = a(fpp::a, fpo.c);
   public static final fpr.a b = a(fpp::a, fpo.d);
   public static final fpr.a c = a(fpp::a, fpo.e);
   public static final fpr.a d = a(fpp::n, fpo.j);
   public static final fpr.a e = a(fpp::n, fpo.k);
   public static final fpr.a f = a(fpp::t, fpo.n);
   public static final fpr.a g = a(fpp::o, fpo.m);
   public static final fpr.a h = a(fpp::E, fpo.p);
   public static final fpr.a i = a(fpp::D, fpo.q);
   public static final fpr.a j = a(fpp::i, fpo.ay);
   public static final fpr.a k = a(fpp::d, fpo.az);
   public static final fpr.a l = a(fpp::j, fpo.aA);
   public static final fpr.a m = a(fpp::j, fpo.aB);
   public static final fpr.a n = a(fpp::j, fpo.aC);
   public static final fpr.a o = a(fpp::j, fpo.aD);
   public static final fpr.a p = a(fpp::b, fpo.aE);
   public static final fpr.a q = a(fpp::b, fpo.aF);
   public static final fpr.a r = a(fpp::b, fpo.aG);
   public static final fpr.a s = a(fpp::b, fpo.aH);
   public static final fpr.a t = a(fpp::l, fpo.aK);
   public static final fpr.a u = a(fpp::m, fpo.aI);
   public static final fpr.a v = a(fpp::G, fpo.aZ);
   public static final fpr.a w = a(fpp::a, fpo.ad);
   public static final fpr.a x = a(fpp::A, fpo.bk);
   public static final fpr.a y = a(fpp::A, fpo.bl);
   public static final fpr.a z = a(fpp::b, fpo.bv);
   public static final fpr.a A = a(fpp::q, fpo.j);
   public static final fpr.a B = a(fpp::q, fpo.k);
   public static final fpr.a C = a(fpp::u, fpo.n);
   public static final fpr.a D = a(fpp::v, fpo.j);
   private final fpp E;
   private final fpn F;

   private fpr(fpp $$0, fpn $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public fpn a() {
      return this.F;
   }

   public fpp b() {
      return this.E;
   }

   public fpr a(Consumer<fpp> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public ald a(dku $$0, BiConsumer<ald, fpl> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public ald a(dku $$0, String $$1, BiConsumer<ald, fpl> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static fpr.a a(Function<dku, fpp> $$0, fpn $$1) {
      return $$2 -> new fpr($$0.apply($$2), $$1);
   }

   public static fpr a(ald $$0) {
      return new fpr(fpp.b($$0), fpo.c);
   }

   @FunctionalInterface
   public interface a {
      fpr get(dku var1);

      default ald create(dku $$0, BiConsumer<ald, fpl> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ald createWithSuffix(dku $$0, String $$1, BiConsumer<ald, fpl> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default fpr.a updateTexture(Consumer<fpp> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
