import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aja {
   private static final awh<aiz<?>> D = awh.c(16);
   public static final aiz<Byte> a = aiz.a(yc.c);
   public static final aiz<Integer> b = aiz.a(yc.f);
   public static final aiz<Long> c = aiz.a(yc.g);
   public static final aiz<Float> d = aiz.a(yc.h);
   public static final aiz<String> e = aiz.a(yc.k);
   public static final aiz<wg> f = aiz.a(wi.d);
   public static final aiz<Optional<wg>> g = aiz.a(wi.e);
   public static final aiz<crj> h = new aiz<crj>() {
      @Override
      public ye<? super vr, crj> codec() {
         return crj.e;
      }

      public crj a(crj $$0) {
         return $$0.r();
      }
   };
   public static final aiz<doz> i = aiz.a(yc.a(dby.q));
   private static final ye<ByteBuf, Optional<doz>> E = new ye<ByteBuf, Optional<doz>>() {
      public void a(ByteBuf $$0, Optional<doz> $$1) {
         if ($$1.isPresent()) {
            vx.a($$0, dby.i($$1.get()));
         } else {
            vx.a($$0, 0);
         }
      }

      public Optional<doz> a(ByteBuf $$0) {
         int $$1 = vx.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dby.a($$1));
      }
   };
   public static final aiz<Optional<doz>> j = aiz.a(E);
   public static final aiz<Boolean> k = aiz.a(yc.b);
   public static final aiz<kj> l = aiz.a(kl.aZ);
   public static final aiz<jd> m = aiz.a(jd.a);
   public static final aiz<ib> n = aiz.a(ib.b);
   public static final aiz<Optional<ib>> o = aiz.a(ib.b.a(yc::a));
   public static final aiz<ih> p = aiz.a(ih.j);
   public static final aiz<Optional<UUID>> q = aiz.a(jf.g.a(yc::a));
   public static final aiz<Optional<ik>> r = aiz.a(ik.c.a(yc::a));
   public static final aiz<tm> s = new aiz<tm>() {
      @Override
      public ye<? super vr, tm> codec() {
         return yc.o;
      }

      public tm a(tm $$0) {
         return $$0.h();
      }
   };
   public static final aiz<cjh> t = aiz.a(cjh.d);
   private static final ye<ByteBuf, OptionalInt> F = new ye<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = vx.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         vx.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final aiz<OptionalInt> u = aiz.a(F);
   public static final aiz<bqz> v = aiz.a(bqz.t);
   public static final aiz<cch> w = aiz.a(yc.a(ks.l));
   public static final aiz<cco> x = aiz.a(yc.a(ks.A));
   public static final aiz<il<cfz>> y = aiz.a(yc.b(ks.R));
   public static final aiz<cdk.a> z = aiz.a(cdk.a.e);
   public static final aiz<ces.a> A = aiz.a(ces.a.i);
   public static final aiz<Vector3f> B = aiz.a(yc.q);
   public static final aiz<Quaternionf> C = aiz.a(yc.r);

   public static void a(aiz<?> $$0) {
      D.d($$0);
   }

   @Nullable
   public static aiz<?> a(int $$0) {
      return D.a($$0);
   }

   public static int b(aiz<?> $$0) {
      return D.a($$0);
   }

   private aja() {
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
      a(m);
      a(n);
      a(o);
      a(p);
      a(q);
      a(i);
      a(j);
      a(s);
      a(l);
      a(t);
      a(u);
      a(v);
      a(w);
      a(x);
      a(r);
      a(y);
      a(A);
      a(z);
      a(B);
      a(C);
   }
}
