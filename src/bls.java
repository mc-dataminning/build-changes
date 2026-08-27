import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bls extends bkx<cbh> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private gw e;
   private long f;
   private int g;
   private final List<gw> h = Lists.newArrayList();

   public bls() {
      super(ImmutableMap.of(bsh.n, bsi.b, bsh.m, bsi.b, bsh.f, bsi.a));
   }

   protected boolean a(akr $$0, cbh $$1) {
      if (!$$0.X().b(cpr.c)) {
         return false;
      } else if ($$1.go().b() != cbk.g) {
         return false;
      } else {
         gw.a $$2 = $$1.dl().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dq() + (double)$$3, $$1.ds() + (double)$$4, $$1.dw() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new gw($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private gw a(akr $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.D_().a(this.h.size()));
   }

   private boolean a(gw $$0, akr $$1) {
      dfj $$2 = $$1.a_($$0);
      csv $$3 = $$2.b();
      csv $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cum && ((cum)$$3).h($$2) || $$2.i() && $$4 instanceof cvo;
   }

   protected void a(akr $$0, cbh $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dN().a(bsh.n, new bla(this.e));
         $$1.dN().a(bsh.m, new bsk(new bla(this.e), 0.5F, 1));
      }
   }

   protected void b(akr $$0, cbh $$1, long $$2) {
      $$1.dN().b(bsh.n);
      $$1.dN().b(bsh.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(akr $$0, cbh $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dj(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dfj $$3 = $$0.a_(this.e);
            csv $$4 = $$3.b();
            csv $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cum && ((cum)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cvo && $$1.gx()) {
               bhf $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cjf $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(aqb.aU) && $$8.d() instanceof cgy $$10) {
                     dfj $$11 = $$10.e().n();
                     $$0.b(this.e, $$11);
                     $$0.a(djt.i, this.e, djt.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), ape.fi, apf.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cjf.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cum && !((cum)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dN().a(bsh.m, new bsk(new bla(this.e), 0.5F, 1));
                  $$1.dN().a(bsh.n, new bla(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(akr $$0, cbh $$1, long $$2) {
      return this.g < 200;
   }
}
