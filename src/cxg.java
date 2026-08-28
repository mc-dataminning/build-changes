import java.util.List;

public class cxg implements cvu {
   private final jo<czk> b;
   private final int c;
   private final int d;
   private final cvc e;

   public cxg(cvc $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jo.a($$1 * $$2, czk.k));
   }

   private cxg(cvc $$0, int $$1, int $$2, jo<czk> $$3) {
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
      for (czk $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czk a(int $$0) {
      return $$0 >= this.b() ? czk.k : this.b.get($$0);
   }

   @Override
   public czk b(int $$0) {
      return bua.a(this.b, $$0);
   }

   @Override
   public czk a(int $$0, int $$1) {
      czk $$2 = bua.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, czk $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crj $$0) {
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
   public int av_() {
      return this.c;
   }

   @Override
   public List<czk> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(crp $$0) {
      for (czk $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
