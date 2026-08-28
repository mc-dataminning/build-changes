import java.util.List;

public class cwo implements cvc {
   private final jn<cys> b;
   private final int c;
   private final int d;
   private final cuk e;

   public cwo(cuk $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jn.a($$1 * $$2, cys.k));
   }

   private cwo(cuk $$0, int $$1, int $$2, jn<cys> $$3) {
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
      for (cys $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cys a(int $$0) {
      return $$0 >= this.b() ? cys.k : this.b.get($$0);
   }

   @Override
   public cys b(int $$0) {
      return bts.a(this.b, $$0);
   }

   @Override
   public cys a(int $$0, int $$1) {
      cys $$2 = bts.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cys $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqs $$0) {
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
   public int au_() {
      return this.c;
   }

   @Override
   public List<cys> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cqx $$0) {
      for (cys $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
