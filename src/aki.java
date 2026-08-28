import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aki {
   private static final axz<akh<?>> F = axz.c(16);
   public static final akh<Byte> a = akh.a(yz.c);
   public static final akh<Integer> b = akh.a(yz.g);
   public static final akh<Long> c = akh.a(yz.h);
   public static final akh<Float> d = akh.a(yz.i);
   public static final akh<String> e = akh.a(yz.l);
   public static final akh<xd> f = akh.a(xf.d);
   public static final akh<Optional<xd>> g = akh.a(xf.e);
   public static final akh<cvl> h = new akh<cvl>() {
      @Override
      public zb<? super wo, cvl> codec() {
         return cvl.h;
      }

      public cvl a(cvl $$0) {
         return $$0.u();
      }
   };
   public static final akh<dua> i = akh.a(yz.a(dgv.q));
   private static final zb<ByteBuf, Optional<dua>> G = new zb<ByteBuf, Optional<dua>>() {
      public void a(ByteBuf $$0, Optional<dua> $$1) {
         if ($$1.isPresent()) {
            wu.a($$0, dgv.j($$1.get()));
         } else {
            wu.a($$0, 0);
         }
      }

      public Optional<dua> a(ByteBuf $$0) {
         int $$1 = wu.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dgv.a($$1));
      }
   };
   public static final akh<Optional<dua>> j = akh.a(G);
   public static final akh<Boolean> k = akh.a(yz.b);
   public static final akh<ll> l = akh.a(ln.bg);
   public static final akh<List<ll>> m = akh.a(ln.bg.a(yz.a()));
   public static final akh<kf> n = akh.a(kf.a);
   public static final akh<je> o = akh.a(je.b);
   public static final akh<Optional<je>> p = akh.a(je.b.a(yz::a));
   public static final akh<jj> q = akh.a(jj.j);
   public static final akh<Optional<UUID>> r = akh.a(kh.g.a(yz::a));
   public static final akh<Optional<jm>> s = akh.a(jm.c.a(yz::a));
   public static final akh<uf> t = new akh<uf>() {
      @Override
      public zb<? super wo, uf> codec() {
         return yz.p;
      }

      public uf a(uf $$0) {
         return $$0.i();
      }
   };
   public static final akh<cnd> u = akh.a(cnd.d);
   private static final zb<ByteBuf, OptionalInt> H = new zb<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wu.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wu.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akh<OptionalInt> v = akh.a(H);
   public static final akh<bur> w = akh.a(bur.t);
   public static final akh<jn<cfz>> x = akh.a(cfz.a);
   public static final akh<jn<cgz>> y = akh.a(cgz.d);
   public static final akh<jn<cgg>> z = akh.a(cgg.a);
   public static final akh<jn<cjv>> A = akh.a(cjv.d);
   public static final akh<che.a> B = akh.a(che.a.e);
   public static final akh<cim.a> C = akh.a(cim.a.i);
   public static final akh<Vector3f> D = akh.a(yz.r);
   public static final akh<Quaternionf> E = akh.a(yz.s);

   public static void a(akh<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static akh<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(akh<?> $$0) {
      return F.a($$0);
   }

   private aki() {
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
