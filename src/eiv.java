import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiv implements eiz {
   public static final Codec<eiv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxu.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dxu.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bsn.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bsn.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eiv::new)
   );
   private final dxu b;
   private final dxu c;
   private final bsn d;
   private final bsn e;

   public eiv(dxu $$0, dxu $$1, bsn $$2, bsn $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dxu a() {
      return this.b;
   }

   public dxu b() {
      return this.c;
   }

   public bsn c() {
      return this.d;
   }

   public bsn d() {
      return this.e;
   }
}
