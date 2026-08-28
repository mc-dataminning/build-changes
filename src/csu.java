import java.util.List;

public class csu implements cri {
   private final jw<cvl> b;
   private final int c;
   private final int d;
   private final cqq e;

   public csu(cqq $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jw.a($$1 * $$2, cvl.k));
   }

   private csu(cqq $$0, int $$1, int $$2, jw<cvl> $$3) {
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
      for (cvl $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvl a(int $$0) {
      return $$0 >= this.b() ? cvl.k : this.b.get($$0);
   }

   @Override
   public cvl b(int $$0) {
      return bre.a(this.b, $$0);
   }

   @Override
   public cvl a(int $$0, int $$1) {
      cvl $$2 = bre.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cvl $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnp $$0) {
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
   public int aB_() {
      return this.c;
   }

   @Override
   public List<cvl> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cnu $$0) {
      for (cvl $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
