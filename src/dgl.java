import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgl extends dee {
   public static final MapCodec<dgl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgj.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dgl::new));
   private final deu e;
   protected static final float b = 6.0F;
   protected static final ewf c = deu.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   protected dgl(deu $$0, drw.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      this.a($$0, (dbu)$$1, $$2);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.n().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dew.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, enr.c, enr.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }
}
