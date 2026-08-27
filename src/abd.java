import java.util.List;
import java.util.UUID;

public record abd(List<UUID> a) implements xf<za> {
   public abd(ui $$0) {
      this($$0.a(ui::p));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, ui::a);
   }

   public void a(za $$0) {
      $$0.a(this);
   }
}
