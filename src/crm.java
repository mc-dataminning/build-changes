import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class crm extends ctj {
   @Deprecated
   private final ddy a;

   public crm(ddy $$0, ctj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bpu a(cxb $$0) {
      bpu $$1 = this.a(new cwz($$0));
      if (!$$1.a() && $$0.n().b(kb.u)) {
         bpu $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bpu.b ? bpu.c : $$2;
      } else {
         return $$1;
      }
   }

   public bpu a(cwz $$0) {
      if (!this.d().a($$0.q().J())) {
         return bpu.e;
      } else if (!$$0.b()) {
         return bpu.e;
      } else {
         cwz $$1 = this.b($$0);
         if ($$1 == null) {
            return bpu.e;
         } else {
            drb $$2 = this.c($$1);
            if ($$2 == null) {
               return bpu.e;
            } else if (!this.a($$1, $$2)) {
               return bpu.e;
            } else {
               io $$3 = $$1.a();
               dax $$4 = $$1.q();
               clw $$5 = $$1.o();
               cto $$6 = $$1.n();
               drb $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aqn) {
                     am.z.a((aqn)$$5, $$3, $$6);
                  }
               }

               dll $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), avi.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dvu.i, $$3, dvu.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bpu.a($$4.B);
            }
         }
      }
   }

   protected avg a(drb $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cwz b(cwz $$0) {
      return $$0;
   }

   private static void a(dax $$0, io $$1, cto $$2) {
      dog $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(io $$0, dax $$1, @Nullable clw $$2, cto $$3, drb $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected drb c(cwz $$0) {
      drb $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private drb a(io $$0, dax $$1, cto $$2, drb $$3) {
      cvz $$4 = $$2.a(kb.aa, cvz.a);
      if ($$4.a()) {
         return $$3;
      } else {
         drb $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cwz $$0, drb $$1) {
      clw $$2 = $$0.o();
      eup $$3 = $$2 == null ? eup.a() : eup.a($$2);
      return (!this.c() || $$1.a((dba)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cwz $$0, drb $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dax $$0, @Nullable clw $$1, io $$2, cto $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cwd $$5 = $$3.a(kb.N, cwd.a);
         if (!$$5.b()) {
            dog $$6 = $$0.c_($$2);
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
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3, $$1 != null ? $$1.H_() : null);
   }

   public ddy d() {
      return this.a;
   }

   public void a(Map<ddy, ctj> $$0, ctj $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean am_() {
      return !(this.d() instanceof dkx);
   }

   @Override
   public void a(cig $$0) {
      cwk $$1 = $$0.p().b(kb.Z, cwk.a);
      if ($$1 != null) {
         ctq.a($$0, $$1.b());
      }
   }

   public static void a(cto $$0, doi<?> $$1, ud $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kb.N);
      } else {
         dog.a($$2, $$1);
         $$0.b(kb.N, cwd.a($$2));
      }
   }

   @Override
   public coj i() {
      return this.d().i();
   }
}
