import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bvm extends bur<clu> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ja e;
   private long f;
   private int g;
   private final List<ja> h = Lists.newArrayList();

   public bvm() {
      super(ImmutableMap.of(ccc.n, ccd.b, ccc.m, ccd.b, ccc.f, ccd.a));
   }

   protected boolean a(aqk $$0, clu $$1) {
      if (!$$0.ab().b(dbz.c)) {
         return false;
      } else if ($$1.gy().b() != clx.g) {
         return false;
      } else {
         ja.a $$2 = $$1.dp().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.du() + (double)$$3, $$1.dw() + (double)$$4, $$1.dA() + (double)$$5);
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
   private ja a(aqk $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(ja $$0, aqk $$1) {
      dsh $$2 = $$1.a_($$0);
      dff $$3 = $$2.b();
      dff $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dha && ((dha)$$3).h($$2) || $$2.i() && $$4 instanceof dic;
   }

   protected void a(aqk $$0, clu $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dT().a(ccc.n, new buu(this.e));
         $$1.dT().a(ccc.m, new ccf(new buu(this.e), 0.5F, 1));
      }
   }

   protected void b(aqk $$0, clu $$1, long $$2) {
      $$1.dT().b(ccc.n);
      $$1.dT().b(ccc.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqk $$0, clu $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dn(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dsh $$3 = $$0.a_(this.e);
            dff $$4 = $$3.b();
            dff $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dha && ((dha)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dic && $$1.gH()) {
               bqm $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cua $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awd.bx) && $$8.g() instanceof cry $$10) {
                     dsh $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dxa.i, this.e, dxa.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avf.gm, avg.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, cua.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dha && !((dha)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dT().a(ccc.m, new ccf(new buu(this.e), 0.5F, 1));
                  $$1.dT().a(ccc.n, new buu(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqk $$0, clu $$1, long $$2) {
      return this.g < 200;
   }
}
