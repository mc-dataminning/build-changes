import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dnd extends diq implements dpr {
   public static final MapCodec<dnd> a = b(dnd::new);
   public static final int b = 15;
   public static final dwu c = dwl.aP;
   public static final dwm d = dwl.C;
   public static final ToIntFunction<dvv> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   public dnd(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C && $$3.gE()) {
         $$1.a($$2, $$0.a(c), 2);
         return bsk.b;
      } else {
         return bsk.c;
      }
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return $$3.a(cwq.hC) ? fap.b() : fap.a();
   }

   @Override
   protected boolean e_(dvv $$0) {
      return $$0.y().c();
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.a;
   }

   @Override
   protected float c(dvv $$0, der $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(d) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cwm a(cwm $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ku.am, cyo.a.a(c, $$1));
      }

      return $$0;
   }
}
