import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diu extends del {
   public static final MapCodec<diu> a = b(diu::new);
   public static final dsw b = dss.Q;
   public static final dst c = dss.f;
   private static final ewk d = dez.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewk e = dez.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ewk f = ewh.a(e, d);
   private static final ewk g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ewk h = ewh.a(f, g, evv.e);
   private static final ewk i = ewh.a(h, dez.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ewk j = ewh.a(h, dez.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ewk k = ewh.a(h, dez.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ewk l = ewh.a(h, dez.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ewk m = ewh.a(h, dez.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ewk n = g;
   private static final ewk o = ewh.a(g, dez.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ewk F = ewh.a(g, dez.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ewk G = ewh.a(g, dez.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ewk H = ewh.a(g, dez.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   public diu(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      switch ((je)$$0.c(b)) {
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
   protected ewk a(dsc $$0, dbe $$1, iz $$2) {
      switch ((je)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public dsc a(cya $$0) {
      je $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == je.a.b ? je.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return $$0.B ? null : a($$2, dpj.r, dqg::a);
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         dph $$5 = $$1.c_($$2);
         if ($$5 instanceof dqg) {
            $$3.a((dqg)$$5);
            $$3.a(awk.ad);
         }

         return bqu.c;
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dby $$0, iz $$1, dsc $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      bqq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      dph $$4 = $$1.c_($$2);
      if ($$4 instanceof dqg) {
         dqg.a($$1, $$2, $$0, $$3, (dqg)$$4);
      }
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
