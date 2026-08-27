import com.mojang.serialization.MapCodec;

public class djf extends deh {
   public static final MapCodec<djf> a = b(djf::new);
   public static final int b = 3;
   public static final dsb c = drr.as;
   private static final evd[] d = new evd[]{
      ddy.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   protected djf(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(dea.dW);
   }

   @Override
   protected boolean d_(drb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(ctr.sj);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }
}
