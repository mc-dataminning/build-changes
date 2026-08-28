import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ajz {
   private static final axv<ajy<?>> F = axv.c(16);
   public static final ajy<Byte> a = ajy.a(yk.c);
   public static final ajy<Integer> b = ajy.a(yk.h);
   public static final ajy<Long> c = ajy.a(yk.k);
   public static final ajy<Float> d = ajy.a(yk.l);
   public static final ajy<String> e = ajy.a(yk.o);
   public static final ajy<wo> f = ajy.a(wq.d);
   public static final ajy<Optional<wo>> g = ajy.a(wq.e);
   public static final ajy<cwn> h = new ajy<cwn>() {
      @Override
      public ym<? super vz, cwn> codec() {
         return cwn.g;
      }

      public cwn a(cwn $$0) {
         return $$0.v();
      }
   };
   public static final ajy<dwv> i = ajy.a(yk.a(djk.q));
   private static final ym<ByteBuf, Optional<dwv>> G = new ym<ByteBuf, Optional<dwv>>() {
      public void a(ByteBuf $$0, Optional<dwv> $$1) {
         if ($$1.isPresent()) {
            wf.a($$0, djk.j($$1.get()));
         } else {
            wf.a($$0, 0);
         }
      }

      public Optional<dwv> a(ByteBuf $$0) {
         int $$1 = wf.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(djk.a($$1));
      }
   };
   public static final ajy<Optional<dwv>> j = ajy.a(G);
   public static final ajy<Boolean> k = ajy.a(yk.b);
   public static final ajy<lr> l = ajy.a(lt.bj);
   public static final ajy<List<lr>> m = ajy.a(lt.bj.a(yk.a()));
   public static final ajy<kj> n = ajy.a(kj.a);
   public static final ajy<ji> o = ajy.a(ji.b);
   public static final ajy<Optional<ji>> p = ajy.a(ji.b.a(yk::a));
   public static final ajy<jn> q = ajy.a(jn.j);
   public static final ajy<Optional<UUID>> r = ajy.a(kl.g.a(yk::a));
   public static final ajy<Optional<jq>> s = ajy.a(jq.c.a(yk::a));
   public static final ajy<tq> t = new ajy<tq>() {
      @Override
      public ym<? super vz, tq> codec() {
         return yk.s;
      }

      public tq a(tq $$0) {
         return $$0.i();
      }
   };
   public static final ajy<coh> u = ajy.a(coh.d);
   private static final ym<ByteBuf, OptionalInt> H = new ym<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wf.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wf.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajy<OptionalInt> v = ajy.a(H);
   public static final ajy<bvr> w = ajy.a(bvr.t);
   public static final ajy<jr<cha>> x = ajy.a(cha.a);
   public static final ajy<jr<cia>> y = ajy.a(cia.d);
   public static final ajy<jr<chh>> z = ajy.a(chh.a);
   public static final ajy<jr<ckw>> A = ajy.a(ckw.d);
   public static final ajy<cif.a> B = ajy.a(cif.a.e);
   public static final ajy<cjn.a> C = ajy.a(cjn.a.i);
   public static final ajy<Vector3f> D = ajy.a(yk.u);
   public static final ajy<Quaternionf> E = ajy.a(yk.v);

   public static void a(ajy<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ajy<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ajy<?> $$0) {
      return F.a($$0);
   }

   private ajz() {
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
