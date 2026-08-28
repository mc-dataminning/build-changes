import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwx extends bwc<cnh> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private je e;
   private long f;
   private int g;
   private final List<je> h = Lists.newArrayList();

   public bwx() {
      super(ImmutableMap.of(cdn.n, cdo.b, cdn.m, cdo.b, cdn.f, cdo.a));
   }

   protected boolean a(arh $$0, cnh $$1) {
      if (!$$0.ac().b(dec.c)) {
         return false;
      } else if ($$1.gz().b() != cnk.g) {
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
   private je a(arh $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.C_().a(this.h.size()));
   }

   private boolean a(je $$0, arh $$1) {
      duo $$2 = $$1.a_($$0);
      dhj $$3 = $$2.b();
      dhj $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dje && ((dje)$$3).i($$2) || $$2.l() && $$4 instanceof dkg;
   }

   protected void a(arh $$0, cnh $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dX().a(cdn.n, new bwf(this.e));
         $$1.dX().a(cdn.m, new cdq(new bwf(this.e), 0.5F, 1));
      }
   }

   protected void b(arh $$0, cnh $$1, long $$2) {
      $$1.dX().b(cdn.n);
      $$1.dX().b(cdn.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arh $$0, cnh $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dq(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            duo $$3 = $$0.a_(this.e);
            dhj $$4 = $$3.b();
            dhj $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dje && ((dje)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dkg && $$1.gJ()) {
               brw $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cvp $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axc.bB) && $$8.h() instanceof ctr $$10) {
                     duo $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dzl.i, this.e, dzl.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awe.gn, awf.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cvp.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dje && !((dje)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dX().a(cdn.m, new cdq(new bwf(this.e), 0.5F, 1));
                  $$1.dX().a(cdn.n, new bwf(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arh $$0, cnh $$1, long $$2) {
      return this.g < 200;
   }
}
