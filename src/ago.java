import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ago {
   private static final atl<agn<?>> C = atl.c(16);
   public static final agn<Byte> a = agn.a(($$0, $$1) -> $$0.k($$1), ui::readByte);
   public static final agn<Integer> b = agn.a(ui::c, ui::n);
   public static final agn<Long> c = agn.a(ui::a, ui::o);
   public static final agn<Float> d = agn.a(ui::a, ui::readFloat);
   public static final agn<String> e = agn.a(ui::a, ui::s);
   public static final agn<vf> f = agn.a(ui::a, ui::m);
   public static final agn<Optional<vf>> g = agn.b(ui::a, ui::m);
   public static final agn<cmy> h = new agn<cmy>() {
      public void a(ui $$0, cmy $$1) {
         $$0.a($$1);
      }

      public cmy b(ui $$0) {
         return $$0.r();
      }

      public cmy a(cmy $$0) {
         return $$0.p();
      }
   };
   public static final agn<djh> i = agn.a(cwq.q);
   public static final agn<Optional<djh>> j = new agn.a<Optional<djh>>() {
      public void a(ui $$0, Optional<djh> $$1) {
         if ($$1.isPresent()) {
            $$0.c(cwq.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<djh> b(ui $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? Optional.empty() : Optional.of(cwq.a($$1));
      }
   };
   public static final agn<Boolean> k = agn.a(ui::a, ui::readBoolean);
   public static final agn<jv> l = new agn.a<jv>() {
      public void a(ui $$0, jv $$1) {
         $$0.a(kd.j, $$1.b());
         $$1.a($$0);
      }

      public jv b(ui $$0) {
         return this.a($$0, $$0.a(kd.j));
      }

      private <T extends jv> T a(ui $$0, jw<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final agn<iy> m = new agn.a<iy>() {
      public void a(ui $$0, iy $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public iy b(ui $$0) {
         return new iy($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final agn<hx> n = agn.a(ui::a, ui::e);
   public static final agn<Optional<hx>> o = agn.b(ui::a, ui::e);
   public static final agn<ic> p = agn.a(ic.class);
   public static final agn<Optional<UUID>> q = agn.b(ui::a, ui::p);
   public static final agn<Optional<ig>> r = agn.b(ui::a, ui::h);
   public static final agn<sn> s = new agn<sn>() {
      public void a(ui $$0, sn $$1) {
         $$0.a((tk)$$1);
      }

      public sn b(ui $$0) {
         return $$0.q();
      }

      public sn a(sn $$0) {
         return $$0.h();
      }
   };
   public static final agn<cew> t = new agn.a<cew>() {
      public void a(ui $$0, cew $$1) {
         $$0.a(kd.y, $$1.a());
         $$0.a(kd.z, $$1.b());
         $$0.c($$1.c());
      }

      public cew b(ui $$0) {
         return new cew($$0.a(kd.y), $$0.a(kd.z), $$0.n());
      }
   };
   public static final agn<OptionalInt> u = new agn.a<OptionalInt>() {
      public void a(ui $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(ui $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final agn<bmx> v = agn.a(bmx.class);
   public static final agn<byc> w = agn.a(kd.ak);
   public static final agn<byj> x = agn.a(kd.al);
   public static final agn<ih<cbq>> y = agn.a(kd.l.t());
   public static final agn<cak.a> z = agn.a(cak.a.class);
   public static final agn<Vector3f> A = agn.a(ui::a, ui::i);
   public static final agn<Quaternionf> B = agn.a(ui::a, ui::j);

   public static void a(agn<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static agn<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(agn<?> $$0) {
      return C.a($$0);
   }

   private ago() {
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
