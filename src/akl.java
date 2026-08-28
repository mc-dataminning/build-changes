import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akl {
   private static final ayi<akk<?>> I = ayi.c(16);
   public static final akk<Byte> a = akk.a(yu.c);
   public static final akk<Integer> b = akk.a(yu.h);
   public static final akk<Long> c = akk.a(yu.k);
   public static final akk<Float> d = akk.a(yu.l);
   public static final akk<String> e = akk.a(yu.o);
   public static final akk<wy> f = akk.a(xa.d);
   public static final akk<Optional<wy>> g = akk.a(xa.e);
   public static final akk<czd> h = new akk<czd>() {
      @Override
      public yw<? super wj, czd> codec() {
         return czd.h;
      }

      public czd a(czd $$0) {
         return $$0.v();
      }
   };
   public static final akk<eah> i = akk.a(yu.a(dmf.k));
   private static final yw<ByteBuf, Optional<eah>> J = new yw<ByteBuf, Optional<eah>>() {
      public void a(ByteBuf $$0, Optional<eah> $$1) {
         if ($$1.isPresent()) {
            wp.a($$0, dmf.j($$1.get()));
         } else {
            wp.a($$0, 0);
         }
      }

      public Optional<eah> a(ByteBuf $$0) {
         int $$1 = wp.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dmf.a($$1));
      }
   };
   public static final akk<Optional<eah>> j = akk.a(J);
   public static final akk<Boolean> k = akk.a(yu.b);
   public static final akk<lv> l = akk.a(lx.bl);
   public static final akk<List<lv>> m = akk.a(lx.bl.a(yu.a()));
   public static final akk<jw> n = akk.a(jw.a);
   public static final akk<iu> o = akk.a(iu.b);
   public static final akk<Optional<iu>> p = akk.a(iu.b.a(yu::a));
   public static final akk<ja> q = akk.a(ja.j);
   public static final akk<Optional<bwl<bxe>>> r = akk.a(bwl.b().a(yu::a));
   public static final akk<Optional<jd>> s = akk.a(jd.c.a(yu::a));
   public static final akk<tz> t = new akk<tz>() {
      @Override
      public yw<? super wj, tz> codec() {
         return yu.s;
      }

      public tz a(tz $$0) {
         return $$0.i();
      }
   };
   public static final akk<cqp> u = akk.a(cqp.d);
   private static final yw<ByteBuf, OptionalInt> K = new yw<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wp.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wp.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akk<OptionalInt> v = akk.a(K);
   public static final akk<bxq> w = akk.a(bxq.t);
   public static final akk<je<ciy>> x = akk.a(ciy.d);
   public static final akk<je<cjb>> y = akk.a(cjb.d);
   public static final akk<je<cjf>> z = akk.a(cjf.d);
   public static final akk<je<ckf>> A = akk.a(ckf.d);
   public static final akk<je<ckx>> B = akk.a(ckx.d);
   public static final akk<je<cjq>> C = akk.a(cjq.d);
   public static final akk<je<cnd>> D = akk.a(cnd.d);
   public static final akk<ckk.a> E = akk.a(ckk.a.e);
   public static final akk<clu.a> F = akk.a(clu.a.i);
   public static final akk<Vector3f> G = akk.a(yu.u);
   public static final akk<Quaternionf> H = akk.a(yu.v);

   public static void a(akk<?> $$0) {
      I.d($$0);
   }

   @Nullable
   public static akk<?> a(int $$0) {
      return I.a($$0);
   }

   public static int b(akk<?> $$0) {
      return I.a($$0);
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
      a(z);
      a(A);
      a(B);
      a(C);
      a(y);
      a(s);
      a(D);
      a(F);
      a(E);
      a(G);
      a(H);
   }
}
