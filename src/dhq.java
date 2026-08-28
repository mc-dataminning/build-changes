import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dhq implements eh {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final ww c = ww.b("@");
   private long d = -1L;
   private boolean e = true;
   private int f;
   private boolean g = true;
   @Nullable
   private ww h;
   private String i = "";
   @Nullable
   private ww j;

   public int k() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   public ww l() {
      return this.h == null ? wv.a : this.h;
   }

   public tx a(tx $$0, jg.a $$1) {
      $$0.a("Command", this.i);
      $$0.a("SuccessCount", this.f);
      alc<uu> $$2 = $$1.a(ul.a);
      if (this.j != null) {
         $$0.a("CustomName", (uu)wy.a.encodeStart($$2, this.j).getOrThrow());
      }

      $$0.a("TrackOutput", this.g);
      if (this.h != null && this.g) {
         $$0.a("LastOutput", (uu)wy.a.encodeStart($$2, this.h).getOrThrow());
      }

      $$0.a("UpdateLastExecution", this.e);
      if (this.e && this.d > 0L) {
         $$0.a("LastExecution", this.d);
      }

      return $$0;
   }

   public void b(tx $$0, jg.a $$1) {
      this.i = $$0.l("Command");
      this.f = $$0.h("SuccessCount");
      this.b(dwn.a($$0.c("CustomName"), $$1));
      if ($$0.b("TrackOutput", 1)) {
         this.g = $$0.q("TrackOutput");
      }

      if ($$0.e("LastOutput") && this.g) {
         this.h = dwn.a($$0.c("LastOutput"), $$1);
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

   public boolean a(dip $$0) {
      if ($$0.C || $$0.ae() == this.d) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.i)) {
         this.h = ww.b("#itzlipofutzli");
         this.f = 1;
         return true;
      } else {
         this.f = 0;
         MinecraftServer $$1 = this.e().p();
         if ($$1.q() && !baj.b(this.i)) {
            try {
               this.h = null;
               ei $$2 = this.i().a((ef)(($$0x, $$1x) -> {
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

   public ww n() {
      return this.j != null ? this.j : c;
   }

   @Nullable
   public ww o() {
      return this.j;
   }

   public void b(@Nullable ww $$0) {
      this.j = $$0;
   }

   @Override
   public void a(ww $$0) {
      if (this.g) {
         this.h = ww.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract aro e();

   public abstract void f();

   public void c(@Nullable ww $$0) {
      this.h = $$0;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public boolean p() {
      return this.g;
   }

   public bty a(cqs $$0) {
      if (!$$0.gF()) {
         return bty.e;
      } else {
         if ($$0.cU().C) {
            $$0.a(this);
         }

         return bty.a;
      }
   }

   public abstract fdw g();

   public abstract ei i();

   @Override
   public boolean t_() {
      return this.e().O().c(dil.p) && this.g;
   }

   @Override
   public boolean u_() {
      return this.g;
   }

   @Override
   public boolean c() {
      return this.e().O().c(dil.j);
   }

   public abstract boolean j();
}
