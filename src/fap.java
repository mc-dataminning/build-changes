public class fap extends gtb {
   private static final wu a = wu.c("mco.selectServer.create");
   private static final wu b = wu.c("mco.configure.world.name");
   private static final wu c = wu.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final eyi D;
   private final fir E = new fir(this);
   private ffn F;
   private ffn G;
   private final Runnable H;

   public fap(eyi $$0, eze $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fap(eyi $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.E.a(this.l, this.p);
      fiv $$0 = this.E.c(fiv.d()).a(10);
      ffe $$1 = ffe.a(wt.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new ffn(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !ayu.h($$1x));
      this.G = new ffn(this.p, 210, 20, c);
      $$0.a(fin.a(this.p, this.F, b));
      $$0.a(fin.a(this.p, this.G, c));
      fiv $$2 = this.E.b(fiv.e().a(10));
      $$2.a($$1);
      $$2.a(ffe.a(wt.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(eze $$0) {
      fcg $$1 = new fcg($$0.a, this.F.a(), this.G.a());
      fbc $$2 = fbc.a(this, $$0, $$1, () -> this.m.execute(() -> {
            eyi.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fld $$1 = new fbb($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fau(this, new fcb(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
