import java.util.List;

public class cxu implements cwi {
   private final jo<czy> b;
   private final int c;
   private final int d;
   private final cvq e;

   public cxu(cvq $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jo.a($$1 * $$2, czy.k));
   }

   private cxu(cvq $$0, int $$1, int $$2, jo<czy> $$3) {
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
      for (czy $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czy a(int $$0) {
      return $$0 >= this.b() ? czy.k : this.b.get($$0);
   }

   @Override
   public czy b(int $$0) {
      return bul.a(this.b, $$0);
   }

   @Override
   public czy a(int $$0, int $$1) {
      czy $$2 = bul.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, czy $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crx $$0) {
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
   public List<czy> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(csd $$0) {
      for (czy $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
