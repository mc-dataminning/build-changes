import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akl {
   private static final ayi<akk<?>> J = ayi.c(16);
   public static final akk<Byte> a = akk.a(yu.c);
   public static final akk<Integer> b = akk.a(yu.h);
   public static final akk<Long> c = akk.a(yu.k);
   public static final akk<Float> d = akk.a(yu.l);
   public static final akk<String> e = akk.a(yu.p);
   public static final akk<wy> f = akk.a(xa.d);
   public static final akk<Optional<wy>> g = akk.a(xa.e);
   public static final akk<czn> h = new akk<czn>() {
      @Override
      public yw<? super wj, czn> codec() {
         return czn.h;
      }

      public czn a(czn $$0) {
         return $$0.v();
      }
   };
   public static final akk<eat> i = akk.a(yu.a(dmr.k));
   private static final yw<ByteBuf, Optional<eat>> K = new yw<ByteBuf, Optional<eat>>() {
      public void a(ByteBuf $$0, Optional<eat> $$1) {
         if ($$1.isPresent()) {
            wp.a($$0, dmr.j($$1.get()));
         } else {
            wp.a($$0, 0);
         }
      }

      public Optional<eat> a(ByteBuf $$0) {
         int $$1 = wp.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dmr.a($$1));
      }
   };
   public static final akk<Optional<eat>> j = akk.a(K);
   public static final akk<Boolean> k = akk.a(yu.b);
   public static final akk<lw> l = akk.a(ly.bl);
   public static final akk<List<lw>> m = akk.a(ly.bl.a(yu.a()));
   public static final akk<jx> n = akk.a(jx.b);
   public static final akk<iv> o = akk.a(iv.b);
   public static final akk<Optional<iv>> p = akk.a(iv.b.a(yu::a));
   public static final akk<jb> q = akk.a(jb.j);
   public static final akk<Optional<bwo<bxj>>> r = akk.a(bwo.b().a(yu::a));
   public static final akk<Optional<je>> s = akk.a(je.c.a(yu::a));
   public static final akk<tz> t = new akk<tz>() {
      @Override
      public yw<? super wj, tz> codec() {
         return yu.t;
      }

      public tz a(tz $$0) {
         return $$0.i();
      }
   };
   public static final akk<cqz> u = akk.a(cqz.d);
   private static final yw<ByteBuf, OptionalInt> L = new yw<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wp.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wp.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akk<OptionalInt> v = akk.a(L);
   public static final akk<bxv> w = akk.a(bxv.t);
   public static final akk<jf<cjd>> x = akk.a(cjd.d);
   public static final akk<jf<cjg>> y = akk.a(cjg.d);
   public static final akk<jf<cjk>> z = akk.a(cjk.d);
   public static final akk<jf<cme>> A = akk.a(cme.d);
   public static final akk<jf<cmc>> B = akk.a(cmc.d);
   public static final akk<jf<cky>> C = akk.a(cky.d);
   public static final akk<jf<cjv>> D = akk.a(cjv.d);
   public static final akk<jf<cnn>> E = akk.a(cnn.d);
   public static final akk<ckl.a> F = akk.a(ckl.a.e);
   public static final akk<cly.a> G = akk.a(cly.a.i);
   public static final akk<Vector3f> H = akk.a(yu.v);
   public static final akk<Quaternionf> I = akk.a(yu.w);

   public static void a(akk<?> $$0) {
      J.d($$0);
   }

   @Nullable
   public static akk<?> a(int $$0) {
      return J.a($$0);
   }

   public static int b(akk<?> $$0) {
      return J.a($$0);
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
