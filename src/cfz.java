import java.util.List;

public class cfz implements ceq {
   private final ho<ciw> c;
   private final int d;
   private final int e;
   private final cec f;

   public cfz(cec $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, ho.a($$1 * $$2, ciw.b));
   }

   public cfz(cec $$0, int $$1, int $$2, ho<ciw> $$3) {
      this.c = $$3;
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean ab_() {
      for (ciw $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ciw a(int $$0) {
      return $$0 >= this.b() ? ciw.b : this.c.get($$0);
   }

   @Override
   public ciw b(int $$0) {
      return bgi.a(this.c, $$0);
   }

   @Override
   public ciw a(int $$0, int $$1) {
      ciw $$2 = bgi.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, ciw $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbl $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public int g() {
      return this.e;
   }

   @Override
   public int f() {
      return this.d;
   }

   @Override
   public List<ciw> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cbp $$0) {
      for (ciw $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
