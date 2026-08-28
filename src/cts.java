import java.util.List;

public class cts implements csg {
   private final jz<cwb> b;
   private final int c;
   private final int d;
   private final cro e;

   public cts(cro $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jz.a($$1 * $$2, cwb.k));
   }

   private cts(cro $$0, int $$1, int $$2, jz<cwb> $$3) {
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
      for (cwb $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwb a(int $$0) {
      return $$0 >= this.b() ? cwb.k : this.b.get($$0);
   }

   @Override
   public cwb b(int $$0) {
      return brx.a(this.b, $$0);
   }

   @Override
   public cwb a(int $$0, int $$1) {
      cwb $$2 = brx.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cwb $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(com $$0) {
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
   public int az_() {
      return this.c;
   }

   @Override
   public List<cwb> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cos $$0) {
      for (cwb $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
