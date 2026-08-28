import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emr implements emc {
   public static final Codec<emr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eat.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               eat.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               btl.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, emr::new)
   );
   public final eat b;
   public final eat c;
   private final btl d;

   public emr(eat $$0, eat $$1, btl $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public btl a() {
      return this.d;
   }
}
