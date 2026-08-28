import java.util.ArrayList;
import java.util.List;

public class axn {
   private final List<axo> a = new ArrayList<>();

   public static axn a() {
      return new axn();
   }

   public List<axo> b() {
      return List.copyOf(this.a);
   }

   public axn a(axo $$0) {
      this.a.add($$0);
      return this;
   }

   public axn a(ali $$0) {
      return this.a(axo.a($$0));
   }

   public axn b(ali $$0) {
      return this.a(axo.b($$0));
   }

   public axn c(ali $$0) {
      return this.a(axo.c($$0));
   }

   public axn d(ali $$0) {
      return this.a(axo.d($$0));
   }
}
