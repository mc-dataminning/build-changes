import javax.annotation.Nullable;

public class aca implements xd<yx> {
   private final int a;
   private final int b;

   public aca(blp $$0, @Nullable blp $$1) {
      this.a = $$0.aj();
      this.b = $$1 != null ? $$1.aj() : 0;
   }

   public aca(ug $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(ug $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
