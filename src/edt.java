import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edt implements ede {
   public static final Codec<edt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dse.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dse.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bqb.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edt::new)
   );
   public final dse b;
   public final dse c;
   private final bqb d;

   public edt(dse $$0, dse $$1, bqb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bqb a() {
      return this.d;
   }
}
