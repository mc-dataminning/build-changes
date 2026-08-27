import java.util.List;

public class ckb implements cir {
   private final iq<cmy> c;
   private final int d;
   private final int e;
   private final cib f;

   public ckb(cib $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, iq.a($$1 * $$2, cmy.f));
   }

   public ckb(cib $$0, int $$1, int $$2, iq<cmy> $$3) {
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
      for (cmy $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmy a(int $$0) {
      return $$0 >= this.b() ? cmy.f : this.c.get($$0);
   }

   @Override
   public cmy b(int $$0) {
      return bjv.a(this.c, $$0);
   }

   @Override
   public cmy a(int $$0, int $$1) {
      cmy $$2 = bjv.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cmy $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfi $$0) {
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
   public List<cmy> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cfm $$0) {
      for (cmy $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
