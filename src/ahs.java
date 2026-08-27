import javax.annotation.Nullable;

public class ahs implements ze<agd> {
   public static final yv<vx, ahs> a = ze.a(ahs::a, ahs::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahs(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahs(vx $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zg<ahs> a() {
      return agb.bU;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   @Nullable
   public czy a(dax $$0) {
      bru $$1 = $$0.a(this.b);
      return $$1 instanceof cnz ? ((cnz)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
