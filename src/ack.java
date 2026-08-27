import javax.annotation.Nullable;

public class ack implements ux<aaw> {
   private final int a;
   private final String b;
   private final boolean c;

   public ack(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ack(si $$0) {
      this.a = $$0.m();
      this.b = $$0.r();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   @Nullable
   public com a(cpm $$0) {
      bii $$1 = $$0.a(this.a);
      return $$1 instanceof cdm ? ((cdm)$$1).A() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
