import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dum extends dlu {
   public static final MapCodec<dum> a = b(dum::new);
   public static final eaf b = eae.H;

   @Override
   public MapCodec<dum> a() {
      return a;
   }

   public dum(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.D($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if ($$1.D($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      if (!$$0.w_() && !$$3.gj().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aro $$0, iu $$1, dii $$2) {
      cmy $$3 = new cmy($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.g();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dip $$0, iu $$1) {
      a($$0, $$1, null);
   }

   private static void a(dip $$0, iu $$1, @Nullable bwz $$2) {
      if (!$$0.C) {
         cmy $$3 = new cmy($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), awl.Aw, awm.e, 1.0F, 1.0F);
         $$0.a($$2, eeo.I, $$1);
      }
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if (!$$0.a(cyw.pb) && !$$0.a(cyw.uZ)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dlw.a.m(), 11);
         cyo $$7 = $$0.h();
         if ($$0.a(cyw.pb)) {
            $$0.a(1, $$4, bwz.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awv.c.b($$7));
         return bty.a;
      }
   }

   @Override
   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
      if ($$0 instanceof aro $$4) {
         iu $$5 = $$2.b();
         bwa $$6 = $$3.q();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bwz ? (bwz)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dii $$0) {
      return false;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }
}
