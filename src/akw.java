import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akw {
   private static final ayu<akv<?>> J = ayu.c(16);
   public static final akv<Byte> a = akv.a(zc.c);
   public static final akv<Integer> b = akv.a(zc.h);
   public static final akv<Long> c = akv.a(zc.k);
   public static final akv<Float> d = akv.a(zc.l);
   public static final akv<String> e = akv.a(zc.p);
   public static final akv<xg> f = akv.a(xi.d);
   public static final akv<Optional<xg>> g = akv.a(xi.e);
   public static final akv<dak> h = new akv<dak>() {
      @Override
      public ze<? super wp, dak> codec() {
         return dak.h;
      }

      public dak a(dak $$0) {
         return $$0.v();
      }
   };
   public static final akv<ebq> i = akv.a(zc.a(dno.k));
   private static final ze<ByteBuf, Optional<ebq>> K = new ze<ByteBuf, Optional<ebq>>() {
      public void a(ByteBuf $$0, Optional<ebq> $$1) {
         if ($$1.isPresent()) {
            wx.a($$0, dno.j($$1.get()));
         } else {
            wx.a($$0, 0);
         }
      }

      public Optional<ebq> a(ByteBuf $$0) {
         int $$1 = wx.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dno.a($$1));
      }
   };
   public static final akv<Optional<ebq>> j = akv.a(K);
   public static final akv<Boolean> k = akv.a(zc.b);
   public static final akv<lx> l = akv.a(lz.bl);
   public static final akv<List<lx>> m = akv.a(lz.bl.a(zc.a()));
   public static final akv<jy> n = akv.a(jy.b);
   public static final akv<iw> o = akv.a(iw.b);
   public static final akv<Optional<iw>> p = akv.a(iw.b.a(zc::a));
   public static final akv<jc> q = akv.a(jc.j);
   public static final akv<Optional<bxk<byf>>> r = akv.a(bxk.b().a(zc::a));
   public static final akv<Optional<jf>> s = akv.a(jf.c.a(zc::a));
   public static final akv<ua> t = new akv<ua>() {
      @Override
      public ze<? super wp, ua> codec() {
         return zc.t;
      }

      public ua a(ua $$0) {
         return $$0.l();
      }
   };
   public static final akv<crv> u = akv.a(crv.d);
   private static final ze<ByteBuf, OptionalInt> L = new ze<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wx.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wx.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akv<OptionalInt> v = akv.a(L);
   public static final akv<byr> w = akv.a(byr.t);
   public static final akv<jg<cjz>> x = akv.a(cjz.d);
   public static final akv<jg<ckc>> y = akv.a(ckc.d);
   public static final akv<jg<ckg>> z = akv.a(ckg.d);
   public static final akv<jg<cna>> A = akv.a(cna.d);
   public static final akv<jg<cmy>> B = akv.a(cmy.d);
   public static final akv<jg<clu>> C = akv.a(clu.d);
   public static final akv<jg<ckr>> D = akv.a(ckr.d);
   public static final akv<jg<coj>> E = akv.a(coj.d);
   public static final akv<clh.a> F = akv.a(clh.a.e);
   public static final akv<cmu.a> G = akv.a(cmu.a.i);
   public static final akv<Vector3f> H = akv.a(zc.v);
   public static final akv<Quaternionf> I = akv.a(zc.w);

   public static void a(akv<?> $$0) {
      J.d($$0);
   }

   @Nullable
   public static akv<?> a(int $$0) {
      return J.a($$0);
   }

   public static int b(akv<?> $$0) {
      return J.a($$0);
   }

   private akw() {
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
      a(z);
      a(A);
      a(B);
      a(C);
      a(D);
      a(y);
      a(s);
      a(E);
      a(G);
      a(F);
      a(H);
      a(I);
   }
}
