import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class flx {
   public static final xv a = xu.a;
   private static final Logger b = LogUtils.getLogger();
   private final fmg c;
   private final Narrator d = Narrator.getNarrator();

   public flx(fmg $$0) {
      this.c = $$0;
   }

   public void a(xv $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(xv $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(xv $$0) {
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

   private fmi d() {
      return this.c.n.av().c();
   }

   private void b(String $$0) {
      if (ab.aU) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(fmi $$0) {
      this.b();
      this.d.say(xv.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      fqr $$1 = fmg.Q().aA();
      if (this.d.active()) {
         if ($$0 == fmi.a) {
            fqp.b($$1, fqp.a.a, xv.c("narrator.toast.disabled"), null);
         } else {
            fqp.b($$1, fqp.a.a, xv.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fqp.b($$1, fqp.a.a, xv.c("narrator.toast.disabled"), xv.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != fmi.a && this.d.active()) {
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
         throw new flx.a("Narrator library is not active");
      }
   }

   public static class a extends fzz {
      public a(String $$0) {
         super($$0);
      }
   }
}
