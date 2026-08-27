import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record cx(ck.d c) implements bq {
   public static final MapCodec<cx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(atv.a(ck.d.d, "size", ck.d.c).forGetter(cx::b)).apply($$0, cx::new));

   public static cx a(ck.d $$0) {
      return new cx($$0);
   }

   @Override
   public boolean a(blu $$0, and $$1, @Nullable els $$2) {
      return $$0 instanceof ccx $$3 ? this.c.d($$3.gf()) : false;
   }

   @Override
   public bq.a a() {
      return bq.b.e;
   }

   public ck.d b() {
      return this.c;
   }
}
