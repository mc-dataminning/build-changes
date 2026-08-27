import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class afe {
   private static final arw<afd<?>> C = arw.c(16);
   public static final afd<Byte> a = afd.a(($$0, $$1) -> $$0.k($$1), tl::readByte);
   public static final afd<Integer> b = afd.a(tl::c, tl::n);
   public static final afd<Long> c = afd.a(tl::a, tl::o);
   public static final afd<Float> d = afd.a(tl::a, tl::readFloat);
   public static final afd<String> e = afd.a(tl::a, tl::s);
   public static final afd<ui> f = afd.a(tl::a, tl::m);
   public static final afd<Optional<ui>> g = afd.b(tl::a, tl::m);
   public static final afd<ckj> h = new afd<ckj>() {
      public void a(tl $$0, ckj $$1) {
         $$0.a($$1);
      }

      public ckj b(tl $$0) {
         return $$0.r();
      }

      public ckj a(ckj $$0) {
         return $$0.p();
      }
   };
   public static final afd<dgb> i = afd.a(cua.q);
   public static final afd<Optional<dgb>> j = new afd.a<Optional<dgb>>() {
      public void a(tl $$0, Optional<dgb> $$1) {
         if ($$1.isPresent()) {
            $$0.c(cua.i($$1.get()));
         } else {
            $$0.c(0);
         }
      }

      public Optional<dgb> b(tl $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? Optional.empty() : Optional.of(cua.a($$1));
      }
   };
   public static final afd<Boolean> k = afd.a(tl::a, tl::readBoolean);
   public static final afd<jq> l = new afd.a<jq>() {
      public void a(tl $$0, jq $$1) {
         $$0.a(jy.k, $$1.b());
         $$1.a($$0);
      }

      public jq b(tl $$0) {
         return this.a($$0, $$0.a(jy.k));
      }

      private <T extends jq> T a(tl $$0, jr<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final afd<it> m = new afd.a<it>() {
      public void a(tl $$0, it $$1) {
         $$0.a($$1.b());
         $$0.a($$1.c());
         $$0.a($$1.d());
      }

      public it b(tl $$0) {
         return new it($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final afd<ht> n = afd.a(tl::a, tl::e);
   public static final afd<Optional<ht>> o = afd.b(tl::a, tl::e);
   public static final afd<hx> p = afd.a(hx.class);
   public static final afd<Optional<UUID>> q = afd.b(tl::a, tl::p);
   public static final afd<Optional<ia>> r = afd.b(tl::a, tl::h);
   public static final afd<rt> s = new afd<rt>() {
      public void a(tl $$0, rt $$1) {
         $$0.a((sn)$$1);
      }

      public rt b(tl $$0) {
         return $$0.q();
      }

      public rt a(rt $$0) {
         return $$0.h();
      }
   };
   public static final afd<ccl> t = new afd.a<ccl>() {
      public void a(tl $$0, ccl $$1) {
         $$0.a(jy.z, $$1.a());
         $$0.a(jy.A, $$1.b());
         $$0.c($$1.c());
      }

      public ccl b(tl $$0) {
         return new ccl($$0.a(jy.z), $$0.a(jy.A), $$0.n());
      }
   };
   public static final afd<OptionalInt> u = new afd.a<OptionalInt>() {
      public void a(tl $$0, OptionalInt $$1) {
         $$0.c($$1.orElse(-1) + 1);
      }

      public OptionalInt b(tl $$0) {
         int $$1 = $$0.n();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final afd<bkv> v = afd.a(bkv.class);
   public static final afd<bvy> w = afd.a(jy.ak);
   public static final afd<bwf> x = afd.a(jy.al);
   public static final afd<ib<bzm>> y = afd.a(jy.m.t());
   public static final afd<byg.a> z = afd.a(byg.a.class);
   public static final afd<Vector3f> A = afd.a(tl::a, tl::i);
   public static final afd<Quaternionf> B = afd.a(tl::a, tl::j);

   public static void a(afd<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static afd<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(afd<?> $$0) {
      return C.a($$0);
   }

   private afe() {
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
