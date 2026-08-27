import java.util.List;

public class cpk implements cnx {
   private final je<csd> c;
   private final int d;
   private final int e;
   private final cnh f;

   public cpk(cnh $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, je.a($$1 * $$2, csd.i));
   }

   public cpk(cnh $$0, int $$1, int $$2, je<csd> $$3) {
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
   public boolean c() {
      for (csd $$0 : this.c) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csd a(int $$0) {
      return $$0 >= this.b() ? csd.i : this.c.get($$0);
   }

   @Override
   public csd b(int $$0) {
      return bok.a(this.c, $$0);
   }

   @Override
   public csd a(int $$0, int $$1) {
      csd $$2 = bok.a(this.c, $$0, $$1);
      if (!$$2.d()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, csd $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ckl $$0) {
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
   public List<csd> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(ckp $$0) {
      for (csd $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
