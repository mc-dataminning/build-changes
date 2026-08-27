import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ajt {
   private static final axb<ajs<?>> F = axb.c(16);
   public static final ajs<Byte> a = ajs.a(yt.c);
   public static final ajs<Integer> b = ajs.a(yt.f);
   public static final ajs<Long> c = ajs.a(yt.g);
   public static final ajs<Float> d = ajs.a(yt.h);
   public static final ajs<String> e = ajs.a(yt.k);
   public static final ajs<wx> f = ajs.a(wz.d);
   public static final ajs<Optional<wx>> g = ajs.a(wz.e);
   public static final ajs<cto> h = new ajs<cto>() {
      @Override
      public yv<? super wi, cto> codec() {
         return cto.e;
      }

      public cto a(cto $$0) {
         return $$0.s();
      }
   };
   public static final ajs<drb> i = ajs.a(yt.a(ddy.q));
   private static final yv<ByteBuf, Optional<drb>> G = new yv<ByteBuf, Optional<drb>>() {
      public void a(ByteBuf $$0, Optional<drb> $$1) {
         if ($$1.isPresent()) {
            wo.a($$0, ddy.i($$1.get()));
         } else {
            wo.a($$0, 0);
         }
      }

      public Optional<drb> a(ByteBuf $$0) {
         int $$1 = wo.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(ddy.a($$1));
      }
   };
   public static final ajs<Optional<drb>> j = ajs.a(G);
   public static final ajs<Boolean> k = ajs.a(yt.b);
   public static final ajs<kw> l = ajs.a(ky.bg);
   public static final ajs<List<kw>> m = ajs.a(ky.bg.a(yt.a()));
   public static final ajs<jp> n = ajs.a(jp.a);
   public static final ajs<io> o = ajs.a(io.b);
   public static final ajs<Optional<io>> p = ajs.a(io.b.a(yt::a));
   public static final ajs<it> q = ajs.a(it.j);
   public static final ajs<Optional<UUID>> r = ajs.a(jr.g.a(yt::a));
   public static final ajs<Optional<iw>> s = ajs.a(iw.c.a(yt::a));
   public static final ajs<ud> t = new ajs<ud>() {
      @Override
      public yv<? super wi, ud> codec() {
         return yt.o;
      }

      public ud a(ud $$0) {
         return $$0.h();
      }
   };
   public static final ajs<clk> u = ajs.a(clk.d);
   private static final yv<ByteBuf, OptionalInt> H = new yv<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wo.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wo.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajs<OptionalInt> v = ajs.a(H);
   public static final ajs<bta> w = ajs.a(bta.t);
   public static final ajs<ix<cei>> x = ajs.a(yt.b(lf.l));
   public static final ajs<ix<cfi>> y = ajs.a(yt.b(lf.m));
   public static final ajs<ix<cep>> z = ajs.a(yt.b(lf.B));
   public static final ajs<ix<cic>> A = ajs.a(yt.b(lf.S));
   public static final ajs<cfn.a> B = ajs.a(cfn.a.e);
   public static final ajs<cgv.a> C = ajs.a(cgv.a.i);
   public static final ajs<Vector3f> D = ajs.a(yt.q);
   public static final ajs<Quaternionf> E = ajs.a(yt.r);

   public static void a(ajs<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ajs<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ajs<?> $$0) {
      return F.a($$0);
   }

   private ajt() {
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
