import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcb extends fbb {
   public static final MapCodec<fcb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dct.d.fieldOf("pages").forGetter($$0x -> $$0x.b), fba.a(100).forGetter($$0x -> $$0x.c))).apply($$0, fcb::new)
   );
   private final List<asi<String>> b;
   private final fba c;

   protected fcb(List<fcx> $$0, List<asi<String>> $$1, fba $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czk a(czk $$0, ezo $$1) {
      $$0.a(kk.U, dct.a, this::a);
      return $$0;
   }

   public dct a(dct $$0) {
      List<asi<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public fbd<fcb> b() {
      return fbe.O;
   }
}
