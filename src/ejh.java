import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejh extends eju {
   public static final MapCodec<ejh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebd.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ejh::new)
   );
   private final ebd c;

   private ejh(ebd $$0) {
      this.c = $$0;
   }

   public static ejh a(ebd $$0) {
      return new ejh($$0);
   }

   @Override
   protected boolean a(ejt $$0, azk $$1, je $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ejw<?> b() {
      return ejw.a;
   }
}
