import java.util.List;

public class cyg implements cwt {
   private final jp<dak> b;
   private final int c;
   private final int d;
   private final cwb e;

   public cyg(cwb $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jp.a($$1 * $$2, dak.l));
   }

   private cyg(cwb $$0, int $$1, int $$2, jp<dak> $$3) {
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
      for (dak $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dak a(int $$0) {
      return $$0 >= this.b() ? dak.l : this.b.get($$0);
   }

   @Override
   public dak b(int $$0) {
      return buw.a(this.b, $$0);
   }

   @Override
   public dak a(int $$0, int $$1) {
      dak $$2 = buw.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, dak $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(csi $$0) {
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
   public int aA_() {
      return this.c;
   }

   @Override
   public List<dak> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cso $$0) {
      for (dak $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
