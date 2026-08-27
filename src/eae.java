import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eae implements eai {
   public static final Codec<eae> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpi.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dpi.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bnk.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bnk.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eae::new)
   );
   private final dpi b;
   private final dpi c;
   private final bnk d;
   private final bnk e;

   public eae(dpi $$0, dpi $$1, bnk $$2, bnk $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dpi a() {
      return this.b;
   }

   public dpi b() {
      return this.c;
   }

   public bnk c() {
      return this.d;
   }

   public bnk d() {
      return this.e;
   }
}
