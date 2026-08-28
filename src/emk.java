import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emk implements emp {
   public static final Codec<emk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebe.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               ebe.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               btw.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               btw.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emk::new)
   );
   private final ebe b;
   private final ebe c;
   private final btw d;
   private final btw e;

   public emk(ebe $$0, ebe $$1, btw $$2, btw $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public ebe a() {
      return this.b;
   }

   public ebe b() {
      return this.c;
   }

   public btw c() {
      return this.d;
   }

   public btw d() {
      return this.e;
   }
}
