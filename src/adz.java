import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class adz {
   private static final aqm<ady<?>> C = aqm.c(16);
   public static final ady<Byte> a = ady.a(($$0, $$1) -> $$0.k($$1), sh::readByte);
   public static final ady<Integer> b = ady.a(sh::c, sh::m);
   public static final ady<Long> c = ady.a(sh::a, sh::n);
   public static final ady<Float> d = ady.a(sh::a, sh::readFloat);
   public static final ady<String> e = ady.a(sh::a, sh::r);
   public static final ady<te> f = ady.a(sh::a, sh::l);
   public static final ady<Optional<te>> g = ady.b(sh::a, sh::l);
   public static final ady<ciw> h = new ady<ciw>() {
      public void a(sh $$0, ciw $$1) {
         $$0.a($$1);
      }

      public ciw b(sh $$0) {
         return $$0.q();
      }

      public ciw a(ciw $$0) {
         return $$0.p();
      }
   };
   public static final ady<dey> i = ady.a(csk.o);
   public static final ady<Optional<dey>> j = new ady.a<Optional<dey>>() {
      public void a(sh $$0, Optional<dey> $$1) {
         if ($$1.isPresent()) {
            $$0.c(csk.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dey> b(sh $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? Optional.empty() : Optional.of(csk.a($$1));
      }
   };
   public static final ady<Boolean> k = ady.a(sh::a, sh::readBoolean);
   public static final ady<iu> l = new ady.a<iu>() {
      public void a(sh $$0, iu $$1) {
         $$0.a(jc.k, $$1.b());
         $$1.a($$0);
      }

      public iu b(sh $$0) {
         return this.a($$0, $$0.a(jc.k));
      }

      private <T extends iu> T a(sh $$0, iv<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final ady<hx> m = new ady.a<hx>() {
      public void a(sh $$0, hx $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public hx b(sh $$0) {
         return new hx($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final ady<gv> n = ady.a(sh::a, sh::e);
   public static final ady<Optional<gv>> o = ady.b(sh::a, sh::e);
   public static final ady<hb> p = ady.a(hb.class);
   public static final ady<Optional<UUID>> q = ady.b(sh::a, sh::o);
   public static final ady<Optional<he>> r = ady.b(sh::a, sh::h);
   public static final ady<qs> s = new ady<qs>() {
      public void a(sh $$0, qs $$1) {
         $$0.a((rl)$$1);
      }

      public qs b(sh $$0) {
         return $$0.p();
      }

      public qs a(qs $$0) {
         return $$0.h();
      }
   };
   public static final ady<caz> t = new ady.a<caz>() {
      public void a(sh $$0, caz $$1) {
         $$0.a(jc.z, $$1.a());
         $$0.a(jc.A, $$1.b());
         $$0.c($$1.c());
      }

      public caz b(sh $$0) {
         return new caz($$0.a(jc.z), $$0.a(jc.A), $$0.m());
      }
   };
   public static final ady<OptionalInt> u = new ady.a<OptionalInt>() {
      public void a(sh $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(sh $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final ady<bji> v = ady.a(bji.class);
   public static final ady<bum> w = ady.a(jc.aj);
   public static final ady<but> x = ady.a(jc.ak);
   public static final ady<hf<bya>> y = ady.a(jc.m.t());
   public static final ady<bwu.a> z = ady.a(bwu.a.class);
   public static final ady<Vector3f> A = ady.a(sh::a, sh::i);
   public static final ady<Quaternionf> B = ady.a(sh::a, sh::j);

   public static void a(ady<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static ady<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(ady<?> $$0) {
      return C.a($$0);
   }

   private adz() {
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
