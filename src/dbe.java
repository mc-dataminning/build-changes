import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dbe implements ep {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final wu c = wu.b("@");
   private long d = -1L;
   private boolean e = true;
   private int f;
   private boolean g = true;
   @Nullable
   private wu h;
   private String i = "";
   @Nullable
   private wu j;

   public int k() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   public wu l() {
      return this.h == null ? wt.a : this.h;
   }

   public tx a(tx $$0, jl.a $$1) {
      $$0.a("Command", this.i);
      $$0.a("SuccessCount", this.f);
      if (this.j != null) {
         $$0.a("CustomName", wu.a.a(this.j, $$1));
      }

      $$0.a("TrackOutput", this.g);
      if (this.h != null && this.g) {
         $$0.a("LastOutput", wu.a.a(this.h, $$1));
      }

      $$0.a("UpdateLastExecution", this.e);
      if (this.e && this.d > 0L) {
         $$0.a("LastExecution", this.d);
      }

      return $$0;
   }

   public void b(tx $$0, jl.a $$1) {
      this.i = $$0.l("Command");
      this.f = $$0.h("SuccessCount");
      if ($$0.b("CustomName", 8)) {
         this.b(dpn.a($$0.l("CustomName"), $$1));
      } else {
         this.b(null);
      }

      if ($$0.b("TrackOutput", 1)) {
         this.g = $$0.q("TrackOutput");
      }

      if ($$0.b("LastOutput", 8) && this.g) {
         try {
            this.h = wu.a.a($$0.l("LastOutput"), $$1);
         } catch (Throwable var4) {
            this.h = wu.b(var4.getMessage());
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

   public boolean a(dcd $$0) {
      if ($$0.B || $$0.Z() == this.d) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.i)) {
         this.h = wu.b("#itzlipofutzli");
         this.f = 1;
         return true;
      } else {
         this.f = 0;
         MinecraftServer $$1 = this.e().o();
         if ($$1.q() && !aza.b(this.i)) {
            try {
               this.h = null;
               eq $$2 = this.i().a((en)(($$0x, $$1x) -> {
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

   public wu n() {
      return this.j != null ? this.j : c;
   }

   @Nullable
   public wu o() {
      return this.j;
   }

   public void b(@Nullable wu $$0) {
      this.j = $$0;
   }

   @Override
   public void a(wu $$0) {
      if (this.g) {
         this.h = wu.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract aqk e();

   public abstract void f();

   public void c(@Nullable wu $$0) {
      this.h = $$0;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public boolean p() {
      return this.g;
   }

   public bqd a(cmh $$0) {
      if (!$$0.gv()) {
         return bqd.e;
      } else {
         if ($$0.cN().B) {
            $$0.a(this);
         }

         return bqd.a($$0.dP().B);
      }
   }

   public abstract evz g();

   public abstract eq i();

   @Override
   public boolean l_() {
      return this.e().ab().b(dbz.p) && this.g;
   }

   @Override
   public boolean w_() {
      return this.g;
   }

   @Override
   public boolean U_() {
      return this.e().ab().b(dbz.j);
   }

   public abstract boolean j();
}
