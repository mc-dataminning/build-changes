import java.util.List;

public class cjk implements cia {
   private final io<cmh> c;
   private final int d;
   private final int e;
   private final chk f;

   public cjk(chk $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, io.a($$1 * $$2, cmh.f));
   }

   public cjk(chk $$0, int $$1, int $$2, io<cmh> $$3) {
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
      for (cmh $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmh a(int $$0) {
      return $$0 >= this.b() ? cmh.f : this.c.get($$0);
   }

   @Override
   public cmh b(int $$0) {
      return bjf.a(this.c, $$0);
   }

   @Override
   public cmh a(int $$0, int $$1) {
      cmh $$2 = bjf.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cmh $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cer $$0) {
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
   public List<cmh> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cev $$0) {
      for (cmh $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
