import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxv extends bxa<coi> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ji e;
   private long f;
   private int g;
   private final List<ji> h = Lists.newArrayList();

   public bxv() {
      super(ImmutableMap.of(cel.n, cem.b, cel.m, cem.b, cel.f, cem.a));
   }

   protected boolean a(ard $$0, coi $$1) {
      if (!$$0.O().b(dge.c)) {
         return false;
      } else if ($$1.gC().b() != col.g) {
         return false;
      } else {
         ji.a $$2 = $$1.dv().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dA() + (double)$$3, $$1.dC() + (double)$$4, $$1.dG() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new ji($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private ji a(ard $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.H_().a(this.h.size()));
   }

   private boolean a(ji $$0, ard $$1) {
      dwx $$2 = $$1.a_($$0);
      djm $$3 = $$2.b();
      djm $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dli && ((dli)$$3).i($$2) || $$2.l() && $$4 instanceof dmk;
   }

   protected void a(ard $$0, coi $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.eb().a(cel.n, new bxd(this.e));
         $$1.eb().a(cel.m, new ceo(new bxd(this.e), 0.5F, 1));
      }
   }

   protected void b(ard $$0, coi $$1, long $$2) {
      $$1.eb().b(cel.n);
      $$1.eb().b(cel.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ard $$0, coi $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dt(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dwx $$3 = $$0.a_(this.e);
            djm $$4 = $$3.b();
            djm $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dli && ((dli)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dmk && $$1.gL()) {
               bsr $$6 = $$1.t();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cwp $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(awy.bM) && $$8.h() instanceof cuv $$10) {
                     dwx $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(ebt.i, this.e, ebt.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awa.gH, awb.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cwp.j);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dli && !((dli)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.eb().a(cel.m, new ceo(new bxd(this.e), 0.5F, 1));
                  $$1.eb().a(cel.n, new bxd(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ard $$0, coi $$1, long $$2) {
      return this.g < 200;
   }
}
