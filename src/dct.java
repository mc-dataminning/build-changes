import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dct(alj b, jq<bwk> d, dck e, bwn.a f) implements dcv {
   public static final MapCodec<dct> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alj.a.fieldOf("id").forGetter(dct::b),
               bwk.a.fieldOf("attribute").forGetter(dct::c),
               dck.b.fieldOf("amount").forGetter(dct::d),
               bwn.a.f.fieldOf("operation").forGetter(dct::e)
            )
            .apply($$0, dct::new)
   );

   private alj a(bai $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bwn a(int $$0, bai $$1) {
      return new bwn(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bvh $$6) {
         $$6.eW().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dcc $$0, bul $$1, ezy $$2, int $$3) {
      if ($$1 instanceof bvh $$4) {
         $$4.eW().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jq<bwk>, bwn> a(int $$0, but $$1) {
      HashMultimap<jq<bwk>, bwn> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bai)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   public jq<bwk> c() {
      return this.d;
   }

   public dck d() {
      return this.e;
   }

   public bwn.a e() {
      return this.f;
   }
}
