import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fow {
   private static final int a = 1024;
   private final fom b;
   private final fot c;
   private final foh d;
   @Nullable
   private fos e;

   public fow(fom $$0, fot $$1, foh $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fow a(fot $$0, UserApiService $$1) {
      foh $$2 = new foh(1024);
      fom $$3 = fom.a($$0, $$1);
      return new fow($$3, $$0, $$2);
   }

   public void a(evi $$0, fdb $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fos $$4 = this.e.b();
         $$0.a(
            new fbu(
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

   public fom a() {
      return this.b;
   }

   public foh b() {
      return this.d;
   }

   public boolean a(fot $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fos $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
