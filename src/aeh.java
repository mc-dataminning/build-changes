import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aeh {
   private static final aqw<aeg<?>> C = aqw.c(16);
   public static final aeg<Byte> a = aeg.a(($$0, $$1) -> $$0.k($$1), so::readByte);
   public static final aeg<Integer> b = aeg.a(so::c, so::m);
   public static final aeg<Long> c = aeg.a(so::a, so::n);
   public static final aeg<Float> d = aeg.a(so::a, so::readFloat);
   public static final aeg<String> e = aeg.a(so::a, so::r);
   public static final aeg<tl> f = aeg.a(so::a, so::l);
   public static final aeg<Optional<tl>> g = aeg.b(so::a, so::l);
   public static final aeg<cjf> h = new aeg<cjf>() {
      public void a(so $$0, cjf $$1) {
         $$0.a($$1);
      }

      public cjf b(so $$0) {
         return $$0.q();
      }

      public cjf a(cjf $$0) {
         return $$0.p();
      }
   };
   public static final aeg<dfj> i = aeg.a(csv.o);
   public static final aeg<Optional<dfj>> j = new aeg.a<Optional<dfj>>() {
      public void a(so $$0, Optional<dfj> $$1) {
         if ($$1.isPresent()) {
            $$0.c(csv.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dfj> b(so $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? Optional.empty() : Optional.of(csv.a($$1));
      }
   };
   public static final aeg<Boolean> k = aeg.a(so::a, so::readBoolean);
   public static final aeg<iv> l = new aeg.a<iv>() {
      public void a(so $$0, iv $$1) {
         $$0.a(jd.k, $$1.b());
         $$1.a($$0);
      }

      public iv b(so $$0) {
         return this.a($$0, $$0.a(jd.k));
      }

      private <T extends iv> T a(so $$0, iw<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final aeg<hy> m = new aeg.a<hy>() {
      public void a(so $$0, hy $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public hy b(so $$0) {
         return new hy($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final aeg<gw> n = aeg.a(so::a, so::e);
   public static final aeg<Optional<gw>> o = aeg.b(so::a, so::e);
   public static final aeg<hc> p = aeg.a(hc.class);
   public static final aeg<Optional<UUID>> q = aeg.b(so::a, so::o);
   public static final aeg<Optional<hf>> r = aeg.b(so::a, so::h);
   public static final aeg<qx> s = new aeg<qx>() {
      public void a(so $$0, qx $$1) {
         $$0.a((rq)$$1);
      }

      public qx b(so $$0) {
         return $$0.p();
      }

      public qx a(qx $$0) {
         return $$0.h();
      }
   };
   public static final aeg<cbi> t = new aeg.a<cbi>() {
      public void a(so $$0, cbi $$1) {
         $$0.a(jd.z, $$1.a());
         $$0.a(jd.A, $$1.b());
         $$0.c($$1.c());
      }

      public cbi b(so $$0) {
         return new cbi($$0.a(jd.z), $$0.a(jd.A), $$0.m());
      }
   };
   public static final aeg<OptionalInt> u = new aeg.a<OptionalInt>() {
      public void a(so $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(so $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final aeg<bjs> v = aeg.a(bjs.class);
   public static final aeg<buv> w = aeg.a(jd.aj);
   public static final aeg<bvc> x = aeg.a(jd.ak);
   public static final aeg<hg<byj>> y = aeg.a(jd.m.t());
   public static final aeg<bxd.a> z = aeg.a(bxd.a.class);
   public static final aeg<Vector3f> A = aeg.a(so::a, so::i);
   public static final aeg<Quaternionf> B = aeg.a(so::a, so::j);

   public static void a(aeg<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static aeg<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(aeg<?> $$0) {
      return C.a($$0);
   }

   private aeh() {
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
