import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dax implements eo {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final xo c = xo.b("@");
   private long d = -1L;
   private boolean e = true;
   private int f;
   private boolean g = true;
   @Nullable
   private xo h;
   private String i = "";
   @Nullable
   private xo j;

   public int k() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   public xo l() {
      return this.h == null ? xn.a : this.h;
   }

   public ur a(ur $$0, jk.a $$1) {
      $$0.a("Command", this.i);
      $$0.a("SuccessCount", this.f);
      if (this.j != null) {
         $$0.a("CustomName", xo.a.a(this.j, $$1));
      }

      $$0.a("TrackOutput", this.g);
      if (this.h != null && this.g) {
         $$0.a("LastOutput", xo.a.a(this.h, $$1));
      }

      $$0.a("UpdateLastExecution", this.e);
      if (this.e && this.d > 0L) {
         $$0.a("LastExecution", this.d);
      }

      return $$0;
   }

   public void b(ur $$0, jk.a $$1) {
      this.i = $$0.l("Command");
      this.f = $$0.h("SuccessCount");
      if ($$0.b("CustomName", 8)) {
         this.b(xo.a.a($$0.l("CustomName"), $$1));
      } else {
         this.b(null);
      }

      if ($$0.b("TrackOutput", 1)) {
         this.g = $$0.q("TrackOutput");
      }

      if ($$0.b("LastOutput", 8) && this.g) {
         try {
            this.h = xo.a.a($$0.l("LastOutput"), $$1);
         } catch (Throwable var4) {
            this.h = xo.b(var4.getMessage());
         }
      } else {
         this.h = null;
      }

      if ($$0.e("UpdateLastExecution")) {
         this.e = $$0.q("UpdateLastExecution");
      }

      if (this.e && $$0.e("LastExecution")) {
         this.d = $$0.i("LastExecution");
      } else {
         this.d = -1L;
      }
   }

   public void a(String $$0) {
      this.i = $$0;
      this.f = 0;
   }

   public String m() {
      return this.i;
   }

   public boolean a(dbw $$0) {
      if ($$0.B || $$0.Z() == this.d) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.i)) {
         this.h = xo.b("#itzlipofutzli");
         this.f = 1;
         return true;
      } else {
         this.f = 0;
         MinecraftServer $$1 = this.e().o();
         if ($$1.q() && !azt.b(this.i)) {
            try {
               this.h = null;
               ep $$2 = this.i().a((em)(($$0x, $$1x) -> {
                  if ($$0x) {
                     this.f++;
                  }
               }));
               $$1.aH().a($$2, this.i);
            } catch (Throwable var6) {
               o $$4 = o.a(var6, "Executing command block");
               p $$5 = $$4.a("Command to be executed");
               $$5.a("Command", this::m);
               $$5.a("Name", () -> this.n().getString());
               throw new y($$4);
            }
         }

         if (this.e) {
            this.d = $$0.Z();
         } else {
            this.d = -1L;
         }

         return true;
      }
   }

   public xo n() {
      return this.j != null ? this.j : c;
   }

   @Nullable
   public xo o() {
      return this.j;
   }

   public void b(@Nullable xo $$0) {
      this.j = $$0;
   }

   @Override
   public void a(xo $$0) {
      if (this.g) {
         this.h = xo.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract are e();

   public abstract void f();

   public void c(@Nullable xo $$0) {
      this.h = $$0;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public boolean p() {
      return this.g;
   }

   public bqs a(cmv $$0) {
      if (!$$0.gz()) {
         return bqs.e;
      } else {
         if ($$0.cN().B) {
            $$0.a(this);
         }

         return bqs.a($$0.dP().B);
      }
   }

   public abstract evp g();

   public abstract ep i();

   @Override
   public boolean l_() {
      return this.e().ab().b(dbs.p) && this.g;
   }

   @Override
   public boolean w_() {
      return this.g;
   }

   @Override
   public boolean U_() {
      return this.e().ab().b(dbs.j);
   }

   public abstract boolean j();
}
