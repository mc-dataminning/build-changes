import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fou {
   private static final int a = 1024;
   private final fok b;
   private final foq c;
   private final fof d;
   @Nullable
   private fop e;

   public fou(fok $$0, foq $$1, fof $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fou a(foq $$0, UserApiService $$1) {
      fof $$2 = new fof(1024);
      fok $$3 = fok.a($$0, $$1);
      return new fou($$3, $$0, $$2);
   }

   public void a(evg $$0, fcz $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fop $$4 = this.e.b();
         $$0.a(
            new fbs(
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

   public fok a() {
      return this.b;
   }

   public fof b() {
      return this.d;
   }

   public boolean a(foq $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fop $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
