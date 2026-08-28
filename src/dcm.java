import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcm(all b, jq<bwh> d, dcd e, bwk.a f) implements dco {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               all.a.fieldOf("id").forGetter(dcm::b),
               bwh.a.fieldOf("attribute").forGetter(dcm::c),
               dcd.b.fieldOf("amount").forGetter(dcm::d),
               bwk.a.f.fieldOf("operation").forGetter(dcm::e)
            )
            .apply($$0, dcm::new)
   );

   private all a(baj $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bwk a(int $$0, baj $$1) {
      return new bwk(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bve $$6) {
         $$6.fb().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dbv $$0, bui $$1, ezr $$2, int $$3) {
      if ($$1 instanceof bve $$4) {
         $$4.fb().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jq<bwh>, bwk> a(int $$0, buq $$1) {
      HashMultimap<jq<bwh>, bwk> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (baj)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public jq<bwh> c() {
      return this.d;
   }

   public dcd d() {
      return this.e;
   }

   public bwk.a e() {
      return this.f;
   }
}
