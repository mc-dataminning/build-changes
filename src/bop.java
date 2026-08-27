import com.google.common.collect.ImmutableMap;

public class bop<E extends cay> extends bkx<E> {
   public bop(int $$0) {
      super(ImmutableMap.of(bsh.o, bsi.b, bsh.m, bsi.b), $$0);
   }

   protected boolean a(akr $$0, E $$1, long $$2) {
      return $$1.dH() == null;
   }

   protected boolean a(akr $$0, E $$1) {
      return $$1.aA() || $$1.aX() || $$1.bl();
   }

   protected void b(akr $$0, E $$1, long $$2) {
      if ($$1.aA()) {
         $$1.b(bjs.o);
         $$1.a(ape.zA, 5.0F, 1.0F);
      } else {
         $$1.a(ape.zv, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(akr $$0, E $$1, long $$2) {
      if ($$1.dH() == null) {
         $$1.a(biq.c.b);
      }
   }
}
