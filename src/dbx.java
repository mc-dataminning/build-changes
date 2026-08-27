import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbx {
   public static final Codec<dbx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ky.bf.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dbx::new)
   );
   private final kw b;
   private final float c;

   public dbx(kw $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public kw a() {
      return this.b;
   }

   public boolean a(aym $$0) {
      return $$0.i() <= this.c;
   }
}
