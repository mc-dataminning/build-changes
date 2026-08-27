import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aka {
   private static final axj<ajz<?>> F = axj.c(16);
   public static final ajz<Byte> a = ajz.a(za.c);
   public static final ajz<Integer> b = ajz.a(za.g);
   public static final ajz<Long> c = ajz.a(za.h);
   public static final ajz<Float> d = ajz.a(za.i);
   public static final ajz<String> e = ajz.a(za.l);
   public static final ajz<xe> f = ajz.a(xg.d);
   public static final ajz<Optional<xe>> g = ajz.a(xg.e);
   public static final ajz<cuh> h = new ajz<cuh>() {
      @Override
      public zc<? super wp, cuh> codec() {
         return cuh.e;
      }

      public cuh a(cuh $$0) {
         return $$0.r();
      }
   };
   public static final ajz<dtc> i = ajz.a(za.a(dfc.q));
   private static final zc<ByteBuf, Optional<dtc>> G = new zc<ByteBuf, Optional<dtc>>() {
      public void a(ByteBuf $$0, Optional<dtc> $$1) {
         if ($$1.isPresent()) {
            wv.a($$0, dfc.i($$1.get()));
         } else {
            wv.a($$0, 0);
         }
      }

      public Optional<dtc> a(ByteBuf $$0) {
         int $$1 = wv.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dfc.a($$1));
      }
   };
   public static final ajz<Optional<dtc>> j = ajz.a(G);
   public static final ajz<Boolean> k = ajz.a(za.b);
   public static final ajz<kz> l = ajz.a(lb.bc);
   public static final ajz<List<kz>> m = ajz.a(lb.bc.a(za.a()));
   public static final ajz<js> n = ajz.a(js.a);
   public static final ajz<ir> o = ajz.a(ir.b);
   public static final ajz<Optional<ir>> p = ajz.a(ir.b.a(za::a));
   public static final ajz<iw> q = ajz.a(iw.j);
   public static final ajz<Optional<UUID>> r = ajz.a(ju.g.a(za::a));
   public static final ajz<Optional<iz>> s = ajz.a(iz.c.a(za::a));
   public static final ajz<uk> t = new ajz<uk>() {
      @Override
      public zc<? super wp, uk> codec() {
         return za.p;
      }

      public uk a(uk $$0) {
         return $$0.h();
      }
   };
   public static final ajz<clm> u = ajz.a(clm.d);
   private static final zc<ByteBuf, OptionalInt> H = new zc<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wv.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wv.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajz<OptionalInt> v = ajz.a(H);
   public static final ajz<bsz> w = ajz.a(bsz.t);
   public static final ajz<ja<cei>> x = ajz.a(za.b(li.l));
   public static final ajz<ja<cfi>> y = ajz.a(za.b(li.m));
   public static final ajz<ja<cep>> z = ajz.a(za.b(li.B));
   public static final ajz<ja<cic>> A = ajz.a(za.b(li.S));
   public static final ajz<cfn.a> B = ajz.a(cfn.a.e);
   public static final ajz<cgv.a> C = ajz.a(cgv.a.i);
   public static final ajz<Vector3f> D = ajz.a(za.r);
   public static final ajz<Quaternionf> E = ajz.a(za.s);

   public static void a(ajz<?> $$0) {
      F.d($$0);
   }

   @Nullable
   public static ajz<?> a(int $$0) {
      return F.a($$0);
   }

   public static int b(ajz<?> $$0) {
      return F.a($$0);
   }

   private aka() {
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
