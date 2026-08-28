import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efu implements efy {
   public static final Codec<efu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dus.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dus.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bqx.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bqx.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, efu::new)
   );
   private final dus b;
   private final dus c;
   private final bqx d;
   private final bqx e;

   public efu(dus $$0, dus $$1, bqx $$2, bqx $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dus a() {
      return this.b;
   }

   public dus b() {
      return this.c;
   }

   public bqx c() {
      return this.d;
   }

   public bqx d() {
      return this.e;
   }
}
