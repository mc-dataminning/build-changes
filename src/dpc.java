import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpc extends dmr {
   public static final MapCodec<dpc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btl.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dpc::new)
   );
   private final btl b;

   @Override
   public MapCodec<? extends dpc> a() {
      return a;
   }

   public dpc(btl $$0, eas.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, czn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
