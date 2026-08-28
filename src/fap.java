import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fap extends fau {
   public static final MapCodec<fap> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cl.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), fax.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fap::new)
   );
   private final cl b;
   private final fav c;

   private fap(List<fcq> $$0, cl $$1, fav $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public faw<fap> b() {
      return fax.v;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(ezn $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
