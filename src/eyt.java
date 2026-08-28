import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyt extends eyy {
   public static final MapCodec<eyt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cv.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), ezb.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyt::new)
   );
   private final cv b;
   private final eyz c;

   private eyt(List<fau> $$0, cv $$1, eyz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eza<eyt> b() {
      return ezb.v;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(exr $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
