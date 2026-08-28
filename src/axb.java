import java.util.ArrayList;
import java.util.List;

public class axb {
   private final List<axc> a = new ArrayList<>();

   public static axb a() {
      return new axb();
   }

   public List<axc> b() {
      return List.copyOf(this.a);
   }

   public axb a(axc $$0) {
      this.a.add($$0);
      return this;
   }

   public axb a(aku $$0) {
      return this.a(axc.a($$0));
   }

   public axb b(aku $$0) {
      return this.a(axc.b($$0));
   }

   public axb c(aku $$0) {
      return this.a(axc.c($$0));
   }

   public axb d(aku $$0) {
      return this.a(axc.d($$0));
   }
}
