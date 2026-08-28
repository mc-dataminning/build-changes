import com.mojang.serialization.MapCodec;
import java.util.Set;

public class doj extends dlg implements drr {
   public static final MapCodec<doj> a = b(doj::new);
   private static final feq b = dlu.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   protected doj(dzn.d $$0) {
      super($$0);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyk($$0, $$1);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, bwa $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == dip.k && $$3 instanceof arp $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public ewv a(aro $$0, bwa $$1, iu $$2) {
      ald<dip> $$3 = $$0.aj() == dip.k ? dip.i : dip.k;
      aro $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dip.k;
         iu $$6 = $$5 ? aro.a : $$4.aa();
         fdw $$7 = $$6.c();
         float $$8;
         Set<bxn> $$9;
         if ($$5) {
            eir.a($$4, iu.a((jo)$$7).e(), true);
            $$8 = ja.e.p();
            $$9 = bxn.a(bxn.l, Set.of(bxn.e));
            if ($$1 instanceof arp) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bxn.a(bxn.l, bxn.k);
            if ($$1 instanceof arp $$12) {
               return $$12.a(false, ewv.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new ewv($$4, $$7, fdw.c, $$8, 0.0F, $$9, ewv.b.then(ewv.c));
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lx.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return cys.k;
   }

   @Override
   protected boolean a(dzo $$0, evu $$1) {
      return false;
   }

   @Override
   protected dsf a_(dzo $$0) {
      return dsf.a;
   }
}
