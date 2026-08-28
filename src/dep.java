import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dep(alz b, jq<bxj> d, deg e, bxm.a f) implements der {
   public static final MapCodec<dep> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alz.a.fieldOf("id").forGetter(dep::b),
               bxj.a.fieldOf("attribute").forGetter(dep::c),
               deg.b.fieldOf("amount").forGetter(dep::d),
               bxm.a.f.fieldOf("operation").forGetter(dep::e)
            )
            .apply($$0, dep::new)
   );

   private alz a(bba $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bxm a(int $$0, bba $$1) {
      return new bxm(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bwg $$6) {
         $$6.eY().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(ddy $$0, bvk $$1, fby $$2, int $$3) {
      if ($$1 instanceof bwg $$4) {
         $$4.eY().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jq<bxj>, bxm> a(int $$0, bvs $$1) {
      HashMultimap<jq<bxj>, bxm> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bba)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public jq<bxj> c() {
      return this.d;
   }

   public deg d() {
      return this.e;
   }

   public bxm.a e() {
      return this.f;
   }
}
