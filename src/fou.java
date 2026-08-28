import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class fou {
   public static final fou.a a = a(fos::a, foq.c);
   public static final fou.a b = a(fos::a, foq.d);
   public static final fou.a c = a(fos::a, foq.e);
   public static final fou.a d = a(fos::n, foq.j);
   public static final fou.a e = a(fos::n, foq.k);
   public static final fou.a f = a(fos::t, foq.n);
   public static final fou.a g = a(fos::o, foq.m);
   public static final fou.a h = a(fos::E, foq.p);
   public static final fou.a i = a(fos::D, foq.q);
   public static final fou.a j = a(fos::i, foq.ay);
   public static final fou.a k = a(fos::d, foq.az);
   public static final fou.a l = a(fos::j, foq.aA);
   public static final fou.a m = a(fos::j, foq.aB);
   public static final fou.a n = a(fos::j, foq.aC);
   public static final fou.a o = a(fos::j, foq.aD);
   public static final fou.a p = a(fos::b, foq.aE);
   public static final fou.a q = a(fos::b, foq.aF);
   public static final fou.a r = a(fos::b, foq.aG);
   public static final fou.a s = a(fos::b, foq.aH);
   public static final fou.a t = a(fos::l, foq.aK);
   public static final fou.a u = a(fos::m, foq.aI);
   public static final fou.a v = a(fos::G, foq.aZ);
   public static final fou.a w = a(fos::a, foq.ad);
   public static final fou.a x = a(fos::A, foq.bk);
   public static final fou.a y = a(fos::A, foq.bl);
   public static final fou.a z = a(fos::b, foq.bv);
   public static final fou.a A = a(fos::q, foq.j);
   public static final fou.a B = a(fos::q, foq.k);
   public static final fou.a C = a(fos::u, foq.n);
   public static final fou.a D = a(fos::v, foq.j);
   private final fos E;
   private final fop F;

   private fou(fos $$0, fop $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public fop a() {
      return this.F;
   }

   public fos b() {
      return this.E;
   }

   public fou a(Consumer<fos> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public aku a(dke $$0, BiConsumer<aku, fon> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public aku a(dke $$0, String $$1, BiConsumer<aku, fon> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static fou.a a(Function<dke, fos> $$0, fop $$1) {
      return $$2 -> new fou($$0.apply($$2), $$1);
   }

   public static fou a(aku $$0) {
      return new fou(fos.b($$0), foq.c);
   }

   @FunctionalInterface
   public interface a {
      fou get(dke var1);

      default aku create(dke $$0, BiConsumer<aku, fon> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default aku createWithSuffix(dke $$0, String $$1, BiConsumer<aku, fon> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default fou.a updateTexture(Consumer<fos> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
