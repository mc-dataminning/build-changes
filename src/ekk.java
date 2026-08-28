import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekk implements ejv {
   public static final Codec<ekk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dym.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dym.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bsv.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ekk::new)
   );
   public final dym b;
   public final dym c;
   private final bsv d;

   public ekk(dym $$0, dym $$1, bsv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bsv a() {
      return this.d;
   }
}
