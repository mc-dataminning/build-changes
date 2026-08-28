import java.util.ArrayList;
import java.util.List;

public class awr {
   private final List<aws> a = new ArrayList<>();

   public static awr a() {
      return new awr();
   }

   public List<aws> b() {
      return List.copyOf(this.a);
   }

   public awr a(aws $$0) {
      this.a.add($$0);
      return this;
   }

   public awr a(akr $$0) {
      return this.a(aws.a($$0));
   }

   public awr b(akr $$0) {
      return this.a(aws.b($$0));
   }

   public awr c(akr $$0) {
      return this.a(aws.c($$0));
   }

   public awr d(akr $$0) {
      return this.a(aws.d($$0));
   }
}
