import java.util.List;

public class ctw implements csk {
   private final jz<cwf> b;
   private final int c;
   private final int d;
   private final crs e;

   public ctw(crs $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jz.a($$1 * $$2, cwf.k));
   }

   private ctw(crs $$0, int $$1, int $$2, jz<cwf> $$3) {
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
      for (cwf $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwf a(int $$0) {
      return $$0 >= this.b() ? cwf.k : this.b.get($$0);
   }

   @Override
   public cwf b(int $$0) {
      return bsb.a(this.b, $$0);
   }

   @Override
   public cwf a(int $$0, int $$1) {
      cwf $$2 = bsb.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cwf $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cor $$0) {
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
   public List<cwf> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cow $$0) {
      for (cwf $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
