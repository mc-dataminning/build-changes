import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akj {
   private static final ayc<aki<?>> F = ayc.c(16);
   public static final aki<Byte> a = aki.a(za.c);
   public static final aki<Integer> b = aki.a(za.h);
   public static final aki<Long> c = aki.a(za.i);
   public static final aki<Float> d = aki.a(za.j);
   public static final aki<String> e = aki.a(za.m);
   public static final aki<xe> f = aki.a(xg.d);
   public static final aki<Optional<xe>> g = aki.a(xg.e);
   public static final aki<cvs> h = new aki<cvs>() {
      @Override
      public zc<? super wp, cvs> codec() {
         return cvs.h;
      }

      public cvs a(cvs $$0) {
         return $$0.u();
      }
   };
   public static final aki<dus> i = aki.a(za.a(dhm.q));
   private static final zc<ByteBuf, Optional<dus>> G = new zc<ByteBuf, Optional<dus>>() {
      public void a(ByteBuf $$0, Optional<dus> $$1) {
         if ($$1.isPresent()) {
            wv.a($$0, dhm.j($$1.get()));
         } else {
            wv.a($$0, 0);
         }
      }

      public Optional<dus> a(ByteBuf $$0) {
         int $$1 = wv.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dhm.a($$1));
      }
   };
   public static final aki<Optional<dus>> j = aki.a(G);
   public static final aki<Boolean> k = aki.a(za.b);
   public static final aki<lm> l = aki.a(lo.bg);
   public static final aki<List<lm>> m = aki.a(lo.bg.a(za.a()));
   public static final aki<kg> n = aki.a(kg.a);
   public static final aki<jf> o = aki.a(jf.b);
   public static final aki<Optional<jf>> p = aki.a(jf.b.a(za::a));
   public static final aki<jk> q = aki.a(jk.j);
   public static final aki<Optional<UUID>> r = aki.a(ki.g.a(za::a));
   public static final aki<Optional<jn>> s = aki.a(jn.c.a(za::a));
   public static final aki<ug> t = new aki<ug>() {
      @Override
      public zc<? super wp, ug> codec() {
         return za.q;
      }

      public ug a(ug $$0) {
         return $$0.i();
      }
   };
   public static final aki<cnl> u = aki.a(cnl.d);
   private static final zc<ByteBuf, OptionalInt> H = new zc<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wv.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wv.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final aki<OptionalInt> v = aki.a(H);
   public static final aki<buz> w = aki.a(buz.t);
   public static final aki<jo<cgh>> x = aki.a(cgh.a);
   public static final aki<jo<chh>> y = aki.a(chh.d);
   public static final aki<jo<cgo>> z = aki.a(cgo.a);
   public static final aki<jo<ckd>> A = aki.a(ckd.d);
   public static final aki<chm.a> B = aki.a(chm.a.e);
   public static final aki<ciu.a> C = aki.a(ciu.a.i);
   public static final aki<Vector3f> D = aki.a(za.s);
   public static final aki<Quaternionf> E = aki.a(za.t);

   public static void a(aki<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static aki<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(aki<?> $$0) {
      return F.a($$0);
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
      a(s);
      a(A);
      a(C);
      a(B);
      a(D);
      a(E);
   }
}
