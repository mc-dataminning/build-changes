import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class diw implements ei {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final xa c = xa.b("@");
   private static final int d = -1;
   private long e = -1L;
   private boolean f = true;
   private int g;
   private boolean h = true;
   @Nullable
   private xa i;
   private String j = "";
   @Nullable
   private xa k;

   public int k() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public xa l() {
      return this.i == null ? wz.a : this.i;
   }

   public tz a(tz $$0, jh.a $$1) {
      $$0.a("Command", this.j);
      $$0.a("SuccessCount", this.g);
      alg<uy> $$2 = $$1.a(un.a);
      $$0.b("CustomName", xc.a, $$2, this.k);
      $$0.a("TrackOutput", this.h);
      if (this.h) {
         $$0.b("LastOutput", xc.a, $$2, this.i);
      }

      $$0.a("UpdateLastExecution", this.f);
      if (this.f && this.e != -1L) {
         $$0.a("LastExecution", this.e);
      }

      return $$0;
   }

   public void b(tz $$0, jh.a $$1) {
      this.j = $$0.b("Command", "");
      this.g = $$0.b("SuccessCount", 0);
      this.b(dyc.a($$0.a("CustomName"), $$1));
      this.h = $$0.b("TrackOutput", true);
      if (this.h) {
         this.i = dyc.a($$0.a("LastOutput"), $$1);
      } else {
         this.i = null;
      }

      this.f = $$0.b("UpdateLastExecution", true);
      if (this.f) {
         this.e = $$0.b("LastExecution", -1L);
      } else {
         this.e = -1L;
      }
   }

   public void a(String $$0) {
      this.j = $$0;
      this.g = 0;
   }

   public String m() {
      return this.j;
   }

   public boolean a(djx $$0) {
      if ($$0.C || $$0.ae() == this.e) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.j)) {
         this.i = xa.b("#itzlipofutzli");
         this.g = 1;
         return true;
      } else {
         this.g = 0;
         MinecraftServer $$1 = this.e().p();
         if ($$1.q() && !ban.b(this.j)) {
            try {
               this.i = null;
               ej $$2 = this.i().a((eg)(($$0x, $$1x) -> {
                  if ($$0x) {
                     this.g++;
                  }
               }));
               $$1.aG().a($$2, this.j);
            } catch (Throwable var6) {
               p $$4 = p.a(var6, "Executing command block");
               q $$5 = $$4.a("Command to be executed");
               $$5.a("Command", this::m);
               $$5.a("Name", () -> this.n().getString());
               throw new aa($$4);
            }
         }

         if (this.f) {
            this.e = $$0.ae();
         } else {
            this.e = -1L;
         }

         return true;
      }
   }

   public xa n() {
      return this.k != null ? this.k : c;
   }

   @Nullable
   public xa o() {
      return this.k;
   }

   public void b(@Nullable xa $$0) {
      this.k = $$0;
   }

   @Override
   public void a(xa $$0) {
      if (this.h) {
         this.i = xa.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract ars e();

   public abstract void f();

   public void c(@Nullable xa $$0) {
      this.i = $$0;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   public boolean p() {
      return this.h;
   }

   public bur a(crx $$0) {
      if (!$$0.gG()) {
         return bur.e;
      } else {
         if ($$0.cU().C) {
            $$0.a(this);
         }

         return bur.a;
      }
   }

   public abstract ffq g();

   public abstract ej i();

   @Override
   public boolean x_() {
      return this.e().O().c(djt.q) && this.h;
   }

   @Override
   public boolean y_() {
      return this.h;
   }

   @Override
   public boolean c() {
      return this.e().O().c(djt.k);
   }

   public abstract boolean j();
}
