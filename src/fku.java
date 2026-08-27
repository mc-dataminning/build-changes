import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fku {
   private static final int a = 1024;
   private final fkl b;
   private final fkr c;
   private final fkg d;
   @Nullable
   private fkq e;

   public fku(fkl $$0, fkr $$1, fkg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fku a(fkr $$0, UserApiService $$1) {
      fkg $$2 = new fkg(1024);
      fkl $$3 = fkl.a($$0, $$1);
      return new fku($$3, $$0, $$2);
   }

   public void a(ero $$0, ezd $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fkq $$4 = this.e.b();
         $$0.a(
            new exx(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               ui.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               ui.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               ui.c("gui.abuseReport.draft.edit"),
               ui.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fkl a() {
      return this.b;
   }

   public fkg b() {
      return this.d;
   }

   public boolean a(fkr $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fkq $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
