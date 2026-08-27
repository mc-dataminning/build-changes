import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbr(dal d, coj e) {
   public static final String a = "enabled_features";
   public static final Codec<dbr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dal.b.lenientOptionalFieldOf("DataPacks", dal.a).forGetter(dbr::a), col.f.lenientOptionalFieldOf("enabled_features", col.h).forGetter(dbr::b)
            )
            .apply($$0, dbr::new)
   );
   public static final dbr c = new dbr(dal.a, col.h);

   public dbr a(coj $$0) {
      return new dbr(this.d, this.e.b($$0));
   }

   public dal a() {
      return this.d;
   }

   public coj b() {
      return this.e;
   }
}
