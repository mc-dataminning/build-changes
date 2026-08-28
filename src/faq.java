import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class faq extends fam {
   public static final MapCodec<faq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyx.e.fieldOf("component").forGetter($$0x -> $$0x.b), fap.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, faq::new)
   );
   private final eyw<?> b;
   private final fan c;

   private faq(List<fci> $$0, eyw<?> $$1, fan $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fao<faq> b() {
      return fap.u;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(ezf $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
