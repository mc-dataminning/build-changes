import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class eqn {
   public static final tl a = tk.a;
   private static final Logger b = LogUtils.getLogger();
   private final eqv c;
   private final Narrator d = Narrator.getNarrator();

   public eqn(eqv $$0) {
      this.c = $$0;
   }

   public void a(tl $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void b(tl $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.d.say($$1, false);
      }
   }

   public void c(tl $$0) {
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

   private eqx d() {
      return this.c.m.ao().c();
   }

   private void b(String $$0) {
      if (aa.aT) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(eqx $$0) {
      this.b();
      this.d.say(tl.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      euy $$1 = eqv.O().ay();
      if (this.d.active()) {
         if ($$0 == eqx.a) {
            euw.b($$1, euw.a.b, tl.c("narrator.toast.disabled"), null);
         } else {
            euw.b($$1, euw.a.b, tl.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         euw.b($$1, euw.a.b, tl.c("narrator.toast.disabled"), tl.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != eqx.a && this.d.active()) {
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
         throw new eqn.a("Narrator library is not active");
      }
   }

   public static class a extends fdx {
      public a(String $$0) {
         super($$0);
      }
   }
}
