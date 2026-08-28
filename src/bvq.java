import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bvq extends buv<cly> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ja e;
   private long f;
   private int g;
   private final List<ja> h = Lists.newArrayList();

   public bvq() {
      super(ImmutableMap.of(ccg.n, cch.b, ccg.m, cch.b, ccg.f, cch.a));
   }

   protected boolean a(aqm $$0, cly $$1) {
      if (!$$0.ab().b(dcc.c)) {
         return false;
      } else if ($$1.gy().b() != cmb.g) {
         return false;
      } else {
         ja.a $$2 = $$1.dr().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dw() + (double)$$3, $$1.dy() + (double)$$4, $$1.dC() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new ja($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private ja a(aqm $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(ja $$0, aqm $$1) {
      dsl $$2 = $$1.a_($$0);
      dfi $$3 = $$2.b();
      dfi $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dhd && ((dhd)$$3).h($$2) || $$2.i() && $$4 instanceof dif;
   }

   protected void a(aqm $$0, cly $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dV().a(ccg.n, new buy(this.e));
         $$1.dV().a(ccg.m, new ccj(new buy(this.e), 0.5F, 1));
      }
   }

   protected void b(aqm $$0, cly $$1, long $$2) {
      $$1.dV().b(ccg.n);
      $$1.dV().b(ccg.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqm $$0, cly $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dp(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dsl $$3 = $$0.a_(this.e);
            dfi $$4 = $$3.b();
            dfi $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dhd && ((dhd)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dif && $$1.gH()) {
               bqq $$6 = $$1.x();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cud $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awf.bx) && $$8.g() instanceof csc $$10) {
                     dsl $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dxh.i, this.e, dxh.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avh.gm, avi.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, cud.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dhd && !((dhd)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dV().a(ccg.m, new ccj(new buy(this.e), 0.5F, 1));
                  $$1.dV().a(ccg.n, new buy(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqm $$0, cly $$1, long $$2) {
      return this.g < 200;
   }
}
