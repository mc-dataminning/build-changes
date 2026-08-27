import java.util.ArrayList;
import java.util.List;

public class aum {
   private final List<aun> a = new ArrayList<>();

   public static aum a() {
      return new aum();
   }

   public List<aun> b() {
      return List.copyOf(this.a);
   }

   public aum a(aun $$0) {
      this.a.add($$0);
      return this;
   }

   public aum a(aiy $$0) {
      return this.a(aun.a($$0));
   }

   public aum b(aiy $$0) {
      return this.a(aun.b($$0));
   }

   public aum c(aiy $$0) {
      return this.a(aun.c($$0));
   }

   public aum d(aiy $$0) {
      return this.a(aun.d($$0));
   }
}
