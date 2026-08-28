import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dex(ald b, js<bxs> d, deo e, bxv.a f) implements dez {
   public static final MapCodec<dex> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ald.a.fieldOf("id").forGetter(dex::b),
               bxs.a.fieldOf("attribute").forGetter(dex::c),
               deo.b.fieldOf("amount").forGetter(dex::d),
               bxv.a.f.fieldOf("operation").forGetter(dex::e)
            )
            .apply($$0, dex::new)
   );

   private ald a(bag $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bxv a(int $$0, bag $$1) {
      return new bxv(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bwr $$6) {
         $$6.eZ().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(deg $$0, bvs $$1, fcu $$2, int $$3) {
      if ($$1 instanceof bwr $$4) {
         $$4.eZ().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<js<bxs>, bxv> a(int $$0, bwc $$1) {
      HashMultimap<js<bxs>, bxv> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bag)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public js<bxs> c() {
      return this.d;
   }

   public deo d() {
      return this.e;
   }

   public bxv.a e() {
      return this.f;
   }
}
