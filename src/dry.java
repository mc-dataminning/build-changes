import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dry extends diq implements drv {
   public static final MapCodec<dry> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drv.a.e.fieldOf("weathering_state").forGetter(djr::c), t()).apply($$0, dry::new)
   );
   private final drv.a e;

   @Override
   public MapCodec<dry> a() {
      return d;
   }

   public dry(drv.a $$0, dvu.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvv $$0) {
      return drv.c($$0.b()).isPresent();
   }

   public drv.a q() {
      return this.e;
   }
}
