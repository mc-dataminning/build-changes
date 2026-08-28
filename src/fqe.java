import javax.annotation.Nullable;

public abstract class fqe extends fnl {
   private static final int b = 100;
   private final wu c;
   @Nullable
   private final wu q;
   private final wu r;
   @Nullable
   protected fhw a;
   @Nullable
   private fif s;
   private final flf u;

   protected fqe(wu $$0, wu $$1, wu $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqe(wu $$0, wu $$1, @Nullable wu $$2, wu $$3) {
      super($$0);
      this.c = $$1;
      this.q = $$2;
      this.r = $$3;
      this.u = new flf(0, 0, this.m, this.n);
   }

   protected abstract fli m();

   @Override
   protected void aP_() {
      fll $$0 = this.u.a(fll.d().a(8));
      $$0.c().b();
      $$0.a(new fjb(this.n(), this.o));
      this.s = $$0.a(new fif(this.m - 100, this.c, this.o, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fll $$1 = $$0.a(fll.d().a(8));
      $$1.c().b();
      if (this.q != null) {
         this.a = $$1.a(fhw.a(this.q, this.o).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fhs var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.m - 100);
      }

      this.u.a();
      flf.a(this.u, this.H());
   }

   @Override
   public wu i() {
      return this.r;
   }
}
