import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esv extends eru {
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxx.d.fieldOf("pages").forGetter($$0x -> $$0x.b), ert.a(100).forGetter($$0x -> $$0x.c))).apply($$0, esv::new)
   );
   private final List<arw<String>> b;
   private final ert c;

   protected esv(List<ets> $$0, List<arw<String>> $$1, ert $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cup a(cup $$0, eqi $$1) {
      $$0.a(km.I, cxx.a, this::a);
      return $$0;
   }

   public cxx a(cxx $$0) {
      List<arw<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public erw<esv> b() {
      return erx.O;
   }
}
