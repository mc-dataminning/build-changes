import java.util.List;

public class cta implements cro {
   private final jw<cvp> b;
   private final int c;
   private final int d;
   private final cqw e;

   public cta(cqw $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jw.a($$1 * $$2, cvp.k));
   }

   private cta(cqw $$0, int $$1, int $$2, jw<cvp> $$3) {
      this.b = $$3;
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public int b() {
      return this.b.size();
   }

   @Override
   public boolean c() {
      for (cvp $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvp a(int $$0) {
      return $$0 >= this.b() ? cvp.k : this.b.get($$0);
   }

   @Override
   public cvp b(int $$0) {
      return brj.a(this.b, $$0);
   }

   @Override
   public cvp a(int $$0, int $$1) {
      cvp $$2 = brj.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cvp $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public int g() {
      return this.d;
   }

   @Override
   public int az_() {
      return this.c;
   }

   @Override
   public List<cvp> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cnz $$0) {
      for (cvp $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
