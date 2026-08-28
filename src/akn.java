import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akn {
   private static final ayk<akm<?>> J = ayk.c(16);
   public static final akm<Byte> a = akm.a(yw.c);
   public static final akm<Integer> b = akm.a(yw.h);
   public static final akm<Long> c = akm.a(yw.k);
   public static final akm<Float> d = akm.a(yw.l);
   public static final akm<String> e = akm.a(yw.p);
   public static final akm<xa> f = akm.a(xc.d);
   public static final akm<Optional<xa>> g = akm.a(xc.e);
   public static final akm<czy> h = new akm<czy>() {
      @Override
      public yy<? super wl, czy> codec() {
         return czy.h;
      }

      public czy a(czy $$0) {
         return $$0.v();
      }
   };
   public static final akm<ebe> i = akm.a(yw.a(dnc.k));
   private static final yy<ByteBuf, Optional<ebe>> K = new yy<ByteBuf, Optional<ebe>>() {
      public void a(ByteBuf $$0, Optional<ebe> $$1) {
         if ($$1.isPresent()) {
            wr.a($$0, dnc.j($$1.get()));
         } else {
            wr.a($$0, 0);
         }
      }

      public Optional<ebe> a(ByteBuf $$0) {
         int $$1 = wr.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dnc.a($$1));
      }
   };
   public static final akm<Optional<ebe>> j = akm.a(K);
   public static final akm<Boolean> k = akm.a(yw.b);
   public static final akm<lw> l = akm.a(ly.bl);
   public static final akm<List<lw>> m = akm.a(ly.bl.a(yw.a()));
   public static final akm<jx> n = akm.a(jx.b);
   public static final akm<iv> o = akm.a(iv.b);
   public static final akm<Optional<iv>> p = akm.a(iv.b.a(yw::a));
   public static final akm<jb> q = akm.a(jb.j);
   public static final akm<Optional<bwz<bxu>>> r = akm.a(bwz.b().a(yw::a));
   public static final akm<Optional<je>> s = akm.a(je.c.a(yw::a));
   public static final akm<tz> t = new akm<tz>() {
      @Override
      public yy<? super wl, tz> codec() {
         return yw.t;
      }

      public tz a(tz $$0) {
         return $$0.l();
      }
   };
   public static final akm<crk> u = akm.a(crk.d);
   private static final yy<ByteBuf, OptionalInt> L = new yy<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wr.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wr.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akm<OptionalInt> v = akm.a(L);
   public static final akm<byg> w = akm.a(byg.t);
   public static final akm<jf<cjo>> x = akm.a(cjo.d);
   public static final akm<jf<cjr>> y = akm.a(cjr.d);
   public static final akm<jf<cjv>> z = akm.a(cjv.d);
   public static final akm<jf<cmp>> A = akm.a(cmp.d);
   public static final akm<jf<cmn>> B = akm.a(cmn.d);
   public static final akm<jf<clj>> C = akm.a(clj.d);
   public static final akm<jf<ckg>> D = akm.a(ckg.d);
   public static final akm<jf<cny>> E = akm.a(cny.d);
   public static final akm<ckw.a> F = akm.a(ckw.a.e);
   public static final akm<cmj.a> G = akm.a(cmj.a.i);
   public static final akm<Vector3f> H = akm.a(yw.v);
   public static final akm<Quaternionf> I = akm.a(yw.w);

   public static void a(akm<?> $$0) {
      J.d($$0);
   }

   @Nullable
   public static akm<?> a(int $$0) {
      return J.a($$0);
   }

   public static int b(akm<?> $$0) {
      return J.a($$0);
   }

   private akn() {
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
      a(z);
      a(A);
      a(B);
      a(C);
      a(D);
      a(y);
      a(s);
      a(E);
      a(G);
      a(F);
      a(H);
      a(I);
   }
}
