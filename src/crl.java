import java.util.List;

public class crl implements cpz {
   private final js<cud> b;
   private final int c;
   private final int d;
   private final cpi e;

   public crl(cpi $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, js.a($$1 * $$2, cud.l));
   }

   public crl(cpi $$0, int $$1, int $$2, js<cud> $$3) {
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
      for (cud $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cud a(int $$0) {
      return $$0 >= this.b() ? cud.l : this.b.get($$0);
   }

   @Override
   public cud b(int $$0) {
      return bqb.a(this.b, $$0);
   }

   @Override
   public cud a(int $$0, int $$1) {
      cud $$2 = bqb.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cud $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cml $$0) {
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
   public List<cud> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cmp $$0) {
      for (cud $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
