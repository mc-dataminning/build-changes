import java.util.List;

public class cvr implements cuf {
   private final kb<cxy> b;
   private final int c;
   private final int d;
   private final ctn e;

   public cvr(ctn $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, kb.a($$1 * $$2, cxy.k));
   }

   private cvr(ctn $$0, int $$1, int $$2, kb<cxy> $$3) {
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
      for (cxy $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxy a(int $$0) {
      return $$0 >= this.b() ? cxy.k : this.b.get($$0);
   }

   @Override
   public cxy b(int $$0) {
      return btk.a(this.b, $$0);
   }

   @Override
   public cxy a(int $$0, int $$1) {
      cxy $$2 = btk.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cxy $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqi $$0) {
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
   public int au_() {
      return this.c;
   }

   @Override
   public List<cxy> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cqn $$0) {
      for (cxy $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
