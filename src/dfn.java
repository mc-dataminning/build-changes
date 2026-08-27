import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfn extends ddm implements dlb {
   public static final MapCodec<dfn> a = b(dfn::new);
   public static final dru b = drt.C;
   private static final int d = 3;
   protected static final evf c = dea.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   public dfn(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dou($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.z, $$0.B ? dou::a : dou::b);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.b;
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(b) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Boolean.valueOf($$1.a(awc.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
