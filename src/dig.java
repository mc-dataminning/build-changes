import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dig extends dfw {
   public static final MapCodec<dig> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpv.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dig::new)
   );
   private final bpv b;

   @Override
   public MapCodec<? extends dig> a() {
      return a;
   }

   public dig(bpv $$0, dsz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
