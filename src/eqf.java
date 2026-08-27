import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class eqf {
   public static final te a = td.a;
   private static final Logger b = LogUtils.getLogger();
   private final eqn c;
   private final Narrator d = Narrator.getNarrator();

   public eqf(eqn $$0) {
      this.c = $$0;
   }

   public void a(te $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(te $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(te $$0) {
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

   private eqp d() {
      return this.c.m.an().c();
   }

   private void b(String $$0) {
      if (aa.aS) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(eqp $$0) {
      this.b();
      this.d.say(te.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      euk $$1 = eqn.N().ay();
      if (this.d.active()) {
         if ($$0 == eqp.a) {
            eui.b($$1, eui.a.b, te.c("narrator.toast.disabled"), null);
         } else {
            eui.b($$1, eui.a.b, te.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         eui.b($$1, eui.a.b, te.c("narrator.toast.disabled"), te.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != eqp.a && this.d.active()) {
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
         throw new eqf.a("Narrator library is not active");
      }
   }

   public static class a extends fde {
      public a(String $$0) {
         super($$0);
      }
   }
}
