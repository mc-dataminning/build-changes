import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtg extends dnd implements dpp {
   public static final MapCodec<dtg> c = b(dtg::new);
   public static final dzk<dzi> d = dnd.b;
   private static final fdo e = dku.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dtg> a() {
      return c;
   }

   public dtg(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e;
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.c($$1, $$2, jo.b) && !$$0.a(dkw.ll);
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(dkw.bD);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = super.a($$0);
      if ($$1 != null) {
         eut $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axf.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      if ($$0.c(d) == dzi.a) {
         dym $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dzi.b;
      } else {
         eut $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axf.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eut b_(dym $$0) {
      return euu.c.a(false);
   }

   @Override
   public boolean a(@Nullable bwr $$0, dgv $$1, jj $$2, dym $$3, eus $$4) {
      return false;
   }

   @Override
   public boolean a(dhq $$0, jj $$1, dym $$2, eut $$3) {
      return false;
   }
}
