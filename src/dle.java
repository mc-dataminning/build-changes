import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dle extends dfc {
   public static final MapCodec<dle> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(u(), csy.q.fieldOf("color").forGetter($$0x -> $$0x.b)).apply($$0, dle::new)
   );
   private final csy b;

   public dle(dtb.d $$0, csy $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   protected MapCodec<dle> a() {
      return a;
   }

   public csy b() {
      return this.b;
   }

   public cuc c() {
      return (cuc)cuk.AD.get(this.b());
   }
}
