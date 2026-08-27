import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class eyy {
   public static final vu a = vt.a;
   private static final Logger b = LogUtils.getLogger();
   private final ezg c;
   private final Narrator d = Narrator.getNarrator();

   public eyy(ezg $$0) {
      this.c = $$0;
   }

   public void a(vu $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(vu $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(vu $$0) {
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

   private ezi d() {
      return this.c.m.aq().c();
   }

   private void b(String $$0) {
      if (aa.aW) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(ezi $$0) {
      this.b();
      this.d.say(vu.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      fdq $$1 = ezg.Q().aA();
      if (this.d.active()) {
         if ($$0 == ezi.a) {
            fdo.b($$1, fdo.a.a, vu.c("narrator.toast.disabled"), null);
         } else {
            fdo.b($$1, fdo.a.a, vu.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fdo.b($$1, fdo.a.a, vu.c("narrator.toast.disabled"), vu.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != ezi.a && this.d.active()) {
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
         throw new eyy.a("Narrator library is not active");
      }
   }

   public static class a extends fmu {
      public a(String $$0) {
         super($$0);
      }
   }
}
