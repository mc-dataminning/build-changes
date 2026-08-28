import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akl {
   private static final ayi<akk<?>> H = ayi.c(16);
   public static final akk<Byte> a = akk.a(yu.c);
   public static final akk<Integer> b = akk.a(yu.h);
   public static final akk<Long> c = akk.a(yu.k);
   public static final akk<Float> d = akk.a(yu.l);
   public static final akk<String> e = akk.a(yu.o);
   public static final akk<wy> f = akk.a(xa.d);
   public static final akk<Optional<wy>> g = akk.a(xa.e);
   public static final akk<cyy> h = new akk<cyy>() {
      @Override
      public yw<? super wj, cyy> codec() {
         return cyy.h;
      }

      public cyy a(cyy $$0) {
         return $$0.v();
      }
   };
   public static final akk<dzz> i = akk.a(yu.a(dma.k));
   private static final yw<ByteBuf, Optional<dzz>> I = new yw<ByteBuf, Optional<dzz>>() {
      public void a(ByteBuf $$0, Optional<dzz> $$1) {
         if ($$1.isPresent()) {
            wp.a($$0, dma.j($$1.get()));
         } else {
            wp.a($$0, 0);
         }
      }

      public Optional<dzz> a(ByteBuf $$0) {
         int $$1 = wp.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dma.a($$1));
      }
   };
   public static final akk<Optional<dzz>> j = akk.a(I);
   public static final akk<Boolean> k = akk.a(yu.b);
   public static final akk<lv> l = akk.a(lx.bl);
   public static final akk<List<lv>> m = akk.a(lx.bl.a(yu.a()));
   public static final akk<jw> n = akk.a(jw.a);
   public static final akk<iu> o = akk.a(iu.b);
   public static final akk<Optional<iu>> p = akk.a(iu.b.a(yu::a));
   public static final akk<ja> q = akk.a(ja.j);
   public static final akk<Optional<bwj<bxc>>> r = akk.a(bwj.b().a(yu::a));
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
   public static final akk<cql> u = akk.a(cql.d);
   private static final yw<ByteBuf, OptionalInt> J = new yw<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wp.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wp.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akk<OptionalInt> v = akk.a(J);
   public static final akk<bxo> w = akk.a(bxo.t);
   public static final akk<je<ciw>> x = akk.a(ciw.d);
   public static final akk<je<cjb>> y = akk.a(cjb.d);
   public static final akk<je<ckb>> z = akk.a(ckb.d);
   public static final akk<je<ckt>> A = akk.a(ckt.d);
   public static final akk<je<cjm>> B = akk.a(cjm.d);
   public static final akk<je<cmz>> C = akk.a(cmz.d);
   public static final akk<ckg.a> D = akk.a(ckg.a.e);
   public static final akk<clq.a> E = akk.a(clq.a.i);
   public static final akk<Vector3f> F = akk.a(yu.u);
   public static final akk<Quaternionf> G = akk.a(yu.v);

   public static void a(akk<?> $$0) {
      H.d($$0);
   }

   @Nullable
   public static akk<?> a(int $$0) {
      return H.a($$0);
   }

   public static int b(akk<?> $$0) {
      return H.a($$0);
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
      a(A);
      a(B);
      a(s);
      a(C);
      a(E);
      a(D);
      a(F);
      a(G);
   }
}
