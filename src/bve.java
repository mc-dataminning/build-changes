import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bve extends buj<cll> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private io e;
   private long f;
   private int g;
   private final List<io> h = Lists.newArrayList();

   public bve() {
      super(ImmutableMap.of(cbu.n, cbv.b, cbu.m, cbv.b, cbu.f, cbv.a));
   }

   protected boolean a(aqn $$0, cll $$1) {
      if (!$$0.aa().b(dav.c)) {
         return false;
      } else if ($$1.gA().b() != clo.g) {
         return false;
      } else {
         io.a $$2 = $$1.dp().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.du() + (double)$$3, $$1.dw() + (double)$$4, $$1.dA() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new io($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private io a(aqn $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(io $$0, aqn $$1) {
      drd $$2 = $$1.a_($$0);
      dea $$3 = $$2.b();
      dea $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dfv && ((dfv)$$3).h($$2) || $$2.i() && $$4 instanceof dgx;
   }

   protected void a(aqn $$0, cll $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dS().a(cbu.n, new bum(this.e));
         $$1.dS().a(cbu.m, new cbx(new bum(this.e), 0.5F, 1));
      }
   }

   protected void b(aqn $$0, cll $$1, long $$2) {
      $$1.dS().b(cbu.n);
      $$1.dS().b(cbu.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqn $$0, cll $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dn(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            drd $$3 = $$0.a_(this.e);
            dea $$4 = $$3.b();
            dea $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dfv && ((dfv)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dgx && $$1.gJ()) {
               bqf $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  ctq $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awf.by) && $$8.g() instanceof cro $$10) {
                     drd $$11 = $$10.d().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dvw.i, this.e, dvw.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avi.gm, avj.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, ctq.i);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dfv && !((dfv)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dS().a(cbu.m, new cbx(new bum(this.e), 0.5F, 1));
                  $$1.dS().a(cbu.n, new bum(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqn $$0, cll $$1, long $$2) {
      return this.g < 200;
   }
}
