import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fop {
   public static final wy a = wx.a;
   private static final Logger b = LogUtils.getLogger();
   private final foz c;
   private final Narrator d = Narrator.getNarrator();

   public fop(foz $$0) {
      this.c = $$0;
   }

   public void a(wy $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.a($$1, false);
      }
   }

   public void b(wy $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.a($$1, false);
      }
   }

   public void c(wy $$0) {
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
      this.d.say($$0, $$1, this.c.n.a(awo.j) * this.c.n.a(awo.a));
   }

   private fpb d() {
      return this.c.n.av().c();
   }

   private void b(String $$0) {
      if (ab.aU) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(fpb $$0) {
      this.b();
      this.a(wy.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      fuu $$1 = foz.Q().aA();
      if (this.d.active()) {
         if ($$0 == fpb.a) {
            fus.b($$1, fus.a.a, wy.c("narrator.toast.disabled"), null);
         } else {
            fus.b($$1, fus.a.a, wy.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fus.b($$1, fus.a.a, wy.c("narrator.toast.disabled"), wy.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != fpb.a && this.d.active()) {
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
         throw new fop.a("Narrator library is not active");
      }
   }

   public static class a extends gee {
      public a(String $$0) {
         super($$0);
      }
   }
}
