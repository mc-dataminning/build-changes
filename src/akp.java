import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class akp {
   private static final aym<ako<?>> J = aym.c(16);
   public static final ako<Byte> a = ako.a(yy.c);
   public static final ako<Integer> b = ako.a(yy.h);
   public static final ako<Long> c = ako.a(yy.k);
   public static final ako<Float> d = ako.a(yy.l);
   public static final ako<String> e = ako.a(yy.p);
   public static final ako<xc> f = ako.a(xe.d);
   public static final ako<Optional<xc>> g = ako.a(xe.e);
   public static final ako<daa> h = new ako<daa>() {
      @Override
      public za<? super wn, daa> codec() {
         return daa.h;
      }

      public daa a(daa $$0) {
         return $$0.v();
      }
   };
   public static final ako<ebg> i = ako.a(yy.a(dne.k));
   private static final za<ByteBuf, Optional<ebg>> K = new za<ByteBuf, Optional<ebg>>() {
      public void a(ByteBuf $$0, Optional<ebg> $$1) {
         if ($$1.isPresent()) {
            wt.a($$0, dne.j($$1.get()));
         } else {
            wt.a($$0, 0);
         }
      }

      public Optional<ebg> a(ByteBuf $$0) {
         int $$1 = wt.a($$0);
         return $$1 == 0 ? Optional.empty() : Optional.of(dne.a($$1));
      }
   };
   public static final ako<Optional<ebg>> j = ako.a(K);
   public static final ako<Boolean> k = ako.a(yy.b);
   public static final ako<lx> l = ako.a(lz.bl);
   public static final ako<List<lx>> m = ako.a(lz.bl.a(yy.a()));
   public static final ako<jy> n = ako.a(jy.b);
   public static final ako<iw> o = ako.a(iw.b);
   public static final ako<Optional<iw>> p = ako.a(iw.b.a(yy::a));
   public static final ako<jc> q = ako.a(jc.j);
   public static final ako<Optional<bxb<bxw>>> r = ako.a(bxb.b().a(yy::a));
   public static final ako<Optional<jf>> s = ako.a(jf.c.a(yy::a));
   public static final ako<ua> t = new ako<ua>() {
      @Override
      public za<? super wn, ua> codec() {
         return yy.t;
      }

      public ua a(ua $$0) {
         return $$0.l();
      }
   };
   public static final ako<crm> u = ako.a(crm.d);
   private static final za<ByteBuf, OptionalInt> L = new za<ByteBuf, OptionalInt>() {
      public OptionalInt a(ByteBuf $$0) {
         int $$1 = wt.a($$0);
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }

      public void a(ByteBuf $$0, OptionalInt $$1) {
         wt.a($$0, $$1.orElse(-1) + 1);
      }
   };
   public static final ako<OptionalInt> v = ako.a(L);
   public static final ako<byi> w = ako.a(byi.t);
   public static final ako<jg<cjq>> x = ako.a(cjq.d);
   public static final ako<jg<cjt>> y = ako.a(cjt.d);
   public static final ako<jg<cjx>> z = ako.a(cjx.d);
   public static final ako<jg<cmr>> A = ako.a(cmr.d);
   public static final ako<jg<cmp>> B = ako.a(cmp.d);
   public static final ako<jg<cll>> C = ako.a(cll.d);
   public static final ako<jg<cki>> D = ako.a(cki.d);
   public static final ako<jg<coa>> E = ako.a(coa.d);
   public static final ako<cky.a> F = ako.a(cky.a.e);
   public static final ako<cml.a> G = ako.a(cml.a.i);
   public static final ako<Vector3f> H = ako.a(yy.v);
   public static final ako<Quaternionf> I = ako.a(yy.w);

   public static void a(ako<?> $$0) {
      J.d($$0);
   }

   @Nullable
   public static ako<?> a(int $$0) {
      return J.a($$0);
   }

   public static int b(ako<?> $$0) {
      return J.a($$0);
   }

   private akp() {
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
      a(z);
      a(A);
      a(B);
      a(C);
      a(D);
      a(y);
      a(s);
      a(E);
      a(G);
      a(F);
      a(H);
      a(I);
   }
}
