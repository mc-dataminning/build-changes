import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjg {
   private final Consumer<fhb> a;
   private final Consumer<fhb> b;
   @Nullable
   private fjf c;
   @Nullable
   private flj d;

   public fjg(Consumer<fhb> $$0, Consumer<fhb> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(flj $$0) {
      this.d = $$0;
      fjf $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fjf $$0, boolean $$1) {
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
            ffe.Q().aj().a(gsh.a(avz.Ao, 1.0F));
         }
      }
   }

   @Nullable
   public fjf a() {
      return this.c;
   }
}
