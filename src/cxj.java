import java.util.List;

public class cxj implements cvx {
   private final jo<czn> b;
   private final int c;
   private final int d;
   private final cvf e;

   public cxj(cvf $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jo.a($$1 * $$2, czn.k));
   }

   private cxj(cvf $$0, int $$1, int $$2, jo<czn> $$3) {
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
      for (czn $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czn a(int $$0) {
      return $$0 >= this.b() ? czn.k : this.b.get($$0);
   }

   @Override
   public czn b(int $$0) {
      return bua.a(this.b, $$0);
   }

   @Override
   public czn a(int $$0, int $$1) {
      czn $$2 = bua.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, czn $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crm $$0) {
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
   public int av_() {
      return this.c;
   }

   @Override
   public List<czn> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(crs $$0) {
      for (czn $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
