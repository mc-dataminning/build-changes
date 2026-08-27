public class acy implements yp<aba> {
   public static final yg<vi, acy> a = yp.a(acy::a, acy::new);
   private final id b;
   private final boolean c;

   public acy(id $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acy(vi $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<acy> a() {
      return afl.X;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public id b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
