public class ack implements zs<ach> {
   public static final zj<wi, ack> a = zs.a(ack::a, ack::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public ack(bui $$0, int $$1) {
      this.g = $$0.as();
      this.h = $$1;
   }

   private ack(wi $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(wi $$0) {
      $$0.c(this.g);
      $$0.l(this.h);
   }

   @Override
   public zu<ack> a() {
      return agw.e;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
