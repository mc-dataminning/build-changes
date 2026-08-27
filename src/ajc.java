import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ajc {
   private static final awj<ajb<?>> E = awj.c(16);
   public static final ajb<Byte> a = ajb.a(ye.c);
   public static final ajb<Integer> b = ajb.a(ye.f);
   public static final ajb<Long> c = ajb.a(ye.g);
   public static final ajb<Float> d = ajb.a(ye.h);
   public static final ajb<String> e = ajb.a(ye.k);
   public static final ajb<wi> f = ajb.a(wk.d);
   public static final ajb<Optional<wi>> g = ajb.a(wk.e);
   public static final ajb<crs> h = new ajb<crs>() {
      @Override
      public yg<? super vt, crs> codec() {
         return crs.e;
      }

      public crs a(crs $$0) {
         return $$0.r();
      }
   };
   public static final ajb<dpi> i = ajb.a(ye.a(dch.q));
   private static final yg<ByteBuf, Optional<dpi>> F = new yg<ByteBuf, Optional<dpi>>() {
      public void a(ByteBuf $$0, Optional<dpi> $$1) {
         if ($$1.isPresent()) {
            vz.a($$0, dch.i($$1.get()));
         } else {
            vz.a($$0, 0);
         }
      }

      public Optional<dpi> a(ByteBuf $$0) {
         int $$1 = vz.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dch.a($$1));
      }
   };
   public static final ajb<Optional<dpi>> j = ajb.a(F);
   public static final ajb<Boolean> k = ajb.a(ye.b);
   public static final ajb<kl> l = ajb.a(kn.aZ);
   public static final ajb<jf> m = ajb.a(jf.a);
   public static final ajb<id> n = ajb.a(id.b);
   public static final ajb<Optional<id>> o = ajb.a(id.b.a(ye::a));
   public static final ajb<ij> p = ajb.a(ij.j);
   public static final ajb<Optional<UUID>> q = ajb.a(jh.g.a(ye::a));
   public static final ajb<Optional<im>> r = ajb.a(im.c.a(ye::a));
   public static final ajb<to> s = new ajb<to>() {
      @Override
      public yg<? super vt, to> codec() {
         return ye.o;
      }

      public to a(to $$0) {
         return $$0.h();
      }
   };
   public static final ajb<cjo> t = ajb.a(cjo.d);
   private static final yg<ByteBuf, OptionalInt> G = new yg<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = vz.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         vz.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajb<OptionalInt> u = ajb.a(G);
   public static final ajb<bre> v = ajb.a(bre.t);
   public static final ajb<ccm> w = ajb.a(ye.a(ku.l));
   public static final ajb<in<cdm>> x = ajb.a(ye.b(ku.m));
   public static final ajb<cct> y = ajb.a(ye.a(ku.B));
   public static final ajb<in<cgg>> z = ajb.a(ye.b(ku.S));
   public static final ajb<cdr.a> A = ajb.a(cdr.a.e);
   public static final ajb<cez.a> B = ajb.a(cez.a.i);
   public static final ajb<Vector3f> C = ajb.a(ye.q);
   public static final ajb<Quaternionf> D = ajb.a(ye.r);

   public static void a(ajb<?> $$0) {
      E.d($$0);
   }

   @Nullable
   public static ajb<?> a(int $$0) {
      return E.a($$0);
   }

   public static int b(ajb<?> $$0) {
      return E.a($$0);
   }

   private ajc() {
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
      a(y);
      a(r);
      a(z);
      a(B);
      a(A);
      a(C);
      a(D);
   }
}
