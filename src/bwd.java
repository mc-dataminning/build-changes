import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwd extends bvi<cmk> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private iz e;
   private long f;
   private int g;
   private final List<iz> h = Lists.newArrayList();

   public bwd() {
      super(ImmutableMap.of(cct.n, ccu.b, cct.m, ccu.b, cct.f, ccu.a));
   }

   protected boolean a(arf $$0, cmk $$1) {
      if (!$$0.ab().b(dbu.c)) {
         return false;
      } else if ($$1.gB().b() != cmn.g) {
         return false;
      } else {
         iz.a $$2 = $$1.dp().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.du() + (double)$$3, $$1.dw() + (double)$$4, $$1.dA() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new iz($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private iz a(arf $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(iz $$0, arf $$1) {
      dsc $$2 = $$1.a_($$0);
      dez $$3 = $$2.b();
      dez $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dgu && ((dgu)$$3).h($$2) || $$2.i() && $$4 instanceof dhw;
   }

   protected void a(arf $$0, cmk $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dS().a(cct.n, new bvl(this.e));
         $$1.dS().a(cct.m, new ccw(new bvl(this.e), 0.5F, 1));
      }
   }

   protected void b(arf $$0, cmk $$1, long $$2) {
      $$1.dS().b(cct.n);
      $$1.dS().b(cct.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arf $$0, cmk $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dn(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dsc $$3 = $$0.a_(this.e);
            dez $$4 = $$3.b();
            dez $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dgu && ((dgu)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dhw && $$1.gK()) {
               brd $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cup $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awy.bx) && $$8.g() instanceof csn $$10) {
                     dsc $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dwv.i, this.e, dwv.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awa.gm, awb.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, cup.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dgu && !((dgu)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dS().a(cct.m, new ccw(new bvl(this.e), 0.5F, 1));
                  $$1.dS().a(cct.n, new bvl(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arf $$0, cmk $$1, long $$2) {
      return this.g < 200;
   }
}
