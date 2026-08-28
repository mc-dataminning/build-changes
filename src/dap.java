import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dap(akq b, jm<bup> d, dah e, bus.a f) implements dar {
   public static final MapCodec<dap> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akq.a.fieldOf("id").forGetter(dap::b),
               bup.a.fieldOf("attribute").forGetter(dap::c),
               dah.b.fieldOf("amount").forGetter(dap::d),
               bus.a.f.fieldOf("operation").forGetter(dap::e)
            )
            .apply($$0, dap::new)
   );

   private akq a(azj $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bus a(int $$0, azj $$1) {
      return new bus(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4, boolean $$5) {
      if ($$5 && $$3 instanceof btl $$6) {
         $$6.eT().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(czz $$0, bsq $$1, eww $$2, int $$3) {
      if ($$1 instanceof btl $$4) {
         $$4.eT().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jm<bup>, bus> a(int $$0, bsx $$1) {
      HashMultimap<jm<bup>, bus> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (azj)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dap> a() {
      return a;
   }

   public jm<bup> c() {
      return this.d;
   }

   public dah d() {
      return this.e;
   }

   public bus.a e() {
      return this.f;
   }
}
