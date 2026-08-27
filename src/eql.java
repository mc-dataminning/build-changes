import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eql extends epo {
   public static final Codec<eql> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(cvi.c.fieldOf("pages").forGetter($$0x -> $$0x.b), epn.e.f.forGetter($$0x -> $$0x.c))).apply($$0, eql::new)
   );
   private final List<aqv<String>> b;
   private final epn c;

   protected eql(List<erh> $$0, List<aqv<String>> $$1, epn $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected csd a(csd $$0, eoa $$1) {
      $$0.a(jz.z, cvi.a, this::a);
      return $$0;
   }

   public cvi a(cvi $$0) {
      List<aqv<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public epq b() {
      return epr.J;
   }
}
