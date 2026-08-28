import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ect implements ecx {
   public static final Codec<ect> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drx.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               drx.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpu.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpu.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ect::new)
   );
   private final drx b;
   private final drx c;
   private final bpu d;
   private final bpu e;

   public ect(drx $$0, drx $$1, bpu $$2, bpu $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public drx a() {
      return this.b;
   }

   public drx b() {
      return this.c;
   }

   public bpu c() {
      return this.d;
   }

   public bpu d() {
      return this.e;
   }
}
