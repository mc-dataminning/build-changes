import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fgb {
   public static final xe a = xd.a;
   private static final Logger b = LogUtils.getLogger();
   private final fgj c;
   private final Narrator d = Narrator.getNarrator();

   public fgb(fgj $$0) {
      this.c = $$0;
   }

   public void a(xe $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(xe $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(xe $$0) {
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

   private fgl d() {
      return this.c.m.as().c();
   }

   private void b(String $$0) {
      if (ab.aX) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(fgl $$0) {
      this.b();
      this.d.say(xe.c("options.narrator").f(" : ").a($$0.b()).getString(), true);
      fkx $$1 = fgj.Q().aA();
      if (this.d.active()) {
         if ($$0 == fgl.a) {
            fkv.b($$1, fkv.a.a, xe.c("narrator.toast.disabled"), null);
         } else {
            fkv.b($$1, fkv.a.a, xe.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fkv.b($$1, fkv.a.a, xe.c("narrator.toast.disabled"), xe.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != fgl.a && this.d.active()) {
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
         throw new fgb.a("Narrator library is not active");
      }
   }

   public static class a extends fug {
      public a(String $$0) {
         super($$0);
      }
   }
}
