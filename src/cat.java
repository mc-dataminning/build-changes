import com.google.common.collect.ImmutableMap;

public class cat extends bwx<cnt> {
   private static final int c = 25;
   private static final int d = 20;

   public cat() {
      super(ImmutableMap.of(cei.ay, cej.a, cei.o, cej.b, cei.aF, cej.c, cei.aD, cej.c), cnu.b);
   }

   protected void a(arq $$0, cnt $$1, long $$2) {
      bwg<cnt> $$3 = $$1.ee();
      $$3.a(cei.aD, bat.a, 25L);
      $$3.b(cei.m);
      bve $$4 = $$1.ee().c(cei.ay).get();
      bwz.a($$1, $$4);
      $$1.b(bvq.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arq $$0, cnt $$1, long $$2) {
      return true;
   }

   protected void c(arq $$0, cnt $$1, long $$2) {
      if (!$$1.ee().a(cei.aD) && !$$1.ee().a(cei.aF)) {
         $$1.ee().a(cei.aF, bat.a, (long)(cnu.b - 25));
         $$1.a(awo.BY, 3.0F, 1.0F);
      }
   }

   protected void d(arq $$0, cnt $$1, long $$2) {
      if ($$1.c(bvq.l)) {
         $$1.b(bvq.a);
      }

      $$1.ee().c(cei.ay).ifPresent($$1::j);
      $$1.ee().b(cei.ay);
   }
}
