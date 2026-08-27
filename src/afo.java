import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class afo {
   private static final asg<afn<?>> C = asg.c(16);
   public static final afn<Byte> a = afn.a(($$0, $$1) -> $$0.k($$1), tu::readByte);
   public static final afn<Integer> b = afn.a(tu::c, tu::n);
   public static final afn<Long> c = afn.a(tu::a, tu::o);
   public static final afn<Float> d = afn.a(tu::a, tu::readFloat);
   public static final afn<String> e = afn.a(tu::a, tu::s);
   public static final afn<ur> f = afn.a(tu::a, tu::m);
   public static final afn<Optional<ur>> g = afn.b(tu::a, tu::m);
   public static final afn<clb> h = new afn<clb>() {
      public void a(tu $$0, clb $$1) {
         $$0.a($$1);
      }

      public clb b(tu $$0) {
         return $$0.r();
      }

      public clb a(clb $$0) {
         return $$0.p();
      }
   };
   public static final afn<dgw> i = afn.a(cut.q);
   public static final afn<Optional<dgw>> j = new afn.a<Optional<dgw>>() {
      public void a(tu $$0, Optional<dgw> $$1) {
         if ($$1.isPresent()) {
            $$0.c(cut.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dgw> b(tu $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? Optional.empty() : Optional.of(cut.a($$1));
      }
   };
   public static final afn<Boolean> k = afn.a(tu::a, tu::readBoolean);
   public static final afn<jq> l = new afn.a<jq>() {
      public void a(tu $$0, jq $$1) {
         $$0.a(jy.k, $$1.b());
         $$1.a($$0);
      }

      public jq b(tu $$0) {
         return this.a($$0, $$0.a(jy.k));
      }

      private <T extends jq> T a(tu $$0, jr<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final afn<it> m = new afn.a<it>() {
      public void a(tu $$0, it $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public it b(tu $$0) {
         return new it($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final afn<ht> n = afn.a(tu::a, tu::e);
   public static final afn<Optional<ht>> o = afn.b(tu::a, tu::e);
   public static final afn<hx> p = afn.a(hx.class);
   public static final afn<Optional<UUID>> q = afn.b(tu::a, tu::p);
   public static final afn<Optional<ia>> r = afn.b(tu::a, tu::h);
   public static final afn<rz> s = new afn<rz>() {
      public void a(tu $$0, rz $$1) {
         $$0.a((sw)$$1);
      }

      public rz b(tu $$0) {
         return $$0.q();
      }

      public rz a(rz $$0) {
         return $$0.h();
      }
   };
   public static final afn<cda> t = new afn.a<cda>() {
      public void a(tu $$0, cda $$1) {
         $$0.a(jy.z, $$1.a());
         $$0.a(jy.A, $$1.b());
         $$0.c($$1.c());
      }

      public cda b(tu $$0) {
         return new cda($$0.a(jy.z), $$0.a(jy.A), $$0.n());
      }
   };
   public static final afn<OptionalInt> u = new afn.a<OptionalInt>() {
      public void a(tu $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(tu $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final afn<blk> v = afn.a(blk.class);
   public static final afn<bwn> w = afn.a(jy.al);
   public static final afn<bwu> x = afn.a(jy.am);
   public static final afn<ib<cab>> y = afn.a(jy.m.t());
   public static final afn<byv.a> z = afn.a(byv.a.class);
   public static final afn<Vector3f> A = afn.a(tu::a, tu::i);
   public static final afn<Quaternionf> B = afn.a(tu::a, tu::j);

   public static void a(afn<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static afn<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(afn<?> $$0) {
      return C.a($$0);
   }

   private afo() {
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
