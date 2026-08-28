import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdm extends ccf {
   private final clk a;
   @Nullable
   private bvh b;

   public cdm(clk $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccf.a.a));
   }

   @Override
   public boolean b() {
      bvh $$0 = this.a.aa_();
      return this.a.v() > 0 || $$0 != null && this.a.g((bul)$$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.L().o();
      this.b = this.a.aa_();
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g((bul)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.N().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
