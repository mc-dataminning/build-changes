import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcq(dbk d, cpj e) {
   public static final String a = "enabled_features";
   public static final Codec<dcq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbk.b.lenientOptionalFieldOf("DataPacks", dbk.a).forGetter(dcq::a), cpl.f.lenientOptionalFieldOf("enabled_features", cpl.h).forGetter(dcq::b)
            )
            .apply($$0, dcq::new)
   );
   public static final dcq c = new dcq(dbk.a, cpl.h);

   public dcq a(cpj $$0) {
      return new dcq(this.d, this.e.c($$0));
   }

   public dbk a() {
      return this.d;
   }

   public cpj b() {
      return this.e;
   }
}
