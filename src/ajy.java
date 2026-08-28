import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ajy {
   private static final axk<ajx<?>> F = axk.c(16);
   public static final ajx<Byte> a = ajx.a(yv.c);
   public static final ajx<Integer> b = ajx.a(yv.g);
   public static final ajx<Long> c = ajx.a(yv.h);
   public static final ajx<Float> d = ajx.a(yv.i);
   public static final ajx<String> e = ajx.a(yv.l);
   public static final ajx<wz> f = ajx.a(xb.d);
   public static final ajx<Optional<wz>> g = ajx.a(xb.e);
   public static final ajx<cuq> h = new ajx<cuq>() {
      @Override
      public yx<? super wk, cuq> codec() {
         return cuq.h;
      }

      public cuq a(cuq $$0) {
         return $$0.s();
      }
   };
   public static final ajx<dtc> i = ajx.a(yv.a(dfy.q));
   private static final yx<ByteBuf, Optional<dtc>> G = new yx<ByteBuf, Optional<dtc>>() {
      public void a(ByteBuf $$0, Optional<dtc> $$1) {
         if ($$1.isPresent()) {
            wq.a($$0, dfy.i($$1.get()));
         } else {
            wq.a($$0, 0);
         }
      }

      public Optional<dtc> a(ByteBuf $$0) {
         int $$1 = wq.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dfy.a($$1));
      }
   };
   public static final ajx<Optional<dtc>> j = ajx.a(G);
   public static final ajx<Boolean> k = ajx.a(yv.b);
   public static final ajx<lk> l = ajx.a(lm.bg);
   public static final ajx<List<lk>> m = ajx.a(lm.bg.a(yv.a()));
   public static final ajx<ke> n = ajx.a(ke.a);
   public static final ajx<jd> o = ajx.a(jd.b);
   public static final ajx<Optional<jd>> p = ajx.a(jd.b.a(yv::a));
   public static final ajx<ji> q = ajx.a(ji.j);
   public static final ajx<Optional<UUID>> r = ajx.a(kg.g.a(yv::a));
   public static final ajx<Optional<jl>> s = ajx.a(jl.c.a(yv::a));
   public static final ajx<ub> t = new ajx<ub>() {
      @Override
      public yx<? super wk, ub> codec() {
         return yv.p;
      }

      public ub a(ub $$0) {
         return $$0.i();
      }
   };
   public static final ajx<cml> u = ajx.a(cml.d);
   private static final yx<ByteBuf, OptionalInt> H = new yx<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wq.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wq.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajx<OptionalInt> v = ajx.a(H);
   public static final ajx<bua> w = ajx.a(bua.t);
   public static final ajx<jm<cfi>> x = ajx.a(cfi.a);
   public static final ajx<jm<cgi>> y = ajx.a(cgi.d);
   public static final ajx<jm<cfp>> z = ajx.a(cfp.a);
   public static final ajx<jm<cjd>> A = ajx.a(cjd.d);
   public static final ajx<cgn.a> B = ajx.a(cgn.a.e);
   public static final ajx<chv.a> C = ajx.a(chv.a.i);
   public static final ajx<Vector3f> D = ajx.a(yv.r);
   public static final ajx<Quaternionf> E = ajx.a(yv.s);

   public static void a(ajx<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ajx<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ajx<?> $$0) {
      return F.a($$0);
   }

   private ajy() {
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
