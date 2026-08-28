import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxw extends bxb<coj> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ji e;
   private long f;
   private int g;
   private final List<ji> h = Lists.newArrayList();

   public bxw() {
      super(ImmutableMap.of(cem.n, cen.b, cem.m, cen.b, cem.f, cen.a));
   }

   protected boolean a(ard $$0, coj $$1) {
      if (!$$0.O().b(dgf.c)) {
         return false;
      } else if ($$1.gC().b() != com.g) {
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
      dwy $$2 = $$1.a_($$0);
      djn $$3 = $$2.b();
      djn $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dlj && ((dlj)$$3).i($$2) || $$2.l() && $$4 instanceof dml;
   }

   protected void a(ard $$0, coj $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.eb().a(cem.n, new bxe(this.e));
         $$1.eb().a(cem.m, new cep(new bxe(this.e), 0.5F, 1));
      }
   }

   protected void b(ard $$0, coj $$1, long $$2) {
      $$1.eb().b(cem.n);
      $$1.eb().b(cem.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ard $$0, coj $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dt(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dwy $$3 = $$0.a_(this.e);
            djn $$4 = $$3.b();
            djn $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dlj && ((dlj)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dml && $$1.gL()) {
               bss $$6 = $$1.t();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cwq $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(awy.bM) && $$8.h() instanceof cuw $$10) {
                     dwy $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(ebu.i, this.e, ebu.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awa.gH, awb.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cwq.j);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dlj && !((dlj)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.eb().a(cem.m, new cep(new bxe(this.e), 0.5F, 1));
                  $$1.eb().a(cem.n, new bxe(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ard $$0, coj $$1, long $$2) {
      return this.g < 200;
   }
}
