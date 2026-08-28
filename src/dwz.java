import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwz extends dor implements dwy {
   public static final MapCodec<dwz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwy.a.e.fieldOf("weathering_state").forGetter(dwz::q), t()).apply($$0, dwz::new)
   );
   private final dwy.a e;

   @Override
   protected MapCodec<dwz> a() {
      return d;
   }

   public dwz(dwy.a $$0, ebd.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(ebe $$0) {
      return dwy.c($$0.b()).isPresent();
   }

   public dwy.a q() {
      return this.e;
   }
}
