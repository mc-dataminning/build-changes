import java.util.List;

public class cdc implements cbt {
   private final hn<cfz> c;
   private final int d;
   private final int e;
   private final cbf f;

   public cdc(cbf $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, hn.a($$1 * $$2, cfz.b));
   }

   public cdc(cbf $$0, int $$1, int $$2, hn<cfz> $$3) {
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
      for (cfz $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cfz a(int $$0) {
      return $$0 >= this.b() ? cfz.b : this.c.get($$0);
   }

   @Override
   public cfz b(int $$0) {
      return bdr.a(this.c, $$0);
   }

   @Override
   public cfz a(int $$0, int $$1) {
      cfz $$2 = bdr.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cfz $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(byo $$0) {
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
   public List<cfz> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(bys $$0) {
      for (cfz $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
