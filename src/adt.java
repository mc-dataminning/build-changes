public class adt implements zf<abu> {
   public static final yw<vu, adt> a = zf.a(adt::a, adt::new);
   private final iu b;
   private final boolean c;

   public adt(iu $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private adt(vu $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<adt> a() {
      return agn.Y;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public iu b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
