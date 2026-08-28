import javax.annotation.Nullable;

public class dcn {
   @Nullable
   private final cqs a;
   private final btx b;
   private final fds c;
   private final dip d;
   private final cys e;

   public dcn(cqs $$0, btx $$1, fds $$2) {
      this($$0.dV(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected dcn(dip $$0, @Nullable cqs $$1, btx $$2, cys $$3, fds $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fds j() {
      return this.c;
   }

   public iu a() {
      return this.c.b();
   }

   public ja k() {
      return this.c.c();
   }

   public fdw l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cys n() {
      return this.e;
   }

   @Nullable
   public cqs o() {
      return this.a;
   }

   public btx p() {
      return this.b;
   }

   public dip q() {
      return this.d;
   }

   public ja g() {
      return this.a == null ? ja.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fX();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dL();
   }
}
