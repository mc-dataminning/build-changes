import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class frb {
   private static final int a = 1024;
   private final fqs b;
   private final fqy c;
   private final fqn d;
   @Nullable
   private fqx e;

   public frb(fqs $$0, fqy $$1, fqn $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static frb a(fqy $$0, UserApiService $$1) {
      fqn $$2 = new fqn(1024);
      fqs $$3 = fqs.a($$0, $$1);
      return new frb($$3, $$0, $$2);
   }

   public void a(exh $$0, ffe $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fqx $$4 = this.e.b();
         $$0.a(
            new fdx(
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

   public fqs a() {
      return this.b;
   }

   public fqn b() {
      return this.d;
   }

   public boolean a(fqy $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fqx $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
