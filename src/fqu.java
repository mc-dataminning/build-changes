import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fqu {
   public static final xa a = wz.a;
   private static final Logger b = LogUtils.getLogger();
   private final frd c;
   private final Narrator d = Narrator.getNarrator();

   public fqu(frd $$0) {
      this.c = $$0;
   }

   public void a(xa $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.a($$1, false);
      }
   }

   public void b(xa $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.a($$1, false);
      }
   }

   public void c(xa $$0) {
      this.a($$0.getString());
   }

   public void a(String $$0) {
      if (this.d().d() && !$$0.isEmpty()) {
         this.b($$0);
         if (this.d.active()) {
            this.d.clear();
            this.a($$0, true);
         }
      }
   }

   private void a(String $$0, boolean $$1) {
      this.d.say($$0, $$1, this.c.n.a(awq.j) * this.c.n.a(awq.a));
   }

   private frf d() {
      return this.c.n.av().c();
   }

   private void b(String $$0) {
      if (ac.aU) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(frf $$0) {
      this.b();
      this.a(xa.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      fww $$1 = frd.Q().aA();
      if (this.d.active()) {
         if ($$0 == frf.a) {
            fwu.b($$1, fwu.a.a, xa.c("narrator.toast.disabled"), null);
         } else {
            fwu.b($$1, fwu.a.a, xa.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fwu.b($$1, fwu.a.a, xa.c("narrator.toast.disabled"), xa.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != frf.a && this.d.active()) {
         this.d.clear();
      }
   }

   public void c() {
      this.d.destroy();
   }

   public void a(boolean $$0) {
      if ($$0
         && !this.a()
         && !TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Failed to initialize text-to-speech library. Do you want to continue?\nIf this problem persists, please report it at bugs.mojang.com",
            "yesno",
            "error",
            true
         )) {
         throw new fqu.a("Narrator library is not active");
      }
   }

   public static class a extends ggg {
      public a(String $$0) {
         super($$0);
      }
   }
}
