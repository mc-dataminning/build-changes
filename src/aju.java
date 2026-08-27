import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aju {
   private static final axc<ajt<?>> F = axc.c(16);
   public static final ajt<Byte> a = ajt.a(yt.c);
   public static final ajt<Integer> b = ajt.a(yt.f);
   public static final ajt<Long> c = ajt.a(yt.g);
   public static final ajt<Float> d = ajt.a(yt.h);
   public static final ajt<String> e = ajt.a(yt.k);
   public static final ajt<wx> f = ajt.a(wz.d);
   public static final ajt<Optional<wx>> g = ajt.a(wz.e);
   public static final ajt<ctq> h = new ajt<ctq>() {
      @Override
      public yv<? super wi, ctq> codec() {
         return ctq.e;
      }

      public ctq a(ctq $$0) {
         return $$0.s();
      }
   };
   public static final ajt<drd> i = ajt.a(yt.a(dea.q));
   private static final yv<ByteBuf, Optional<drd>> G = new yv<ByteBuf, Optional<drd>>() {
      public void a(ByteBuf $$0, Optional<drd> $$1) {
         if ($$1.isPresent()) {
            wo.a($$0, dea.i($$1.get()));
         } else {
            wo.a($$0, 0);
         }
      }

      public Optional<drd> a(ByteBuf $$0) {
         int $$1 = wo.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dea.a($$1));
      }
   };
   public static final ajt<Optional<drd>> j = ajt.a(G);
   public static final ajt<Boolean> k = ajt.a(yt.b);
   public static final ajt<kw> l = ajt.a(ky.bg);
   public static final ajt<List<kw>> m = ajt.a(ky.bg.a(yt.a()));
   public static final ajt<jp> n = ajt.a(jp.a);
   public static final ajt<io> o = ajt.a(io.b);
   public static final ajt<Optional<io>> p = ajt.a(io.b.a(yt::a));
   public static final ajt<it> q = ajt.a(it.j);
   public static final ajt<Optional<UUID>> r = ajt.a(jr.g.a(yt::a));
   public static final ajt<Optional<iw>> s = ajt.a(iw.c.a(yt::a));
   public static final ajt<ud> t = new ajt<ud>() {
      @Override
      public yv<? super wi, ud> codec() {
         return yt.o;
      }

      public ud a(ud $$0) {
         return $$0.h();
      }
   };
   public static final ajt<clm> u = ajt.a(clm.d);
   private static final yv<ByteBuf, OptionalInt> H = new yv<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wo.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wo.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajt<OptionalInt> v = ajt.a(H);
   public static final ajt<btc> w = ajt.a(btc.t);
   public static final ajt<ix<cek>> x = ajt.a(yt.b(lf.l));
   public static final ajt<ix<cfk>> y = ajt.a(yt.b(lf.m));
   public static final ajt<ix<cer>> z = ajt.a(yt.b(lf.B));
   public static final ajt<ix<cie>> A = ajt.a(yt.b(lf.S));
   public static final ajt<cfp.a> B = ajt.a(cfp.a.e);
   public static final ajt<cgx.a> C = ajt.a(cgx.a.i);
   public static final ajt<Vector3f> D = ajt.a(yt.q);
   public static final ajt<Quaternionf> E = ajt.a(yt.r);

   public static void a(ajt<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ajt<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ajt<?> $$0) {
      return F.a($$0);
   }

   private aju() {
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
