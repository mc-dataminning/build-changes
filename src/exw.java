import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exw extends eyb {
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cv.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), eye.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exw::new)
   );
   private final cv b;
   private final eyc c;

   private exw(List<ezx> $$0, cv $$1, eyc $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eyd<exw> b() {
      return eye.v;
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(ewu $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
