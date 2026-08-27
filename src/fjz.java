import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fjz {
   private static final int a = 1024;
   private final fjq b;
   private final fjw c;
   private final fjl d;
   @Nullable
   private fjv e;

   public fjz(fjq $$0, fjw $$1, fjl $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fjz a(fjw $$0, UserApiService $$1) {
      fjl $$2 = new fjl(1024);
      fjq $$3 = fjq.a($$0, $$1);
      return new fjz($$3, $$0, $$2);
   }

   public void a(eqv $$0, eyk $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fjv $$4 = this.e.b();
         $$0.a(
            new exd(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               tm.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               tm.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               tm.c("gui.abuseReport.draft.edit"),
               tm.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fjq a() {
      return this.b;
   }

   public fjl b() {
      return this.d;
   }

   public boolean a(fjw $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fjv $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
