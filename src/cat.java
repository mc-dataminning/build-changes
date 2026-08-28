import com.google.common.collect.ImmutableMap;

public class cat<E extends cnw> extends bxa<E> {
   public cat(int $$0) {
      super(ImmutableMap.of(cel.o, cem.b, cel.m, cem.b), $$0);
   }

   protected boolean a(arp $$0, E $$1, long $$2) {
      return $$1.dR() == null;
   }

   protected boolean a(arp $$0, E $$1) {
      return $$1.aJ() || $$1.bj() || $$1.bx();
   }

   protected void b(arp $$0, E $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.b(bvt.o);
         $$1.a(awn.BP, 5.0F, 1.0F);
      } else {
         $$1.a(awn.BK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arp $$0, E $$1, long $$2) {
      if ($$1.dR() == null) {
         $$1.a(bul.c.b);
      }
   }
}
