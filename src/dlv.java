import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlv extends dfg implements dfa, djo {
   public static final MapCodec<dlv> a = b(dlv::new);
   protected static final float b = 6.0F;
   protected static final ewi c = dex.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   protected dlv(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dez.kJ);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      return $$1.a(awu.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      dsa $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return true;
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   protected ent b_(dsa $$0) {
      return enu.c.a(false);
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      dsa $$4 = dez.bx.o();
      dsa $$5 = $$4.a(dnd.d, dsw.a);
      iz $$6 = $$2.c();
      if ($$0.a_($$6).a(dez.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
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
