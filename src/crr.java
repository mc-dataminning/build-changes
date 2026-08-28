import java.util.List;

public class crr implements cqf {
   private final jr<cuk> b;
   private final int c;
   private final int d;
   private final cpp e;

   public crr(cpp $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jr.a($$1 * $$2, cuk.l));
   }

   public crr(cpp $$0, int $$1, int $$2, jr<cuk> $$3) {
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
      for (cuk $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuk a(int $$0) {
      return $$0 >= this.b() ? cuk.l : this.b.get($$0);
   }

   @Override
   public cuk b(int $$0) {
      return bqj.a(this.b, $$0);
   }

   @Override
   public cuk a(int $$0, int $$1) {
      cuk $$2 = bqj.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cuk $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cms $$0) {
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
   public List<cuk> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cmw $$0) {
      for (cuk $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
