import javax.annotation.Nullable;

public class abj implements xf<za> {
   private final int a;
   private final blf b;

   public abj(int $$0, blf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public abj(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.a(kd.d);
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(kd.d, this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   @Nullable
   public blu a(cto $$0) {
      return $$0.a(this.a);
   }

   @Nullable
   public blf a() {
      return this.b;
   }
}
