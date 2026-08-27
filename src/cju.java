import java.util.List;

public class cju implements cik {
   private final iq<cmr> c;
   private final int d;
   private final int e;
   private final chu f;

   public cju(chu $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, iq.a($$1 * $$2, cmr.f));
   }

   public cju(chu $$0, int $$1, int $$2, iq<cmr> $$3) {
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
      for (cmr $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmr a(int $$0) {
      return $$0 >= this.b() ? cmr.f : this.c.get($$0);
   }

   @Override
   public cmr b(int $$0) {
      return bjp.a(this.c, $$0);
   }

   @Override
   public cmr a(int $$0, int $$1) {
      cmr $$2 = bjp.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cmr $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfb $$0) {
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
   public List<cmr> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cff $$0) {
      for (cmr $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
