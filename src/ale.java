import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ale {
   private static final azb<ald<?>> F = azb.c(16);
   public static final ald<Byte> a = ald.a(zr.c);
   public static final ald<Integer> b = ald.a(zr.h);
   public static final ald<Long> c = ald.a(zr.k);
   public static final ald<Float> d = ald.a(zr.l);
   public static final ald<String> e = ald.a(zr.o);
   public static final ald<xv> f = ald.a(xx.d);
   public static final ald<Optional<xv>> g = ald.a(xx.e);
   public static final ald<cxo> h = new ald<cxo>() {
      @Override
      public zt<? super xg, cxo> codec() {
         return cxo.h;
      }

      public cxo a(cxo $$0) {
         return $$0.v();
      }
   };
   public static final ald<dxu> i = ald.a(zr.a(dkl.q));
   private static final zt<ByteBuf, Optional<dxu>> G = new zt<ByteBuf, Optional<dxu>>() {
      public void a(ByteBuf $$0, Optional<dxu> $$1) {
         if ($$1.isPresent()) {
            xm.a($$0, dkl.j($$1.get()));
         } else {
            xm.a($$0, 0);
         }
      }

      public Optional<dxu> a(ByteBuf $$0) {
         int $$1 = xm.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dkl.a($$1));
      }
   };
   public static final ald<Optional<dxu>> j = ald.a(G);
   public static final ald<Boolean> k = ald.a(zr.b);
   public static final ald<lq> l = ald.a(ls.bi);
   public static final ald<List<lq>> m = ald.a(ls.bi.a(zr.a()));
   public static final ald<ki> n = ald.a(ki.a);
   public static final ald<jh> o = ald.a(jh.b);
   public static final ald<Optional<jh>> p = ald.a(jh.b.a(zr::a));
   public static final ald<jm> q = ald.a(jm.j);
   public static final ald<Optional<UUID>> r = ald.a(kk.g.a(zr::a));
   public static final ald<Optional<jp>> s = ald.a(jp.c.a(zr::a));
   public static final ald<ux> t = new ald<ux>() {
      @Override
      public zt<? super xg, ux> codec() {
         return zr.s;
      }

      public ux a(ux $$0) {
         return $$0.i();
      }
   };
   public static final ald<cpj> u = ald.a(cpj.d);
   private static final zt<ByteBuf, OptionalInt> H = new zt<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = xm.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         xm.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ald<OptionalInt> v = ald.a(H);
   public static final ald<bwr> w = ald.a(bwr.t);
   public static final ald<jq<cia>> x = ald.a(cia.a);
   public static final ald<jq<cja>> y = ald.a(cja.d);
   public static final ald<jq<cih>> z = ald.a(cih.a);
   public static final ald<jq<clw>> A = ald.a(clw.d);
   public static final ald<cjf.a> B = ald.a(cjf.a.e);
   public static final ald<ckn.a> C = ald.a(ckn.a.i);
   public static final ald<Vector3f> D = ald.a(zr.u);
   public static final ald<Quaternionf> E = ald.a(zr.v);

   public static void a(ald<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ald<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ald<?> $$0) {
      return F.a($$0);
   }

   private ale() {
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
