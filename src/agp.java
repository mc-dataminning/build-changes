import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class agp {
   private static final atm<ago<?>> D = atm.c(16);
   public static final ago<Byte> a = ago.a(($$0, $$1) -> $$0.k($$1), uj::readByte);
   public static final ago<Integer> b = ago.a(uj::c, uj::n);
   public static final ago<Long> c = ago.a(uj::a, uj::o);
   public static final ago<Float> d = ago.a(uj::a, uj::readFloat);
   public static final ago<String> e = ago.a(uj::a, uj::s);
   public static final ago<vg> f = ago.a(uj::a, uj::m);
   public static final ago<Optional<vg>> g = ago.b(uj::a, uj::m);
   public static final ago<cng> h = new ago<cng>() {
      public void a(uj $$0, cng $$1) {
         $$0.a($$1);
      }

      public cng b(uj $$0) {
         return $$0.r();
      }

      public cng a(cng $$0) {
         return $$0.p();
      }
   };
   public static final ago<djp> i = ago.a(cwy.q);
   public static final ago<Optional<djp>> j = new ago.a<Optional<djp>>() {
      public void a(uj $$0, Optional<djp> $$1) {
         if ($$1.isPresent()) {
            $$0.c(cwy.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<djp> b(uj $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? Optional.empty() : Optional.of(cwy.a($$1));
      }
   };
   public static final ago<Boolean> k = ago.a(uj::a, uj::readBoolean);
   public static final ago<jv> l = new ago.a<jv>() {
      public void a(uj $$0, jv $$1) {
         $$0.a(kd.j, $$1.b());
         $$1.a($$0);
      }

      public jv b(uj $$0) {
         return this.a($$0, $$0.a(kd.j));
      }

      private <T extends jv> T a(uj $$0, jw<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final ago<iy> m = new ago.a<iy>() {
      public void a(uj $$0, iy $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public iy b(uj $$0) {
         return new iy($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final ago<hx> n = ago.a(uj::a, uj::e);
   public static final ago<Optional<hx>> o = ago.b(uj::a, uj::e);
   public static final ago<ic> p = ago.a(ic.class);
   public static final ago<Optional<UUID>> q = ago.b(uj::a, uj::p);
   public static final ago<Optional<ig>> r = ago.b(uj::a, uj::h);
   public static final ago<so> s = new ago<so>() {
      public void a(uj $$0, so $$1) {
         $$0.a((tl)$$1);
      }

      public so b(uj $$0) {
         return $$0.q();
      }

      public so a(so $$0) {
         return $$0.h();
      }
   };
   public static final ago<cfe> t = new ago.a<cfe>() {
      public void a(uj $$0, cfe $$1) {
         $$0.a(kd.y, $$1.a());
         $$0.a(kd.z, $$1.b());
         $$0.c($$1.c());
      }

      public cfe b(uj $$0) {
         return new cfe($$0.a(kd.y), $$0.a(kd.z), $$0.n());
      }
   };
   public static final ago<OptionalInt> u = new ago.a<OptionalInt>() {
      public void a(uj $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(uj $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final ago<bna> v = ago.a(bna.class);
   public static final ago<byg> w = ago.a(kd.ak);
   public static final ago<byn> x = ago.a(kd.al);
   public static final ago<ih<cbx>> y = ago.a(kd.l.t());
   public static final ago<car.a> z = ago.a(car.a.class);
   public static final ago<bzj.a> A = ago.a(bzj.a.class);
   public static final ago<Vector3f> B = ago.a(uj::a, uj::i);
   public static final ago<Quaternionf> C = ago.a(uj::a, uj::j);

   public static void a(ago<?> $$0) {
      D.c($$0);
   }

   @Nullable
   public static ago<?> a(int $$0) {
      return D.a($$0);
   }

   public static int b(ago<?> $$0) {
      return D.a($$0);
   }

   private agp() {
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
      a(C);
   }
}
