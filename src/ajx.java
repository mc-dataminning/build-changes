import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ajx {
   private static final axj<ajw<?>> F = axj.c(16);
   public static final ajw<Byte> a = ajw.a(yu.c);
   public static final ajw<Integer> b = ajw.a(yu.g);
   public static final ajw<Long> c = ajw.a(yu.h);
   public static final ajw<Float> d = ajw.a(yu.i);
   public static final ajw<String> e = ajw.a(yu.l);
   public static final ajw<wy> f = ajw.a(xa.d);
   public static final ajw<Optional<wy>> g = ajw.a(xa.e);
   public static final ajw<cuo> h = new ajw<cuo>() {
      @Override
      public yw<? super wj, cuo> codec() {
         return cuo.h;
      }

      public cuo a(cuo $$0) {
         return $$0.s();
      }
   };
   public static final ajw<dta> i = ajw.a(yu.a(dfw.q));
   private static final yw<ByteBuf, Optional<dta>> G = new yw<ByteBuf, Optional<dta>>() {
      public void a(ByteBuf $$0, Optional<dta> $$1) {
         if ($$1.isPresent()) {
            wp.a($$0, dfw.i($$1.get()));
         } else {
            wp.a($$0, 0);
         }
      }

      public Optional<dta> a(ByteBuf $$0) {
         int $$1 = wp.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dfw.a($$1));
      }
   };
   public static final ajw<Optional<dta>> j = ajw.a(G);
   public static final ajw<Boolean> k = ajw.a(yu.b);
   public static final ajw<lk> l = ajw.a(lm.bg);
   public static final ajw<List<lk>> m = ajw.a(lm.bg.a(yu.a()));
   public static final ajw<ke> n = ajw.a(ke.a);
   public static final ajw<jd> o = ajw.a(jd.b);
   public static final ajw<Optional<jd>> p = ajw.a(jd.b.a(yu::a));
   public static final ajw<ji> q = ajw.a(ji.j);
   public static final ajw<Optional<UUID>> r = ajw.a(kg.g.a(yu::a));
   public static final ajw<Optional<jl>> s = ajw.a(jl.c.a(yu::a));
   public static final ajw<ua> t = new ajw<ua>() {
      @Override
      public yw<? super wj, ua> codec() {
         return yu.p;
      }

      public ua a(ua $$0) {
         return $$0.i();
      }
   };
   public static final ajw<cmj> u = ajw.a(cmj.d);
   private static final yw<ByteBuf, OptionalInt> H = new yw<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wp.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wp.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajw<OptionalInt> v = ajw.a(H);
   public static final ajw<bty> w = ajw.a(bty.t);
   public static final ajw<jm<cfg>> x = ajw.a(cfg.a);
   public static final ajw<jm<cgg>> y = ajw.a(cgg.d);
   public static final ajw<jm<cfn>> z = ajw.a(cfn.a);
   public static final ajw<jm<cjb>> A = ajw.a(cjb.d);
   public static final ajw<cgl.a> B = ajw.a(cgl.a.e);
   public static final ajw<cht.a> C = ajw.a(cht.a.i);
   public static final ajw<Vector3f> D = ajw.a(yu.r);
   public static final ajw<Quaternionf> E = ajw.a(yu.s);

   public static void a(ajw<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ajw<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ajw<?> $$0) {
      return F.a($$0);
   }

   private ajx() {
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
