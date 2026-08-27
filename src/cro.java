import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cro extends ctl {
   @Deprecated
   private final dea a;

   public cro(dea $$0, ctl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bpw a(cxd $$0) {
      bpw $$1 = this.a(new cxb($$0));
      if (!$$1.a() && $$0.n().b(kb.u)) {
         bpw $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bpw.b ? bpw.c : $$2;
      } else {
         return $$1;
      }
   }

   public bpw a(cxb $$0) {
      if (!this.d().a($$0.q().J())) {
         return bpw.e;
      } else if (!$$0.b()) {
         return bpw.e;
      } else {
         cxb $$1 = this.b($$0);
         if ($$1 == null) {
            return bpw.e;
         } else {
            drd $$2 = this.c($$1);
            if ($$2 == null) {
               return bpw.e;
            } else if (!this.a($$1, $$2)) {
               return bpw.e;
            } else {
               io $$3 = $$1.a();
               daz $$4 = $$1.q();
               cly $$5 = $$1.o();
               ctq $$6 = $$1.n();
               drd $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aqo) {
                     am.z.a((aqo)$$5, $$3, $$6);
                  }
               }

               dln $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avj.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dvw.i, $$3, dvw.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bpw.a($$4.B);
            }
         }
      }
   }

   protected avh a(drd $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cxb b(cxb $$0) {
      return $$0;
   }

   private static void a(daz $$0, io $$1, ctq $$2) {
      doi $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(io $$0, daz $$1, @Nullable cly $$2, ctq $$3, drd $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected drd c(cxb $$0) {
      drd $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private drd a(io $$0, daz $$1, ctq $$2, drd $$3) {
      cwb $$4 = $$2.a(kb.aa, cwb.a);
      if ($$4.a()) {
         return $$3;
      } else {
         drd $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cxb $$0, drd $$1) {
      cly $$2 = $$0.o();
      eur $$3 = $$2 == null ? eur.a() : eur.a($$2);
      return (!this.c() || $$1.a((dbc)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cxb $$0, drd $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(daz $$0, @Nullable cly $$1, io $$2, ctq $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cwf $$5 = $$3.a(kb.N, cwf.a);
         if (!$$5.b()) {
            doi $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.B || !$$6.q() || $$1 != null && $$1.gz()) {
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
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dea d() {
      return this.a;
   }

   public void a(Map<dea, ctl> $$0, ctl $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean an_() {
      return !(this.d() instanceof dkz);
   }

   @Override
   public void a(cii $$0) {
      cwm $$1 = $$0.p().b(kb.Z, cwm.a);
      if ($$1 != null) {
         cts.a($$0, $$1.b());
      }
   }

   public static void a(ctq $$0, dok<?> $$1, ud $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kb.N);
      } else {
         doi.a($$2, $$1);
         $$0.b(kb.N, cwf.a($$2));
      }
   }

   @Override
   public col i() {
      return this.d().i();
   }
}
