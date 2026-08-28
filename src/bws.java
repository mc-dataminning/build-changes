import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bws extends bvx<cnc> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private je e;
   private long f;
   private int g;
   private final List<je> h = Lists.newArrayList();

   public bws() {
      super(ImmutableMap.of(cdi.n, cdj.b, cdi.m, cdj.b, cdi.f, cdj.a));
   }

   protected boolean a(arg $$0, cnc $$1) {
      if (!$$0.ac().b(ddo.c)) {
         return false;
      } else if ($$1.gy().b() != cnf.g) {
         return false;
      } else {
         je.a $$2 = $$1.ds().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dx() + (double)$$3, $$1.dz() + (double)$$4, $$1.dD() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new je($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private je a(arg $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.C_().a(this.h.size()));
   }

   private boolean a(je $$0, arg $$1) {
      dua $$2 = $$1.a_($$0);
      dgv $$3 = $$2.b();
      dgv $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof diq && ((diq)$$3).i($$2) || $$2.l() && $$4 instanceof djs;
   }

   protected void a(arg $$0, cnc $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dX().a(cdi.n, new bwa(this.e));
         $$1.dX().a(cdi.m, new cdl(new bwa(this.e), 0.5F, 1));
      }
   }

   protected void b(arg $$0, cnc $$1, long $$2) {
      $$1.dX().b(cdi.n);
      $$1.dX().b(cdi.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arg $$0, cnc $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dq(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dua $$3 = $$0.a_(this.e);
            dgv $$4 = $$3.b();
            dgv $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof diq && ((diq)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof djs && $$1.gI()) {
               brr $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cvl $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axb.bB) && $$8.h() instanceof ctl $$10) {
                     dua $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dyx.i, this.e, dyx.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awd.gn, awe.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cvl.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof diq && !((diq)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dX().a(cdi.m, new cdl(new bwa(this.e), 0.5F, 1));
                  $$1.dX().a(cdi.n, new bwa(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arg $$0, cnc $$1, long $$2) {
      return this.g < 200;
   }
}
