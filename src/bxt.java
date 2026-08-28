import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxt extends bwy<cog> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ji e;
   private long f;
   private int g;
   private final List<ji> h = Lists.newArrayList();

   public bxt() {
      super(ImmutableMap.of(cej.n, cek.b, cej.m, cek.b, cej.f, cek.a));
   }

   protected boolean a(arc $$0, cog $$1) {
      if (!$$0.O().b(dgc.c)) {
         return false;
      } else if ($$1.gz().b() != coj.g) {
         return false;
      } else {
         ji.a $$2 = $$1.dw().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dB() + (double)$$3, $$1.dD() + (double)$$4, $$1.dH() + (double)$$5);
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
   private ji a(arc $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.H_().a(this.h.size()));
   }

   private boolean a(ji $$0, arc $$1) {
      dwv $$2 = $$1.a_($$0);
      djk $$3 = $$2.b();
      djk $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dlg && ((dlg)$$3).i($$2) || $$2.l() && $$4 instanceof dmi;
   }

   protected void a(arc $$0, cog $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ec().a(cej.n, new bxb(this.e));
         $$1.ec().a(cej.m, new cem(new bxb(this.e), 0.5F, 1));
      }
   }

   protected void b(arc $$0, cog $$1, long $$2) {
      $$1.ec().b(cej.n);
      $$1.ec().b(cej.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arc $$0, cog $$1, long $$2) {
      if (this.e == null || this.e.a($$1.du(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dwv $$3 = $$0.a_(this.e);
            djk $$4 = $$3.b();
            djk $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dlg && ((dlg)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dmi && $$1.gI()) {
               bsp $$6 = $$1.t();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cwn $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(awx.bM) && $$8.h() instanceof cut $$10) {
                     dwv $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(ebr.i, this.e, ebr.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avz.gH, awa.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cwn.j);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dlg && !((dlg)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ec().a(cej.m, new cem(new bxb(this.e), 0.5F, 1));
                  $$1.ec().a(cej.n, new bxb(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arc $$0, cog $$1, long $$2) {
      return this.g < 200;
   }
}
