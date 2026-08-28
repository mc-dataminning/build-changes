import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccy extends cbk {
   private final cbk a;
   private final int b;
   private boolean c;

   public ccy(int $$0, cbk $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   public boolean a(ccy $$0) {
      return this.T_() && $$0.i() < this.i();
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
   public boolean T_() {
      return this.a.T_();
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
   public boolean U_() {
      return this.a.U_();
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
   public void a(EnumSet<cbk.a> $$0) {
      this.a.a($$0);
   }

   @Override
   public EnumSet<cbk.a> j() {
      return this.a.j();
   }

   public boolean h() {
      return this.c;
   }

   public int i() {
      return this.b;
   }

   public cbk k() {
      return this.a;
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? this.a.equals(((ccy)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }
}
