import java.util.List;

public class cgb implements ces {
   private final hn<ciy> c;
   private final int d;
   private final int e;
   private final cee f;

   public cgb(cee $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, hn.a($$1 * $$2, ciy.b));
   }

   public cgb(cee $$0, int $$1, int $$2, hn<ciy> $$3) {
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
   public boolean ab_() {
      for (ciy $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ciy a(int $$0) {
      return $$0 >= this.b() ? ciy.b : this.c.get($$0);
   }

   @Override
   public ciy b(int $$0) {
      return bgk.a(this.c, $$0);
   }

   @Override
   public ciy a(int $$0, int $$1) {
      ciy $$2 = bgk.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, ciy $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbn $$0) {
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
   public List<ciy> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cbr $$0) {
      for (ciy $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
