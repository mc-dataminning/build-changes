import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcn(dbh d, cpg e) {
   public static final String a = "enabled_features";
   public static final Codec<dcn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbh.b.lenientOptionalFieldOf("DataPacks", dbh.a).forGetter(dcn::a), cpi.f.lenientOptionalFieldOf("enabled_features", cpi.h).forGetter(dcn::b)
            )
            .apply($$0, dcn::new)
   );
   public static final dcn c = new dcn(dbh.a, cpi.h);

   public dcn a(cpg $$0) {
      return new dcn(this.d, this.e.b($$0));
   }

   public dbh a() {
      return this.d;
   }

   public cpg b() {
      return this.e;
   }
}
