import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cnf(cma d, caw e) {
   public static final String a = "enabled_features";
   public static final Codec<cnf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cma.b.optionalFieldOf("DataPacks", cma.a).forGetter(cnf::a), cay.d.optionalFieldOf("enabled_features", cay.f).forGetter(cnf::b))
            .apply($$0, cnf::new)
   );
   public static final cnf c = new cnf(cma.a, cay.f);

   public cnf a(caw $$0) {
      return new cnf(this.d, this.e.b($$0));
   }

   public cma a() {
      return this.d;
   }

   public caw b() {
      return this.e;
   }
}
