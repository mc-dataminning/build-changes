import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhh extends dex {
   public static final MapCodec<dhh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpx.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhh::new)
   );
   private final bpx b;

   @Override
   public MapCodec<? extends dhh> a() {
      return a;
   }

   public dhh(bpx $$0, drz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, cun $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
