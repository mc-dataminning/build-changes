import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aka {
   private static final axw<ajz<?>> F = axw.c(16);
   public static final ajz<Byte> a = ajz.a(yl.c);
   public static final ajz<Integer> b = ajz.a(yl.h);
   public static final ajz<Long> c = ajz.a(yl.k);
   public static final ajz<Float> d = ajz.a(yl.l);
   public static final ajz<String> e = ajz.a(yl.o);
   public static final ajz<wp> f = ajz.a(wr.d);
   public static final ajz<Optional<wp>> g = ajz.a(wr.e);
   public static final ajz<cwq> h = new ajz<cwq>() {
      @Override
      public yn<? super wa, cwq> codec() {
         return cwq.g;
      }

      public cwq a(cwq $$0) {
         return $$0.v();
      }
   };
   public static final ajz<dwy> i = ajz.a(yl.a(djn.q));
   private static final yn<ByteBuf, Optional<dwy>> G = new yn<ByteBuf, Optional<dwy>>() {
      public void a(ByteBuf $$0, Optional<dwy> $$1) {
         if ($$1.isPresent()) {
            wg.a($$0, djn.j($$1.get()));
         } else {
            wg.a($$0, 0);
         }
      }

      public Optional<dwy> a(ByteBuf $$0) {
         int $$1 = wg.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(djn.a($$1));
      }
   };
   public static final ajz<Optional<dwy>> j = ajz.a(G);
   public static final ajz<Boolean> k = ajz.a(yl.b);
   public static final ajz<lr> l = ajz.a(lt.bj);
   public static final ajz<List<lr>> m = ajz.a(lt.bj.a(yl.a()));
   public static final ajz<kj> n = ajz.a(kj.a);
   public static final ajz<ji> o = ajz.a(ji.b);
   public static final ajz<Optional<ji>> p = ajz.a(ji.b.a(yl::a));
   public static final ajz<jn> q = ajz.a(jn.j);
   public static final ajz<Optional<UUID>> r = ajz.a(kl.g.a(yl::a));
   public static final ajz<Optional<jq>> s = ajz.a(jq.c.a(yl::a));
   public static final ajz<tq> t = new ajz<tq>() {
      @Override
      public yn<? super wa, tq> codec() {
         return yl.s;
      }

      public tq a(tq $$0) {
         return $$0.i();
      }
   };
   public static final ajz<cok> u = ajz.a(cok.d);
   private static final yn<ByteBuf, OptionalInt> H = new yn<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wg.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wg.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ajz<OptionalInt> v = ajz.a(H);
   public static final ajz<bvu> w = ajz.a(bvu.t);
   public static final ajz<jr<chd>> x = ajz.a(chd.a);
   public static final ajz<jr<cid>> y = ajz.a(cid.d);
   public static final ajz<jr<chk>> z = ajz.a(chk.a);
   public static final ajz<jr<ckz>> A = ajz.a(ckz.d);
   public static final ajz<cii.a> B = ajz.a(cii.a.e);
   public static final ajz<cjq.a> C = ajz.a(cjq.a.i);
   public static final ajz<Vector3f> D = ajz.a(yl.u);
   public static final ajz<Quaternionf> E = ajz.a(yl.v);

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
