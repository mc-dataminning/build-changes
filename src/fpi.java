import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fpi {
   private static final int a = 1024;
   private final foz b;
   private final fpf c;
   private final fou d;
   @Nullable
   private fpe e;

   public fpi(foz $$0, fpf $$1, fou $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fpi a(fpf $$0, UserApiService $$1) {
      fou $$2 = new fou(1024);
      foz $$3 = foz.a($$0, $$1);
      return new fpi($$3, $$0, $$2);
   }

   public void a(evr $$0, fdm $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fpe $$4 = this.e.b();
         $$0.a(
            new fcf(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               vg.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               vg.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               vg.c("gui.abuseReport.draft.edit"),
               vg.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public foz a() {
      return this.b;
   }

   public fou b() {
      return this.d;
   }

   public boolean a(fpf $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fpe $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
