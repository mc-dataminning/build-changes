import javax.annotation.Nullable;

public class acd implements xf<za> {
   private final int a;
   private final int b;

   public acd(blu $$0, @Nullable blu $$1) {
      this.a = $$0.aj();
      this.b = $$1 != null ? $$1.aj() : 0;
   }

   public acd(ui $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(ui $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
