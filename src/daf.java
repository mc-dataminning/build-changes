import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class daf extends cxy {
   public static final MapCodec<daf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dad.a.forGetter($$0x -> $$0x.e), u()).apply($$0, daf::new));
   private final cyo e;
   protected static final float b = 6.0F;
   protected static final eol c = cyo.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   protected daf(cyo $$0, dle.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      this.a($$0, (cvo)$$1, $$2);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.a && !$$0.a($$3, $$4)) {
         return cyq.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, egq.c, egq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }
}
