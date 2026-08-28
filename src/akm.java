import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akm {
   private static final ayg<akl<?>> F = ayg.c(16);
   public static final akl<Byte> a = akl.a(zd.c);
   public static final akl<Integer> b = akl.a(zd.h);
   public static final akl<Long> c = akl.a(zd.i);
   public static final akl<Float> d = akl.a(zd.j);
   public static final akl<String> e = akl.a(zd.m);
   public static final akl<xh> f = akl.a(xj.d);
   public static final akl<Optional<xh>> g = akl.a(xj.e);
   public static final akl<cvx> h = new akl<cvx>() {
      @Override
      public zf<? super ws, cvx> codec() {
         return cvx.h;
      }

      public cvx a(cvx $$0) {
         return $$0.v();
      }
   };
   public static final akl<dvd> i = akl.a(zd.a(dhy.q));
   private static final zf<ByteBuf, Optional<dvd>> G = new zf<ByteBuf, Optional<dvd>>() {
      public void a(ByteBuf $$0, Optional<dvd> $$1) {
         if ($$1.isPresent()) {
            wy.a($$0, dhy.j($$1.get()));
         } else {
            wy.a($$0, 0);
         }
      }

      public Optional<dvd> a(ByteBuf $$0) {
         int $$1 = wy.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dhy.a($$1));
      }
   };
   public static final akl<Optional<dvd>> j = akl.a(G);
   public static final akl<Boolean> k = akl.a(zd.b);
   public static final akl<lo> l = akl.a(lq.bg);
   public static final akl<List<lo>> m = akl.a(lq.bg.a(zd.a()));
   public static final akl<kh> n = akl.a(kh.a);
   public static final akl<jg> o = akl.a(jg.b);
   public static final akl<Optional<jg>> p = akl.a(jg.b.a(zd::a));
   public static final akl<jl> q = akl.a(jl.j);
   public static final akl<Optional<UUID>> r = akl.a(kj.g.a(zd::a));
   public static final akl<Optional<jo>> s = akl.a(jo.c.a(zd::a));
   public static final akl<uj> t = new akl<uj>() {
      @Override
      public zf<? super ws, uj> codec() {
         return zd.q;
      }

      public uj a(uj $$0) {
         return $$0.i();
      }
   };
   public static final akl<cnu> u = akl.a(cnu.d);
   private static final zf<ByteBuf, OptionalInt> H = new zf<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wy.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wy.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akl<OptionalInt> v = akl.a(H);
   public static final akl<bvh> w = akl.a(bvh.t);
   public static final akl<jp<cgq>> x = akl.a(cgq.a);
   public static final akl<jp<chq>> y = akl.a(chq.d);
   public static final akl<jp<cgx>> z = akl.a(cgx.a);
   public static final akl<jp<ckm>> A = akl.a(ckm.d);
   public static final akl<chv.a> B = akl.a(chv.a.e);
   public static final akl<cjd.a> C = akl.a(cjd.a.i);
   public static final akl<Vector3f> D = akl.a(zd.s);
   public static final akl<Quaternionf> E = akl.a(zd.t);

   public static void a(akl<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static akl<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(akl<?> $$0) {
      return F.a($$0);
   }

   private akm() {
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
