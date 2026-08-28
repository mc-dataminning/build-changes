import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ely implements emc {
   public static final Codec<ely> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eat.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               eat.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               btl.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               btl.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ely::new)
   );
   private final eat b;
   private final eat c;
   private final btl d;
   private final btl e;

   public ely(eat $$0, eat $$1, btl $$2, btl $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public eat a() {
      return this.b;
   }

   public eat b() {
      return this.c;
   }

   public btl c() {
      return this.d;
   }

   public btl d() {
      return this.e;
   }
}
