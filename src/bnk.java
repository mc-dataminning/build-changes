import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bnk extends bmp<ccz> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ht e;
   private long f;
   private int g;
   private final List<ht> h = Lists.newArrayList();

   public bnk() {
      super(ImmutableMap.of(btz.n, bua.b, btz.m, bua.b, btz.f, bua.a));
   }

   protected boolean a(ama $$0, ccz $$1) {
      if (!$$0.X().b(cro.c)) {
         return false;
      } else if ($$1.gp().b() != cdc.g) {
         return false;
      } else {
         ht.a $$2 = $$1.dl().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dq() + (double)$$3, $$1.ds() + (double)$$4, $$1.dw() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new ht($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private ht a(ama $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(ht $$0, ama $$1) {
      dgw $$2 = $$1.a_($$0);
      cut $$3 = $$2.b();
      cut $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cwn && ((cwn)$$3).h($$2) || $$2.i() && $$4 instanceof cxp;
   }

   protected void a(ama $$0, ccz $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dN().a(btz.n, new bms(this.e));
         $$1.dN().a(btz.m, new buc(new bms(this.e), 0.5F, 1));
      }
   }

   protected void b(ama $$0, ccz $$1, long $$2) {
      $$1.dN().b(btz.n);
      $$1.dN().b(btz.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ama $$0, ccz $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dj(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dgw $$3 = $$0.a_(this.e);
            cut $$4 = $$3.b();
            cut $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cwn && ((cwn)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cxp && $$1.gy()) {
               bix $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  clb $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(ark.aU) && $$8.d() instanceof ciu $$10) {
                     dgw $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dlg.i, this.e, dlg.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), aqn.fk, aqo.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, clb.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cwn && !((cwn)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dN().a(btz.m, new buc(new bms(this.e), 0.5F, 1));
                  $$1.dN().a(btz.n, new bms(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ama $$0, ccz $$1, long $$2) {
      return this.g < 200;
   }
}
