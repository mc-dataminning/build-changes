import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record cx(ck.d c) implements bq {
   public static final MapCodec<cx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(atg.a(ck.d.d, "size", ck.d.c).forGetter(cx::b)).apply($$0, cx::new));

   public static cx a(ck.d $$0) {
      return new cx($$0);
   }

   @Override
   public boolean a(blf $$0, amp $$1, @Nullable elb $$2) {
      return $$0 instanceof cci $$3 ? this.c.d($$3.gf()) : false;
   }

   @Override
   public bq.a a() {
      return bq.b.e;
   }

   public ck.d b() {
      return this.c;
   }
}
