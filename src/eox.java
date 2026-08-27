public class eox extends gfb {
   private static final int a = 212;
   private static final tl b = tl.c("mco.configure.world.name");
   private static final tl c = tl.c("mco.configure.world.description");
   private final eof y;
   private final emw z;
   private esq A;
   private esz B;
   private esz C;

   public eox(eof $$0, emw $$1) {
      super(tl.c("mco.configure.world.settings.title"));
      this.y = $$0;
      this.z = $$1;
   }

   @Override
   public void c() {
      this.A.i = !ac.b(this.C.a());
   }

   @Override
   public void aI_() {
      int $$0 = this.g / 2 - 106;
      this.A = this.d(esq.a(tl.c("mco.configure.world.buttons.done"), $$0x -> this.f()).a($$0 - 2, h(12), 106, 20).a());
      this.d(esq.a(tk.e, $$0x -> this.f.a(this.y)).a(this.g / 2 + 2, h(12), 106, 20).a());
      String $$1 = this.z.e == emw.b.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      esq $$2 = esq.a(tl.c($$1), $$0x -> {
         if (this.z.e == emw.b.b) {
            tl $$1x = tl.c("mco.configure.world.close.question.line1");
            tl $$2x = tl.c("mco.configure.world.close.question.line2");
            this.f.a(new eol($$0xx -> {
               if ($$0xx) {
                  this.y.a(this);
               } else {
                  this.f.a(this);
               }
            }, eol.a.b, $$1x, $$2x, true));
         } else {
            this.y.a(false, this);
         }
      }).a(this.g / 2 - 53, h(0), 106, 20).a();
      this.d($$2);
      this.C = new esz(this.f.h, $$0, h(4), 212, 20, null, tl.c("mco.configure.world.name"));
      this.C.l(32);
      this.C.a(this.z.b());
      this.e(this.C);
      this.b(this.C);
      this.B = new esz(this.f.h, $$0, h(8), 212, 20, null, tl.c("mco.configure.world.description"));
      this.B.l(32);
      this.B.a(this.z.a());
      this.e(this.B);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.y);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, b, this.g / 2 - 106, h(3), -6250336, false);
      $$0.a(this.i, c, this.g / 2 - 106, h(7), -6250336, false);
      this.C.a($$0, $$1, $$2, $$3);
      this.B.a($$0, $$1, $$2, $$3);
   }

   public void f() {
      this.y.a(this.C.a(), this.B.a());
   }
}
