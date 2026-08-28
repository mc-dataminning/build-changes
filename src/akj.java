import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akj {
   private static final ayg<aki<?>> G = ayg.c(16);
   public static final aki<Byte> a = aki.a(ys.c);
   public static final aki<Integer> b = aki.a(ys.h);
   public static final aki<Long> c = aki.a(ys.k);
   public static final aki<Float> d = aki.a(ys.l);
   public static final aki<String> e = aki.a(ys.o);
   public static final aki<ww> f = aki.a(wy.d);
   public static final aki<Optional<ww>> g = aki.a(wy.e);
   public static final aki<cys> h = new aki<cys>() {
      @Override
      public yu<? super wh, cys> codec() {
         return cys.h;
      }

      public cys a(cys $$0) {
         return $$0.v();
      }
   };
   public static final aki<dzo> i = aki.a(ys.a(dlu.k));
   private static final yu<ByteBuf, Optional<dzo>> H = new yu<ByteBuf, Optional<dzo>>() {
      public void a(ByteBuf $$0, Optional<dzo> $$1) {
         if ($$1.isPresent()) {
            wn.a($$0, dlu.j($$1.get()));
         } else {
            wn.a($$0, 0);
         }
      }

      public Optional<dzo> a(ByteBuf $$0) {
         int $$1 = wn.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dlu.a($$1));
      }
   };
   public static final aki<Optional<dzo>> j = aki.a(H);
   public static final aki<Boolean> k = aki.a(ys.b);
   public static final aki<lv> l = aki.a(lx.bk);
   public static final aki<List<lv>> m = aki.a(lx.bk.a(ys.a()));
   public static final aki<jw> n = aki.a(jw.a);
   public static final aki<iu> o = aki.a(iu.b);
   public static final aki<Optional<iu>> p = aki.a(iu.b.a(ys::a));
   public static final aki<ja> q = aki.a(ja.j);
   public static final aki<Optional<bwg<bwz>>> r = aki.a(bwg.b().a(ys::a));
   public static final aki<Optional<jd>> s = aki.a(jd.c.a(ys::a));
   public static final aki<tx> t = new aki<tx>() {
      @Override
      public yu<? super wh, tx> codec() {
         return ys.s;
      }

      public tx a(tx $$0) {
         return $$0.i();
      }
   };
   public static final aki<cqf> u = aki.a(cqf.d);
   private static final yu<ByteBuf, OptionalInt> I = new yu<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wn.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wn.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final aki<OptionalInt> v = aki.a(I);
   public static final aki<bxl> w = aki.a(bxl.t);
   public static final aki<je<cis>> x = aki.a(cis.d);
   public static final aki<je<cjv>> y = aki.a(cjv.d);
   public static final aki<je<ckn>> z = aki.a(ckn.d);
   public static final aki<je<cjg>> A = aki.a(cjg.d);
   public static final aki<je<cmt>> B = aki.a(cmt.d);
   public static final aki<cka.a> C = aki.a(cka.a.e);
   public static final aki<clk.a> D = aki.a(clk.a.i);
   public static final aki<Vector3f> E = aki.a(ys.u);
   public static final aki<Quaternionf> F = aki.a(ys.v);

   public static void a(aki<?> $$0) {
      G.d($$0);
   }

   @Nullable
   public static aki<?> a(int $$0) {
      return G.a($$0);
   }

   public static int b(aki<?> $$0) {
      return G.a($$0);
   }

   private akj() {
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
