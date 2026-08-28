import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhp extends dff {
   public static final MapCodec<dhp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpi.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhp::new)
   );
   private final bpi b;

   @Override
   public MapCodec<? extends dhp> a() {
      return a;
   }

   public dhp(bpi $$0, dsg.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, cua $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
