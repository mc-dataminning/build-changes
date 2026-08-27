import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aei {
   private static final aqx<aeh<?>> C = aqx.c(16);
   public static final aeh<Byte> a = aeh.a(($$0, $$1) -> $$0.k($$1), sq::readByte);
   public static final aeh<Integer> b = aeh.a(sq::c, sq::m);
   public static final aeh<Long> c = aeh.a(sq::a, sq::n);
   public static final aeh<Float> d = aeh.a(sq::a, sq::readFloat);
   public static final aeh<String> e = aeh.a(sq::a, sq::r);
   public static final aeh<tn> f = aeh.a(sq::a, sq::l);
   public static final aeh<Optional<tn>> g = aeh.b(sq::a, sq::l);
   public static final aeh<cjh> h = new aeh<cjh>() {
      public void a(sq $$0, cjh $$1) {
         $$0.a($$1);
      }

      public cjh b(sq $$0) {
         return $$0.q();
      }

      public cjh a(cjh $$0) {
         return $$0.p();
      }
   };
   public static final aeh<dfl> i = aeh.a(csx.o);
   public static final aeh<Optional<dfl>> j = new aeh.a<Optional<dfl>>() {
      public void a(sq $$0, Optional<dfl> $$1) {
         if ($$1.isPresent()) {
            $$0.c(csx.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dfl> b(sq $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? Optional.empty() : Optional.of(csx.a($$1));
      }
   };
   public static final aeh<Boolean> k = aeh.a(sq::a, sq::readBoolean);
   public static final aeh<iv> l = new aeh.a<iv>() {
      public void a(sq $$0, iv $$1) {
         $$0.a(jd.k, $$1.b());
         $$1.a($$0);
      }

      public iv b(sq $$0) {
         return this.a($$0, $$0.a(jd.k));
      }

      private <T extends iv> T a(sq $$0, iw<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final aeh<hy> m = new aeh.a<hy>() {
      public void a(sq $$0, hy $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public hy b(sq $$0) {
         return new hy($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final aeh<gw> n = aeh.a(sq::a, sq::e);
   public static final aeh<Optional<gw>> o = aeh.b(sq::a, sq::e);
   public static final aeh<hc> p = aeh.a(hc.class);
   public static final aeh<Optional<UUID>> q = aeh.b(sq::a, sq::o);
   public static final aeh<Optional<hf>> r = aeh.b(sq::a, sq::h);
   public static final aeh<qy> s = new aeh<qy>() {
      public void a(sq $$0, qy $$1) {
         $$0.a((rs)$$1);
      }

      public qy b(sq $$0) {
         return $$0.p();
      }

      public qy a(qy $$0) {
         return $$0.h();
      }
   };
   public static final aeh<cbk> t = new aeh.a<cbk>() {
      public void a(sq $$0, cbk $$1) {
         $$0.a(jd.z, $$1.a());
         $$0.a(jd.A, $$1.b());
         $$0.c($$1.c());
      }

      public cbk b(sq $$0) {
         return new cbk($$0.a(jd.z), $$0.a(jd.A), $$0.m());
      }
   };
   public static final aeh<OptionalInt> u = new aeh.a<OptionalInt>() {
      public void a(sq $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(sq $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final aeh<bju> v = aeh.a(bju.class);
   public static final aeh<bux> w = aeh.a(jd.aj);
   public static final aeh<bve> x = aeh.a(jd.ak);
   public static final aeh<hg<byl>> y = aeh.a(jd.m.t());
   public static final aeh<bxf.a> z = aeh.a(bxf.a.class);
   public static final aeh<Vector3f> A = aeh.a(sq::a, sq::i);
   public static final aeh<Quaternionf> B = aeh.a(sq::a, sq::j);

   public static void a(aeh<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static aeh<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(aeh<?> $$0) {
      return C.a($$0);
   }

   private aei() {
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
