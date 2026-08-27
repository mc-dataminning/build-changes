import javax.annotation.Nullable;

public class aac implements xf<za> {
   private final int a;
   private final byte b;

   public aac(blu $$0, byte $$1) {
      this.a = $$0.aj();
      this.b = $$1;
   }

   public aac(ui $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(ui $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   @Nullable
   public blu a(cto $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
