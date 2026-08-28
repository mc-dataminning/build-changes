import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcl(dcd d) implements dcn {
   public static final MapCodec<dcl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcd.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dcl::new));

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      arr $$6 = $$2.c() instanceof arr $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   public dcd b() {
      return this.d;
   }
}
