import java.util.List;

public class cga implements cer {
   private final hn<cix> c;
   private final int d;
   private final int e;
   private final ced f;

   public cga(ced $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, hn.a($$1 * $$2, cix.b));
   }

   public cga(ced $$0, int $$1, int $$2, hn<cix> $$3) {
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
   public boolean aa_() {
      for (cix $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cix a(int $$0) {
      return $$0 >= this.b() ? cix.b : this.c.get($$0);
   }

   @Override
   public cix b(int $$0) {
      return bgk.a(this.c, $$0);
   }

   @Override
   public cix a(int $$0, int $$1) {
      cix $$2 = bgk.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cix $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbm $$0) {
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
   public List<cix> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cbq $$0) {
      for (cix $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
