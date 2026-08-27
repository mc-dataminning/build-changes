import javax.annotation.Nullable;

public class crz {
   @Nullable
   private final cia a;
   private final bmk b;
   private final eor c;
   private final cwe d;
   private final cpq e;

   public crz(cia $$0, bmk $$1, eor $$2) {
      this($$0.dJ(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected crz(cwe $$0, @Nullable cia $$1, bmk $$2, cpq $$3, eor $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eor j() {
      return this.c;
   }

   public ib a() {
      return this.c.a();
   }

   public ih k() {
      return this.c.b();
   }

   public eov l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cpq n() {
      return this.e;
   }

   @Nullable
   public cia o() {
      return this.a;
   }

   public bmk p() {
      return this.b;
   }

   public cwe q() {
      return this.d;
   }

   public ih g() {
      return this.a == null ? ih.c : this.a.cB();
   }

   public boolean h() {
      return this.a != null && this.a.fK();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dz();
   }
}
