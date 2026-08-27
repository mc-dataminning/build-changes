import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxk extends cva {
   public static final MapCodec<cxk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bic.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, cxk::new)
   );
   private final bic b;

   @Override
   public MapCodec<? extends cxk> a() {
      return a;
   }

   public cxk(bic $$0, dhh.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, clj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
