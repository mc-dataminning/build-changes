import java.util.Objects;
import javax.annotation.Nullable;

public class acb implements xf<za> {
   private final emn a;
   private final String b;

   public acb(emn $$0, @Nullable emo $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public acb(ui $$0) {
      this.a = $$0.a(emn.u);
      this.b = $$0.s();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(emn::a, this.a);
      $$0.a(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public emn a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
