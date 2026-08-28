import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class ffo {
   public static final wu a = wt.a;
   private static final Logger b = LogUtils.getLogger();
   private final ffw c;
   private final Narrator d = Narrator.getNarrator();

   public ffo(ffw $$0) {
      this.c = $$0;
   }

   public void a(wu $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(wu $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(wu $$0) {
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

   private ffy d() {
      return this.c.m.as().c();
   }

   private void b(String $$0) {
      if (aa.aU) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(ffy $$0) {
      this.b();
      this.d.say(wu.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      fke $$1 = ffw.Q().aw();
      if (this.d.active()) {
         if ($$0 == ffy.a) {
            fkc.b($$1, fkc.a.a, wu.c("narrator.toast.disabled"), null);
         } else {
            fkc.b($$1, fkc.a.a, wu.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fkc.b($$1, fkc.a.a, wu.c("narrator.toast.disabled"), wu.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != ffy.a && this.d.active()) {
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
         throw new ffo.a("Narrator library is not active");
      }
   }

   public static class a extends fth {
      public a(String $$0) {
         super($$0);
      }
   }
}
