import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlh extends dgy {
   public static final MapCodec<dlh> a = b(dlh::new);
   public static final dvm b = dvi.Q;
   public static final dvj c = dvi.f;
   private static final ezq d = dhm.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezq e = dhm.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ezq f = ezn.a(e, d);
   private static final ezq g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ezq h = ezn.a(f, g, eza.e);
   private static final ezq i = ezn.a(h, dhm.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ezq j = ezn.a(h, dhm.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ezq k = ezn.a(h, dhm.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ezq l = ezn.a(h, dhm.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ezq m = ezn.a(h, dhm.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ezq n = g;
   private static final ezq o = ezn.a(g, dhm.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ezq G = ezn.a(g, dhm.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ezq H = ezn.a(g, dhm.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ezq I = ezn.a(g, dhm.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      switch ((jk)$$0.c(b)) {
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
   protected ezq a(dus $$0, ddo $$1, jf $$2) {
      switch ((jk)$$0.c(b)) {
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
   public dus a(czn $$0) {
      jk $$1 = $$0.k().g();
      return this.n().b(b, $$1.o() == jk.a.b ? jk.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0.B ? null : a($$2, drx.r, dsw::a);
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dsw $$5) {
         $$3.a($$5);
         $$3.a(awq.ad);
      }

      return brs.a;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dej $$0, jf $$1, dus $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      bro.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return cqz.a($$1.c_($$2));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      drv $$4 = $$1.c_($$2);
      if ($$4 instanceof dsw) {
         dsw.a($$1, $$2, $$0, $$3, (dsw)$$4);
      }
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
