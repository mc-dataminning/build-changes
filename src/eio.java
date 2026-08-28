import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eio implements eis {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxn.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dxn.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bsj.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bsj.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eio::new)
   );
   private final dxn b;
   private final dxn c;
   private final bsj d;
   private final bsj e;

   public eio(dxn $$0, dxn $$1, bsj $$2, bsj $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dxn a() {
      return this.b;
   }

   public dxn b() {
      return this.c;
   }

   public bsj c() {
      return this.d;
   }

   public bsj d() {
      return this.e;
   }
}
