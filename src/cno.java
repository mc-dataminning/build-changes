import java.util.List;

public class cno implements cme {
   private final iu<cqk> c;
   private final int d;
   private final int e;
   private final clo f;

   public cno(clo $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, iu.a($$1 * $$2, cqk.h));
   }

   public cno(clo $$0, int $$1, int $$2, iu<cqk> $$3) {
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
      for (cqk $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqk a(int $$0) {
      return $$0 >= this.b() ? cqk.h : this.c.get($$0);
   }

   @Override
   public cqk b(int $$0) {
      return bmw.a(this.c, $$0);
   }

   @Override
   public cqk a(int $$0, int $$1) {
      cqk $$2 = bmw.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cqk $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cis $$0) {
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
   public List<cqk> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(ciw $$0) {
      for (cqk $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
