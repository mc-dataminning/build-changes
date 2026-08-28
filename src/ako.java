import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ako {
   private static final ayj<akn<?>> F = ayj.c(16);
   public static final akn<Byte> a = akn.a(zf.c);
   public static final akn<Integer> b = akn.a(zf.h);
   public static final akn<Long> c = akn.a(zf.j);
   public static final akn<Float> d = akn.a(zf.k);
   public static final akn<String> e = akn.a(zf.n);
   public static final akn<xj> f = akn.a(xl.d);
   public static final akn<Optional<xj>> g = akn.a(xl.e);
   public static final akn<cwm> h = new akn<cwm>() {
      @Override
      public zh<? super wu, cwm> codec() {
         return cwm.h;
      }

      public cwm a(cwm $$0) {
         return $$0.v();
      }
   };
   public static final akn<dvv> i = akn.a(zf.a(diq.q));
   private static final zh<ByteBuf, Optional<dvv>> G = new zh<ByteBuf, Optional<dvv>>() {
      public void a(ByteBuf $$0, Optional<dvv> $$1) {
         if ($$1.isPresent()) {
            xa.a($$0, diq.j($$1.get()));
         } else {
            xa.a($$0, 0);
         }
      }

      public Optional<dvv> a(ByteBuf $$0) {
         int $$1 = xa.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(diq.a($$1));
      }
   };
   public static final akn<Optional<dvv>> j = akn.a(G);
   public static final akn<Boolean> k = akn.a(zf.b);
   public static final akn<lq> l = akn.a(ls.bg);
   public static final akn<List<lq>> m = akn.a(ls.bg.a(zf.a()));
   public static final akn<ki> n = akn.a(ki.a);
   public static final akn<jh> o = akn.a(jh.b);
   public static final akn<Optional<jh>> p = akn.a(jh.b.a(zf::a));
   public static final akn<jm> q = akn.a(jm.j);
   public static final akn<Optional<UUID>> r = akn.a(kk.g.a(zf::a));
   public static final akn<Optional<jp>> s = akn.a(jp.c.a(zf::a));
   public static final akn<ul> t = new akn<ul>() {
      @Override
      public zh<? super wu, ul> codec() {
         return zf.r;
      }

      public ul a(ul $$0) {
         return $$0.i();
      }
   };
   public static final akn<cog> u = akn.a(cog.d);
   private static final zh<ByteBuf, OptionalInt> H = new zh<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = xa.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         xa.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akn<OptionalInt> v = akn.a(H);
   public static final akn<bvt> w = akn.a(bvt.t);
   public static final akn<jq<chc>> x = akn.a(chc.a);
   public static final akn<jq<cic>> y = akn.a(cic.d);
   public static final akn<jq<chj>> z = akn.a(chj.a);
   public static final akn<jq<cky>> A = akn.a(cky.d);
   public static final akn<cih.a> B = akn.a(cih.a.e);
   public static final akn<cjp.a> C = akn.a(cjp.a.i);
   public static final akn<Vector3f> D = akn.a(zf.t);
   public static final akn<Quaternionf> E = akn.a(zf.u);

   public static void a(akn<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static akn<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(akn<?> $$0) {
      return F.a($$0);
   }

   private ako() {
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
