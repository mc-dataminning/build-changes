import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class end extends enq {
   public static final MapCodec<end> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eex.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, end::new)
   );
   private final eex c;

   private end(eex $$0) {
      this.c = $$0;
   }

   public static end a(eex $$0) {
      return new end($$0);
   }

   @Override
   protected boolean a(enp $$0, bam $$1, jh $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ens<?> b() {
      return ens.a;
   }
}
