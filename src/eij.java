public class eij {
   private final eim a;
   private final String b;
   private final eip c;
   private tm d;
   private tm e;
   private eip.a f;

   public eij(eim $$0, String $$1, eip $$2, tm $$3, eip.a $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.g();
      this.f = $$4;
   }

   public eim a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public eip c() {
      return this.c;
   }

   public tm d() {
      return this.d;
   }

   private tm g() {
      return to.a((tm)this.d.e().a($$0 -> $$0.a(new tr(tr.a.a, tm.b(this.b)))));
   }

   public tm e() {
      return this.e;
   }

   public void a(tm $$0) {
      this.d = $$0;
      this.e = this.g();
      this.a.b(this);
   }

   public eip.a f() {
      return this.f;
   }

   public void a(eip.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }
}
