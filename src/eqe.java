import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class eqe {
   public static final tf a = te.a;
   private static final Logger b = LogUtils.getLogger();
   private final eqm c;
   private final Narrator d = Narrator.getNarrator();

   public eqe(eqm $$0) {
      this.c = $$0;
   }

   public void a(tf $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(tf $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(tf $$0) {
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

   private eqo d() {
      return this.c.m.an().c();
   }

   private void b(String $$0) {
      if (aa.aS) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(eqo $$0) {
      this.b();
      this.d.say(tf.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      euo $$1 = eqm.O().az();
      if (this.d.active()) {
         if ($$0 == eqo.a) {
            eum.b($$1, eum.a.b, tf.c("narrator.toast.disabled"), null);
         } else {
            eum.b($$1, eum.a.b, tf.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         eum.b($$1, eum.a.b, tf.c("narrator.toast.disabled"), tf.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != eqo.a && this.d.active()) {
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
         throw new eqe.a("Narrator library is not active");
      }
   }

   public static class a extends fdi {
      public a(String $$0) {
         super($$0);
      }
   }
}
