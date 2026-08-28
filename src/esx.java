import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esx extends erw {
   public static final MapCodec<esx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxz.d.fieldOf("pages").forGetter($$0x -> $$0x.b), erv.a(100).forGetter($$0x -> $$0x.c))).apply($$0, esx::new)
   );
   private final List<arw<String>> b;
   private final erv c;

   protected esx(List<etu> $$0, List<arw<String>> $$1, erv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cur a(cur $$0, eqk $$1) {
      $$0.a(km.I, cxz.a, this::a);
      return $$0;
   }

   public cxz a(cxz $$0) {
      List<arw<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public ery<esx> b() {
      return erz.O;
   }
}
