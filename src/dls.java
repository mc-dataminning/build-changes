import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dls extends dfd implements dex, djl {
   public static final MapCodec<dls> a = b(dls::new);
   protected static final float b = 6.0F;
   protected static final ewf c = deu.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   protected dls(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dew.kJ);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      return $$1.a(awr.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      drx $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return true;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   protected enq b_(drx $$0) {
      return enr.c.a(false);
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      drx $$4 = dew.bx.n();
      drx $$5 = $$4.a(dna.d, dst.a);
      iz $$6 = $$2.c();
      if ($$0.a_($$6).a(dew.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cms $$0, daz $$1, iz $$2, drx $$3, enp $$4) {
      return false;
   }

   @Override
   public boolean a(dbu $$0, iz $$1, drx $$2, enq $$3) {
      return false;
   }
}
