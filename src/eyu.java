import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyu extends exu {
   public static final MapCodec<eyu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dar.d.fieldOf("pages").forGetter($$0x -> $$0x.b), ext.a(100).forGetter($$0x -> $$0x.c))).apply($$0, eyu::new)
   );
   private final List<asz<String>> b;
   private final ext c;

   protected eyu(List<ezs> $$0, List<asz<String>> $$1, ext $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxk a(cxk $$0, ewh $$1) {
      $$0.a(ku.S, dar.a, this::a);
      return $$0;
   }

   public dar a(dar $$0) {
      List<asz<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public exw<eyu> b() {
      return exx.O;
   }
}
