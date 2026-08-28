import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akq {
   private static final ayk<akp<?>> F = ayk.c(16);
   public static final akp<Byte> a = akp.a(zh.c);
   public static final akp<Integer> b = akp.a(zh.h);
   public static final akp<Long> c = akp.a(zh.i);
   public static final akp<Float> d = akp.a(zh.j);
   public static final akp<String> e = akp.a(zh.m);
   public static final akp<xl> f = akp.a(xn.d);
   public static final akp<Optional<xl>> g = akp.a(xn.e);
   public static final akp<cwf> h = new akp<cwf>() {
      @Override
      public zj<? super ww, cwf> codec() {
         return cwf.h;
      }

      public cwf a(cwf $$0) {
         return $$0.v();
      }
   };
   public static final akp<dvo> i = akp.a(zh.a(dij.q));
   private static final zj<ByteBuf, Optional<dvo>> G = new zj<ByteBuf, Optional<dvo>>() {
      public void a(ByteBuf $$0, Optional<dvo> $$1) {
         if ($$1.isPresent()) {
            xc.a($$0, dij.j($$1.get()));
         } else {
            xc.a($$0, 0);
         }
      }

      public Optional<dvo> a(ByteBuf $$0) {
         int $$1 = xc.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dij.a($$1));
      }
   };
   public static final akp<Optional<dvo>> j = akp.a(G);
   public static final akp<Boolean> k = akp.a(zh.b);
   public static final akp<lq> l = akp.a(ls.bg);
   public static final akp<List<lq>> m = akp.a(ls.bg.a(zh.a()));
   public static final akp<ki> n = akp.a(ki.a);
   public static final akp<jh> o = akp.a(jh.b);
   public static final akp<Optional<jh>> p = akp.a(jh.b.a(zh::a));
   public static final akp<jm> q = akp.a(jm.j);
   public static final akp<Optional<UUID>> r = akp.a(kk.g.a(zh::a));
   public static final akp<Optional<jp>> s = akp.a(jp.c.a(zh::a));
   public static final akp<un> t = new akp<un>() {
      @Override
      public zj<? super ww, un> codec() {
         return zh.q;
      }

      public un a(un $$0) {
         return $$0.i();
      }
   };
   public static final akp<cod> u = akp.a(cod.d);
   private static final zj<ByteBuf, OptionalInt> H = new zj<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = xc.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         xc.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akp<OptionalInt> v = akp.a(H);
   public static final akp<bvq> w = akp.a(bvq.t);
   public static final akp<jq<cgz>> x = akp.a(cgz.a);
   public static final akp<jq<chz>> y = akp.a(chz.d);
   public static final akp<jq<chg>> z = akp.a(chg.a);
   public static final akp<jq<ckv>> A = akp.a(ckv.d);
   public static final akp<cie.a> B = akp.a(cie.a.e);
   public static final akp<cjm.a> C = akp.a(cjm.a.i);
   public static final akp<Vector3f> D = akp.a(zh.s);
   public static final akp<Quaternionf> E = akp.a(zh.t);

   public static void a(akp<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static akp<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(akp<?> $$0) {
      return F.a($$0);
   }

   private akq() {
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
