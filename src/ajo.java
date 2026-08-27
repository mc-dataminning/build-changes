import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ajo {
   private static final aww<ajn<?>> F = aww.c(16);
   public static final ajn<Byte> a = ajn.a(yq.c);
   public static final ajn<Integer> b = ajn.a(yq.f);
   public static final ajn<Long> c = ajn.a(yq.g);
   public static final ajn<Float> d = ajn.a(yq.h);
   public static final ajn<String> e = ajn.a(yq.k);
   public static final ajn<wu> f = ajn.a(ww.d);
   public static final ajn<Optional<wu>> g = ajn.a(ww.e);
   public static final ajn<csz> h = new ajn<csz>() {
      @Override
      public ys<? super wf, csz> codec() {
         return csz.e;
      }

      public csz a(csz $$0) {
         return $$0.r();
      }
   };
   public static final ajn<dqh> i = ajn.a(yq.a(dde.q));
   private static final ys<ByteBuf, Optional<dqh>> G = new ys<ByteBuf, Optional<dqh>>() {
      public void a(ByteBuf $$0, Optional<dqh> $$1) {
         if ($$1.isPresent()) {
            wl.a($$0, dde.i($$1.get()));
         } else {
            wl.a($$0, 0);
         }
      }

      public Optional<dqh> a(ByteBuf $$0) {
         int $$1 = wl.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dde.a($$1));
      }
   };
   public static final ajn<Optional<dqh>> j = ajn.a(G);
   public static final ajn<Boolean> k = ajn.a(yq.b);
   public static final ajn<kv> l = ajn.a(kx.aY);
   public static final ajn<List<kv>> m = ajn.a(kx.aY.a(yq.a()));
   public static final ajn<jo> n = ajn.a(jo.a);
   public static final ajn<in> o = ajn.a(in.b);
   public static final ajn<Optional<in>> p = ajn.a(in.b.a(yq::a));
   public static final ajn<is> q = ajn.a(is.j);
   public static final ajn<Optional<UUID>> r = ajn.a(jq.g.a(yq::a));
   public static final ajn<Optional<iv>> s = ajn.a(iv.c.a(yq::a));
   public static final ajn<ua> t = new ajn<ua>() {
      @Override
      public ys<? super wf, ua> codec() {
         return yq.o;
      }

      public ua a(ua $$0) {
         return $$0.h();
      }
   };
   public static final ajn<ckv> u = ajn.a(ckv.d);
   private static final ys<ByteBuf, OptionalInt> H = new ys<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wl.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wl.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajn<OptionalInt> v = ajn.a(H);
   public static final ajn<bsl> w = ajn.a(bsl.t);
   public static final ajn<iw<cdt>> x = ajn.a(yq.b(le.l));
   public static final ajn<iw<cet>> y = ajn.a(yq.b(le.m));
   public static final ajn<iw<cea>> z = ajn.a(yq.b(le.B));
   public static final ajn<iw<chn>> A = ajn.a(yq.b(le.S));
   public static final ajn<cey.a> B = ajn.a(cey.a.e);
   public static final ajn<cgg.a> C = ajn.a(cgg.a.i);
   public static final ajn<Vector3f> D = ajn.a(yq.q);
   public static final ajn<Quaternionf> E = ajn.a(yq.r);

   public static void a(ajn<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ajn<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ajn<?> $$0) {
      return F.a($$0);
   }

   private ajo() {
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
