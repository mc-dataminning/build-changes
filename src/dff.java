import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dff extends dcv {
   public static final MapCodec<dff> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bnv.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dff::new)
   );
   private final bnv b;

   @Override
   public MapCodec<? extends dff> a() {
      return a;
   }

   public dff(bnv $$0, dpx.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, csd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
