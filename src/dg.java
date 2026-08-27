import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dg(cs.d c) implements bs {
   public static final MapCodec<dg> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(axe.a(cs.d.d, "size", cs.d.c).forGetter(dg::b)).apply($$0, dg::new));

   public static dg a(cs.d $$0) {
      return new dg($$0);
   }

   @Override
   public boolean a(bql $$0, aqe $$1, @Nullable etf $$2) {
      return $$0 instanceof cia $$3 ? this.c.d($$3.gq()) : false;
   }

   @Override
   public MapCodec<dg> a() {
      return bt.d;
   }

   public cs.d b() {
      return this.c;
   }
}
