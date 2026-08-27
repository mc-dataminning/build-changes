public abstract class ftg<T extends bfj, M extends fbf<T>> {
   private final fqt<T, M> a;

   public ftg(fqt<T, M> $$0) {
      this.a = $$0;
   }

   protected static <T extends bfz> void a(
      fbf<T> $$0,
      fbf<T> $$1,
      acq $$2,
      eij $$3,
      fjx $$4,
      int $$5,
      T $$6,
      float $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14,
      float $$15
   ) {
      if (!$$6.cb()) {
         $$0.a($$1);
         $$1.a($$6, $$7, $$8, $$12);
         $$1.a($$6, $$7, $$8, $$9, $$10, $$11);
         a($$1, $$2, $$3, $$4, $$5, $$6, $$13, $$14, $$15);
      }
   }

   protected static <T extends bfz> void a(fbf<T> $$0, acq $$1, eij $$2, fjx $$3, int $$4, T $$5, float $$6, float $$7, float $$8) {
      ein $$9 = $$3.getBuffer(fkf.d($$1));
      $$0.a($$2, $$9, $$4, fpz.c($$5, 0.0F), $$6, $$7, $$8, 1.0F);
   }

   public M c() {
      return this.a.a();
   }

   protected acq a(T $$0) {
      return this.a.a($$0);
   }

   public abstract void a(eij var1, fjx var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
