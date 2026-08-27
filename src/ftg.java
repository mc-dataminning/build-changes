import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ftg {
   private static final int a = 1024;
   private final fsx b;
   private final ftd c;
   private final fss d;
   @Nullable
   private ftc e;

   public ftg(fsx $$0, ftd $$1, fss $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ftg a(ftd $$0, UserApiService $$1) {
      fss $$2 = new fss(1024);
      fsx $$3 = fsx.a($$0, $$1);
      return new ftg($$3, $$0, $$2);
   }

   public void a(ezg $$0, fhf $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ftc $$4 = this.e.b();
         $$0.a(
            new ffx(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               vu.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               vu.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               vu.c("gui.abuseReport.draft.edit"),
               vu.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fsx a() {
      return this.b;
   }

   public fss b() {
      return this.d;
   }

   public boolean a(ftd $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ftc $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
