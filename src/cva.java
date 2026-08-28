import java.util.List;

public class cva implements cto {
   private final ka<cxh> b;
   private final int c;
   private final int d;
   private final csw e;

   public cva(csw $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, ka.a($$1 * $$2, cxh.k));
   }

   private cva(csw $$0, int $$1, int $$2, ka<cxh> $$3) {
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
      for (cxh $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxh a(int $$0) {
      return $$0 >= this.b() ? cxh.k : this.b.get($$0);
   }

   @Override
   public cxh b(int $$0) {
      return bss.a(this.b, $$0);
   }

   @Override
   public cxh a(int $$0, int $$1) {
      cxh $$2 = bss.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cxh $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpr $$0) {
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
   public int ay_() {
      return this.c;
   }

   @Override
   public List<cxh> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cpw $$0) {
      for (cxh $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
