import com.mojang.logging.LogUtils;
import com.mojang.text2speech.Narrator;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fmu {
   public static final wv a = wu.a;
   private static final Logger b = LogUtils.getLogger();
   private final fnd c;
   private final Narrator d = Narrator.getNarrator();

   public fmu(fnd $$0) {
      this.c = $$0;
   }

   public void a(wv $$0) {
      if (this.d().c()) {
         String $$1 = $$0.getString();
         this.b($$1);
         this.a($$1, false);
      }
   }

   public void b(wv $$0) {
      String $$1 = $$0.getString();
      if (this.d().d() && !$$1.isEmpty()) {
         this.b($$1);
         this.a($$1, false);
      }
   }

   public void c(wv $$0) {
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
      this.d.say($$0, $$1, this.c.n.a(awl.j) * this.c.n.a(awl.a));
   }

   private fnf d() {
      return this.c.n.av().c();
   }

   private void b(String $$0) {
      if (ab.aU) {
         b.debug("Narrating: {}", $$0.replaceAll("\n", "\\\\n"));
      }
   }

   public void a(fnf $$0) {
      this.b();
      this.a(wv.c("options.narrator").f(" : ").b($$0.b()).getString(), true);
      fsy $$1 = fnd.Q().aA();
      if (this.d.active()) {
         if ($$0 == fnf.a) {
            fsw.b($$1, fsw.a.a, wv.c("narrator.toast.disabled"), null);
         } else {
            fsw.b($$1, fsw.a.a, wv.c("narrator.toast.enabled"), $$0.b());
         }
      } else {
         fsw.b($$1, fsw.a.a, wv.c("narrator.toast.disabled"), wv.c("options.narrator.notavailable"));
      }
   }

   public boolean a() {
      return this.d.active();
   }

   public void b() {
      if (this.d() != fnf.a && this.d.active()) {
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
         throw new fmu.a("Narrator library is not active");
      }
   }

   public static class a extends gci {
      public a(String $$0) {
         super($$0);
      }
   }
}
