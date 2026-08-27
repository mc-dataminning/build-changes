import java.util.List;

public class chm implements cgd {
   private final il<ckj> c;
   private final int d;
   private final int e;
   private final cfp f;

   public chm(cfp $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, il.a($$1 * $$2, ckj.b));
   }

   public chm(cfp $$0, int $$1, int $$2, il<ckj> $$3) {
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
   public boolean ai_() {
      for (ckj $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ckj a(int $$0) {
      return $$0 >= this.b() ? ckj.b : this.c.get($$0);
   }

   @Override
   public ckj b(int $$0) {
      return bhv.a(this.c, $$0);
   }

   @Override
   public ckj a(int $$0, int $$1) {
      ckj $$2 = bhv.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, ckj $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ccx $$0) {
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
   public List<ckj> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cdb $$0) {
      for (ckj $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
