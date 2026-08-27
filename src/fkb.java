import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fkb {
   private static final int a = 1024;
   private final fjs b;
   private final fjy c;
   private final fjn d;
   @Nullable
   private fjx e;

   public fkb(fjs $$0, fjy $$1, fjn $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fkb a(fjy $$0, UserApiService $$1) {
      fjn $$2 = new fjn(1024);
      fjs $$3 = fjs.a($$0, $$1);
      return new fkb($$3, $$0, $$2);
   }

   public void a(eqx $$0, eym $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fjx $$4 = this.e.b();
         $$0.a(
            new exf(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               tn.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               tn.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               tn.c("gui.abuseReport.draft.edit"),
               tn.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fjs a() {
      return this.b;
   }

   public fjn b() {
      return this.d;
   }

   public boolean a(fjy $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fjx $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
