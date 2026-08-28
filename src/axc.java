import java.util.ArrayList;
import java.util.List;

public class axc {
   private final List<axd> a = new ArrayList<>();

   public static axc a() {
      return new axc();
   }

   public List<axd> b() {
      return List.copyOf(this.a);
   }

   public axc a(axd $$0) {
      this.a.add($$0);
      return this;
   }

   public axc a(aku $$0) {
      return this.a(axd.a($$0));
   }

   public axc b(aku $$0) {
      return this.a(axd.b($$0));
   }

   public axc c(aku $$0) {
      return this.a(axd.c($$0));
   }

   public axc d(aku $$0) {
      return this.a(axd.d($$0));
   }
}
