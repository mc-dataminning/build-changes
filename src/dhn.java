import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhn extends dfc {
   public static final MapCodec<dhn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpf.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhn::new)
   );
   protected final bpf b;

   @Override
   public MapCodec<? extends dhn> a() {
      return a;
   }

   public dhn(bpf $$0, dtb.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, cuh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
