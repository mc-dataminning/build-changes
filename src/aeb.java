import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aeb {
   private static final aqo<aea<?>> C = aqo.c(16);
   public static final aea<Byte> a = aea.a(($$0, $$1) -> $$0.k($$1), si::readByte);
   public static final aea<Integer> b = aea.a(si::c, si::m);
   public static final aea<Long> c = aea.a(si::a, si::n);
   public static final aea<Float> d = aea.a(si::a, si::readFloat);
   public static final aea<String> e = aea.a(si::a, si::r);
   public static final aea<tf> f = aea.a(si::a, si::l);
   public static final aea<Optional<tf>> g = aea.b(si::a, si::l);
   public static final aea<cix> h = new aea<cix>() {
      public void a(si $$0, cix $$1) {
         $$0.a($$1);
      }

      public cix b(si $$0) {
         return $$0.q();
      }

      public cix a(cix $$0) {
         return $$0.p();
      }
   };
   public static final aea<dez> i = aea.a(csl.o);
   public static final aea<Optional<dez>> j = new aea.a<Optional<dez>>() {
      public void a(si $$0, Optional<dez> $$1) {
         if ($$1.isPresent()) {
            $$0.c(csl.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dez> b(si $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? Optional.empty() : Optional.of(csl.a($$1));
      }
   };
   public static final aea<Boolean> k = aea.a(si::a, si::readBoolean);
   public static final aea<it> l = new aea.a<it>() {
      public void a(si $$0, it $$1) {
         $$0.a(jb.k, $$1.b());
         $$1.a($$0);
      }

      public it b(si $$0) {
         return this.a($$0, $$0.a(jb.k));
      }

      private <T extends it> T a(si $$0, iu<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final aea<hw> m = new aea.a<hw>() {
      public void a(si $$0, hw $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public hw b(si $$0) {
         return new hw($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final aea<gu> n = aea.a(si::a, si::e);
   public static final aea<Optional<gu>> o = aea.b(si::a, si::e);
   public static final aea<ha> p = aea.a(ha.class);
   public static final aea<Optional<UUID>> q = aea.b(si::a, si::o);
   public static final aea<Optional<hd>> r = aea.b(si::a, si::h);
   public static final aea<qr> s = new aea<qr>() {
      public void a(si $$0, qr $$1) {
         $$0.a((rk)$$1);
      }

      public qr b(si $$0) {
         return $$0.p();
      }

      public qr a(qr $$0) {
         return $$0.h();
      }
   };
   public static final aea<cba> t = new aea.a<cba>() {
      public void a(si $$0, cba $$1) {
         $$0.a(jb.z, $$1.a());
         $$0.a(jb.A, $$1.b());
         $$0.c($$1.c());
      }

      public cba b(si $$0) {
         return new cba($$0.a(jb.z), $$0.a(jb.A), $$0.m());
      }
   };
   public static final aea<OptionalInt> u = new aea.a<OptionalInt>() {
      public void a(si $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(si $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final aea<bjk> v = aea.a(bjk.class);
   public static final aea<bun> w = aea.a(jb.aj);
   public static final aea<buu> x = aea.a(jb.ak);
   public static final aea<he<byb>> y = aea.a(jb.m.t());
   public static final aea<bwv.a> z = aea.a(bwv.a.class);
   public static final aea<Vector3f> A = aea.a(si::a, si::i);
   public static final aea<Quaternionf> B = aea.a(si::a, si::j);

   public static void a(aea<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static aea<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(aea<?> $$0) {
      return C.a($$0);
   }

   private aeb() {
   }

   static {
      a(a);
      a(b);
      a(c);
      a(d);
      a(e);
      a(f);
      a(g);
      a(h);
      a(k);
      a(m);
      a(n);
      a(o);
      a(p);
      a(q);
      a(i);
      a(j);
      a(s);
      a(l);
      a(t);
      a(u);
      a(v);
      a(w);
      a(x);
      a(r);
      a(y);
      a(z);
      a(A);
      a(B);
   }
}
