import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ajz {
   private static final axw<ajy<?>> G = axw.c(16);
   public static final ajy<Byte> a = ajy.a(yl.c);
   public static final ajy<Integer> b = ajy.a(yl.h);
   public static final ajy<Long> c = ajy.a(yl.k);
   public static final ajy<Float> d = ajy.a(yl.l);
   public static final ajy<String> e = ajy.a(yl.o);
   public static final ajy<wp> f = ajy.a(wr.d);
   public static final ajy<Optional<wp>> g = ajy.a(wr.e);
   public static final ajy<cxh> h = new ajy<cxh>() {
      @Override
      public yn<? super wa, cxh> codec() {
         return cxh.h;
      }

      public cxh a(cxh $$0) {
         return $$0.v();
      }
   };
   public static final ajy<dxq> i = ajy.a(yl.a(dke.k));
   private static final yn<ByteBuf, Optional<dxq>> H = new yn<ByteBuf, Optional<dxq>>() {
      public void a(ByteBuf $$0, Optional<dxq> $$1) {
         if ($$1.isPresent()) {
            wg.a($$0, dke.j($$1.get()));
         } else {
            wg.a($$0, 0);
         }
      }

      public Optional<dxq> a(ByteBuf $$0) {
         int $$1 = wg.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dke.a($$1));
      }
   };
   public static final ajy<Optional<dxq>> j = ajy.a(H);
   public static final ajy<Boolean> k = ajy.a(yl.b);
   public static final ajy<lr> l = ajy.a(lt.bk);
   public static final ajy<List<lr>> m = ajy.a(lt.bk.a(yl.a()));
   public static final ajy<kj> n = ajy.a(kj.a);
   public static final ajy<ji> o = ajy.a(ji.b);
   public static final ajy<Optional<ji>> p = ajy.a(ji.b.a(yl::a));
   public static final ajy<jn> q = ajy.a(jn.j);
   public static final ajy<Optional<bvf<bvy>>> r = ajy.a(bvf.b().a(yl::a));
   public static final ajy<Optional<jq>> s = ajy.a(jq.c.a(yl::a));
   public static final ajy<tq> t = new ajy<tq>() {
      @Override
      public yn<? super wa, tq> codec() {
         return yl.s;
      }

      public tq a(tq $$0) {
         return $$0.i();
      }
   };
   public static final ajy<cpe> u = ajy.a(cpe.d);
   private static final yn<ByteBuf, OptionalInt> I = new yn<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wg.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wg.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajy<OptionalInt> v = ajy.a(I);
   public static final ajy<bwk> w = ajy.a(bwk.t);
   public static final ajy<jr<cht>> x = ajy.a(cht.a);
   public static final ajy<jr<ciw>> y = ajy.a(ciw.d);
   public static final ajy<jr<cia>> z = ajy.a(cia.a);
   public static final ajy<jr<cih>> A = ajy.a(cih.d);
   public static final ajy<jr<cls>> B = ajy.a(cls.d);
   public static final ajy<cjb.a> C = ajy.a(cjb.a.e);
   public static final ajy<ckj.a> D = ajy.a(ckj.a.i);
   public static final ajy<Vector3f> E = ajy.a(yl.u);
   public static final ajy<Quaternionf> F = ajy.a(yl.v);

   public static void a(ajy<?> $$0) {
      G.d($$0);
   }

   @Nullable
   public static ajy<?> a(int $$0) {
      return G.a($$0);
   }

   public static int b(ajy<?> $$0) {
      return G.a($$0);
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
      a(A);
      a(s);
      a(B);
      a(D);
      a(C);
      a(E);
      a(F);
   }
}
