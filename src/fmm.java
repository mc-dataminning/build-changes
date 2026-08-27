import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fmm {
   private static final int a = 1024;
   private final fmd b;
   private final fmj c;
   private final fly d;
   @Nullable
   private fmi e;

   public fmm(fmd $$0, fmj $$1, fly $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fmm a(fmj $$0, UserApiService $$1) {
      fly $$2 = new fly(1024);
      fmd $$3 = fmd.a($$0, $$1);
      return new fmm($$3, $$0, $$2);
   }

   public void a(etd $$0, fau $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fmi $$4 = this.e.b();
         $$0.a(
            new ezn(
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

   public fmd a() {
      return this.b;
   }

   public fly b() {
      return this.d;
   }

   public boolean a(fmj $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fmi $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
