import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dfz implements ev {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final xk c = xk.b("@");
   private long d = -1L;
   private boolean e = true;
   private int f;
   private boolean g = true;
   @Nullable
   private xk h;
   private String i = "";
   @Nullable
   private xk j;

   public int k() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   public xk l() {
      return this.h == null ? xj.a : this.h;
   }

   public um a(um $$0, js.a $$1) {
      $$0.a("Command", this.i);
      $$0.a("SuccessCount", this.f);
      if (this.j != null) {
         $$0.a("CustomName", xk.a.a(this.j, $$1));
      }

      $$0.a("TrackOutput", this.g);
      if (this.h != null && this.g) {
         $$0.a("LastOutput", xk.a.a(this.h, $$1));
      }

      $$0.a("UpdateLastExecution", this.e);
      if (this.e && this.d > 0L) {
         $$0.a("LastExecution", this.d);
      }

      return $$0;
   }

   public void b(um $$0, js.a $$1) {
      this.i = $$0.l("Command");
      this.f = $$0.h("SuccessCount");
      if ($$0.b("CustomName", 8)) {
         this.b(duq.a($$0.l("CustomName"), $$1));
      } else {
         this.b(null);
      }

      if ($$0.b("TrackOutput", 1)) {
         this.g = $$0.q("TrackOutput");
      }

      if ($$0.b("LastOutput", 8) && this.g) {
         try {
            this.h = xk.a.a($$0.l("LastOutput"), $$1);
         } catch (Throwable var4) {
            this.h = xk.b(var4.getMessage());
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

   public boolean a(dgz $$0) {
      if ($$0.C || $$0.ad() == this.d) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.i)) {
         this.h = xk.b("#itzlipofutzli");
         this.f = 1;
         return true;
      } else {
         this.f = 0;
         MinecraftServer $$1 = this.e().p();
         if ($$1.q() && !bar.b(this.i)) {
            try {
               this.h = null;
               ew $$2 = this.i().a((et)(($$0x, $$1x) -> {
                  if ($$0x) {
                     this.f++;
                  }
               }));
               $$1.aG().a($$2, this.i);
            } catch (Throwable var6) {
               o $$4 = o.a(var6, "Executing command block");
               p $$5 = $$4.a("Command to be executed");
               $$5.a("Command", this::m);
               $$5.a("Name", () -> this.n().getString());
               throw new z($$4);
            }
         }

         if (this.e) {
            this.d = $$0.ad();
         } else {
            this.d = -1L;
         }

         return true;
      }
   }

   public xk n() {
      return this.j != null ? this.j : c;
   }

   @Nullable
   public xk o() {
      return this.j;
   }

   public void b(@Nullable xk $$0) {
      this.j = $$0;
   }

   @Override
   public void a(xk $$0) {
      if (this.g) {
         this.h = xk.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract arx e();

   public abstract void f();

   public void c(@Nullable xk $$0) {
      this.h = $$0;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public boolean p() {
      return this.g;
   }

   public bta a(cpo $$0) {
      if (!$$0.gG()) {
         return bta.e;
      } else {
         if ($$0.cU().C) {
            $$0.a(this);
         }

         return bta.a;
      }
   }

   public abstract fbr g();

   public abstract ew i();

   @Override
   public boolean y_() {
      return this.e().O().b(dgv.p) && this.g;
   }

   @Override
   public boolean z_() {
      return this.g;
   }

   @Override
   public boolean c() {
      return this.e().O().b(dgv.j);
   }

   public abstract boolean j();
}
