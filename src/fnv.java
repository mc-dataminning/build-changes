import javax.annotation.Nullable;

public abstract class fnv extends fkt {
   private static final int b = 100;
   private final ws c;
   @Nullable
   private final ws d;
   private final ws r;
   @Nullable
   protected few a;
   @Nullable
   private fff s;
   private final fif u;

   protected fnv(ws $$0, ws $$1, ws $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fnv(ws $$0, ws $$1, @Nullable ws $$2, ws $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fif(0, 0, this.n, this.o);
   }

   protected abstract fii m();

   @Override
   protected void aM_() {
      fil $$0 = this.u.a(fil.d().a(8));
      $$0.c().b();
      $$0.a(new fgb(this.n(), this.p));
      this.s = $$0.a(new fff(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fil $$1 = $$0.a(fil.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(few.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fes var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fif.a(this.u, this.G());
   }

   @Override
   public ws i() {
      return this.r;
   }
}
