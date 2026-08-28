import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgb(alg b, je<byd> d, dfs e, byg.a f) implements dgd {
   public static final MapCodec<dgb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alg.a.fieldOf("id").forGetter(dgb::b),
               byd.a.fieldOf("attribute").forGetter(dgb::c),
               dfs.b.fieldOf("amount").forGetter(dgb::d),
               byg.a.f.fieldOf("operation").forGetter(dgb::e)
            )
            .apply($$0, dgb::new)
   );

   private alg a(bak $$0) {
      return this.b.g("/" + $$0.c());
   }

   public byg a(int $$0, bak $$1) {
      return new byg(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bxc $$6) {
         $$6.eZ().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dfk $$0, bwd $$1, fei $$2, int $$3) {
      if ($$1 instanceof bxc $$4) {
         $$4.eZ().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<je<byd>, byg> a(int $$0, bwn $$1) {
      HashMultimap<je<byd>, byg> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bak)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public je<byd> c() {
      return this.d;
   }

   public dfs d() {
      return this.e;
   }

   public byg.a e() {
      return this.f;
   }
}
