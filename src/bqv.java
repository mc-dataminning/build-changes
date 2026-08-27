import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bqv extends bqa<cgy> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private hz e;
   private long f;
   private int g;
   private final List<hz> h = Lists.newArrayList();

   public bqv() {
      super(ImmutableMap.of(bxl.n, bxm.b, bxl.m, bxm.b, bxl.f, bxm.a));
   }

   protected boolean a(aow $$0, cgy $$1) {
      if (!$$0.Z().b(cvn.c)) {
         return false;
      } else if ($$1.gr().b() != chb.g) {
         return false;
      } else {
         hz.a $$2 = $$1.dm().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dr() + (double)$$3, $$1.dt() + (double)$$4, $$1.dx() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new hz($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private hz a(aow $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.F_().a(this.h.size()));
   }

   private boolean a(hz $$0, aow $$1) {
      dlj $$2 = $$1.a_($$0);
      cys $$3 = $$2.b();
      cys $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dan && ((dan)$$3).h($$2) || $$2.i() && $$4 instanceof dbp;
   }

   protected void a(aow $$0, cgy $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dO().a(bxl.n, new bqd(this.e));
         $$1.dO().a(bxl.m, new bxo(new bqd(this.e), 0.5F, 1));
      }
   }

   protected void b(aow $$0, cgy $$1, long $$2) {
      $$1.dO().b(bxl.n);
      $$1.dO().b(bxl.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aow $$0, cgy $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dk(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dlj $$3 = $$0.a_(this.e);
            cys $$4 = $$3.b();
            cys $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dan && ((dan)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dbp && $$1.gA()) {
               bmf $$6 = $$1.A();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cpd $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(aui.aZ) && $$8.d() instanceof cmw $$10) {
                     dlj $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dpw.i, this.e, dpw.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), atl.fZ, atm.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cpd.h);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dan && !((dan)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dO().a(bxl.m, new bxo(new bqd(this.e), 0.5F, 1));
                  $$1.dO().a(bxl.n, new bqd(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aow $$0, cgy $$1, long $$2) {
      return this.g < 200;
   }
}
