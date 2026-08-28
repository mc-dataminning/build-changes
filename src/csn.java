import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class csn extends cuk {
   @Deprecated
   private final dez a;

   public csn(dez $$0, cuk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqu a(cyc $$0) {
      bqu $$1 = this.a(new cya($$0));
      if (!$$1.a() && $$0.n().b(km.v)) {
         bqu $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqu.c ? bqu.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqu a(cya $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqu.f;
      } else if (!$$0.b()) {
         return bqu.f;
      } else {
         cya $$1 = this.b($$0);
         if ($$1 == null) {
            return bqu.f;
         } else {
            dsc $$2 = this.c($$1);
            if ($$2 == null) {
               return bqu.f;
            } else if (!this.a($$1, $$2)) {
               return bqu.f;
            } else {
               iz $$3 = $$1.a();
               dby $$4 = $$1.q();
               cmx $$5 = $$1.o();
               cup $$6 = $$1.n();
               dsc $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arg) {
                     am.z.a((arg)$$5, $$3, $$6);
                  }
               }

               dmm $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), awb.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dwv.i, $$3, dwv.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqu.a($$4.B);
            }
         }
      }
   }

   protected avz a(dsc $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cya b(cya $$0) {
      return $$0;
   }

   private static void a(dby $$0, iz $$1, cup $$2) {
      dph $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iz $$0, dby $$1, @Nullable cmx $$2, cup $$3, dsc $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dsc c(cya $$0) {
      dsc $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dsc a(iz $$0, dby $$1, cup $$2, dsc $$3) {
      cxa $$4 = $$2.a(km.ab, cxa.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dsc $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cya $$0, dsc $$1) {
      cmx $$2 = $$0.o();
      evw $$3 = $$2 == null ? evw.a() : evw.a($$2);
      return (!this.c() || $$1.a((dcb)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cya $$0, dsc $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dby $$0, @Nullable cmx $$1, iz $$2, cup $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cxe $$5 = $$3.a(km.O, cxe.a);
         if (!$$5.b()) {
            dph $$6 = $$0.c_($$2);
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
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dez d() {
      return this.a;
   }

   public void a(Map<dez, cuk> $$0, cuk $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean am_() {
      return !(this.d() instanceof dly);
   }

   @Override
   public void a(cjh $$0) {
      cxl $$1 = $$0.p().b(km.aa, cxl.a);
      if ($$1 != null) {
         cur.a($$0, $$1.e());
      }
   }

   public static void a(cup $$0, dpj<?> $$1, us $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(km.O);
      } else {
         dph.a($$2, $$1);
         $$0.b(km.O, cxe.a($$2));
      }
   }

   @Override
   public cpl i() {
      return this.d().i();
   }
}
