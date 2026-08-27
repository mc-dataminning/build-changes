import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bsb extends brg<cif> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ib e;
   private long f;
   private int g;
   private final List<ib> h = Lists.newArrayList();

   public bsb() {
      super(ImmutableMap.of(byr.n, bys.b, byr.m, bys.b, byr.f, bys.a));
   }

   protected boolean a(apf $$0, cif $$1) {
      if (!$$0.Z().b(cwv.c)) {
         return false;
      } else if ($$1.gy().b() != cii.g) {
         return false;
      } else {
         ib.a $$2 = $$1.dm().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dr() + (double)$$3, $$1.dt() + (double)$$4, $$1.dx() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new ib($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private ib a(apf $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(ib $$0, apf $$1) {
      dmz $$2 = $$1.a_($$0);
      daa $$3 = $$2.b();
      daa $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dbv && ((dbv)$$3).h($$2) || $$2.i() && $$4 instanceof dcx;
   }

   protected void a(apf $$0, cif $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dP().a(byr.n, new brj(this.e));
         $$1.dP().a(byr.m, new byu(new brj(this.e), 0.5F, 1));
      }
   }

   protected void b(apf $$0, cif $$1, long $$2) {
      $$1.dP().b(byr.n);
      $$1.dP().b(byr.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(apf $$0, cif $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dk(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dmz $$3 = $$0.a_(this.e);
            daa $$4 = $$3.b();
            daa $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dbv && ((dbv)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dcx && $$1.gH()) {
               bnl $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cqk $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(auv.aZ) && $$8.d() instanceof cof $$10) {
                     dmz $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(drn.i, this.e, drn.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), aty.gc, atz.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cqk.h);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dbv && !((dbv)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dP().a(byr.m, new byu(new brj(this.e), 0.5F, 1));
                  $$1.dP().a(byr.n, new brj(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(apf $$0, cif $$1, long $$2) {
      return this.g < 200;
   }
}
