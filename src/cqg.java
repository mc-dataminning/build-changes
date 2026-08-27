import java.util.List;

public class cqg implements cou {
   private final jf<csz> b;
   private final int c;
   private final int d;
   private final cod e;

   public cqg(cod $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jf.a($$1 * $$2, csz.i));
   }

   public cqg(cod $$0, int $$1, int $$2, jf<csz> $$3) {
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
      for (csz $$0 : this.b) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csz a(int $$0) {
      return $$0 >= this.b() ? csz.i : this.b.get($$0);
   }

   @Override
   public csz b(int $$0) {
      return bpg.a(this.b, $$0);
   }

   @Override
   public csz a(int $$0, int $$1) {
      csz $$2 = bpg.a(this.b, $$0, $$1);
      if (!$$2.d()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, csz $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(clh $$0) {
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
   public int f() {
      return this.c;
   }

   @Override
   public List<csz> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cll $$0) {
      for (csz $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
