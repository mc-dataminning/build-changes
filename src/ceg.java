import java.util.EnumSet;
import javax.annotation.Nullable;

public class ceg extends ccz {
   private final cme a;
   @Nullable
   private bwb b;

   public ceg(cme $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccz.a.a));
   }

   @Override
   public boolean b() {
      bwb $$0 = this.a.O_();
      return this.a.t() > 0 || $$0 != null && this.a.g((bvf)$$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.L().o();
      this.b = this.a.O_();
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g((bvf)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.N().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
