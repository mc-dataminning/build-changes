import javax.annotation.Nullable;

public class abq implements wu<yo> {
   private final int a;
   private final int b;

   public abq(blf $$0, @Nullable blf $$1) {
      this.a = $$0.aj();
      this.b = $$1 != null ? $$1.aj() : 0;
   }

   public abq(ue $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(ue $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
