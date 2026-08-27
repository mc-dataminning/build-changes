import javax.annotation.Nullable;

public class adn implements wb<aca> {
   private final int a;
   private final String b;
   private final boolean c;

   public adn(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public adn(tl $$0) {
      this.a = $$0.n();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   @Nullable
   public cqa a(cqz $$0) {
      bjt $$1 = $$0.a(this.a);
      return $$1 instanceof cew ? ((cew)$$1).B() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
