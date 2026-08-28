import java.util.List;

public class cuf implements cst {
   private final ka<cwo> b;
   private final int c;
   private final int d;
   private final csb e;

   public cuf(csb $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, ka.a($$1 * $$2, cwo.j));
   }

   private cuf(csb $$0, int $$1, int $$2, ka<cwo> $$3) {
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
      for (cwo $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwo a(int $$0) {
      return $$0 >= this.b() ? cwo.j : this.b.get($$0);
   }

   @Override
   public cwo b(int $$0) {
      return bsd.a(this.b, $$0);
   }

   @Override
   public cwo a(int $$0, int $$1) {
      cwo $$2 = bsd.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cwo $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cow $$0) {
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
   public List<cwo> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cpb $$0) {
      for (cwo $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
