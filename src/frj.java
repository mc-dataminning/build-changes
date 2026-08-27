import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class frj {
   private static final int a = 1024;
   private final fra b;
   private final frg c;
   private final fqv d;
   @Nullable
   private frf e;

   public frj(fra $$0, frg $$1, fqv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static frj a(frg $$0, UserApiService $$1) {
      fqv $$2 = new fqv(1024);
      fra $$3 = fra.a($$0, $$1);
      return new frj($$3, $$0, $$2);
   }

   public void a(exo $$0, ffl $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         frf $$4 = this.e.b();
         $$0.a(
            new fee(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               vq.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               vq.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               vq.c("gui.abuseReport.draft.edit"),
               vq.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fra a() {
      return this.b;
   }

   public fqv b() {
      return this.d;
   }

   public boolean a(frg $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable frf $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
