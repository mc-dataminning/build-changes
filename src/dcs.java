import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcs(je<awm> c) implements dcr {
   public static final MapCodec<dcs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awm.b.fieldOf("sound").forGetter(dcs::b)).apply($$0, dcs::new));
   public static final yw<wj, dcs> b = yw.a(awm.d, dcs::b, dcs::new);

   @Override
   public dcr.a<dcs> a() {
      return dcr.a.e;
   }

   @Override
   public boolean a(dja $$0, czd $$1, bxe $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public je<awm> b() {
      return this.c;
   }
}
