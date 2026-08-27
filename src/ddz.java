import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddz extends dbs {
   public static final MapCodec<ddz> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddw.a.forGetter($$0x -> $$0x.f), u()).apply($$0, ddz::new));
   private final dch f;

   @Override
   public MapCodec<ddz> a() {
      return e;
   }

   protected ddz(dch $$0, dph.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      this.a($$0, (czh)$$1, $$2);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.n().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dcj.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, elc.c, elc.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
