import java.util.List;

public class cgi implements cez {
   private final hp<cjf> c;
   private final int d;
   private final int e;
   private final cel f;

   public cgi(cel $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, hp.a($$1 * $$2, cjf.b));
   }

   public cgi(cel $$0, int $$1, int $$2, hp<cjf> $$3) {
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
   public boolean af_() {
      for (cjf $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjf a(int $$0) {
      return $$0 >= this.b() ? cjf.b : this.c.get($$0);
   }

   @Override
   public cjf b(int $$0) {
      return bgs.a(this.c, $$0);
   }

   @Override
   public cjf a(int $$0, int $$1) {
      cjf $$2 = bgs.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cjf $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbu $$0) {
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
   public List<cjf> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cby $$0) {
      for (cjf $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
