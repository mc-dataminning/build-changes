import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dim extends ddy implements dkz {
   public static final MapCodec<dim> a = b(dim::new);
   public static final int b = 15;
   public static final dsb c = drr.aP;
   public static final drs d = drr.C;
   public static final ToIntFunction<drb> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return bpu.a;
      } else {
         return bpu.b;
      }
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return $$3.a(ctr.hC) ? eva.b() : eva.a();
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return true;
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.a;
   }

   @Override
   protected float d(drb $$0, dad $$1, io $$2) {
      return 1.0F;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(d) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cto a(cto $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kb.aa, cvz.a.a(c, $$1));
      }

      return $$0;
   }
}
