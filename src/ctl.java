import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ctl extends cvg {
   @Deprecated
   private final dgv a;

   public ctl(dgv $$0, cvg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public brk a(cyy $$0) {
      brk $$1 = this.a(new cyw($$0));
      return !$$1.a() && $$0.n().b(kr.v) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public brk a(cyw $$0) {
      if (!this.d().a($$0.q().J())) {
         return brk.d;
      } else if (!$$0.b()) {
         return brk.d;
      } else {
         cyw $$1 = this.b($$0);
         if ($$1 == null) {
            return brk.d;
         } else {
            dua $$2 = this.c($$1);
            if ($$2 == null) {
               return brk.d;
            } else if (!this.a($$1, $$2)) {
               return brk.d;
            } else {
               je $$3 = $$1.a();
               dds $$4 = $$1.q();
               cnp $$5 = $$1.o();
               cvl $$6 = $$1.n();
               dua $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arh) {
                     an.z.a((arh)$$5, $$3, $$6);
                  }
               }

               doj $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awe.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dyx.i, $$3, dyx.a.a($$5, $$7));
               $$6.a(1, $$5);
               return brk.b;
            }
         }
      }
   }

   protected awc a(dua $$0) {
      return $$0.A().e();
   }

   @Nullable
   public cyw b(cyw $$0) {
      return $$0;
   }

   private static void a(dds $$0, je $$1, cvl $$2) {
      dre $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(je $$0, dds $$1, @Nullable cnp $$2, cvl $$3, dua $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dua c(cyw $$0) {
      dua $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dua a(je $$0, dds $$1, cvl $$2, dua $$3) {
      cxw $$4 = $$2.a(kr.ae, cxw.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dua $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cyw $$0, dua $$1) {
      cnp $$2 = $$0.o();
      eyj $$3 = $$2 == null ? eyj.a() : eyj.a($$2);
      return (!this.c() || $$1.a((ddv)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cyw $$0, dua $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dds $$0, @Nullable cnp $$1, je $$2, cvl $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cya $$5 = $$3.a(kr.Q, cya.a);
         if (!$$5.b()) {
            dre $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if ($$0.B || !$$6.p() || $$1 != null && $$1.gz()) {
                  return $$5.a($$6, $$0.F_());
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
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dgv d() {
      return this.a;
   }

   public void a(Map<dgv, cvg> $$0, cvg $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean aq_() {
      return !(this.d() instanceof dnv);
   }

   @Override
   public void a(cjz $$0) {
      cyh $$1 = $$0.m().b(kr.ad, cyh.a);
      if ($$1 != null) {
         cvn.a($$0, $$1.e());
      }
   }

   public static void a(cvl $$0, drg<?> $$1, uf $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kr.Q);
      } else {
         dre.a($$2, $$1);
         $$0.b(kr.Q, cya.a($$2));
      }
   }

   @Override
   public cqh i() {
      return this.d().i();
   }
}
