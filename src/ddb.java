import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class ddb extends cyo implements dfo {
   public static final MapCodec<ddb> a = b(ddb::new);
   public static final int b = 15;
   public static final dmf c = dlv.aP;
   public static final dlw d = dlv.C;
   public static final ToIntFunction<dlf> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   public ddb(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if (!$$1.B && $$3.gq()) {
         $$1.a($$2, $$0.a(c), 2);
         return blu.a;
      } else {
         return blu.b;
      }
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return $$3.a(cpc.hB) ? eoi.b() : eoi.a();
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return true;
   }

   @Override
   protected det b_(dlf $$0) {
      return det.a;
   }

   @Override
   protected float d(dlf $$0, cut $$1, hz $$2) {
      return 1.0F;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(d) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static coz a(coz $$0, int $$1) {
      if ($$1 != 15) {
         sw $$2 = new sw();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
