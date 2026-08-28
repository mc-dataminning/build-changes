import java.util.List;

public class cxw implements cwk {
   private final jp<daa> b;
   private final int c;
   private final int d;
   private final cvs e;

   public cxw(cvs $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jp.a($$1 * $$2, daa.k));
   }

   private cxw(cvs $$0, int $$1, int $$2, jp<daa> $$3) {
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
      for (daa $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public daa a(int $$0) {
      return $$0 >= this.b() ? daa.k : this.b.get($$0);
   }

   @Override
   public daa b(int $$0) {
      return bun.a(this.b, $$0);
   }

   @Override
   public daa a(int $$0, int $$1) {
      daa $$2 = bun.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, daa $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crz $$0) {
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
   public List<daa> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(csf $$0) {
      for (daa $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
