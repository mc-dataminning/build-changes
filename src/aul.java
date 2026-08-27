import java.util.ArrayList;
import java.util.List;

public class aul {
   private final List<aum> a = new ArrayList<>();

   public static aul a() {
      return new aul();
   }

   public List<aum> b() {
      return List.copyOf(this.a);
   }

   public aul a(aum $$0) {
      this.a.add($$0);
      return this;
   }

   public aul a(aiy $$0) {
      return this.a(aum.a($$0));
   }

   public aul b(aiy $$0) {
      return this.a(aum.b($$0));
   }

   public aul c(aiy $$0) {
      return this.a(aum.c($$0));
   }

   public aul d(aiy $$0) {
      return this.a(aum.d($$0));
   }
}
