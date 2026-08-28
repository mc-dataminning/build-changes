public class ach implements zg<abu> {
   public static final yx<vw, ach> a = zg.a(ach::a, ach::new);
   private final bqo b;
   private final boolean c;

   public ach(bqo $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ach(vw $$0) {
      this.b = bqo.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zi<ach> a() {
      return agg.m;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bqo e() {
      return this.b;
   }
}
