import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fjv {
   private static final int a = 1024;
   private final fjm b;
   private final fjs c;
   private final fjh d;
   @Nullable
   private fjr e;

   public fjv(fjm $$0, fjs $$1, fjh $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fjv a(fjs $$0, UserApiService $$1) {
      fjh $$2 = new fjh(1024);
      fjm $$3 = fjm.a($$0, $$1);
      return new fjv($$3, $$0, $$2);
   }

   public void a(eqp $$0, eye $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fjr $$4 = this.e.b();
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
               tl.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               tl.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               tl.c("gui.abuseReport.draft.edit"),
               tl.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fjm a() {
      return this.b;
   }

   public fjh b() {
      return this.d;
   }

   public boolean a(fjs $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fjr $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
