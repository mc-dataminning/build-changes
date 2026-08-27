import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlq extends djj implements dll {
   public static final MapCodec<dlq> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dll.a.e.fieldOf("weathering_state").forGetter(ddi::c), u()).apply($$0, dlq::new)
   );
   private final dll.a g;

   @Override
   public MapCodec<dlq> a() {
      return f;
   }

   public dlq(dll.a $$0, dph.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
