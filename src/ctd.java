import java.util.List;

public class ctd implements crr {
   private final jx<cvs> b;
   private final int c;
   private final int d;
   private final cqz e;

   public ctd(cqz $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jx.a($$1 * $$2, cvs.k));
   }

   private ctd(cqz $$0, int $$1, int $$2, jx<cvs> $$3) {
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
      for (cvs $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvs a(int $$0) {
      return $$0 >= this.b() ? cvs.k : this.b.get($$0);
   }

   @Override
   public cvs b(int $$0) {
      return brm.a(this.b, $$0);
   }

   @Override
   public cvs a(int $$0, int $$1) {
      cvs $$2 = brm.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cvs $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnx $$0) {
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
   public List<cvs> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(coc $$0) {
      for (cvs $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
