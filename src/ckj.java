import java.util.List;

public class ckj implements ciz {
   private final iq<cng> c;
   private final int d;
   private final int e;
   private final cij f;

   public ckj(cij $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, iq.a($$1 * $$2, cng.f));
   }

   public ckj(cij $$0, int $$1, int $$2, iq<cng> $$3) {
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
      for (cng $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cng a(int $$0) {
      return $$0 >= this.b() ? cng.f : this.c.get($$0);
   }

   @Override
   public cng b(int $$0) {
      return bjw.a(this.c, $$0);
   }

   @Override
   public cng a(int $$0, int $$1) {
      cng $$2 = bjw.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cng $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfq $$0) {
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
   public List<cng> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cfu $$0) {
      for (cng $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
