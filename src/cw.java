import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record cw(cj.d c) implements bp {
   public static final MapCodec<cw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aqy.a(cj.d.d, "size", cj.d.c).forGetter(cw::b)).apply($$0, cw::new));

   public static cw a(cj.d $$0) {
      return new cw($$0);
   }

   @Override
   public boolean a(bii $$0, akk $$1, @Nullable ehd $$2) {
      return $$0 instanceof bzj $$3 ? this.c.d($$3.gb()) : false;
   }

   @Override
   public bp.a a() {
      return bp.b.e;
   }

   public cj.d b() {
      return this.c;
   }
}
