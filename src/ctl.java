import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctl(cw.c c) implements ctn {
   public static final MapCodec<ctl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cw.c.d.fieldOf("range").forGetter(ctl::b)).apply($$0, ctl::new));

   public boolean a(ctp $$0) {
      return this.c.d((double)$$0.b().a().as());
   }

   @Override
   public MapCodec<ctl> a() {
      return a;
   }

   public cw.c b() {
      return this.c;
   }
}
