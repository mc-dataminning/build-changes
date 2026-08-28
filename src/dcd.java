import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcd(ale b, jo<bvp> d, dbu e, bvs.a f) implements dcf {
   public static final MapCodec<dcd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a.fieldOf("id").forGetter(dcd::b),
               bvp.a.fieldOf("attribute").forGetter(dcd::c),
               dbu.b.fieldOf("amount").forGetter(dcd::d),
               bvs.a.f.fieldOf("operation").forGetter(dcd::e)
            )
            .apply($$0, dcd::new)
   );

   private ale a(bab $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bvs a(int $$0, bab $$1) {
      return new bvs(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bun $$6) {
         $$6.eV().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dbm $$0, btr $$1, eyw $$2, int $$3) {
      if ($$1 instanceof bun $$4) {
         $$4.eV().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jo<bvp>, bvs> a(int $$0, btz $$1) {
      HashMultimap<jo<bvp>, bvs> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bab)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dcd> a() {
      return a;
   }

   public jo<bvp> c() {
      return this.d;
   }

   public dbu d() {
      return this.e;
   }

   public bvs.a e() {
      return this.f;
   }
}
