import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dni extends dix {
   public static final MapCodec<dni> a = b(dni::new);
   public static final dxt<jn> b = dxm.T;
   public static final dxn c = dxm.j;
   private static final fbt d = djl.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbt e = djl.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fbt f = fbq.a(e, d);
   private static final fbt g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fbt h = fbq.a(f, g, fbd.e);
   private static final fbt i = fbq.a(h, djl.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fbt j = fbq.a(h, djl.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fbt k = fbq.a(h, djl.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fbt l = fbq.a(h, djl.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fbt m = fbq.a(h, djl.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fbt n = g;
   private static final fbt o = fbq.a(g, djl.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fbt G = fbq.a(g, djl.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fbt H = fbq.a(g, djl.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fbt I = fbq.a(g, djl.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      switch ((jn)$$0.c(b)) {
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
   protected fbt a(dww $$0, dfm $$1, ji $$2) {
      switch ((jn)$$0.c(b)) {
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
   public dww a(daf $$0) {
      jn $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jn.a.b ? jn.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dva($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0.C ? null : a($$2, dua.s, dva::a);
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dva $$5) {
         $$3.a($$5);
         $$3.a(awk.ad);
      }

      return bsj.a;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dgh $$0, ji $$1, dww $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return csb.a($$1.c_($$2));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      dty $$4 = $$1.c_($$2);
      if ($$4 instanceof dva) {
         dva.a($$1, $$2, $$0, $$3, (dva)$$4);
      }
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
