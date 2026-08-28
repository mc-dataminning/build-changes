import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddn(aku b, jr<bwi> d, dde e, bwl.a f) implements ddp {
   public static final MapCodec<ddn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aku.a.fieldOf("id").forGetter(ddn::b),
               bwi.a.fieldOf("attribute").forGetter(ddn::c),
               dde.b.fieldOf("amount").forGetter(ddn::d),
               bwl.a.f.fieldOf("operation").forGetter(ddn::e)
            )
            .apply($$0, ddn::new)
   );

   private aku a(azu $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bwl a(int $$0, azu $$1) {
      return new bwl(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bvf $$6) {
         $$6.eY().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dcw $$0, buj $$1, fay $$2, int $$3) {
      if ($$1 instanceof bvf $$4) {
         $$4.eY().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jr<bwi>, bwl> a(int $$0, bur $$1) {
      HashMultimap<jr<bwi>, bwl> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (azu)$$1));
      return $$2;
   }

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   public jr<bwi> c() {
      return this.d;
   }

   public dde d() {
      return this.e;
   }

   public bwl.a e() {
      return this.f;
   }
}
