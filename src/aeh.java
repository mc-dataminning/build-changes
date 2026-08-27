import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aeh {
   private static final aqz<aeg<?>> C = aqz.c(16);
   public static final aeg<Byte> a = aeg.a(($$0, $$1) -> $$0.k($$1), so::readByte);
   public static final aeg<Integer> b = aeg.a(so::c, so::n);
   public static final aeg<Long> c = aeg.a(so::a, so::o);
   public static final aeg<Float> d = aeg.a(so::a, so::readFloat);
   public static final aeg<String> e = aeg.a(so::a, so::s);
   public static final aeg<tl> f = aeg.a(so::a, so::m);
   public static final aeg<Optional<tl>> g = aeg.b(so::a, so::m);
   public static final aeg<cjl> h = new aeg<cjl>() {
      public void a(so $$0, cjl $$1) {
         $$0.a($$1);
      }

      public cjl b(so $$0) {
         return $$0.r();
      }

      public cjl a(cjl $$0) {
         return $$0.p();
      }
   };
   public static final aeg<dfd> i = aeg.a(ctc.q);
   public static final aeg<Optional<dfd>> j = new aeg.a<Optional<dfd>>() {
      public void a(so $$0, Optional<dfd> $$1) {
         if ($$1.isPresent()) {
            $$0.c(ctc.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dfd> b(so $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? Optional.empty() : Optional.of(ctc.a($$1));
      }
   };
   public static final aeg<Boolean> k = aeg.a(so::a, so::readBoolean);
   public static final aeg<it> l = new aeg.a<it>() {
      public void a(so $$0, it $$1) {
         $$0.a(jb.k, $$1.b());
         $$1.a($$0);
      }

      public it b(so $$0) {
         return this.a($$0, $$0.a(jb.k));
      }

      private <T extends it> T a(so $$0, iu<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final aeg<hv> m = new aeg.a<hv>() {
      public void a(so $$0, hv $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public hv b(so $$0) {
         return new hv($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final aeg<gw> n = aeg.a(so::a, so::e);
   public static final aeg<Optional<gw>> o = aeg.b(so::a, so::e);
   public static final aeg<ha> p = aeg.a(ha.class);
   public static final aeg<Optional<UUID>> q = aeg.b(so::a, so::p);
   public static final aeg<Optional<hd>> r = aeg.b(so::a, so::h);
   public static final aeg<qw> s = new aeg<qw>() {
      public void a(so $$0, qw $$1) {
         $$0.a((rq)$$1);
      }

      public qw b(so $$0) {
         return $$0.q();
      }

      public qw a(qw $$0) {
         return $$0.h();
      }
   };
   public static final aeg<cbo> t = new aeg.a<cbo>() {
      public void a(so $$0, cbo $$1) {
         $$0.a(jb.z, $$1.a());
         $$0.a(jb.A, $$1.b());
         $$0.c($$1.c());
      }

      public cbo b(so $$0) {
         return new cbo($$0.a(jb.z), $$0.a(jb.A), $$0.n());
      }
   };
   public static final aeg<OptionalInt> u = new aeg.a<OptionalInt>() {
      public void a(so $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(so $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final aeg<bjy> v = aeg.a(bjy.class);
   public static final aeg<bvb> w = aeg.a(jb.ak);
   public static final aeg<bvi> x = aeg.a(jb.al);
   public static final aeg<he<byp>> y = aeg.a(jb.m.t());
   public static final aeg<bxj.a> z = aeg.a(bxj.a.class);
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
