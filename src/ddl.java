import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddl(ddf d) implements ddp {
   public static final MapCodec<ddl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddf.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, ddl::new));

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      cwo $$5 = $$2.a();
      if ($$5.b(kv.d) && $$5.b(kv.e)) {
         are $$7 = $$2.c() instanceof are $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public ddf b() {
      return this.d;
   }
}
