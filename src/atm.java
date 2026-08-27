import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class atm {
   public static final Codec<atm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ato.b.fieldOf("sound").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("min_delay").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("max_delay").forGetter($$0x -> $$0x.d),
               Codec.BOOL.fieldOf("replace_current_music").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, atm::new)
   );
   private final il<ato> b;
   private final int c;
   private final int d;
   private final boolean e;

   public atm(il<ato> $$0, int $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public il<ato> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }
}
