import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aig {
   private static final ave<aif<?>> D = ave.c(16);
   public static final aif<Byte> a = aif.a(xm.b);
   public static final aif<Integer> b = aif.a(xm.d);
   public static final aif<Long> c = aif.a(xm.e);
   public static final aif<Float> d = aif.a(xm.f);
   public static final aif<String> e = aif.a(xm.h);
   public static final aif<vq> f = aif.a(vs.b);
   public static final aif<Optional<vq>> g = aif.a(vs.b.a(xm::a));
   public static final aif<coz> h = new aif<coz>() {
      @Override
      public xo<? super vb, coz> codec() {
         return coz.f;
      }

      public coz a(coz $$0) {
         return $$0.q();
      }
   };
   public static final aif<dlf> i = aif.a(xm.a(cyo.q));
   private static final xo<ByteBuf, Optional<dlf>> E = new xo<ByteBuf, Optional<dlf>>() {
      public void a(ByteBuf $$0, Optional<dlf> $$1) {
         if ($$1.isPresent()) {
            vh.a($$0, cyo.i($$1.get()));
         } else {
            vh.a($$0, 0);
         }
      }

      public Optional<dlf> a(ByteBuf $$0) {
         int $$1 = vh.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(cyo.a($$1));
      }
   };
   public static final aif<Optional<dlf>> j = aif.a(E);
   public static final aif<Boolean> k = aif.a(xm.a);
   public static final aif<jx> l = aif.a(jz.aX);
   public static final aif<ja> m = aif.a(ja.a);
   public static final aif<hz> n = aif.a(hz.b);
   public static final aif<Optional<hz>> o = aif.a(hz.b.a(xm::a));
   public static final aif<ie> p = aif.a(ie.j);
   public static final aif<Optional<UUID>> q = aif.a(jc.f.a(xm::a));
   public static final aif<Optional<ii>> r = aif.a(ii.b.a(xm::a));
   public static final aif<sw> s = new aif<sw>() {
      @Override
      public xo<? super vb, sw> codec() {
         return xm.j;
      }

      public sw a(sw $$0) {
         return $$0.h();
      }
   };
   public static final aif<cgv> t = aif.a(cgv.d);
   private static final xo<ByteBuf, OptionalInt> F = new xo<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = vh.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         vh.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final aif<OptionalInt> u = aif.a(F);
   public static final aif<bor> v = aif.a(bor.t);
   public static final aif<bzx> w = aif.a(xm.a(kg.l));
   public static final aif<cae> x = aif.a(xm.a(kg.A));
   public static final aif<ij<cdo>> y = aif.a(xm.b(kg.R));
   public static final aif<cba.a> z = aif.a(cba.a.d);
   public static final aif<cci.a> A = aif.a(cci.a.i);
   public static final aif<Vector3f> B = aif.a(xm.l);
   public static final aif<Quaternionf> C = aif.a(xm.m);

   public static void a(aif<?> $$0) {
      D.d($$0);
   }

   @Nullable
   public static aif<?> a(int $$0) {
      return D.a($$0);
   }

   public static int b(aif<?> $$0) {
      return D.a($$0);
   }

   private aig() {
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
