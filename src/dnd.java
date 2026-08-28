import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnd extends dhf implements djo {
   public static final MapCodec<dnd> c = b(dnd::new);
   public static final dsy<dsw> d = dhf.b;
   protected static final float e = 6.0F;
   protected static final ewi f = dex.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnd> a() {
      return c;
   }

   public dnd(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return f;
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dez.kJ);
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun(dez.bw);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = super.a($$0);
      if ($$1 != null) {
         ent $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awu.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      if ($$0.c(d) == dsw.a) {
         dsa $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dsw.b;
      } else {
         ent $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awu.a) && $$4.e() == 8;
      }
   }

   @Override
   protected ent b_(dsa $$0) {
      return enu.c.a(false);
   }

   @Override
   public boolean a(@Nullable cmv $$0, dbc $$1, iz $$2, dsa $$3, ens $$4) {
      return false;
   }

   @Override
   public boolean a(dbx $$0, iz $$1, dsa $$2, ent $$3) {
      return false;
   }
}
