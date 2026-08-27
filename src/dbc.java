import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbc extends cys {
   public static final MapCodec<dbc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(blb.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dbc::new)
   );
   private final blb b;

   @Override
   public MapCodec<? extends dbc> a() {
      return a;
   }

   public dbc(blb $$0, dli.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, cpd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
