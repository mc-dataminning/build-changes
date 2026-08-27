import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aee {
   private static final aqr<aed<?>> C = aqr.c(16);
   public static final aed<Byte> a = aed.a(($$0, $$1) -> $$0.k($$1), sl::readByte);
   public static final aed<Integer> b = aed.a(sl::c, sl::m);
   public static final aed<Long> c = aed.a(sl::a, sl::n);
   public static final aed<Float> d = aed.a(sl::a, sl::readFloat);
   public static final aed<String> e = aed.a(sl::a, sl::r);
   public static final aed<ti> f = aed.a(sl::a, sl::l);
   public static final aed<Optional<ti>> g = aed.b(sl::a, sl::l);
   public static final aed<cja> h = new aed<cja>() {
      public void a(sl $$0, cja $$1) {
         $$0.a($$1);
      }

      public cja b(sl $$0) {
         return $$0.q();
      }

      public cja a(cja $$0) {
         return $$0.p();
      }
   };
   public static final aed<dfe> i = aed.a(csq.o);
   public static final aed<Optional<dfe>> j = new aed.a<Optional<dfe>>() {
      public void a(sl $$0, Optional<dfe> $$1) {
         if ($$1.isPresent()) {
            $$0.c(csq.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dfe> b(sl $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? Optional.empty() : Optional.of(csq.a($$1));
      }
   };
   public static final aed<Boolean> k = aed.a(sl::a, sl::readBoolean);
   public static final aed<iv> l = new aed.a<iv>() {
      public void a(sl $$0, iv $$1) {
         $$0.a(jd.k, $$1.b());
         $$1.a($$0);
      }

      public iv b(sl $$0) {
         return this.a($$0, $$0.a(jd.k));
      }

      private <T extends iv> T a(sl $$0, iw<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final aed<hy> m = new aed.a<hy>() {
      public void a(sl $$0, hy $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public hy b(sl $$0) {
         return new hy($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final aed<gw> n = aed.a(sl::a, sl::e);
   public static final aed<Optional<gw>> o = aed.b(sl::a, sl::e);
   public static final aed<hc> p = aed.a(hc.class);
   public static final aed<Optional<UUID>> q = aed.b(sl::a, sl::o);
   public static final aed<Optional<hf>> r = aed.b(sl::a, sl::h);
   public static final aed<qu> s = new aed<qu>() {
      public void a(sl $$0, qu $$1) {
         $$0.a((rn)$$1);
      }

      public qu b(sl $$0) {
         return $$0.p();
      }

      public qu a(qu $$0) {
         return $$0.h();
      }
   };
   public static final aed<cbd> t = new aed.a<cbd>() {
      public void a(sl $$0, cbd $$1) {
         $$0.a(jd.z, $$1.a());
         $$0.a(jd.A, $$1.b());
         $$0.c($$1.c());
      }

      public cbd b(sl $$0) {
         return new cbd($$0.a(jd.z), $$0.a(jd.A), $$0.m());
      }
   };
   public static final aed<OptionalInt> u = new aed.a<OptionalInt>() {
      public void a(sl $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(sl $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final aed<bjn> v = aed.a(bjn.class);
   public static final aed<buq> w = aed.a(jd.aj);
   public static final aed<bux> x = aed.a(jd.ak);
   public static final aed<hg<bye>> y = aed.a(jd.m.t());
   public static final aed<bwy.a> z = aed.a(bwy.a.class);
   public static final aed<Vector3f> A = aed.a(sl::a, sl::i);
   public static final aed<Quaternionf> B = aed.a(sl::a, sl::j);

   public static void a(aed<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static aed<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(aed<?> $$0) {
      return C.a($$0);
   }

   private aee() {
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
