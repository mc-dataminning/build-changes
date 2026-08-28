import javax.annotation.Nullable;

public abstract class fpw extends fnd {
   private static final int b = 100;
   private final wu c;
   @Nullable
   private final wu q;
   private final wu r;
   @Nullable
   protected fho a;
   @Nullable
   private fhx s;
   private final fkx u;

   protected fpw(wu $$0, wu $$1, wu $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fpw(wu $$0, wu $$1, @Nullable wu $$2, wu $$3) {
      super($$0);
      this.c = $$1;
      this.q = $$2;
      this.r = $$3;
      this.u = new fkx(0, 0, this.m, this.n);
   }

   protected abstract fla m();

   @Override
   protected void aO_() {
      fld $$0 = this.u.a(fld.d().a(8));
      $$0.c().b();
      $$0.a(new fit(this.n(), this.o));
      this.s = $$0.a(new fhx(this.m - 100, this.c, this.o, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fld $$1 = $$0.a(fld.d().a(8));
      $$1.c().b();
      if (this.q != null) {
         this.a = $$1.a(fho.a(this.q, this.o).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fhk var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.m - 100);
      }

      this.u.a();
      fkx.a(this.u, this.H());
   }

   @Override
   public wu i() {
      return this.r;
   }
}
