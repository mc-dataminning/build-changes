import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dim extends dgf {
   public static final MapCodec<dim> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dik.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dim::new));
   private final dgv e;
   protected static final float b = 6.0F;
   protected static final eyx c = dgv.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   protected dim(dgv $$0, dtz.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      this.a($$0, (ddt)$$1, $$2);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == jj.a && !$$0.a($$3, $$4)) {
         return dgx.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eqc.c, eqc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }
}
