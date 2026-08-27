import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ajm {
   private static final awt<ajl<?>> F = awt.c(16);
   public static final ajl<Byte> a = ajl.a(yo.c);
   public static final ajl<Integer> b = ajl.a(yo.f);
   public static final ajl<Long> c = ajl.a(yo.g);
   public static final ajl<Float> d = ajl.a(yo.h);
   public static final ajl<String> e = ajl.a(yo.k);
   public static final ajl<ws> f = ajl.a(wu.d);
   public static final ajl<Optional<ws>> g = ajl.a(wu.e);
   public static final ajl<csd> h = new ajl<csd>() {
      @Override
      public yq<? super wd, csd> codec() {
         return csd.e;
      }

      public csd a(csd $$0) {
         return $$0.r();
      }
   };
   public static final ajl<dpy> i = ajl.a(yo.a(dcv.q));
   private static final yq<ByteBuf, Optional<dpy>> G = new yq<ByteBuf, Optional<dpy>>() {
      public void a(ByteBuf $$0, Optional<dpy> $$1) {
         if ($$1.isPresent()) {
            wj.a($$0, dcv.i($$1.get()));
         } else {
            wj.a($$0, 0);
         }
      }

      public Optional<dpy> a(ByteBuf $$0) {
         int $$1 = wj.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dcv.a($$1));
      }
   };
   public static final ajl<Optional<dpy>> j = ajl.a(G);
   public static final ajl<Boolean> k = ajl.a(yo.b);
   public static final ajl<ku> l = ajl.a(kw.aY);
   public static final ajl<List<ku>> m = ajl.a(kw.aY.a(yo.a()));
   public static final ajl<jn> n = ajl.a(jn.a);
   public static final ajl<im> o = ajl.a(im.b);
   public static final ajl<Optional<im>> p = ajl.a(im.b.a(yo::a));
   public static final ajl<ir> q = ajl.a(ir.j);
   public static final ajl<Optional<UUID>> r = ajl.a(jp.g.a(yo::a));
   public static final ajl<Optional<iu>> s = ajl.a(iu.c.a(yo::a));
   public static final ajl<ty> t = new ajl<ty>() {
      @Override
      public yq<? super wd, ty> codec() {
         return yo.o;
      }

      public ty a(ty $$0) {
         return $$0.h();
      }
   };
   public static final ajl<cjz> u = ajl.a(cjz.d);
   private static final yq<ByteBuf, OptionalInt> H = new yq<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wj.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wj.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajl<OptionalInt> v = ajl.a(H);
   public static final ajl<brp> w = ajl.a(brp.t);
   public static final ajl<ccx> x = ajl.a(yo.a(ld.l));
   public static final ajl<iv<cdx>> y = ajl.a(yo.b(ld.m));
   public static final ajl<cde> z = ajl.a(yo.a(ld.B));
   public static final ajl<iv<cgr>> A = ajl.a(yo.b(ld.S));
   public static final ajl<cec.a> B = ajl.a(cec.a.e);
   public static final ajl<cfk.a> C = ajl.a(cfk.a.i);
   public static final ajl<Vector3f> D = ajl.a(yo.q);
   public static final ajl<Quaternionf> E = ajl.a(yo.r);

   public static void a(ajl<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ajl<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ajl<?> $$0) {
      return F.a($$0);
   }

   private ajm() {
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
