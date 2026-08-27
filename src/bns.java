import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bns extends bmx<cdh> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ht e;
   private long f;
   private int g;
   private final List<ht> h = Lists.newArrayList();

   public bns() {
      super(ImmutableMap.of(buh.n, bui.b, buh.m, bui.b, buh.f, bui.a));
   }

   protected boolean a(ame $$0, cdh $$1) {
      if (!$$0.Y().b(crw.c)) {
         return false;
      } else if ($$1.gq().b() != cdk.g) {
         return false;
      } else {
         ht.a $$2 = $$1.dn().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.ds() + (double)$$3, $$1.du() + (double)$$4, $$1.dy() + (double)$$5);
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
   private ht a(ame $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(ht $$0, ame $$1) {
      dhi $$2 = $$1.a_($$0);
      cva $$3 = $$2.b();
      cva $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cwv && ((cwv)$$3).h($$2) || $$2.i() && $$4 instanceof cxx;
   }

   protected void a(ame $$0, cdh $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dP().a(buh.n, new bna(this.e));
         $$1.dP().a(buh.m, new buk(new bna(this.e), 0.5F, 1));
      }
   }

   protected void b(ame $$0, cdh $$1, long $$2) {
      $$1.dP().b(buh.n);
      $$1.dP().b(buh.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ame $$0, cdh $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dl(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dhi $$3 = $$0.a_(this.e);
            cva $$4 = $$3.b();
            cva $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cwv && ((cwv)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cxx && $$1.gz()) {
               bje $$6 = $$1.A();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  clj $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(aro.aU) && $$8.d() instanceof cjc $$10) {
                     dhi $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dls.i, this.e, dls.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), aqr.fA, aqs.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, clj.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cwv && !((cwv)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dP().a(buh.m, new buk(new bna(this.e), 0.5F, 1));
                  $$1.dP().a(buh.n, new bna(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ame $$0, cdh $$1, long $$2) {
      return this.g < 200;
   }
}
