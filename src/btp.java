import java.util.EnumSet;
import javax.annotation.Nullable;

public class btp extends bsb {
   private final bsb a;
   private final int b;
   private boolean c;

   public btp(int $$0, bsb $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   public boolean a(btp $$0) {
      return this.R_() && $$0.i() < this.i();
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
   public boolean R_() {
      return this.a.R_();
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
   public boolean S_() {
      return this.a.S_();
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
   public void a(EnumSet<bsb.a> $$0) {
      this.a.a($$0);
   }

   @Override
   public EnumSet<bsb.a> j() {
      return this.a.j();
   }

   public boolean h() {
      return this.c;
   }

   public int i() {
      return this.b;
   }

   public bsb k() {
      return this.a;
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? this.a.equals(((btp)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }
}
