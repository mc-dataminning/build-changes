import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class djt extends dff implements dmg {
   public static final MapCodec<djt> a = b(djt::new);
   public static final int b = 15;
   public static final dth c = dsx.aP;
   public static final dsy d = dsx.C;
   public static final ToIntFunction<dsh> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if (!$$1.B && $$3.gv()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqd.a;
      } else {
         return bqd.c;
      }
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return $$3.a(cud.hC) ? ewp.b() : ewp.a();
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.a;
   }

   @Override
   protected float d(dsh $$0, dbj $$1, ja $$2) {
      return 1.0F;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(d) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cua a(cua $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kn.ab, cwk.a.a(c, $$1));
      }

      return $$0;
   }
}
