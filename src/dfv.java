import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfv(ale b, je<bya> d, dfm e, byd.a f) implements dfx {
   public static final MapCodec<dfv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a.fieldOf("id").forGetter(dfv::b),
               bya.a.fieldOf("attribute").forGetter(dfv::c),
               dfm.b.fieldOf("amount").forGetter(dfv::d),
               byd.a.f.fieldOf("operation").forGetter(dfv::e)
            )
            .apply($$0, dfv::new)
   );

   private ale a(bai $$0) {
      return this.b.g("/" + $$0.c());
   }

   public byd a(int $$0, bai $$1) {
      return new byd(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bwz $$6) {
         $$6.eZ().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dfe $$0, bwa $$1, fdw $$2, int $$3) {
      if ($$1 instanceof bwz $$4) {
         $$4.eZ().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<je<bya>, byd> a(int $$0, bwk $$1) {
      HashMultimap<je<bya>, byd> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bai)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public je<bya> c() {
      return this.d;
   }

   public dfm d() {
      return this.e;
   }

   public byd.a e() {
      return this.f;
   }
}
