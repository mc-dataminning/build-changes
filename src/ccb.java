import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccb extends can {
   private final can a;
   private final int b;
   private boolean c;

   public ccb(int $$0, can $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   public boolean a(ccb $$0) {
      return this.Q_() && $$0.i() < this.i();
   }

   @Override
   public boolean a() {
      return this.a.a();
   }

   @Override
   public boolean b() {
      return this.a.b();
   }

   @Override
   public boolean Q_() {
      return this.a.Q_();
   }

   @Override
   public void c() {
      if (!this.c) {
         this.c = true;
         this.a.c();
      }
   }

   @Override
   public void d() {
      if (this.c) {
         this.c = false;
         this.a.d();
      }
   }

   @Override
   public boolean R_() {
      return this.a.R_();
   }

   @Override
   protected int a(int $$0) {
      return this.a.a($$0);
   }

   @Override
   public void e() {
      this.a.e();
   }

   @Override
   public void a(EnumSet<can.a> $$0) {
      this.a.a($$0);
   }

   @Override
   public EnumSet<can.a> j() {
      return this.a.j();
   }

   public boolean h() {
      return this.c;
   }

   public int i() {
      return this.b;
   }

   public can k() {
      return this.a;
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? this.a.equals(((ccb)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }
}
