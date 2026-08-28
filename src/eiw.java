import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiw implements eja {
   public static final Codec<eiw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxv.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dxv.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bso.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bso.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eiw::new)
   );
   private final dxv b;
   private final dxv c;
   private final bso d;
   private final bso e;

   public eiw(dxv $$0, dxv $$1, bso $$2, bso $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dxv a() {
      return this.b;
   }

   public dxv b() {
      return this.c;
   }

   public bso c() {
      return this.d;
   }

   public bso d() {
      return this.e;
   }
}
