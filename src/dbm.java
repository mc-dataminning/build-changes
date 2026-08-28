import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbm(alb b, jn<bvh> d, dbd e, bvk.a f) implements dbo {
   public static final MapCodec<dbm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alb.a.fieldOf("id").forGetter(dbm::b),
               bvh.a.fieldOf("attribute").forGetter(dbm::c),
               dbd.b.fieldOf("amount").forGetter(dbm::d),
               bvk.a.f.fieldOf("operation").forGetter(dbm::e)
            )
            .apply($$0, dbm::new)
   );

   private alb a(azy $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bvk a(int $$0, azy $$1) {
      return new bvk(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4, boolean $$5) {
      if ($$5 && $$3 instanceof buf $$6) {
         $$6.eV().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dav $$0, btj $$1, eye $$2, int $$3) {
      if ($$1 instanceof buf $$4) {
         $$4.eV().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jn<bvh>, bvk> a(int $$0, btr $$1) {
      HashMultimap<jn<bvh>, bvk> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (azy)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dbm> a() {
      return a;
   }

   public jn<bvh> c() {
      return this.d;
   }

   public dbd d() {
      return this.e;
   }

   public bvk.a e() {
      return this.f;
   }
}
