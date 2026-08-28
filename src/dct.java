import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dct(dbn d, cpm e) {
   public static final String a = "enabled_features";
   public static final Codec<dct> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbn.b.lenientOptionalFieldOf("DataPacks", dbn.a).forGetter(dct::a), cpo.f.lenientOptionalFieldOf("enabled_features", cpo.h).forGetter(dct::b)
            )
            .apply($$0, dct::new)
   );
   public static final dct c = new dct(dbn.a, cpo.h);

   public dct a(cpm $$0) {
      return new dct(this.d, this.e.c($$0));
   }

   public dbn a() {
      return this.d;
   }

   public cpm b() {
      return this.e;
   }
}
