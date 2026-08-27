import java.util.List;

public class cir implements chh {
   private final ip<clo> c;
   private final int d;
   private final int e;
   private final cgr f;

   public cir(cgr $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, ip.a($$1 * $$2, clo.b));
   }

   public cir(cgr $$0, int $$1, int $$2, ip<clo> $$3) {
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
   public boolean aj_() {
      for (clo $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clo a(int $$0) {
      return $$0 >= this.b() ? clo.b : this.c.get($$0);
   }

   @Override
   public clo b(int $$0) {
      return biv.a(this.c, $$0);
   }

   @Override
   public clo a(int $$0, int $$1) {
      clo $$2 = biv.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, clo $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdz $$0) {
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
   public List<clo> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(ced $$0) {
      for (clo $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
