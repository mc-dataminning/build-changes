import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class daw extends cyp {
   public static final MapCodec<daw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dau.a.forGetter($$0x -> $$0x.e), u()).apply($$0, daw::new));
   private final czf e;
   protected static final float b = 6.0F;
   protected static final epo c = czf.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   protected daw(czf $$0, dmd.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      this.a($$0, (cwf)$$1, $$2);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !$$0.a($$3, $$4)) {
         return czh.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, ehs.c, ehs.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }
}
