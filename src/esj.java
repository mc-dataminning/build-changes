import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class esj {
   public static final ur a = uq.a;
   private static final Logger b = LogUtils.getLogger();
   private final esr c;
   private final Narrator d = Narrator.getNarrator();

   public esj(esr $$0) {
      this.c = $$0;
   }

   public void a(ur $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(ur $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(ur $$0) {
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

   private est d() {
      return this.c.m.ap().c();
   }

   private void b(String $$0) {
      if (aa.aT) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(est $$0) {
      this.b();
      this.d.say(ur.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      ewv $$1 = esr.N().ax();
      if (this.d.active()) {
         if ($$0 == est.a) {
            ewt.b($$1, ewt.a.b, ur.c("narrator.toast.disabled"), null);
         } else {
            ewt.b($$1, ewt.a.b, ur.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         ewt.b($$1, ewt.a.b, ur.c("narrator.toast.disabled"), ur.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != est.a && this.d.active()) {
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
         throw new esj.a("Narrator library is not active");
      }
   }

   public static class a extends ffw {
      public a(String $$0) {
         super($$0);
      }
   }
}
