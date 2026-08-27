import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dba extends dgl implements dha {
   public static final MapCodec<dba> a = b(dba::new);
   public static final dnq b = dnp.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eqk e = daa.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eqk f = daa.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eqk g = daa.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   public dba(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ih.a.b));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      switch ((ih.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eio.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(b) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
