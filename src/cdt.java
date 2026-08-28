import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdt extends ccf {
   private final ccf a;
   private final int b;
   private boolean c;

   public cdt(int $$0, ccf $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   public boolean a(cdt $$0) {
      return this.S_() && $$0.i() < this.i();
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
   public boolean S_() {
      return this.a.S_();
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
   public boolean T_() {
      return this.a.T_();
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
   public void a(EnumSet<ccf.a> $$0) {
      this.a.a($$0);
   }

   @Override
   public EnumSet<ccf.a> j() {
      return this.a.j();
   }

   public boolean h() {
      return this.c;
   }

   public int i() {
      return this.b;
   }

   public ccf k() {
      return this.a;
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? this.a.equals(((cdt)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }
}
