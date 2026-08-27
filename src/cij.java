import javax.annotation.Nullable;

public class cij {
   @Nullable
   private final byo a;
   private final bdw b;
   private final eee c;
   private final cmm d;
   private final cfz e;

   public cij(byo $$0, bdw $$1, eee $$2) {
      this($$0.dI(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cij(cmm $$0, @Nullable byo $$1, bdw $$2, cfz $$3, eee $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eee j() {
      return this.c;
   }

   public gu a() {
      return this.c.a();
   }

   public ha k() {
      return this.c.b();
   }

   public eei l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cfz n() {
      return this.e;
   }

   @Nullable
   public byo o() {
      return this.a;
   }

   public bdw p() {
      return this.b;
   }

   public cmm q() {
      return this.d;
   }

   public ha g() {
      return this.a == null ? ha.c : this.a.cB();
   }

   public boolean h() {
      return this.a != null && this.a.fD();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dy();
   }
}
