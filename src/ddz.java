import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddz(jg<awx> c) implements ddy {
   public static final MapCodec<ddz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awx.b.fieldOf("sound").forGetter(ddz::b)).apply($$0, ddz::new));
   public static final ze<wp, ddz> b = ze.a(awx.d, ddz::b, ddz::new);

   @Override
   public ddy.a<ddz> a() {
      return ddy.a.e;
   }

   @Override
   public boolean a(dkj $$0, dak $$1, byf $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public jg<awx> b() {
      return this.c;
   }
}
