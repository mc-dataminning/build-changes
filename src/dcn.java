import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcn(je<awm> c) implements dcm {
   public static final MapCodec<dcn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awm.b.fieldOf("sound").forGetter(dcn::b)).apply($$0, dcn::new));
   public static final yw<wj, dcn> b = yw.a(awm.d, dcn::b, dcn::new);

   @Override
   public dcm.a<dcn> a() {
      return dcm.a.e;
   }

   @Override
   public boolean a(div $$0, cyy $$1, bxc $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public je<awm> b() {
      return this.c;
   }
}
