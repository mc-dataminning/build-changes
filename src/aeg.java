import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aeg {
   private static final aqv<aef<?>> C = aqv.c(16);
   public static final aef<Byte> a = aef.a(($$0, $$1) -> $$0.k($$1), so::readByte);
   public static final aef<Integer> b = aef.a(so::c, so::m);
   public static final aef<Long> c = aef.a(so::a, so::n);
   public static final aef<Float> d = aef.a(so::a, so::readFloat);
   public static final aef<String> e = aef.a(so::a, so::r);
   public static final aef<tl> f = aef.a(so::a, so::l);
   public static final aef<Optional<tl>> g = aef.b(so::a, so::l);
   public static final aef<cjf> h = new aef<cjf>() {
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
   public static final aef<dfj> i = aef.a(csv.o);
   public static final aef<Optional<dfj>> j = new aef.a<Optional<dfj>>() {
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
   public static final aef<Boolean> k = aef.a(so::a, so::readBoolean);
   public static final aef<it> l = new aef.a<it>() {
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
   public static final aef<hv> m = new aef.a<hv>() {
      public void a(so $$0, hv $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public hv b(so $$0) {
         return new hv($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final aef<gw> n = aef.a(so::a, so::e);
   public static final aef<Optional<gw>> o = aef.b(so::a, so::e);
   public static final aef<ha> p = aef.a(ha.class);
   public static final aef<Optional<UUID>> q = aef.b(so::a, so::o);
   public static final aef<Optional<hd>> r = aef.b(so::a, so::h);
   public static final aef<qw> s = new aef<qw>() {
      public void a(so $$0, qw $$1) {
         $$0.a((rq)$$1);
      }

      public qw b(so $$0) {
         return $$0.p();
      }

      public qw a(qw $$0) {
         return $$0.h();
      }
   };
   public static final aef<cbi> t = new aef.a<cbi>() {
      public void a(so $$0, cbi $$1) {
         $$0.a(jb.z, $$1.a());
         $$0.a(jb.A, $$1.b());
         $$0.c($$1.c());
      }

      public cbi b(so $$0) {
         return new cbi($$0.a(jb.z), $$0.a(jb.A), $$0.m());
      }
   };
   public static final aef<OptionalInt> u = new aef.a<OptionalInt>() {
      public void a(so $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(so $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final aef<bjs> v = aef.a(bjs.class);
   public static final aef<buv> w = aef.a(jb.aj);
   public static final aef<bvc> x = aef.a(jb.ak);
   public static final aef<he<byj>> y = aef.a(jb.m.t());
   public static final aef<bxd.a> z = aef.a(bxd.a.class);
   public static final aef<Vector3f> A = aef.a(so::a, so::i);
   public static final aef<Quaternionf> B = aef.a(so::a, so::j);

   public static void a(aef<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static aef<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(aef<?> $$0) {
      return C.a($$0);
   }

   private aeg() {
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
