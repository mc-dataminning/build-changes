import java.util.List;

public class crk implements cpy {
   private final js<cuc> b;
   private final int c;
   private final int d;
   private final cph e;

   public crk(cph $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, js.a($$1 * $$2, cuc.l));
   }

   public crk(cph $$0, int $$1, int $$2, js<cuc> $$3) {
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
      for (cuc $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuc a(int $$0) {
      return $$0 >= this.b() ? cuc.l : this.b.get($$0);
   }

   @Override
   public cuc b(int $$0) {
      return bqa.a(this.b, $$0);
   }

   @Override
   public cuc a(int $$0, int $$1) {
      cuc $$2 = bqa.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cuc $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmk $$0) {
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
   public List<cuc> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cmo $$0) {
      for (cuc $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
