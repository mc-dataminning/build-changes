import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddx extends dbp {
   public static final MapCodec<ddx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddw.a.forGetter($$0x -> $$0x.c), u()).apply($$0, ddx::new));
   private final dch c;

   @Override
   public MapCodec<ddx> a() {
      return b;
   }

   protected ddx(dch $$0, dph.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      this.a($$0, (czh)$$1, $$2);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.n().a(d, Boolean.valueOf(false)), 2);
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
}
