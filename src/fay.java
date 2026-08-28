import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fay extends fau {
   public static final MapCodec<fay> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezf.e.fieldOf("component").forGetter($$0x -> $$0x.b), fax.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fay::new)
   );
   private final eze<?> b;
   private final fav c;

   private fay(List<fcq> $$0, eze<?> $$1, fav $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public faw<fay> b() {
      return fax.u;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(ezn $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
