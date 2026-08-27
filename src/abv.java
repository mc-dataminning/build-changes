public class abv implements wu<yo> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final vb e;
   private final emd.a f;
   private final int g;

   public abv(elx $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.f();
      this.g = $$1;
   }

   public abv(ue $$0) {
      this.d = $$0.s();
      this.g = $$0.readByte();
      if (this.g != 0 && this.g != 2) {
         this.e = va.a;
         this.f = emd.a.a;
      } else {
         this.e = $$0.m();
         this.f = $$0.b(emd.a.class);
      }
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.d);
      $$0.k(this.g);
      if (this.g == 0 || this.g == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
      }
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public vb d() {
      return this.e;
   }

   public int e() {
      return this.g;
   }

   public emd.a f() {
      return this.f;
   }
}
