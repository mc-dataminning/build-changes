import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddm(ddg d) implements ddq {
   public static final MapCodec<ddm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddg.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, ddm::new));

   @Override
   public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4) {
      cwp $$5 = $$2.a();
      if ($$5.b(kv.d) && $$5.b(kv.e)) {
         ard $$7 = $$2.c() instanceof ard $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   public ddg b() {
      return this.d;
   }
}
