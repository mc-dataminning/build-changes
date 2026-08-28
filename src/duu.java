import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duu extends dqx implements dmi {
   public static final MapCodec<duu> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyl.q.fieldOf("color").forGetter(duu::b), t()).apply($$0, duu::new));
   private final cyl i;

   @Override
   public MapCodec<duu> a() {
      return h;
   }

   public duu(cyl $$0, eas.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(
         this.C
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cyl b() {
      return this.i;
   }
}
