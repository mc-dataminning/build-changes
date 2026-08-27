import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fti {
   private static final int a = 1024;
   private final fsz b;
   private final ftf c;
   private final fsu d;
   @Nullable
   private fte e;

   public fti(fsz $$0, ftf $$1, fsu $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fti a(ftf $$0, UserApiService $$1) {
      fsu $$2 = new fsu(1024);
      fsz $$3 = fsz.a($$0, $$1);
      return new fti($$3, $$0, $$2);
   }

   public void a(ezi $$0, fhh $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fte $$4 = this.e.b();
         $$0.a(
            new ffz(
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

   public fsz a() {
      return this.b;
   }

   public fsu b() {
      return this.d;
   }

   public boolean a(ftf $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fte $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
