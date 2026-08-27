import java.util.List;

public class cie implements cgu {
   private final il<clb> c;
   private final int d;
   private final int e;
   private final cge f;

   public cie(cge $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, il.a($$1 * $$2, clb.b));
   }

   public cie(cge $$0, int $$1, int $$2, il<clb> $$3) {
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
      for (clb $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clb a(int $$0) {
      return $$0 >= this.b() ? clb.b : this.c.get($$0);
   }

   @Override
   public clb b(int $$0) {
      return bik.a(this.c, $$0);
   }

   @Override
   public clb a(int $$0, int $$1) {
      clb $$2 = bik.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, clb $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdm $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public int ay_() {
      return this.e;
   }

   @Override
   public int ax_() {
      return this.d;
   }

   @Override
   public List<clb> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cdq $$0) {
      for (clb $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
