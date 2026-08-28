import javax.annotation.Nullable;

public abstract class eza {
   protected final dtn a;

   protected eza(dtn $$0) {
      this.a = $$0;
   }

   public abstract void a(djz var1, iw var2, ebg var3, @Nullable eyy var4, boolean var5);

   protected int a(djz $$0, iw $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(iw $$0, ebg $$1) {
      return $$1.a(this.a) ? $$1.c(dtn.f) : 0;
   }

   protected int b(djz $$0, iw $$1) {
      int $$2 = 0;

      for (jc $$3 : jc.c.a) {
         iw $$4 = $$1.a($$3);
         ebg $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         iw $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            iw $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            iw $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
