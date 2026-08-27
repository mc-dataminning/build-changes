import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class did extends dbv {
   public static final MapCodec<did> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpx.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, did::new)
   );
   public static final dpz f = dpy.w;

   @Override
   public MapCodec<did> a() {
      return e;
   }

   protected did(dpx $$0, dph.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dpi $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dpi a(dpi $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(czg $$0, id $$1) {
      Class<? extends bqa> $$2 = switch (this.d.f()) {
         case a -> bqa.class;
         case b -> bqt.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(f);
   }
}
