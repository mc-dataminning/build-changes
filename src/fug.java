import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fug {
   private final Consumer<fsa> a;
   private final Consumer<fsa> b;
   @Nullable
   private fuf c;
   @Nullable
   private fwj d;

   public fug(Consumer<fsa> $$0, Consumer<fsa> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fwj $$0) {
      this.d = $$0;
      fuf $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fuf $$0, boolean $$1) {
      if (!Objects.equals(this.c, $$0)) {
         if (this.c != null) {
            this.c.a(this.b);
         }

         this.c = $$0;
         $$0.a(this.a);
         if (this.d != null) {
            $$0.a(this.d);
         }

         if ($$1) {
            fos.Q().ak().a(hmh.a(awn.Bs, 1.0F));
         }
      }
   }

   @Nullable
   public fuf a() {
      return this.c;
   }
}
