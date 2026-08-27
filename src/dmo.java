import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmo implements dmb {
   public static final Codec<dmo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.v(16).optionalFieldOf("offset", ib.g).forGetter($$0x -> $$0x.e), dfl.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dmo::new)
   );
   private final ib e;
   private final dfl f;

   protected dmo(ib $$0, dfl $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqr $$0, gw $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dmc<?> a() {
      return dmc.g;
   }
}
