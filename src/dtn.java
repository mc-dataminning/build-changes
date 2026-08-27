import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtn implements dtr {
   public static final Codec<dtn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dja.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dja.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bja.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bja.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dtn::new)
   );
   private final dja b;
   private final dja c;
   private final bja d;
   private final bja e;

   public dtn(dja $$0, dja $$1, bja $$2, bja $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dja a() {
      return this.b;
   }

   public dja b() {
      return this.c;
   }

   public bja c() {
      return this.d;
   }

   public bja d() {
      return this.e;
   }
}
