import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aku {
   private static final ayr<akt<?>> F = ayr.c(16);
   public static final akt<Byte> a = akt.a(zg.c);
   public static final akt<Integer> b = akt.a(zg.h);
   public static final akt<Long> c = akt.a(zg.k);
   public static final akt<Float> d = akt.a(zg.l);
   public static final akt<String> e = akt.a(zg.o);
   public static final akt<xk> f = akt.a(xm.d);
   public static final akt<Optional<xk>> g = akt.a(xm.e);
   public static final akt<cxg> h = new akt<cxg>() {
      @Override
      public zi<? super wv, cxg> codec() {
         return cxg.g;
      }

      public cxg a(cxg $$0) {
         return $$0.v();
      }
   };
   public static final akt<dxo> i = akt.a(zg.a(dkd.q));
   private static final zi<ByteBuf, Optional<dxo>> G = new zi<ByteBuf, Optional<dxo>>() {
      public void a(ByteBuf $$0, Optional<dxo> $$1) {
         if ($$1.isPresent()) {
            xb.a($$0, dkd.j($$1.get()));
         } else {
            xb.a($$0, 0);
         }
      }

      public Optional<dxo> a(ByteBuf $$0) {
         int $$1 = xb.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dkd.a($$1));
      }
   };
   public static final akt<Optional<dxo>> j = akt.a(G);
   public static final akt<Boolean> k = akt.a(zg.b);
   public static final akt<lq> l = akt.a(ls.bj);
   public static final akt<List<lq>> m = akt.a(ls.bj.a(zg.a()));
   public static final akt<ki> n = akt.a(ki.a);
   public static final akt<jh> o = akt.a(jh.b);
   public static final akt<Optional<jh>> p = akt.a(jh.b.a(zg::a));
   public static final akt<jm> q = akt.a(jm.j);
   public static final akt<Optional<UUID>> r = akt.a(kk.g.a(zg::a));
   public static final akt<Optional<jp>> s = akt.a(jp.c.a(zg::a));
   public static final akt<um> t = new akt<um>() {
      @Override
      public zi<? super wv, um> codec() {
         return zg.s;
      }

      public um a(um $$0) {
         return $$0.i();
      }
   };
   public static final akt<cpb> u = akt.a(cpb.d);
   private static final zi<ByteBuf, OptionalInt> H = new zi<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = xb.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         xb.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akt<OptionalInt> v = akt.a(H);
   public static final akt<bwj> w = akt.a(bwj.t);
   public static final akt<jq<chs>> x = akt.a(chs.a);
   public static final akt<jq<cis>> y = akt.a(cis.d);
   public static final akt<jq<chz>> z = akt.a(chz.a);
   public static final akt<jq<clo>> A = akt.a(clo.d);
   public static final akt<cix.a> B = akt.a(cix.a.e);
   public static final akt<ckf.a> C = akt.a(ckf.a.i);
   public static final akt<Vector3f> D = akt.a(zg.u);
   public static final akt<Quaternionf> E = akt.a(zg.v);

   public static void a(akt<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static akt<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(akt<?> $$0) {
      return F.a($$0);
   }

   private aku() {
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
