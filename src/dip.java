import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dip extends dkf implements dfi, dmg {
   public static final MapCodec<dip> a = b(dip::new);
   private static final dsy c = dsx.C;
   private final dkg d = new dkg(this);

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   public dip(dsg.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dsh> b(int $$0) {
      return $$1 -> dkf.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, cxk $$1) {
      return !$$1.n().a(cud.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return jf.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(c) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   public dkg c() {
      return this.d;
   }
}
