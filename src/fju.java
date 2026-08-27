import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fju {
   private static final int a = 1024;
   private final fjl b;
   private final fjr c;
   private final fjg d;
   @Nullable
   private fjq e;

   public fju(fjl $$0, fjr $$1, fjg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fju a(fjr $$0, UserApiService $$1) {
      fjg $$2 = new fjg(1024);
      fjl $$3 = fjl.a($$0, $$1);
      return new fju($$3, $$0, $$2);
   }

   public void a(eqq $$0, eyf $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fjq $$4 = this.e.b();
         $$0.a(
            new ewy(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               ti.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               ti.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               ti.c("gui.abuseReport.draft.edit"),
               ti.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fjl a() {
      return this.b;
   }

   public fjg b() {
      return this.d;
   }

   public boolean a(fjr $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fjq $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
