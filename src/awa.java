import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class awa {
   public static final Codec<awa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awc.b.fieldOf("sound").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("min_delay").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("max_delay").forGetter($$0x -> $$0x.d),
               Codec.BOOL.fieldOf("replace_current_music").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, awa::new)
   );
   private final jn<awc> b;
   private final int c;
   private final int d;
   private final boolean e;

   public awa(jn<awc> $$0, int $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public jn<awc> a() {
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
