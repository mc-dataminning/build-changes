import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class afu {
   private static final aso<aft<?>> C = aso.c(16);
   public static final aft<Byte> a = aft.a(($$0, $$1) -> $$0.k($$1), ty::readByte);
   public static final aft<Integer> b = aft.a(ty::c, ty::n);
   public static final aft<Long> c = aft.a(ty::a, ty::o);
   public static final aft<Float> d = aft.a(ty::a, ty::readFloat);
   public static final aft<String> e = aft.a(ty::a, ty::s);
   public static final aft<uv> f = aft.a(ty::a, ty::m);
   public static final aft<Optional<uv>> g = aft.b(ty::a, ty::m);
   public static final aft<clo> h = new aft<clo>() {
      public void a(ty $$0, clo $$1) {
         $$0.a($$1);
      }

      public clo b(ty $$0) {
         return $$0.r();
      }

      public clo a(clo $$0) {
         return $$0.p();
      }
   };
   public static final aft<dhn> i = aft.a(cvf.q);
   public static final aft<Optional<dhn>> j = new aft.a<Optional<dhn>>() {
      public void a(ty $$0, Optional<dhn> $$1) {
         if ($$1.isPresent()) {
            $$0.c(cvf.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dhn> b(ty $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? Optional.empty() : Optional.of(cvf.a($$1));
      }
   };
   public static final aft<Boolean> k = aft.a(ty::a, ty::readBoolean);
   public static final aft<ju> l = new aft.a<ju>() {
      public void a(ty $$0, ju $$1) {
         $$0.a(kc.k, $$1.b());
         $$1.a($$0);
      }

      public ju b(ty $$0) {
         return this.a($$0, $$0.a(kc.k));
      }

      private <T extends ju> T a(ty $$0, jv<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final aft<ix> m = new aft.a<ix>() {
      public void a(ty $$0, ix $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public ix b(ty $$0) {
         return new ix($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final aft<hx> n = aft.a(ty::a, ty::e);
   public static final aft<Optional<hx>> o = aft.b(ty::a, ty::e);
   public static final aft<ib> p = aft.a(ib.class);
   public static final aft<Optional<UUID>> q = aft.b(ty::a, ty::p);
   public static final aft<Optional<ie>> r = aft.b(ty::a, ty::h);
   public static final aft<sd> s = new aft<sd>() {
      public void a(ty $$0, sd $$1) {
         $$0.a((ta)$$1);
      }

      public sd b(ty $$0) {
         return $$0.q();
      }

      public sd a(sd $$0) {
         return $$0.h();
      }
   };
   public static final aft<cdn> t = new aft.a<cdn>() {
      public void a(ty $$0, cdn $$1) {
         $$0.a(kc.z, $$1.a());
         $$0.a(kc.A, $$1.b());
         $$0.c($$1.c());
      }

      public cdn b(ty $$0) {
         return new cdn($$0.a(kc.z), $$0.a(kc.A), $$0.n());
      }
   };
   public static final aft<OptionalInt> u = new aft.a<OptionalInt>() {
      public void a(ty $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(ty $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final aft<blx> v = aft.a(blx.class);
   public static final aft<bxa> w = aft.a(kc.al);
   public static final aft<bxh> x = aft.a(kc.am);
   public static final aft<ig<cao>> y = aft.a(kc.m.t());
   public static final aft<bzi.a> z = aft.a(bzi.a.class);
   public static final aft<Vector3f> A = aft.a(ty::a, ty::i);
   public static final aft<Quaternionf> B = aft.a(ty::a, ty::j);

   public static void a(aft<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static aft<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(aft<?> $$0) {
      return C.a($$0);
   }

   private afu() {
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
