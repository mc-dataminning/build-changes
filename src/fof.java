import javax.annotation.Nullable;

public abstract class fof extends fld {
   private static final int b = 100;
   private final wu c;
   @Nullable
   private final wu d;
   private final wu r;
   @Nullable
   protected ffg a;
   @Nullable
   private ffp s;
   private final fip u;

   protected fof(wu $$0, wu $$1, wu $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fof(wu $$0, wu $$1, @Nullable wu $$2, wu $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fip(0, 0, this.n, this.o);
   }

   protected abstract fis m();

   @Override
   protected void aM_() {
      fiv $$0 = this.u.a(fiv.d().a(8));
      $$0.c().b();
      $$0.a(new fgl(this.n(), this.p));
      this.s = $$0.a(new ffp(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fiv $$1 = $$0.a(fiv.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(ffg.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fip.a(this.u, this.G());
   }

   @Override
   public wu i() {
      return this.r;
   }
}
