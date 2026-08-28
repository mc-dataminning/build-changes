import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erz extends eru {
   public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqg.e.fieldOf("component").forGetter($$0x -> $$0x.b), erx.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, erz::new)
   );
   private final eqf<?> b;
   private final erv c;

   private erz(List<ets> $$0, eqf<?> $$1, erv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erw<erz> b() {
      return erx.u;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(eqo $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
