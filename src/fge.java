import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fge {
   public static final wz a = wy.a;
   private static final Logger b = LogUtils.getLogger();
   private final fgm c;
   private final Narrator d = Narrator.getNarrator();

   public fge(fgm $$0) {
      this.c = $$0;
   }

   public void a(wz $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(wz $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(wz $$0) {
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

   private fgo d() {
      return this.c.m.as().c();
   }

   private void b(String $$0) {
      if (ab.aU) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(fgo $$0) {
      this.b();
      this.d.say(wz.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      fku $$1 = fgm.Q().aw();
      if (this.d.active()) {
         if ($$0 == fgo.a) {
            fks.b($$1, fks.a.a, wz.c("narrator.toast.disabled"), null);
         } else {
            fks.b($$1, fks.a.a, wz.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fks.b($$1, fks.a.a, wz.c("narrator.toast.disabled"), wz.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != fgo.a && this.d.active()) {
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
         throw new fge.a("Narrator library is not active");
      }
   }

   public static class a extends ftz {
      public a(String $$0) {
         super($$0);
      }
   }
}
