import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dui extends dql implements dlw {
   public static final MapCodec<dui> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyb.q.fieldOf("color").forGetter(dui::b), t()).apply($$0, dui::new));
   private final cyb i;

   @Override
   public MapCodec<dui> a() {
      return h;
   }

   public dui(cyb $$0, eag.d $$1) {
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
   public cyb b() {
      return this.i;
   }
}
