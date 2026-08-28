import javax.annotation.Nullable;

public class czo {
   @Nullable
   private final coh a;
   private final brx b;
   private final ezd c;
   private final dev d;
   private final cvx e;

   public czo(coh $$0, brx $$1, ezd $$2) {
      this($$0.dX(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected czo(dev $$0, @Nullable coh $$1, brx $$2, cvx $$3, ezd $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ezd j() {
      return this.c;
   }

   public jg a() {
      return this.c.b();
   }

   public jl k() {
      return this.c.c();
   }

   public ezh l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cvx n() {
      return this.e;
   }

   @Nullable
   public coh o() {
      return this.a;
   }

   public brx p() {
      return this.b;
   }

   public dev q() {
      return this.d;
   }

   public jl g() {
      return this.a == null ? jl.c : this.a.cP();
   }

   public boolean h() {
      return this.a != null && this.a.ga();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dN();
   }
}
