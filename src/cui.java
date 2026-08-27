import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cui(ctc d, chr e) {
   public static final String a = "enabled_features";
   public static final Codec<cui> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctc.b.optionalFieldOf("DataPacks", ctc.a).forGetter(cui::a), cht.f.optionalFieldOf("enabled_features", cht.h).forGetter(cui::b))
            .apply($$0, cui::new)
   );
   public static final cui c = new cui(ctc.a, cht.h);

   public cui a(chr $$0) {
      return new cui(this.d, this.e.b($$0));
   }

   public ctc a() {
      return this.d;
   }

   public chr b() {
      return this.e;
   }
}
