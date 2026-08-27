import javax.annotation.Nullable;

public abstract class fec extends faz {
   private final uv b;
   @Nullable
   private final uv c;
   private final uv k;
   @Nullable
   protected evg a;
   private evx l = evx.a;

   protected fec(uv $$0, uv $$1, uv $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fec(uv $$0, uv $$1, @Nullable uv $$2, uv $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void aQ_() {
      super.aQ_();
      this.l = evx.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.l();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = evg.a(this.c, this.i).a(this.g / 2 - $$1 / 2 - 8, 76 + $$0).a();
         this.d(this.a);
      }

      this.a($$0);
   }

   @Override
   public uv h() {
      return this.k;
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.l(), 16777215);
   }

   protected void c(eut $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int l() {
      return 9 * 2;
   }
}
