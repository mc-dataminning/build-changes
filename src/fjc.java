import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fjc {
   private static final int a = 1024;
   private final fiw b;
   private final fja c;
   private final fir d;
   @Nullable
   private fiy.b e;

   public fjc(fiw $$0, fja $$1, fir $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fjc a(fja $$0, UserApiService $$1) {
      fir $$2 = new fir(1024);
      fiw $$3 = fiw.a($$0, $$1);
      return new fjc($$3, $$0, $$2);
   }

   public void a(eqn $$0, @Nullable exv $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fiy.b $$4 = this.e.a();
         $$0.a(
            new ewo(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a(new fbr($$1, this, $$4));
                  } else {
                     $$2.run();
                  }
               },
               te.c($$3 ? "gui.chatReport.draft.quittotitle.title" : "gui.chatReport.draft.title"),
               te.c($$3 ? "gui.chatReport.draft.quittotitle.content" : "gui.chatReport.draft.content"),
               te.c("gui.chatReport.draft.edit"),
               te.c("gui.chatReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fiw a() {
      return this.b;
   }

   public fir b() {
      return this.d;
   }

   public boolean a(fja $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fiy.b $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
