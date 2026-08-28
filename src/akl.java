import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akl {
   private static final axu<akk<?>> F = axu.c(16);
   public static final akk<Byte> a = akk.a(zk.c);
   public static final akk<Integer> b = akk.a(zk.g);
   public static final akk<Long> c = akk.a(zk.h);
   public static final akk<Float> d = akk.a(zk.i);
   public static final akk<String> e = akk.a(zk.l);
   public static final akk<xo> f = akk.a(xq.d);
   public static final akk<Optional<xo>> g = akk.a(xq.e);
   public static final akk<cun> h = new akk<cun>() {
      @Override
      public zm<? super wz, cun> codec() {
         return cun.h;
      }

      public cun a(cun $$0) {
         return $$0.s();
      }
   };
   public static final akk<dsa> i = akk.a(zk.a(dex.q));
   private static final zm<ByteBuf, Optional<dsa>> G = new zm<ByteBuf, Optional<dsa>>() {
      public void a(ByteBuf $$0, Optional<dsa> $$1) {
         if ($$1.isPresent()) {
            xf.a($$0, dex.i($$1.get()));
         } else {
            xf.a($$0, 0);
         }
      }

      public Optional<dsa> a(ByteBuf $$0) {
         int $$1 = xf.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dex.a($$1));
      }
   };
   public static final akk<Optional<dsa>> j = akk.a(G);
   public static final akk<Boolean> k = akk.a(zk.b);
   public static final akk<lg> l = akk.a(li.bg);
   public static final akk<List<lg>> m = akk.a(li.bg.a(zk.a()));
   public static final akk<ka> n = akk.a(ka.a);
   public static final akk<iz> o = akk.a(iz.b);
   public static final akk<Optional<iz>> p = akk.a(iz.b.a(zk::a));
   public static final akk<je> q = akk.a(je.j);
   public static final akk<Optional<UUID>> r = akk.a(kc.g.a(zk::a));
   public static final akk<Optional<jh>> s = akk.a(jh.c.a(zk::a));
   public static final akk<ur> t = new akk<ur>() {
      @Override
      public zm<? super wz, ur> codec() {
         return zk.p;
      }

      public ur a(ur $$0) {
         return $$0.h();
      }
   };
   public static final akk<cmj> u = akk.a(cmj.d);
   private static final zm<ByteBuf, OptionalInt> H = new zm<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = xf.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         xf.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akk<OptionalInt> v = akk.a(H);
   public static final akk<btz> w = akk.a(btz.t);
   public static final akk<ji<cfh>> x = akk.a(zk.b(lq.l));
   public static final akk<ji<cgh>> y = akk.a(zk.b(lq.m));
   public static final akk<ji<cfo>> z = akk.a(zk.b(lq.B));
   public static final akk<ji<cjb>> A = akk.a(zk.b(lq.S));
   public static final akk<cgm.a> B = akk.a(cgm.a.e);
   public static final akk<chu.a> C = akk.a(chu.a.i);
   public static final akk<Vector3f> D = akk.a(zk.r);
   public static final akk<Quaternionf> E = akk.a(zk.s);

   public static void a(akk<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static akk<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(akk<?> $$0) {
      return F.a($$0);
   }

   private akl() {
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
