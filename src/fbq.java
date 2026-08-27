import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fbq {
   public static final wi a = wh.a;
   private static final Logger b = LogUtils.getLogger();
   private final fby c;
   private final Narrator d = Narrator.getNarrator();

   public fbq(fby $$0) {
      this.c = $$0;
   }

   public void a(wi $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(wi $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(wi $$0) {
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

   private fca d() {
      return this.c.m.as().c();
   }

   private void b(String $$0) {
      if (aa.aW) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(fca $$0) {
      this.b();
      this.d.say(wi.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      fgi $$1 = fby.Q().aA();
      if (this.d.active()) {
         if ($$0 == fca.a) {
            fgg.b($$1, fgg.a.a, wi.c("narrator.toast.disabled"), null);
         } else {
            fgg.b($$1, fgg.a.a, wi.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fgg.b($$1, fgg.a.a, wi.c("narrator.toast.disabled"), wi.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != fca.a && this.d.active()) {
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
         throw new fbq.a("Narrator library is not active");
      }
   }

   public static class a extends fpm {
      public a(String $$0) {
         super($$0);
      }
   }
}
