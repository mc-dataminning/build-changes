import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fmr {
   private static final int a = 1024;
   private final fmi b;
   private final fmo c;
   private final fmd d;
   @Nullable
   private fmn e;

   public fmr(fmi $$0, fmo $$1, fmd $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fmr a(fmo $$0, UserApiService $$1) {
      fmd $$2 = new fmd(1024);
      fmi $$3 = fmi.a($$0, $$1);
      return new fmr($$3, $$0, $$2);
   }

   public void a(eti $$0, faz $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fmn $$4 = this.e.b();
         $$0.a(
            new ezs(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               uv.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               uv.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               uv.c("gui.abuseReport.draft.edit"),
               uv.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fmi a() {
      return this.b;
   }

   public fmd b() {
      return this.d;
   }

   public boolean a(fmo $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fmn $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
