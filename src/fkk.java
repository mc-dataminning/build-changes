import javax.annotation.Nullable;

public abstract class fkk extends fhh {
   private final vu b;
   @Nullable
   private final vu c;
   private final vu k;
   @Nullable
   protected fbk a;
   private fcb l = fcb.a;

   protected fkk(vu $$0, vu $$1, vu $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fkk(vu $$0, vu $$1, @Nullable vu $$2, vu $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void aO_() {
      super.aO_();
      this.l = fcb.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.o();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = fbk.a(this.c, this.i).a(this.g / 2 - $$1 / 2 - 8, 76 + $$0).a();
         this.c(this.a);
      }

      this.a($$0);
   }

   @Override
   public vu i() {
      return this.k;
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.o(), 16777215);
   }

   protected void c(fav $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int o() {
      return 9 * 2;
   }
}
