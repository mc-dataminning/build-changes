import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aio {
   private static final avt<ain<?>> D = avt.c(16);
   public static final ain<Byte> a = ain.a(xq.b);
   public static final ain<Integer> b = ain.a(xq.d);
   public static final ain<Long> c = ain.a(xq.e);
   public static final ain<Float> d = ain.a(xq.f);
   public static final ain<String> e = ain.a(xq.i);
   public static final ain<vu> f = ain.a(vw.b);
   public static final ain<Optional<vu>> g = ain.a(vw.c);
   public static final ain<cqk> h = new ain<cqk>() {
      @Override
      public xs<? super vf, cqk> codec() {
         return cqk.f;
      }

      public cqk a(cqk $$0) {
         return $$0.q();
      }
   };
   public static final ain<dmz> i = ain.a(xq.a(daa.q));
   private static final xs<ByteBuf, Optional<dmz>> E = new xs<ByteBuf, Optional<dmz>>() {
      public void a(ByteBuf $$0, Optional<dmz> $$1) {
         if ($$1.isPresent()) {
            vl.a($$0, daa.i($$1.get()));
         } else {
            vl.a($$0, 0);
         }
      }

      public Optional<dmz> a(ByteBuf $$0) {
         int $$1 = vl.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(daa.a($$1));
      }
   };
   public static final ain<Optional<dmz>> j = ain.a(E);
   public static final ain<Boolean> k = ain.a(xq.a);
   public static final ain<ka> l = ain.a(kc.aZ);
   public static final ain<jd> m = ain.a(jd.a);
   public static final ain<ib> n = ain.a(ib.b);
   public static final ain<Optional<ib>> o = ain.a(ib.b.a(xq::a));
   public static final ain<ih> p = ain.a(ih.j);
   public static final ain<Optional<UUID>> q = ain.a(jf.g.a(xq::a));
   public static final ain<Optional<ik>> r = ain.a(ik.b.a(xq::a));
   public static final ain<ta> s = new ain<ta>() {
      @Override
      public xs<? super vf, ta> codec() {
         return xq.k;
      }

      public ta a(ta $$0) {
         return $$0.h();
      }
   };
   public static final ain<cig> t = ain.a(cig.d);
   private static final xs<ByteBuf, OptionalInt> F = new xs<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = vl.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         vl.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ain<OptionalInt> u = ain.a(F);
   public static final ain<bpz> v = ain.a(bpz.t);
   public static final ain<cbh> w = ain.a(xq.a(kj.l));
   public static final ain<cbo> x = ain.a(xq.a(kj.A));
   public static final ain<il<cez>> y = ain.a(xq.b(kj.R));
   public static final ain<cck.a> z = ain.a(cck.a.e);
   public static final ain<cds.a> A = ain.a(cds.a.i);
   public static final ain<Vector3f> B = ain.a(xq.m);
   public static final ain<Quaternionf> C = ain.a(xq.n);

   public static void a(ain<?> $$0) {
      D.d($$0);
   }

   @Nullable
   public static ain<?> a(int $$0) {
      return D.a($$0);
   }

   public static int b(ain<?> $$0) {
      return D.a($$0);
   }

   private aio() {
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
