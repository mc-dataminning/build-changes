import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class csp implements dr {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final vf c = vf.b("@");
   private long d = -1L;
   private boolean e = true;
   private int f;
   private boolean g = true;
   @Nullable
   private vf h;
   private String i = "";
   private vf j = c;

   public int k() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   public vf l() {
      return this.h == null ? ve.a : this.h;
   }

   public sn a(sn $$0) {
      $$0.a("Command", this.i);
      $$0.a("SuccessCount", this.f);
      $$0.a("CustomName", vf.a.a(this.j));
      $$0.a("TrackOutput", this.g);
      if (this.h != null && this.g) {
         $$0.a("LastOutput", vf.a.a(this.h));
      }

      $$0.a("UpdateLastExecution", this.e);
      if (this.e && this.d > 0L) {
         $$0.a("LastExecution", this.d);
      }

      return $$0;
   }

   public void b(sn $$0) {
      this.i = $$0.l("Command");
      this.f = $$0.h("SuccessCount");
      if ($$0.b("CustomName", 8)) {
         this.b(vf.a.a($$0.l("CustomName")));
      }

      if ($$0.b("TrackOutput", 1)) {
         this.g = $$0.q("TrackOutput");
      }

      if ($$0.b("LastOutput", 8) && this.g) {
         try {
            this.h = vf.a.a($$0.l("LastOutput"));
         } catch (Throwable var3) {
            this.h = vf.b(var3.getMessage());
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

   public boolean a(cto $$0) {
      if ($$0.B || $$0.X() == this.d) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.i)) {
         this.h = vf.b("#itzlipofutzli");
         this.f = 1;
         return true;
      } else {
         this.f = 0;
         MinecraftServer $$1 = this.e().o();
         if ($$1.o() && !avk.b(this.i)) {
            try {
               this.h = null;
               ds $$2 = this.i().a((dp)(($$0x, $$1x) -> {
                  if ($$0x) {
                     this.f++;
                  }
               }));
               $$1.aE().a($$2, this.i);
            } catch (Throwable var6) {
               o $$4 = o.a(var6, "Executing command block");
               p $$5 = $$4.a("Command to be executed");
               $$5.a("Command", this::m);
               $$5.a("Name", () -> this.n().getString());
               throw new y($$4);
            }
         }

         if (this.e) {
            this.d = $$0.X();
         } else {
            this.d = -1L;
         }

         return true;
      }
   }

   public vf n() {
      return this.j;
   }

   public void b(@Nullable vf $$0) {
      if ($$0 != null) {
         this.j = $$0;
      } else {
         this.j = c;
      }
   }

   @Override
   public void a(vf $$0) {
      if (this.g) {
         this.h = vf.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract and e();

   public abstract void f();

   public void c(@Nullable vf $$0) {
      this.h = $$0;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public boolean o() {
      return this.g;
   }

   public bka a(cfh $$0) {
      if (!$$0.gp()) {
         return bka.d;
      } else {
         if ($$0.cK().B) {
            $$0.a(this);
         }

         return bka.a($$0.dM().B);
      }
   }

   public abstract els g();

   public abstract ds i();

   @Override
   public boolean l_() {
      return this.e().Z().b(ctk.p) && this.g;
   }

   @Override
   public boolean x_() {
      return this.g;
   }

   @Override
   public boolean W_() {
      return this.e().Z().b(ctk.j);
   }

   public abstract boolean j();
}
