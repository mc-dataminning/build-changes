import java.util.List;

public class coq implements cnf {
   private final iu<crj> c;
   private final int d;
   private final int e;
   private final cmp f;

   public coq(cmp $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, iu.a($$1 * $$2, crj.i));
   }

   public coq(cmp $$0, int $$1, int $$2, iu<crj> $$3) {
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
   public boolean ah_() {
      for (crj $$0 : this.c) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crj a(int $$0) {
      return $$0 >= this.b() ? crj.i : this.c.get($$0);
   }

   @Override
   public crj b(int $$0) {
      return bnu.a(this.c, $$0);
   }

   @Override
   public crj a(int $$0, int $$1) {
      crj $$2 = bnu.a(this.c, $$0, $$1);
      if (!$$2.d()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, crj $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cjt $$0) {
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
   public List<crj> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cjx $$0) {
      for (crj $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
