import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deh(alz b, jq<bxe> d, ddy e, bxh.a f) implements dej {
   public static final MapCodec<deh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alz.a.fieldOf("id").forGetter(deh::b),
               bxe.a.fieldOf("attribute").forGetter(deh::c),
               ddy.b.fieldOf("amount").forGetter(deh::d),
               bxh.a.f.fieldOf("operation").forGetter(deh::e)
            )
            .apply($$0, deh::new)
   );

   private alz a(bba $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bxh a(int $$0, bba $$1) {
      return new bxh(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bwb $$6) {
         $$6.eW().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(ddq $$0, bvf $$1, fbs $$2, int $$3) {
      if ($$1 instanceof bwb $$4) {
         $$4.eW().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jq<bxe>, bxh> a(int $$0, bvn $$1) {
      HashMultimap<jq<bxe>, bxh> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bba)$$1));
      return $$2;
   }

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   public jq<bxe> c() {
      return this.d;
   }

   public ddy d() {
      return this.e;
   }

   public bxh.a e() {
      return this.f;
   }
}
