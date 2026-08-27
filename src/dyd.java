import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyd implements dya {
   private final js e;
   private final it f;
   public static final MapCodec<dyd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(js.v(16).optionalFieldOf("offset", js.g).forGetter($$0x -> $$0x.e), it.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dyd::new)
   );

   public dyd(js $$0, it $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dbs $$0, io $$1) {
      io $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dyb<?> a() {
      return dyb.d;
   }
}
