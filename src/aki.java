import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aki {
   private static final axr<akh<?>> F = axr.c(16);
   public static final akh<Byte> a = akh.a(zh.c);
   public static final akh<Integer> b = akh.a(zh.g);
   public static final akh<Long> c = akh.a(zh.h);
   public static final akh<Float> d = akh.a(zh.i);
   public static final akh<String> e = akh.a(zh.l);
   public static final akh<xl> f = akh.a(xn.d);
   public static final akh<Optional<xl>> g = akh.a(xn.e);
   public static final akh<cuk> h = new akh<cuk>() {
      @Override
      public zj<? super ww, cuk> codec() {
         return cuk.h;
      }

      public cuk a(cuk $$0) {
         return $$0.s();
      }
   };
   public static final akh<drx> i = akh.a(zh.a(deu.q));
   private static final zj<ByteBuf, Optional<drx>> G = new zj<ByteBuf, Optional<drx>>() {
      public void a(ByteBuf $$0, Optional<drx> $$1) {
         if ($$1.isPresent()) {
            xc.a($$0, deu.i($$1.get()));
         } else {
            xc.a($$0, 0);
         }
      }

      public Optional<drx> a(ByteBuf $$0) {
         int $$1 = xc.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(deu.a($$1));
      }
   };
   public static final akh<Optional<drx>> j = akh.a(G);
   public static final akh<Boolean> k = akh.a(zh.b);
   public static final akh<lh> l = akh.a(lj.bg);
   public static final akh<List<lh>> m = akh.a(lj.bg.a(zh.a()));
   public static final akh<ka> n = akh.a(ka.a);
   public static final akh<iz> o = akh.a(iz.b);
   public static final akh<Optional<iz>> p = akh.a(iz.b.a(zh::a));
   public static final akh<je> q = akh.a(je.j);
   public static final akh<Optional<UUID>> r = akh.a(kc.g.a(zh::a));
   public static final akh<Optional<jh>> s = akh.a(jh.c.a(zh::a));
   public static final akh<ur> t = new akh<ur>() {
      @Override
      public zj<? super ww, ur> codec() {
         return zh.p;
      }

      public ur a(ur $$0) {
         return $$0.h();
      }
   };
   public static final akh<cmg> u = akh.a(cmg.d);
   private static final zj<ByteBuf, OptionalInt> H = new zj<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = xc.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         xc.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akh<OptionalInt> v = akh.a(H);
   public static final akh<btw> w = akh.a(btw.t);
   public static final akh<ji<cfe>> x = akh.a(zh.b(lq.l));
   public static final akh<ji<cge>> y = akh.a(zh.b(lq.m));
   public static final akh<ji<cfl>> z = akh.a(zh.b(lq.B));
   public static final akh<ji<ciy>> A = akh.a(zh.b(lq.S));
   public static final akh<cgj.a> B = akh.a(cgj.a.e);
   public static final akh<chr.a> C = akh.a(chr.a.i);
   public static final akh<Vector3f> D = akh.a(zh.r);
   public static final akh<Quaternionf> E = akh.a(zh.s);

   public static void a(akh<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static akh<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(akh<?> $$0) {
      return F.a($$0);
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
      a(s);
      a(A);
      a(C);
      a(B);
      a(D);
      a(E);
   }
}
