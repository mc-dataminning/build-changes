import java.util.UUID;
import javax.annotation.Nullable;

public class adt implements wb<aca> {
   private final UUID a;

   public adt(UUID $$0) {
      this.a = $$0;
   }

   public adt(tl $$0) {
      this.a = $$0.p();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   @Nullable
   public bjt a(alq $$0) {
      return $$0.a(this.a);
   }
}
