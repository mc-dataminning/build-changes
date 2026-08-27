import com.mojang.brigadier.ResultConsumer;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class coy implements ds {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final tn c = tn.b("@");
   private long d = -1L;
   private boolean e = true;
   private int f;
   private boolean g = true;
   @Nullable
   private tn h;
   private String i = "";
   private tn j = c;

   public int k() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   public tn l() {
      return this.h == null ? tm.a : this.h;
   }

   public qy a(qy $$0) {
      $$0.a("Command", this.i);
      $$0.a("SuccessCount", this.f);
      $$0.a("CustomName", tn.a.a(this.j));
      $$0.a("TrackOutput", this.g);
      if (this.h != null && this.g) {
         $$0.a("LastOutput", tn.a.a(this.h));
      }

      $$0.a("UpdateLastExecution", this.e);
      if (this.e && this.d > 0L) {
         $$0.a("LastExecution", this.d);
      }

      return $$0;
   }

   public void b(qy $$0) {
      this.i = $$0.l("Command");
      this.f = $$0.h("SuccessCount");
      if ($$0.b("CustomName", 8)) {
         this.b(tn.a.a($$0.l("CustomName")));
      }

      if ($$0.b("TrackOutput", 1)) {
         this.g = $$0.q("TrackOutput");
      }

      if ($$0.b("LastOutput", 8) && this.g) {
         try {
            this.h = tn.a.a($$0.l("LastOutput"));
         } catch (Throwable var3) {
            this.h = tn.b(var3.getMessage());
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

   public boolean a(cpx $$0) {
      if ($$0.B || $$0.V() == this.d) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.i)) {
         this.h = tn.b("#itzlipofutzli");
         this.f = 1;
         return true;
      } else {
         this.f = 0;
         MinecraftServer $$1 = this.e().n();
         if ($$1.o() && !ass.b(this.i)) {
            try {
               this.h = null;
               dt $$2 = this.i().a((ResultConsumer<dt>)(($$0x, $$1x, $$2x) -> {
                  if ($$1x) {
                     this.f++;
                  }
               }));
               $$1.aC().a($$2, this.i);
            } catch (Throwable var6) {
               o $$4 = o.a(var6, "Executing command block");
               p $$5 = $$4.a("Command to be executed");
               $$5.a("Command", this::m);
               $$5.a("Name", () -> this.n().getString());
               throw new y($$4);
            }
         }

         if (this.e) {
            this.d = $$0.V();
         } else {
            this.d = -1L;
         }

         return true;
      }
   }

   public tn n() {
      return this.j;
   }

   public void b(@Nullable tn $$0) {
      if ($$0 != null) {
         this.j = $$0;
      } else {
         this.j = c;
      }
   }

   @Override
   public void a(tn $$0) {
      if (this.g) {
         this.h = tn.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract aks e();

   public abstract void f();

   public void c(@Nullable tn $$0) {
      this.h = $$0;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public boolean o() {
      return this.g;
   }

   public bha a(cbw $$0) {
      if (!$$0.go()) {
         return bha.d;
      } else {
         if ($$0.cJ().B) {
            $$0.a(this);
         }

         return bha.a($$0.dL().B);
      }
   }

   public abstract ehp g();

   public abstract dt i();

   @Override
   public boolean j_() {
      return this.e().X().b(cpt.o) && this.g;
   }

   @Override
   public boolean v_() {
      return this.g;
   }

   @Override
   public boolean T_() {
      return this.e().X().b(cpt.i);
   }

   public abstract boolean j();
}
