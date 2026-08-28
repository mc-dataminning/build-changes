import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ajr {
   private static final axa<ajq<?>> F = axa.c(16);
   public static final ajq<Byte> a = ajq.a(yq.c);
   public static final ajq<Integer> b = ajq.a(yq.g);
   public static final ajq<Long> c = ajq.a(yq.h);
   public static final ajq<Float> d = ajq.a(yq.i);
   public static final ajq<String> e = ajq.a(yq.l);
   public static final ajq<wu> f = ajq.a(ww.d);
   public static final ajq<Optional<wu>> g = ajq.a(ww.e);
   public static final ajq<cua> h = new ajq<cua>() {
      @Override
      public ys<? super wf, cua> codec() {
         return cua.h;
      }

      public cua a(cua $$0) {
         return $$0.s();
      }
   };
   public static final ajq<dsh> i = ajq.a(yq.a(dff.q));
   private static final ys<ByteBuf, Optional<dsh>> G = new ys<ByteBuf, Optional<dsh>>() {
      public void a(ByteBuf $$0, Optional<dsh> $$1) {
         if ($$1.isPresent()) {
            wl.a($$0, dff.i($$1.get()));
         } else {
            wl.a($$0, 0);
         }
      }

      public Optional<dsh> a(ByteBuf $$0) {
         int $$1 = wl.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dff.a($$1));
      }
   };
   public static final ajq<Optional<dsh>> j = ajq.a(G);
   public static final ajq<Boolean> k = ajq.a(yq.b);
   public static final ajq<lh> l = ajq.a(lj.bg);
   public static final ajq<List<lh>> m = ajq.a(lj.bg.a(yq.a()));
   public static final ajq<kb> n = ajq.a(kb.a);
   public static final ajq<ja> o = ajq.a(ja.b);
   public static final ajq<Optional<ja>> p = ajq.a(ja.b.a(yq::a));
   public static final ajq<jf> q = ajq.a(jf.j);
   public static final ajq<Optional<UUID>> r = ajq.a(kd.g.a(yq::a));
   public static final ajq<Optional<ji>> s = ajq.a(ji.c.a(yq::a));
   public static final ajq<tx> t = new ajq<tx>() {
      @Override
      public ys<? super wf, tx> codec() {
         return yq.p;
      }

      public tx a(tx $$0) {
         return $$0.i();
      }
   };
   public static final ajq<clv> u = ajq.a(clv.d);
   private static final ys<ByteBuf, OptionalInt> H = new ys<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wl.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wl.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajq<OptionalInt> v = ajq.a(H);
   public static final ajq<btk> w = ajq.a(btk.t);
   public static final ajq<jj<ces>> x = ajq.a(yq.b(lr.l));
   public static final ajq<jj<cfs>> y = ajq.a(yq.b(lr.m));
   public static final ajq<jj<cez>> z = ajq.a(yq.b(lr.F));
   public static final ajq<jj<cin>> A = ajq.a(yq.b(lr.W));
   public static final ajq<cfx.a> B = ajq.a(cfx.a.e);
   public static final ajq<chf.a> C = ajq.a(chf.a.i);
   public static final ajq<Vector3f> D = ajq.a(yq.r);
   public static final ajq<Quaternionf> E = ajq.a(yq.s);

   public static void a(ajq<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ajq<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ajq<?> $$0) {
      return F.a($$0);
   }

   private ajr() {
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
