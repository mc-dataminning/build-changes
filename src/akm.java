import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akm {
   private static final axv<akl<?>> F = axv.c(16);
   public static final akl<Byte> a = akl.a(zl.c);
   public static final akl<Integer> b = akl.a(zl.g);
   public static final akl<Long> c = akl.a(zl.h);
   public static final akl<Float> d = akl.a(zl.i);
   public static final akl<String> e = akl.a(zl.l);
   public static final akl<xp> f = akl.a(xr.d);
   public static final akl<Optional<xp>> g = akl.a(xr.e);
   public static final akl<cup> h = new akl<cup>() {
      @Override
      public zn<? super xa, cup> codec() {
         return cup.h;
      }

      public cup a(cup $$0) {
         return $$0.s();
      }
   };
   public static final akl<dsc> i = akl.a(zl.a(dez.q));
   private static final zn<ByteBuf, Optional<dsc>> G = new zn<ByteBuf, Optional<dsc>>() {
      public void a(ByteBuf $$0, Optional<dsc> $$1) {
         if ($$1.isPresent()) {
            xg.a($$0, dez.i($$1.get()));
         } else {
            xg.a($$0, 0);
         }
      }

      public Optional<dsc> a(ByteBuf $$0) {
         int $$1 = xg.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dez.a($$1));
      }
   };
   public static final akl<Optional<dsc>> j = akl.a(G);
   public static final akl<Boolean> k = akl.a(zl.b);
   public static final akl<lg> l = akl.a(li.bg);
   public static final akl<List<lg>> m = akl.a(li.bg.a(zl.a()));
   public static final akl<ka> n = akl.a(ka.a);
   public static final akl<iz> o = akl.a(iz.b);
   public static final akl<Optional<iz>> p = akl.a(iz.b.a(zl::a));
   public static final akl<je> q = akl.a(je.j);
   public static final akl<Optional<UUID>> r = akl.a(kc.g.a(zl::a));
   public static final akl<Optional<jh>> s = akl.a(jh.c.a(zl::a));
   public static final akl<us> t = new akl<us>() {
      @Override
      public zn<? super xa, us> codec() {
         return zl.p;
      }

      public us a(us $$0) {
         return $$0.i();
      }
   };
   public static final akl<cml> u = akl.a(cml.d);
   private static final zn<ByteBuf, OptionalInt> H = new zn<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = xg.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         xg.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final akl<OptionalInt> v = akl.a(H);
   public static final akl<bub> w = akl.a(bub.t);
   public static final akl<ji<cfj>> x = akl.a(zl.b(lq.l));
   public static final akl<ji<cgj>> y = akl.a(zl.b(lq.m));
   public static final akl<ji<cfq>> z = akl.a(zl.b(lq.B));
   public static final akl<ji<cjd>> A = akl.a(zl.b(lq.S));
   public static final akl<cgo.a> B = akl.a(cgo.a.e);
   public static final akl<chw.a> C = akl.a(chw.a.i);
   public static final akl<Vector3f> D = akl.a(zl.r);
   public static final akl<Quaternionf> E = akl.a(zl.s);

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
