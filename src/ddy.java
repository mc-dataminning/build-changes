import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddy extends dbr {
   public static final MapCodec<ddy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddw.a.forGetter($$0x -> $$0x.e), u()).apply($$0, ddy::new));
   private final dch e;
   protected static final float b = 6.0F;
   protected static final etc c = dch.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   protected ddy(dch $$0, dph.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      this.a($$0, (czh)$$1, $$2);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.n().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == ij.a && !$$0.a($$3, $$4)) {
         return dcj.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, elc.c, elc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }
}
