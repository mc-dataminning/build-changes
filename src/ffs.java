import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ffs {
   private static final int a = 1024;
   private final ffm b;
   private final ffq c;
   private final ffh d;
   @Nullable
   private ffo.b e;

   public ffs(ffm $$0, ffq $$1, ffh $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ffs a(ffq $$0, UserApiService $$1) {
      ffh $$2 = new ffh(1024);
      ffm $$3 = ffm.a($$0, $$1);
      return new ffs($$3, $$0, $$2);
   }

   public void a(enn $$0, @Nullable euq $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ffo.b $$4 = this.e.a();
         $$0.a(
            new etk(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a(new eym($$1, this, $$4));
                  } else {
                     $$2.run();
                  }
               },
               sw.c($$3 ? "gui.chatReport.draft.quittotitle.title" : "gui.chatReport.draft.title"),
               sw.c($$3 ? "gui.chatReport.draft.quittotitle.content" : "gui.chatReport.draft.content"),
               sw.c("gui.chatReport.draft.edit"),
               sw.c("gui.chatReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public ffm a() {
      return this.b;
   }

   public ffh b() {
      return this.d;
   }

   public boolean a(ffq $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ffo.b $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
