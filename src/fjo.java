import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fjo {
   public static final xl a = xk.a;
   private static final Logger b = LogUtils.getLogger();
   private final fjx c;
   private final Narrator d = Narrator.getNarrator();

   public fjo(fjx $$0) {
      this.c = $$0;
   }

   public void a(xl $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(xl $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(xl $$0) {
      this.a($$0.getString());
   }

   public void a(String $$0) {
      if (this.d().d() && !$$0.isEmpty()) {
         this.b($$0);
         if (this.d.active()) {
            this.d.clear();
            this.d.say($$0, true);
         }
      }
   }

   private fjz d() {
      return this.c.n.au().c();
   }

   private void b(String $$0) {
      if (ab.aV) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(fjz $$0) {
      this.b();
      this.d.say(xl.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      foh $$1 = fjx.Q().aA();
      if (this.d.active()) {
         if ($$0 == fjz.a) {
            fof.b($$1, fof.a.a, xl.c("narrator.toast.disabled"), null);
         } else {
            fof.b($$1, fof.a.a, xl.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fof.b($$1, fof.a.a, xl.c("narrator.toast.disabled"), xl.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != fjz.a && this.d.active()) {
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
         throw new fjo.a("Narrator library is not active");
      }
   }

   public static class a extends fxp {
      public a(String $$0) {
         super($$0);
      }
   }
}
