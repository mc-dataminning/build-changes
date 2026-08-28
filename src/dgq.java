import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dgq implements ew {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final wv c = wv.b("@");
   private long d = -1L;
   private boolean e = true;
   private int f;
   private boolean g = true;
   @Nullable
   private wv h;
   private String i = "";
   @Nullable
   private wv j;

   public int k() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   public wv l() {
      return this.h == null ? wu.a : this.h;
   }

   public tw a(tw $$0, ju.a $$1) {
      $$0.a("Command", this.i);
      $$0.a("SuccessCount", this.f);
      alb<ut> $$2 = $$1.a(uk.a);
      if (this.j != null) {
         $$0.a("CustomName", (ut)wx.a.encodeStart($$2, this.j).getOrThrow());
      }

      $$0.a("TrackOutput", this.g);
      if (this.h != null && this.g) {
         $$0.a("LastOutput", (ut)wx.a.encodeStart($$2, this.h).getOrThrow());
      }

      $$0.a("UpdateLastExecution", this.e);
      if (this.e && this.d > 0L) {
         $$0.a("LastExecution", this.d);
      }

      return $$0;
   }

   public void b(tw $$0, ju.a $$1) {
      this.i = $$0.l("Command");
      this.f = $$0.h("SuccessCount");
      this.b(dvl.a($$0.c("CustomName"), $$1));
      if ($$0.b("TrackOutput", 1)) {
         this.g = $$0.q("TrackOutput");
      }

      if ($$0.e("LastOutput") && this.g) {
         this.h = dvl.a($$0.c("LastOutput"), $$1);
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

   public boolean a(dhp $$0) {
      if ($$0.C || $$0.ae() == this.d) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.i)) {
         this.h = wv.b("#itzlipofutzli");
         this.f = 1;
         return true;
      } else {
         this.f = 0;
         MinecraftServer $$1 = this.e().p();
         if ($$1.q() && !bah.b(this.i)) {
            try {
               this.h = null;
               ex $$2 = this.i().a((eu)(($$0x, $$1x) -> {
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
            this.d = $$0.ae();
         } else {
            this.d = -1L;
         }

         return true;
      }
   }

   public wv n() {
      return this.j != null ? this.j : c;
   }

   @Nullable
   public wv o() {
      return this.j;
   }

   public void b(@Nullable wv $$0) {
      this.j = $$0;
   }

   @Override
   public void a(wv $$0) {
      if (this.g) {
         this.h = wv.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract arn e();

   public abstract void f();

   public void c(@Nullable wv $$0) {
      this.h = $$0;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public boolean p() {
      return this.g;
   }

   public btq a(cqi $$0) {
      if (!$$0.gF()) {
         return btq.e;
      } else {
         if ($$0.cU().C) {
            $$0.a(this);
         }

         return btq.a;
      }
   }

   public abstract fcu g();

   public abstract ex i();

   @Override
   public boolean t_() {
      return this.e().O().c(dhl.p) && this.g;
   }

   @Override
   public boolean u_() {
      return this.g;
   }

   @Override
   public boolean c() {
      return this.e().O().c(dhl.j);
   }

   public abstract boolean j();
}
