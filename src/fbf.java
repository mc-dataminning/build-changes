import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbf extends fbb {
   public static final MapCodec<fbf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezm.e.fieldOf("component").forGetter($$0x -> $$0x.b), fbe.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbf::new)
   );
   private final ezl<?> b;
   private final fbc c;

   private fbf(List<fcx> $$0, ezl<?> $$1, fbc $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbd<fbf> b() {
      return fbe.u;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(ezu $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
