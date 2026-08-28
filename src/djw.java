import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djw extends dhm {
   public static final MapCodec<djw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqx.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, djw::new)
   );
   private final bqx b;

   @Override
   public MapCodec<? extends djw> a() {
      return a;
   }

   public djw(bqx $$0, dur.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, cvs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
