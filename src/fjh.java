import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fjh {
   private static final int a = 1024;
   private final fjb b;
   private final fjf c;
   private final fiw d;
   @Nullable
   private fjd.b e;

   public fjh(fjb $$0, fjf $$1, fiw $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fjh a(fjf $$0, UserApiService $$1) {
      fiw $$2 = new fiw(1024);
      fjb $$3 = fjb.a($$0, $$1);
      return new fjh($$3, $$0, $$2);
   }

   public void a(eqm $$0, @Nullable exz $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fjd.b $$4 = this.e.a();
         $$0.a(
            new ews(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a(new fbv($$1, this, $$4));
                  } else {
                     $$2.run();
                  }
               },
               tf.c($$3 ? "gui.chatReport.draft.quittotitle.title" : "gui.chatReport.draft.title"),
               tf.c($$3 ? "gui.chatReport.draft.quittotitle.content" : "gui.chatReport.draft.content"),
               tf.c("gui.chatReport.draft.edit"),
               tf.c("gui.chatReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fjb a() {
      return this.b;
   }

   public fiw b() {
      return this.d;
   }

   public boolean a(fjf $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fjd.b $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
