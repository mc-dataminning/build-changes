import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dis extends dki implements dfl, dmj {
   public static final MapCodec<dis> a = b(dis::new);
   private static final dtc c = dtb.C;
   private final dkj d = new dkj(this);

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dsl> b(int $$0) {
      return $$1 -> dki.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      return !$$1.n().a(cug.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return jf.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsl $$0, dbm $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   public dkj c() {
      return this.d;
   }
}
