import javax.annotation.Nullable;

public abstract class fjk extends fgh {
   private final vs b;
   @Nullable
   private final vs c;
   private final vs k;
   @Nullable
   protected fam a;
   private fbd l = fbd.a;

   protected fjk(vs $$0, vs $$1, vs $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fjk(vs $$0, vs $$1, @Nullable vs $$2, vs $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void aP_() {
      super.aP_();
      this.l = fbd.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.o();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = fam.a(this.c, this.i).a(this.g / 2 - $$1 / 2 - 8, 76 + $$0).a();
         this.c(this.a);
      }

      this.a($$0);
   }

   @Override
   public vs i() {
      return this.k;
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.o(), 16777215);
   }

   protected void c(ezx $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int o() {
      return 9 * 2;
   }
}
