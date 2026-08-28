import java.util.EnumSet;
import javax.annotation.Nullable;

public class cge extends ceq {
   private final ceq a;
   private final int b;
   private boolean c;

   public cge(int $$0, ceq $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   public boolean a(cge $$0) {
      return this.U_() && $$0.i() < this.i();
   }

   @Override
   public boolean b() {
      return this.a.b();
   }

   @Override
   public boolean c() {
      return this.a.c();
   }

   @Override
   public boolean U_() {
      return this.a.U_();
   }

   @Override
   public void d() {
      if (!this.c) {
         this.c = true;
         this.a.d();
      }
   }

   @Override
   public void e() {
      if (this.c) {
         this.c = false;
         this.a.e();
      }
   }

   @Override
   public boolean V_() {
      return this.a.V_();
   }

   @Override
   protected int a(int $$0) {
      return this.a.a($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public void a(EnumSet<ceq.a> $$0) {
      this.a.a($$0);
   }

   @Override
   public EnumSet<ceq.a> j() {
      return this.a.j();
   }

   public boolean h() {
      return this.c;
   }

   public int i() {
      return this.b;
   }

   public ceq k() {
      return this.a;
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? this.a.equals(((cge)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }
}
