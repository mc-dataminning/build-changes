import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dty implements dtv {
   private final jg e;
   private final ih f;
   public static final Codec<dty> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jg.v(16).optionalFieldOf("offset", jg.g).forGetter($$0x -> $$0x.e), ih.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dty::new)
   );

   public dty(jg $$0, ih $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cxw $$0, ib $$1) {
      ib $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dtw<?> a() {
      return dtw.d;
   }
}
