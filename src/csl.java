import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class csl extends cui {
   @Deprecated
   private final dex a;

   public csl(dex $$0, cui.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqs a(cya $$0) {
      bqs $$1 = this.a(new cxy($$0));
      if (!$$1.a() && $$0.n().b(km.u)) {
         bqs $$2 = super.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bqs.c ? bqs.d : $$2;
      } else {
         return $$1;
      }
   }

   public bqs a(cxy $$0) {
      if (!this.d().a($$0.q().J())) {
         return bqs.f;
      } else if (!$$0.b()) {
         return bqs.f;
      } else {
         cxy $$1 = this.b($$0);
         if ($$1 == null) {
            return bqs.f;
         } else {
            dsa $$2 = this.c($$1);
            if ($$2 == null) {
               return bqs.f;
            } else if (!this.a($$1, $$2)) {
               return bqs.f;
            } else {
               iz $$3 = $$1.a();
               dbw $$4 = $$1.q();
               cmv $$5 = $$1.o();
               cun $$6 = $$1.n();
               dsa $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arf) {
                     am.z.a((arf)$$5, $$3, $$6);
                  }
               }

               dmk $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), awa.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dwt.i, $$3, dwt.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bqs.a($$4.B);
            }
         }
      }
   }

   protected avy a(dsa $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cxy b(cxy $$0) {
      return $$0;
   }

   private static void a(dbw $$0, iz $$1, cun $$2) {
      dpf $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iz $$0, dbw $$1, @Nullable cmv $$2, cun $$3, dsa $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dsa c(cxy $$0) {
      dsa $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dsa a(iz $$0, dbw $$1, cun $$2, dsa $$3) {
      cwy $$4 = $$2.a(km.aa, cwy.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dsa $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(cxy $$0, dsa $$1) {
      cmv $$2 = $$0.o();
      evu $$3 = $$2 == null ? evu.a() : evu.a($$2);
      return (!this.c() || $$1.a((dbz)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(cxy $$0, dsa $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dbw $$0, @Nullable cmv $$1, iz $$2, cun $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         cxc $$5 = $$3.a(km.N, cxc.a);
         if (!$$5.b()) {
            dpf $$6 = $$0.c_($$2);
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
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public dex d() {
      return this.a;
   }

   public void a(Map<dex, cui> $$0, cui $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean an_() {
      return !(this.d() instanceof dlw);
   }

   @Override
   public void a(cjf $$0) {
      cxj $$1 = $$0.p().b(km.Z, cxj.a);
      if ($$1 != null) {
         cup.a($$0, $$1.e());
      }
   }

   public static void a(cun $$0, dph<?> $$1, ur $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(km.N);
      } else {
         dpf.a($$2, $$1);
         $$0.b(km.N, cxc.a($$2));
      }
   }

   @Override
   public cpj i() {
      return this.d().i();
   }
}
