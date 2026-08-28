import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doj extends dfb implements dog {
   public static final MapCodec<doj> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dog.a.e.fieldOf("weathering_state").forGetter(dgc::c), u()).apply($$0, doj::new)
   );
   private final dog.a e;

   @Override
   public MapCodec<doj> a() {
      return d;
   }

   public doj(dog.a $$0, dsd.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dse $$0) {
      return dog.c($$0.b()).isPresent();
   }

   public dog.a m() {
      return this.e;
   }
}
