import javax.annotation.Nullable;

public class cxp {
   @Nullable
   private final cml a;
   private final bqg b;
   private final ewd c;
   private final dcg d;
   private final cud e;

   public cxp(cml $$0, bqg $$1, ewd $$2) {
      this($$0.dR(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cxp(dcg $$0, @Nullable cml $$1, bqg $$2, cud $$3, ewd $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ewd j() {
      return this.c;
   }

   public ja a() {
      return this.c.a();
   }

   public jf k() {
      return this.c.b();
   }

   public ewh l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cud n() {
      return this.e;
   }

   @Nullable
   public cml o() {
      return this.a;
   }

   public bqg p() {
      return this.b;
   }

   public dcg q() {
      return this.d;
   }

   public jf g() {
      return this.a == null ? jf.c : this.a.cJ();
   }

   public boolean h() {
      return this.a != null && this.a.fP();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dH();
   }
}
