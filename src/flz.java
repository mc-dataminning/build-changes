import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class flz {
   private static final int a = 1024;
   private final flq b;
   private final flw c;
   private final fll d;
   @Nullable
   private flv e;

   public flz(flq $$0, flw $$1, fll $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static flz a(flw $$0, UserApiService $$1) {
      fll $$2 = new fll(1024);
      flq $$3 = flq.a($$0, $$1);
      return new flz($$3, $$0, $$2);
   }

   public void a(esr $$0, fah $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         flv $$4 = this.e.b();
         $$0.a(
            new eza(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               ur.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               ur.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               ur.c("gui.abuseReport.draft.edit"),
               ur.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public flq a() {
      return this.b;
   }

   public fll b() {
      return this.d;
   }

   public boolean a(flw $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable flv $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
