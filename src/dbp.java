import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbp extends czf {
   public static final MapCodec<dbp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(blq.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dbp::new)
   );
   private final blq b;

   @Override
   public MapCodec<? extends dbp> a() {
      return a;
   }

   public dbp(blq $$0, dmd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, cpq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
