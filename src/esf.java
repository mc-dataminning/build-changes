import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esf extends esb {
   public static final MapCodec<esf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqm.e.fieldOf("component").forGetter($$0x -> $$0x.b), ese.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, esf::new)
   );
   private final eql<?> b;
   private final esc c;

   private esf(List<etz> $$0, eql<?> $$1, esc $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esd<esf> b() {
      return ese.u;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(equ $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
