import javax.annotation.Nullable;

public class aaq implements uo<zb> {
   private final int a;
   private final String b;
   private final boolean c;

   public aaq(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aaq(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.a(this.b);
      $$0.writeBoolean(this.c);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   @Nullable
   public cln a(cmm $$0) {
      bfj $$1 = $$0.a(this.a);
      return $$1 instanceof can ? ((can)$$1).A() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
