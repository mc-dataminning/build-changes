import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dle extends dgv {
   public static final MapCodec<dle> a = b(dle::new);
   public static final dvi b = dve.Q;
   public static final dvf c = dve.f;
   private static final ezm d = dhj.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezm e = dhj.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ezm f = ezj.a(e, d);
   private static final ezm g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ezm h = ezj.a(f, g, eyw.e);
   private static final ezm i = ezj.a(h, dhj.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ezm j = ezj.a(h, dhj.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ezm k = ezj.a(h, dhj.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ezm l = ezj.a(h, dhj.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ezm m = ezj.a(h, dhj.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ezm n = g;
   private static final ezm o = ezj.a(g, dhj.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ezm G = ezj.a(g, dhj.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ezm H = ezj.a(g, dhj.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ezm I = ezj.a(g, dhj.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      switch ((jj)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2) {
      switch ((jj)$$0.c(b)) {
         case a:
            return n;
         case c:
            return G;
         case d:
            return H;
         case e:
            return I;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public duo a(czk $$0) {
      jj $$1 = $$0.k().g();
      return this.o().b(b, $$1.o() == jj.a.b ? jj.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dst($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0.B ? null : a($$2, dru.r, dst::a);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dst $$5) {
         $$3.a($$5);
         $$3.a(awo.ad);
      }

      return brp.a;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(deg $$0, je $$1, duo $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      brl.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return cqw.a($$1.c_($$2));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      drs $$4 = $$1.c_($$2);
      if ($$4 instanceof dst) {
         dst.a($$1, $$2, $$0, $$3, (dst)$$4);
      }
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
