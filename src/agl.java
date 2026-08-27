import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class agl {
   private static final atf<agk<?>> C = atf.c(16);
   public static final agk<Byte> a = agk.a(($$0, $$1) -> $$0.k($$1), ug::readByte);
   public static final agk<Integer> b = agk.a(ug::c, ug::n);
   public static final agk<Long> c = agk.a(ug::a, ug::o);
   public static final agk<Float> d = agk.a(ug::a, ug::readFloat);
   public static final agk<String> e = agk.a(ug::a, ug::s);
   public static final agk<vd> f = agk.a(ug::a, ug::m);
   public static final agk<Optional<vd>> g = agk.b(ug::a, ug::m);
   public static final agk<cmr> h = new agk<cmr>() {
      public void a(ug $$0, cmr $$1) {
         $$0.a($$1);
      }

      public cmr b(ug $$0) {
         return $$0.r();
      }

      public cmr a(cmr $$0) {
         return $$0.p();
      }
   };
   public static final agk<dja> i = agk.a(cwj.q);
   public static final agk<Optional<dja>> j = new agk.a<Optional<dja>>() {
      public void a(ug $$0, Optional<dja> $$1) {
         if ($$1.isPresent()) {
            $$0.c(cwj.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dja> b(ug $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? Optional.empty() : Optional.of(cwj.a($$1));
      }
   };
   public static final agk<Boolean> k = agk.a(ug::a, ug::readBoolean);
   public static final agk<jv> l = new agk.a<jv>() {
      public void a(ug $$0, jv $$1) {
         $$0.a(kd.j, $$1.b());
         $$1.a($$0);
      }

      public jv b(ug $$0) {
         return this.a($$0, $$0.a(kd.j));
      }

      private <T extends jv> T a(ug $$0, jw<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final agk<iy> m = new agk.a<iy>() {
      public void a(ug $$0, iy $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public iy b(ug $$0) {
         return new iy($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final agk<hx> n = agk.a(ug::a, ug::e);
   public static final agk<Optional<hx>> o = agk.b(ug::a, ug::e);
   public static final agk<ic> p = agk.a(ic.class);
   public static final agk<Optional<UUID>> q = agk.b(ug::a, ug::p);
   public static final agk<Optional<ig>> r = agk.b(ug::a, ug::h);
   public static final agk<sl> s = new agk<sl>() {
      public void a(ug $$0, sl $$1) {
         $$0.a((ti)$$1);
      }

      public sl b(ug $$0) {
         return $$0.q();
      }

      public sl a(sl $$0) {
         return $$0.h();
      }
   };
   public static final agk<cep> t = new agk.a<cep>() {
      public void a(ug $$0, cep $$1) {
         $$0.a(kd.y, $$1.a());
         $$0.a(kd.z, $$1.b());
         $$0.c($$1.c());
      }

      public cep b(ug $$0) {
         return new cep($$0.a(kd.y), $$0.a(kd.z), $$0.n());
      }
   };
   public static final agk<OptionalInt> u = new agk.a<OptionalInt>() {
      public void a(ug $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(ug $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final agk<bmr> v = agk.a(bmr.class);
   public static final agk<bxw> w = agk.a(kd.ak);
   public static final agk<byd> x = agk.a(kd.al);
   public static final agk<ih<cbk>> y = agk.a(kd.l.t());
   public static final agk<cae.a> z = agk.a(cae.a.class);
   public static final agk<Vector3f> A = agk.a(ug::a, ug::i);
   public static final agk<Quaternionf> B = agk.a(ug::a, ug::j);

   public static void a(agk<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static agk<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(agk<?> $$0) {
      return C.a($$0);
   }

   private agl() {
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
