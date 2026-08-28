import java.util.List;

public class crh implements cpv {
   private final js<cua> b;
   private final int c;
   private final int d;
   private final cpe e;

   public crh(cpe $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, js.a($$1 * $$2, cua.l));
   }

   public crh(cpe $$0, int $$1, int $$2, js<cua> $$3) {
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
      for (cua $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cua a(int $$0) {
      return $$0 >= this.b() ? cua.l : this.b.get($$0);
   }

   @Override
   public cua b(int $$0) {
      return bpx.a(this.b, $$0);
   }

   @Override
   public cua a(int $$0, int $$1) {
      cua $$2 = bpx.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cua $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmh $$0) {
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
   public List<cua> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cml $$0) {
      for (cua $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
