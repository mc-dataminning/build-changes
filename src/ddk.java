import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddk(dde d) implements ddo {
   public static final MapCodec<ddk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dde.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, ddk::new));

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      cwn $$5 = $$2.a();
      if ($$5.b(kv.d) && $$5.b(kv.e)) {
         ard $$7 = $$2.c() instanceof ard $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   public dde b() {
      return this.d;
   }
}
