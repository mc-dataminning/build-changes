import java.util.EnumSet;
import javax.annotation.Nullable;

public class cek extends cdd {
   private final cmi a;
   @Nullable
   private bwf b;

   public cek(cmi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdd.a.a));
   }

   @Override
   public boolean b() {
      bwf $$0 = this.a.O_();
      return this.a.t() > 0 || $$0 != null && this.a.g((bvj)$$0) < 9.0;
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
      } else if (this.a.g((bvj)this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.N().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
