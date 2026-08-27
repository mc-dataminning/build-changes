import javax.annotation.Nullable;

public class ahb implements yp<afn> {
   public static final yg<vi, ahb> a = yp.a(ahb::a, ahb::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahb(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahb(vi $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yr<ahb> a() {
      return afl.bT;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   @Nullable
   public cyh a(czg $$0) {
      bqa $$1 = $$0.a(this.b);
      return $$1 instanceof cmd ? ((cmd)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
