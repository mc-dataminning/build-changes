import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fon {
   private static final int a = 1024;
   private final foe b;
   private final fok c;
   private final fnz d;
   @Nullable
   private foj e;

   public fon(foe $$0, fok $$1, fnz $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fon a(fok $$0, UserApiService $$1) {
      fnz $$2 = new fnz(1024);
      foe $$3 = foe.a($$0, $$1);
      return new fon($$3, $$0, $$2);
   }

   public void a(eva $$0, fct $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         foj $$4 = this.e.b();
         $$0.a(
            new fbm(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               vd.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               vd.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               vd.c("gui.abuseReport.draft.edit"),
               vd.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public foe a() {
      return this.b;
   }

   public fnz b() {
      return this.d;
   }

   public boolean a(fok $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable foj $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
