import java.util.List;

public class cka implements ciq {
   private final iq<cmx> c;
   private final int d;
   private final int e;
   private final cia f;

   public cka(cia $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, iq.a($$1 * $$2, cmx.f));
   }

   public cka(cia $$0, int $$1, int $$2, iq<cmx> $$3) {
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
      for (cmx $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmx a(int $$0) {
      return $$0 >= this.b() ? cmx.f : this.c.get($$0);
   }

   @Override
   public cmx b(int $$0) {
      return bju.a(this.c, $$0);
   }

   @Override
   public cmx a(int $$0, int $$1) {
      cmx $$2 = bju.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cmx $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfh $$0) {
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
   public List<cmx> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cfl $$0) {
      for (cmx $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
