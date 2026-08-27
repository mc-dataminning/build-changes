import javax.annotation.Nullable;

public class cny {
   @Nullable
   private final cdz a;
   private final bja b;
   private final ejv c;
   private final csf d;
   private final clo e;

   public cny(cdz $$0, bja $$1, ejv $$2) {
      this($$0.dN(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cny(csf $$0, @Nullable cdz $$1, bja $$2, clo $$3, ejv $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ejv j() {
      return this.c;
   }

   public hx a() {
      return this.c.a();
   }

   public ib k() {
      return this.c.b();
   }

   public ejz l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public clo n() {
      return this.e;
   }

   @Nullable
   public cdz o() {
      return this.a;
   }

   public bja p() {
      return this.b;
   }

   public csf q() {
      return this.d;
   }

   public ib g() {
      return this.a == null ? ib.c : this.a.cE();
   }

   public boolean h() {
      return this.a != null && this.a.fJ();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dD();
   }
}
