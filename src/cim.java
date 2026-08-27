import java.util.List;

public class cim implements chc {
   private final il<clj> c;
   private final int d;
   private final int e;
   private final cgm f;

   public cim(cgm $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, il.a($$1 * $$2, clj.b));
   }

   public cim(cgm $$0, int $$1, int $$2, il<clj> $$3) {
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
      for (clj $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clj a(int $$0) {
      return $$0 >= this.b() ? clj.b : this.c.get($$0);
   }

   @Override
   public clj b(int $$0) {
      return bir.a(this.c, $$0);
   }

   @Override
   public clj a(int $$0, int $$1) {
      clj $$2 = bir.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, clj $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public int az_() {
      return this.e;
   }

   @Override
   public int ay_() {
      return this.d;
   }

   @Override
   public List<clj> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cdy $$0) {
      for (clj $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
