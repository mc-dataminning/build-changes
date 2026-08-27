import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxa implements dwx {
   private final jq e;
   private final ir f;
   public static final Codec<dxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jq.v(16).optionalFieldOf("offset", jq.g).forGetter($$0x -> $$0x.e), ir.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dxa::new)
   );

   public dxa(jq $$0, ir $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dap $$0, im $$1) {
      im $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dwy<?> a() {
      return dwy.d;
   }
}
