import java.util.List;

public class cru implements cqi {
   private final jr<cun> b;
   private final int c;
   private final int d;
   private final cps e;

   public cru(cps $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jr.a($$1 * $$2, cun.l));
   }

   public cru(cps $$0, int $$1, int $$2, jr<cun> $$3) {
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
      for (cun $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cun a(int $$0) {
      return $$0 >= this.b() ? cun.l : this.b.get($$0);
   }

   @Override
   public cun b(int $$0) {
      return bqm.a(this.b, $$0);
   }

   @Override
   public cun a(int $$0, int $$1) {
      cun $$2 = bqm.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cun $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmv $$0) {
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
   public List<cun> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cmz $$0) {
      for (cun $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
