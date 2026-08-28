import javax.annotation.Nullable;

public abstract class fqc extends fnj {
   private static final int b = 100;
   private final wu c;
   @Nullable
   private final wu q;
   private final wu r;
   @Nullable
   protected fhu a;
   @Nullable
   private fid s;
   private final fld u;

   protected fqc(wu $$0, wu $$1, wu $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqc(wu $$0, wu $$1, @Nullable wu $$2, wu $$3) {
      super($$0);
      this.c = $$1;
      this.q = $$2;
      this.r = $$3;
      this.u = new fld(0, 0, this.m, this.n);
   }

   protected abstract flg m();

   @Override
   protected void aP_() {
      flj $$0 = this.u.a(flj.d().a(8));
      $$0.c().b();
      $$0.a(new fiz(this.n(), this.o));
      this.s = $$0.a(new fid(this.m - 100, this.c, this.o, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      flj $$1 = $$0.a(flj.d().a(8));
      $$1.c().b();
      if (this.q != null) {
         this.a = $$1.a(fhu.a(this.q, this.o).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.m - 100);
      }

      this.u.a();
      fld.a(this.u, this.H());
   }

   @Override
   public wu i() {
      return this.r;
   }
}
