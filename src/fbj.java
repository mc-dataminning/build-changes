public class fbj extends eyk {
   private static final int a = 600;
   private final sm b;
   private esq c;
   private int k;
   private final ewd l = ewd.d();

   public fbj(tl $$0, sm $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   protected void aH_() {
      this.l.c().b().a(10);
      this.l.a(new etw(this.e, this.i));
      this.c = this.l.a(esq.a(tk.p, $$0 -> this.b.a(exe.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         eso var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      evx.a(this.l, this.s());
   }

   @Override
   public void c() {
      super.c();
      this.k++;
      if (this.k == 600) {
         this.c.i = true;
      }

      if (this.b.k()) {
         this.b.d();
      } else {
         this.b.p();
      }
   }
}
