import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dil implements ei {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final wy c = wy.b("@");
   private long d = -1L;
   private boolean e = true;
   private int f;
   private boolean g = true;
   @Nullable
   private wy h;
   private String i = "";
   @Nullable
   private wy j;

   public int k() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   public wy l() {
      return this.h == null ? wx.a : this.h;
   }

   public tz a(tz $$0, jh.a $$1) {
      $$0.a("Command", this.i);
      $$0.a("SuccessCount", this.f);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.b("CustomName", xa.a, $$2, this.j);
      $$0.a("TrackOutput", this.g);
      if (this.g) {
         $$0.b("LastOutput", xa.a, $$2, this.h);
      }

      $$0.a("UpdateLastExecution", this.e);
      if (this.e && this.d > 0L) {
         $$0.a("LastExecution", this.d);
      }

      return $$0;
   }

   public void b(tz $$0, jh.a $$1) {
      this.i = $$0.j("Command");
      this.f = $$0.f("SuccessCount");
      this.b(dxr.a($$0.a("CustomName"), $$1));
      if ($$0.b("TrackOutput", 1)) {
         this.g = $$0.o("TrackOutput");
      }

      if ($$0.c("LastOutput") && this.g) {
         this.h = dxr.a($$0.a("LastOutput"), $$1);
      } else {
         this.h = null;
      }

      if ($$0.c("UpdateLastExecution")) {
         this.e = $$0.o("UpdateLastExecution");
      }

      if (this.e && $$0.c("LastExecution")) {
         this.d = $$0.g("LastExecution");
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

   public boolean a(djm $$0) {
      if ($$0.C || $$0.ae() == this.d) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.i)) {
         this.h = wy.b("#itzlipofutzli");
         this.f = 1;
         return true;
      } else {
         this.f = 0;
         MinecraftServer $$1 = this.e().p();
         if ($$1.q() && !bal.b(this.i)) {
            try {
               this.h = null;
               ej $$2 = this.i().a((eg)(($$0x, $$1x) -> {
                  if ($$0x) {
                     this.f++;
                  }
               }));
               $$1.aG().a($$2, this.i);
            } catch (Throwable var6) {
               p $$4 = p.a(var6, "Executing command block");
               q $$5 = $$4.a("Command to be executed");
               $$5.a("Command", this::m);
               $$5.a("Name", () -> this.n().getString());
               throw new aa($$4);
            }
         }

         if (this.e) {
            this.d = $$0.ae();
         } else {
            this.d = -1L;
         }

         return true;
      }
   }

   public wy n() {
      return this.j != null ? this.j : c;
   }

   @Nullable
   public wy o() {
      return this.j;
   }

   public void b(@Nullable wy $$0) {
      this.j = $$0;
   }

   @Override
   public void a(wy $$0) {
      if (this.g) {
         this.h = wy.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract arq e();

   public abstract void f();

   public void c(@Nullable wy $$0) {
      this.h = $$0;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public boolean p() {
      return this.g;
   }

   public bug a(crm $$0) {
      if (!$$0.gF()) {
         return bug.e;
      } else {
         if ($$0.cT().C) {
            $$0.a(this);
         }

         return bug.a;
      }
   }

   public abstract ffc g();

   public abstract ej i();

   @Override
   public boolean t_() {
      return this.e().O().c(dji.q) && this.g;
   }

   @Override
   public boolean u_() {
      return this.g;
   }

   @Override
   public boolean c() {
      return this.e().O().c(dji.k);
   }

   public abstract boolean j();
}
