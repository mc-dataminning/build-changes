import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aik {
   private static final avj<aij<?>> D = avj.c(16);
   public static final aij<Byte> a = aij.a(xo.b);
   public static final aij<Integer> b = aij.a(xo.d);
   public static final aij<Long> c = aij.a(xo.e);
   public static final aij<Float> d = aij.a(xo.f);
   public static final aij<String> e = aij.a(xo.i);
   public static final aij<vs> f = aij.a(vu.b);
   public static final aij<Optional<vs>> g = aij.a(vu.c);
   public static final aij<cpq> h = new aij<cpq>() {
      @Override
      public xq<? super vd, cpq> codec() {
         return cpq.f;
      }

      public cpq a(cpq $$0) {
         return $$0.q();
      }
   };
   public static final aij<dme> i = aij.a(xo.a(czf.q));
   private static final xq<ByteBuf, Optional<dme>> E = new xq<ByteBuf, Optional<dme>>() {
      public void a(ByteBuf $$0, Optional<dme> $$1) {
         if ($$1.isPresent()) {
            vj.a($$0, czf.i($$1.get()));
         } else {
            vj.a($$0, 0);
         }
      }

      public Optional<dme> a(ByteBuf $$0) {
         int $$1 = vj.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(czf.a($$1));
      }
   };
   public static final aij<Optional<dme>> j = aij.a(E);
   public static final aij<Boolean> k = aij.a(xo.a);
   public static final aij<jz> l = aij.a(kb.aY);
   public static final aij<jc> m = aij.a(jc.a);
   public static final aij<ib> n = aij.a(ib.b);
   public static final aij<Optional<ib>> o = aij.a(ib.b.a(xo::a));
   public static final aij<ih> p = aij.a(ih.j);
   public static final aij<Optional<UUID>> q = aij.a(je.g.a(xo::a));
   public static final aij<Optional<ik>> r = aij.a(ik.b.a(xo::a));
   public static final aij<sy> s = new aij<sy>() {
      @Override
      public xq<? super vd, sy> codec() {
         return xo.k;
      }

      public sy a(sy $$0) {
         return $$0.h();
      }
   };
   public static final aij<cho> t = aij.a(cho.d);
   private static final xq<ByteBuf, OptionalInt> F = new xq<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = vj.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         vj.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final aij<OptionalInt> u = aij.a(F);
   public static final aij<bpi> v = aij.a(bpi.t);
   public static final aij<caq> w = aij.a(xo.a(ki.l));
   public static final aij<cax> x = aij.a(xo.a(ki.A));
   public static final aij<il<ceh>> y = aij.a(xo.b(ki.R));
   public static final aij<cbt.a> z = aij.a(cbt.a.d);
   public static final aij<cdb.a> A = aij.a(cdb.a.i);
   public static final aij<Vector3f> B = aij.a(xo.m);
   public static final aij<Quaternionf> C = aij.a(xo.n);

   public static void a(aij<?> $$0) {
      D.d($$0);
   }

   @Nullable
   public static aij<?> a(int $$0) {
      return D.a($$0);
   }

   public static int b(aij<?> $$0) {
      return D.a($$0);
   }

   private aik() {
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
      a(m);
      a(n);
      a(o);
      a(p);
      a(q);
      a(i);
      a(j);
      a(s);
      a(l);
      a(t);
      a(u);
      a(v);
      a(w);
      a(x);
      a(r);
      a(y);
      a(A);
      a(z);
      a(B);
      a(C);
   }
}
