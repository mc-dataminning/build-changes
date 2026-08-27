import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class afq {
   private static final ask<afp<?>> C = ask.c(16);
   public static final afp<Byte> a = afp.a(($$0, $$1) -> $$0.k($$1), tu::readByte);
   public static final afp<Integer> b = afp.a(tu::c, tu::n);
   public static final afp<Long> c = afp.a(tu::a, tu::o);
   public static final afp<Float> d = afp.a(tu::a, tu::readFloat);
   public static final afp<String> e = afp.a(tu::a, tu::s);
   public static final afp<ur> f = afp.a(tu::a, tu::m);
   public static final afp<Optional<ur>> g = afp.b(tu::a, tu::m);
   public static final afp<clj> h = new afp<clj>() {
      public void a(tu $$0, clj $$1) {
         $$0.a($$1);
      }

      public clj b(tu $$0) {
         return $$0.r();
      }

      public clj a(clj $$0) {
         return $$0.p();
      }
   };
   public static final afp<dhi> i = afp.a(cva.q);
   public static final afp<Optional<dhi>> j = new afp.a<Optional<dhi>>() {
      public void a(tu $$0, Optional<dhi> $$1) {
         if ($$1.isPresent()) {
            $$0.c(cva.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dhi> b(tu $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? Optional.empty() : Optional.of(cva.a($$1));
      }
   };
   public static final afp<Boolean> k = afp.a(tu::a, tu::readBoolean);
   public static final afp<jq> l = new afp.a<jq>() {
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
   public static final afp<it> m = new afp.a<it>() {
      public void a(tu $$0, it $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public it b(tu $$0) {
         return new it($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final afp<ht> n = afp.a(tu::a, tu::e);
   public static final afp<Optional<ht>> o = afp.b(tu::a, tu::e);
   public static final afp<hx> p = afp.a(hx.class);
   public static final afp<Optional<UUID>> q = afp.b(tu::a, tu::p);
   public static final afp<Optional<ia>> r = afp.b(tu::a, tu::h);
   public static final afp<rz> s = new afp<rz>() {
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
   public static final afp<cdi> t = new afp.a<cdi>() {
      public void a(tu $$0, cdi $$1) {
         $$0.a(jy.z, $$1.a());
         $$0.a(jy.A, $$1.b());
         $$0.c($$1.c());
      }

      public cdi b(tu $$0) {
         return new cdi($$0.a(jy.z), $$0.a(jy.A), $$0.n());
      }
   };
   public static final afp<OptionalInt> u = new afp.a<OptionalInt>() {
      public void a(tu $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(tu $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final afp<bls> v = afp.a(bls.class);
   public static final afp<bwv> w = afp.a(jy.al);
   public static final afp<bxc> x = afp.a(jy.am);
   public static final afp<ib<caj>> y = afp.a(jy.m.t());
   public static final afp<bzd.a> z = afp.a(bzd.a.class);
   public static final afp<Vector3f> A = afp.a(tu::a, tu::i);
   public static final afp<Quaternionf> B = afp.a(tu::a, tu::j);

   public static void a(afp<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static afp<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(afp<?> $$0) {
      return C.a($$0);
   }

   private afq() {
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
