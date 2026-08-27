import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fid {
   private final Consumer<ffy> a;
   private final Consumer<ffy> b;
   @Nullable
   private fic c;
   @Nullable
   private fkg d;

   public fid(Consumer<ffy> $$0, Consumer<ffy> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fkg $$0) {
      this.d = $$0;
      fic $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fic $$0, boolean $$1) {
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
            feb.Q().aj().a(gre.a(avi.Ao, 1.0F));
         }
      }
   }

   @Nullable
   public fic a() {
      return this.c;
   }
}
