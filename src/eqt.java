import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqt extends epw {
   public static final Codec<eqt> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(cwf.c.fieldOf("pages").forGetter($$0x -> $$0x.b), epv.a(100).forGetter($$0x -> $$0x.c))).apply($$0, eqt::new)
   );
   private final List<aqy<String>> b;
   private final epv c;

   protected eqt(List<erq> $$0, List<aqy<String>> $$1, epv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected csz a(csz $$0, eol $$1) {
      $$0.a(ka.G, cwf.a, this::a);
      return $$0;
   }

   public cwf a(cwf $$0) {
      List<aqy<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public epy b() {
      return epz.L;
   }
}
