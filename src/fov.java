import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fov {
   private static final int a = 1024;
   private final fol b;
   private final fos c;
   private final fog d;
   @Nullable
   private foq e;

   public fov(fol $$0, fos $$1, fog $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fov a(fos $$0, UserApiService $$1) {
      fog $$2 = new fog(1024);
      fol $$3 = fol.a($$0, $$1);
      return new fov($$3, $$0, $$2);
   }

   public void a(evh $$0, fda $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         foq $$4 = this.e.b();
         $$0.a(
            new fbt(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               vf.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               vf.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               vf.c("gui.abuseReport.draft.edit"),
               vf.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fol a() {
      return this.b;
   }

   public fog b() {
      return this.d;
   }

   public boolean a(fos $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable foq $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
