import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fjp {
   private static final int a = 1024;
   private final fjg b;
   private final fjm c;
   private final fjb d;
   @Nullable
   private fjl e;

   public fjp(fjg $$0, fjm $$1, fjb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fjp a(fjm $$0, UserApiService $$1) {
      fjb $$2 = new fjb(1024);
      fjg $$3 = fjg.a($$0, $$1);
      return new fjp($$3, $$0, $$2);
   }

   public void a(eql $$0, eya $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fjl $$4 = this.e.b();
         $$0.a(
            new ewt(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               tf.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               tf.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               tf.c("gui.abuseReport.draft.edit"),
               tf.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fjg a() {
      return this.b;
   }

   public fjb b() {
      return this.d;
   }

   public boolean a(fjm $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fjl $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
