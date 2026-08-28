import java.util.List;

public class cwz implements cvn {
   private final jn<czd> b;
   private final int c;
   private final int d;
   private final cuv e;

   public cwz(cuv $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jn.a($$1 * $$2, czd.k));
   }

   private cwz(cuv $$0, int $$1, int $$2, jn<czd> $$3) {
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
      for (czd $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czd a(int $$0) {
      return $$0 >= this.b() ? czd.k : this.b.get($$0);
   }

   @Override
   public czd b(int $$0) {
      return btx.a(this.b, $$0);
   }

   @Override
   public czd a(int $$0, int $$1) {
      czd $$2 = btx.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, czd $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crc $$0) {
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
   public List<czd> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cri $$0) {
      for (czd $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
