import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record del(def d) implements dep {
   public static final MapCodec<del> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(def.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, del::new));

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      cxo $$5 = $$2.a();
      if ($$5.b(ku.d) && $$5.b(ku.e)) {
         asi $$7 = $$2.c() instanceof asi $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public def b() {
      return this.d;
   }
}
