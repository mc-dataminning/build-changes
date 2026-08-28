import java.util.List;

public class cue implements css {
   private final ka<cwn> b;
   private final int c;
   private final int d;
   private final csa e;

   public cue(csa $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, ka.a($$1 * $$2, cwn.j));
   }

   private cue(csa $$0, int $$1, int $$2, ka<cwn> $$3) {
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
      for (cwn $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwn a(int $$0) {
      return $$0 >= this.b() ? cwn.j : this.b.get($$0);
   }

   @Override
   public cwn b(int $$0) {
      return bsc.a(this.b, $$0);
   }

   @Override
   public cwn a(int $$0, int $$1) {
      cwn $$2 = bsc.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cwn $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cov $$0) {
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
   public List<cwn> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cpa $$0) {
      for (cwn $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
