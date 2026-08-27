import java.util.List;

public class cqx implements cpl {
   private final jg<ctq> b;
   private final int c;
   private final int d;
   private final cov e;

   public cqx(cov $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jg.a($$1 * $$2, ctq.i));
   }

   public cqx(cov $$0, int $$1, int $$2, jg<ctq> $$3) {
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
      for (ctq $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ctq a(int $$0) {
      return $$0 >= this.b() ? ctq.i : this.b.get($$0);
   }

   @Override
   public ctq b(int $$0) {
      return bpq.a(this.b, $$0);
   }

   @Override
   public ctq a(int $$0, int $$1) {
      ctq $$2 = bpq.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, ctq $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cly $$0) {
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
   public int f() {
      return this.c;
   }

   @Override
   public List<ctq> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cmc $$0) {
      for (ctq $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
