import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlp extends dlk implements dll {
   public static final MapCodec<dlp> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dll.a.e.fieldOf("weathering_state").forGetter(dlp::k), u()).apply($$0, dlp::new)
   );
   private final dll.a f;

   @Override
   protected MapCodec<dlp> a() {
      return e;
   }

   protected dlp(dll.a $$0, dph.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dpi $$0) {
      return dll.c($$0.b()).isPresent();
   }

   public dll.a k() {
      return this.f;
   }
}
