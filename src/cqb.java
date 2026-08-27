import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cqb extends cry {
   @Deprecated
   private final dcv a;

   public cqb(dcv $$0, cry.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boq a(cvn $$0) {
      boq $$1 = this.a(new cvl($$0));
      if (!$$1.a() && this.y()) {
         boq $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == boq.b ? boq.c : $$2;
      } else {
         return $$1;
      }
   }

   public boq a(cvl $$0) {
      if (!this.d().a($$0.q().J())) {
         return boq.e;
      } else if (!$$0.b()) {
         return boq.e;
      } else {
         cvl $$1 = this.b($$0);
         if ($$1 == null) {
            return boq.e;
         } else {
            dpy $$2 = this.c($$1);
            if ($$2 == null) {
               return boq.e;
            } else if (!this.a($$1, $$2)) {
               return boq.e;
            } else {
               im $$3 = $$1.a();
               czu $$4 = $$1.q();
               ckl $$5 = $$1.o();
               csd $$6 = $$1.n();
               dpy $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aqf) {
                     am.z.a((aqf)$$5, $$3, $$6);
                  }
               }

               dki $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), ava.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dur.i, $$3, dur.a.a($$5, $$7));
               $$6.a(1, $$5);
               return boq.a($$4.B);
            }
         }
      }
   }

   protected auy a(dpy $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cvl b(cvl $$0) {
      return $$0;
   }

   private static void a(czu $$0, im $$1, csd $$2) {
      dnd $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2.a());
      }
   }

   protected boolean a(im $$0, czu $$1, @Nullable ckl $$2, csd $$3, dpy $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dpy c(cvl $$0) {
      dpy $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dpy a(im $$0, czu $$1, csd $$2, dpy $$3) {
      cum $$4 = $$2.a(jz.R, cum.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dpy $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cvl $$0, dpy $$1) {
      ckl $$2 = $$0.o();
      etk $$3 = $$2 == null ? etk.a() : etk.a($$2);
      return (!this.c() || $$1.a((czx)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cvl $$0, dpy $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(czu $$0, @Nullable ckl $$1, im $$2, csd $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cuq $$5 = $$3.a(jz.F, cuq.a);
         if (!$$5.b()) {
            dnd $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.B || !$$6.q() || $$1 != null && $$1.gx()) {
                  return $$5.a($$6, $$0.H_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public String a() {
      return this.d().g();
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3, $$1 != null ? $$1.H_() : null);
   }

   public dcv d() {
      return this.a;
   }

   public void a(Map<dcv, cry> $$0, cry $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean am_() {
      return !(this.d() instanceof dju);
   }

   @Override
   public void a(cgv $$0) {
      cux $$1 = $$0.p().b(jz.Q, cux.a);
      if ($$1 != null) {
         csf.a($$0, $$1.b());
      }
   }

   public static void a(csd $$0, dnf<?> $$1, ty $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(jz.F);
      } else {
         dnd.a($$2, $$1);
         $$0.b(jz.F, cuq.a($$2));
      }
   }

   @Override
   public cmy m() {
      return this.d().m();
   }
}
