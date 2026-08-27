import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddb extends dbb implements dcz {
   public static final MapCodec<ddb> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcz.a.e.fieldOf("weathering_state").forGetter(cvb::c), t()).apply($$0, ddb::new)
   );
   private final dcz.a g;

   @Override
   public MapCodec<ddb> a() {
      return f;
   }

   public ddb(dcz.a $$0, dga.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dgb $$0) {
      return dcz.c($$0.b()).isPresent();
   }

   public dcz.a g() {
      return this.g;
   }
}
