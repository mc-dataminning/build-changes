import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fdt {
   public static final wx a = ww.a;
   private static final Logger b = LogUtils.getLogger();
   private final feb c;
   private final Narrator d = Narrator.getNarrator();

   public fdt(feb $$0) {
      this.c = $$0;
   }

   public void a(wx $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(wx $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(wx $$0) {
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

   private fed d() {
      return this.c.m.as().c();
   }

   private void b(String $$0) {
      if (aa.aX) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(fed $$0) {
      this.b();
      this.d.say(wx.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      fik $$1 = feb.Q().ax();
      if (this.d.active()) {
         if ($$0 == fed.a) {
            fii.b($$1, fii.a.a, wx.c("narrator.toast.disabled"), null);
         } else {
            fii.b($$1, fii.a.a, wx.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fii.b($$1, fii.a.a, wx.c("narrator.toast.disabled"), wx.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != fed.a && this.d.active()) {
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
         throw new fdt.a("Narrator library is not active");
      }
   }

   public static class a extends frn {
      public a(String $$0) {
         super($$0);
      }
   }
}
