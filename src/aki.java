import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aki {
   private static final ayg<akh<?>> G = ayg.c(16);
   public static final akh<Byte> a = akh.a(yr.c);
   public static final akh<Integer> b = akh.a(yr.h);
   public static final akh<Long> c = akh.a(yr.k);
   public static final akh<Float> d = akh.a(yr.l);
   public static final akh<String> e = akh.a(yr.o);
   public static final akh<wv> f = akh.a(wx.d);
   public static final akh<Optional<wv>> g = akh.a(wx.e);
   public static final akh<cxy> h = new akh<cxy>() {
      @Override
      public yt<? super wg, cxy> codec() {
         return cxy.h;
      }

      public cxy a(cxy $$0) {
         return $$0.v();
      }
   };
   public static final akh<dym> i = akh.a(yr.a(dku.k));
   private static final yt<ByteBuf, Optional<dym>> H = new yt<ByteBuf, Optional<dym>>() {
      public void a(ByteBuf $$0, Optional<dym> $$1) {
         if ($$1.isPresent()) {
            wm.a($$0, dku.j($$1.get()));
         } else {
            wm.a($$0, 0);
         }
      }

      public Optional<dym> a(ByteBuf $$0) {
         int $$1 = wm.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dku.a($$1));
      }
   };
   public static final akh<Optional<dym>> j = akh.a(H);
   public static final akh<Boolean> k = akh.a(yr.b);
   public static final akh<lt> l = akh.a(lv.bk);
   public static final akh<List<lt>> m = akh.a(lv.bk.a(yr.a()));
   public static final akh<kk> n = akh.a(kk.a);
   public static final akh<jj> o = akh.a(jj.b);
   public static final akh<Optional<jj>> p = akh.a(jj.b.a(yr::a));
   public static final akh<jo> q = akh.a(jo.j);
   public static final akh<Optional<bvy<bwr>>> r = akh.a(bvy.b().a(yr::a));
   public static final akh<Optional<jr>> s = akh.a(jr.c.a(yr::a));
   public static final akh<tw> t = new akh<tw>() {
      @Override
      public yt<? super wg, tw> codec() {
         return yr.s;
      }

      public tw a(tw $$0) {
         return $$0.i();
      }
   };
   public static final akh<cpv> u = akh.a(cpv.d);
   private static final yt<ByteBuf, OptionalInt> I = new yt<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wm.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wm.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akh<OptionalInt> v = akh.a(I);
   public static final akh<bxd> w = akh.a(bxd.t);
   public static final akh<js<cik>> x = akh.a(cik.b);
   public static final akh<js<cjn>> y = akh.a(cjn.d);
   public static final akh<js<cir>> z = akh.a(cir.b);
   public static final akh<js<ciy>> A = akh.a(ciy.d);
   public static final akh<js<cmj>> B = akh.a(cmj.d);
   public static final akh<cjs.a> C = akh.a(cjs.a.e);
   public static final akh<cla.a> D = akh.a(cla.a.i);
   public static final akh<Vector3f> E = akh.a(yr.u);
   public static final akh<Quaternionf> F = akh.a(yr.v);

   public static void a(akh<?> $$0) {
      G.d($$0);
   }

   @Nullable
   public static akh<?> a(int $$0) {
      return G.a($$0);
   }

   public static int b(akh<?> $$0) {
      return G.a($$0);
   }

   private aki() {
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
      a(A);
      a(s);
      a(B);
      a(D);
      a(C);
      a(E);
      a(F);
   }
}
