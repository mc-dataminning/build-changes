import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akn {
   private static final ayh<akm<?>> F = ayh.c(16);
   public static final akm<Byte> a = akm.a(ze.c);
   public static final akm<Integer> b = akm.a(ze.h);
   public static final akm<Long> c = akm.a(ze.i);
   public static final akm<Float> d = akm.a(ze.j);
   public static final akm<String> e = akm.a(ze.m);
   public static final akm<xi> f = akm.a(xk.d);
   public static final akm<Optional<xi>> g = akm.a(xk.e);
   public static final akm<cwb> h = new akm<cwb>() {
      @Override
      public zg<? super wt, cwb> codec() {
         return cwb.h;
      }

      public cwb a(cwb $$0) {
         return $$0.v();
      }
   };
   public static final akm<dvj> i = akm.a(ze.a(die.q));
   private static final zg<ByteBuf, Optional<dvj>> G = new zg<ByteBuf, Optional<dvj>>() {
      public void a(ByteBuf $$0, Optional<dvj> $$1) {
         if ($$1.isPresent()) {
            wz.a($$0, die.j($$1.get()));
         } else {
            wz.a($$0, 0);
         }
      }

      public Optional<dvj> a(ByteBuf $$0) {
         int $$1 = wz.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(die.a($$1));
      }
   };
   public static final akm<Optional<dvj>> j = akm.a(G);
   public static final akm<Boolean> k = akm.a(ze.b);
   public static final akm<lp> l = akm.a(lr.bg);
   public static final akm<List<lp>> m = akm.a(lr.bg.a(ze.a()));
   public static final akm<ki> n = akm.a(ki.a);
   public static final akm<jh> o = akm.a(jh.b);
   public static final akm<Optional<jh>> p = akm.a(jh.b.a(ze::a));
   public static final akm<jm> q = akm.a(jm.j);
   public static final akm<Optional<UUID>> r = akm.a(kk.g.a(ze::a));
   public static final akm<Optional<jp>> s = akm.a(jp.c.a(ze::a));
   public static final akm<uk> t = new akm<uk>() {
      @Override
      public zg<? super wt, uk> codec() {
         return ze.q;
      }

      public uk a(uk $$0) {
         return $$0.i();
      }
   };
   public static final akm<cnz> u = akm.a(cnz.d);
   private static final zg<ByteBuf, OptionalInt> H = new zg<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wz.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wz.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akm<OptionalInt> v = akm.a(H);
   public static final akm<bvm> w = akm.a(bvm.t);
   public static final akm<jq<cgv>> x = akm.a(cgv.a);
   public static final akm<jq<chv>> y = akm.a(chv.d);
   public static final akm<jq<chc>> z = akm.a(chc.a);
   public static final akm<jq<ckr>> A = akm.a(ckr.d);
   public static final akm<cia.a> B = akm.a(cia.a.e);
   public static final akm<cji.a> C = akm.a(cji.a.i);
   public static final akm<Vector3f> D = akm.a(ze.s);
   public static final akm<Quaternionf> E = akm.a(ze.t);

   public static void a(akm<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static akm<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(akm<?> $$0) {
      return F.a($$0);
   }

   private akn() {
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
      a(n);
      a(o);
      a(p);
      a(q);
      a(r);
      a(i);
      a(j);
      a(t);
      a(l);
      a(m);
      a(u);
      a(v);
      a(w);
      a(x);
      a(y);
      a(z);
      a(s);
      a(A);
      a(C);
      a(B);
      a(D);
      a(E);
   }
}
