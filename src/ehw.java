import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehw implements eia {
   public static final Codec<ehw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwv.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dwv.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               brn.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               brn.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehw::new)
   );
   private final dwv b;
   private final dwv c;
   private final brn d;
   private final brn e;

   public ehw(dwv $$0, dwv $$1, brn $$2, brn $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dwv a() {
      return this.b;
   }

   public dwv b() {
      return this.c;
   }

   public brn c() {
      return this.d;
   }

   public brn d() {
      return this.e;
   }
}
