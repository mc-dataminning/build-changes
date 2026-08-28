import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ctu extends cvn {
   @Deprecated
   private final dhm a;

   public ctu(dhm $$0, cvn.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public brs a(czp $$0) {
      brs $$1 = this.a(new czn($$0));
      return !$$1.a() && $$0.n().b(ks.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public brs a(czn $$0) {
      if (!this.d().a($$0.q().J())) {
         return brs.d;
      } else if (!$$0.b()) {
         return brs.d;
      } else {
         czn $$1 = this.b($$0);
         if ($$1 == null) {
            return brs.d;
         } else {
            dus $$2 = this.c($$1);
            if ($$2 == null) {
               return brs.d;
            } else if (!this.a($$1, $$2)) {
               return brs.d;
            } else {
               jf $$3 = $$1.a();
               dej $$4 = $$1.q();
               cnx $$5 = $$1.o();
               cvs $$6 = $$1.n();
               dus $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof ark) {
                     an.z.a((ark)$$5, $$3, $$6);
                  }
               }

               dpa $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awh.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dzp.i, $$3, dzp.a.a($$5, $$7));
               $$6.a(1, $$5);
               return brs.b;
            }
         }
      }
   }

   protected awf a(dus $$0) {
      return $$0.A().e();
   }

   @Nullable
   public czn b(czn $$0) {
      return $$0;
   }

   private static void a(dej $$0, jf $$1, cvs $$2) {
      drv $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jf $$0, dej $$1, @Nullable cnx $$2, cvs $$3, dus $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dus c(czn $$0) {
      dus $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dus a(jf $$0, dej $$1, cvs $$2, dus $$3) {
      cya $$4 = $$2.a(ks.ah, cya.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dus $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(czn $$0, dus $$1) {
      cnx $$2 = $$0.o();
      ezb $$3 = $$2 == null ? ezb.a() : ezb.a($$2);
      return (!this.c() || $$1.a((dem)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(czn $$0, dus $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dej $$0, @Nullable cnx $$1, jf $$2, cvs $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cyh $$5 = $$3.a(ks.T, cyh.a);
         if (!$$5.b()) {
            drv $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.B || !$$6.p() || $$1 != null && $$1.gA()) {
                  return $$5.a($$6, $$0.G_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public String a() {
      return this.d().v();
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dhm d() {
      return this.a;
   }

   public void a(Map<dhm, cvn> $$0, cvn $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean ap_() {
      return !(this.d() instanceof dom);
   }

   @Override
   public void a(ckh $$0) {
      cyo $$1 = $$0.m().b(ks.ag, cyo.a);
      if ($$1 != null) {
         cvv.a($$0, $$1.e());
      }
   }

   public static void a(cvs $$0, drx<?> $$1, ug $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ks.T);
      } else {
         drv.a($$2, $$1);
         $$0.b(ks.T, cyh.a($$2));
      }
   }

   @Override
   public cqq i() {
      return this.d().i();
   }
}
