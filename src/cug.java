import java.util.List;

public class cug implements csu {
   private final ka<cwp> b;
   private final int c;
   private final int d;
   private final csc e;

   public cug(csc $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, ka.a($$1 * $$2, cwp.j));
   }

   private cug(csc $$0, int $$1, int $$2, ka<cwp> $$3) {
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
      for (cwp $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwp a(int $$0) {
      return $$0 >= this.b() ? cwp.j : this.b.get($$0);
   }

   @Override
   public cwp b(int $$0) {
      return bse.a(this.b, $$0);
   }

   @Override
   public cwp a(int $$0, int $$1) {
      cwp $$2 = bse.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cwp $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cox $$0) {
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
   public int ay_() {
      return this.c;
   }

   @Override
   public List<cwp> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cpc $$0) {
      for (cwp $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
