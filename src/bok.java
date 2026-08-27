import com.google.common.collect.ImmutableMap;

public class bok<E extends cat> extends bks<E> {
   public bok(int $$0) {
      super(ImmutableMap.of(bsc.o, bsd.b, bsc.m, bsd.b), $$0);
   }

   protected boolean a(akn $$0, E $$1, long $$2) {
      return $$1.dG() == null;
   }

   protected boolean a(akn $$0, E $$1) {
      return $$1.aA() || $$1.aX() || $$1.bl();
   }

   protected void b(akn $$0, E $$1, long $$2) {
      if ($$1.aA()) {
         $$1.b(bjn.o);
         $$1.a(aoz.zA, 5.0F, 1.0F);
      } else {
         $$1.a(aoz.zv, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(akn $$0, E $$1, long $$2) {
      if ($$1.dG() == null) {
         $$1.a(bil.c.b);
      }
   }
}
