import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fck extends fcg {
   public static final MapCodec<fck> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(far.e.fieldOf("component").forGetter($$0x -> $$0x.b), fcj.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fck::new)
   );
   private final faq<?> b;
   private final fch c;

   private fck(List<fec> $$0, faq<?> $$1, fch $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fci<fck> b() {
      return fcj.u;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(faz $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
