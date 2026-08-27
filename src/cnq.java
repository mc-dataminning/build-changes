import java.util.List;

public class cnq implements cmg {
   private final iu<cqm> c;
   private final int d;
   private final int e;
   private final clq f;

   public cnq(clq $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, iu.a($$1 * $$2, cqm.h));
   }

   public cnq(clq $$0, int $$1, int $$2, iu<cqm> $$3) {
      this.c = $$3;
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean ai_() {
      for (cqm $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqm a(int $$0) {
      return $$0 >= this.b() ? cqm.h : this.c.get($$0);
   }

   @Override
   public cqm b(int $$0) {
      return bmx.a(this.c, $$0);
   }

   @Override
   public cqm a(int $$0, int $$1) {
      cqm $$2 = bmx.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cqm $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ciu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public int g() {
      return this.e;
   }

   @Override
   public int f() {
      return this.d;
   }

   @Override
   public List<cqm> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(ciy $$0) {
      for (cqm $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
