import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class agb {
   private static final asv<aga<?>> C = asv.c(16);
   public static final aga<Byte> a = aga.a(($$0, $$1) -> $$0.k($$1), ue::readByte);
   public static final aga<Integer> b = aga.a(ue::c, ue::n);
   public static final aga<Long> c = aga.a(ue::a, ue::o);
   public static final aga<Float> d = aga.a(ue::a, ue::readFloat);
   public static final aga<String> e = aga.a(ue::a, ue::s);
   public static final aga<vb> f = aga.a(ue::a, ue::m);
   public static final aga<Optional<vb>> g = aga.b(ue::a, ue::m);
   public static final aga<cmh> h = new aga<cmh>() {
      public void a(ue $$0, cmh $$1) {
         $$0.a($$1);
      }

      public cmh b(ue $$0) {
         return $$0.r();
      }

      public cmh a(cmh $$0) {
         return $$0.p();
      }
   };
   public static final aga<dip> i = aga.a(cvz.q);
   public static final aga<Optional<dip>> j = new aga.a<Optional<dip>>() {
      public void a(ue $$0, Optional<dip> $$1) {
         if ($$1.isPresent()) {
            $$0.c(cvz.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dip> b(ue $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? Optional.empty() : Optional.of(cvz.a($$1));
      }
   };
   public static final aga<Boolean> k = aga.a(ue::a, ue::readBoolean);
   public static final aga<jt> l = new aga.a<jt>() {
      public void a(ue $$0, jt $$1) {
         $$0.a(kb.j, $$1.b());
         $$1.a($$0);
      }

      public jt b(ue $$0) {
         return this.a($$0, $$0.a(kb.j));
      }

      private <T extends jt> T a(ue $$0, ju<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final aga<iw> m = new aga.a<iw>() {
      public void a(ue $$0, iw $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public iw b(ue $$0) {
         return new iw($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final aga<hv> n = aga.a(ue::a, ue::e);
   public static final aga<Optional<hv>> o = aga.b(ue::a, ue::e);
   public static final aga<ia> p = aga.a(ia.class);
   public static final aga<Optional<UUID>> q = aga.b(ue::a, ue::p);
   public static final aga<Optional<id>> r = aga.b(ue::a, ue::h);
   public static final aga<sj> s = new aga<sj>() {
      public void a(ue $$0, sj $$1) {
         $$0.a((tg)$$1);
      }

      public sj b(ue $$0) {
         return $$0.q();
      }

      public sj a(sj $$0) {
         return $$0.h();
      }
   };
   public static final aga<cef> t = new aga.a<cef>() {
      public void a(ue $$0, cef $$1) {
         $$0.a(kb.y, $$1.a());
         $$0.a(kb.z, $$1.b());
         $$0.c($$1.c());
      }

      public cef b(ue $$0) {
         return new cef($$0.a(kb.y), $$0.a(kb.z), $$0.n());
      }
   };
   public static final aga<OptionalInt> u = new aga.a<OptionalInt>() {
      public void a(ue $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(ue $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final aga<bmh> v = aga.a(bmh.class);
   public static final aga<bxm> w = aga.a(kb.ak);
   public static final aga<bxt> x = aga.a(kb.al);
   public static final aga<ie<cba>> y = aga.a(kb.l.t());
   public static final aga<bzu.a> z = aga.a(bzu.a.class);
   public static final aga<Vector3f> A = aga.a(ue::a, ue::i);
   public static final aga<Quaternionf> B = aga.a(ue::a, ue::j);

   public static void a(aga<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static aga<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(aga<?> $$0) {
      return C.a($$0);
   }

   private agb() {
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
