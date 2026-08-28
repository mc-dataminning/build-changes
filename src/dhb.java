import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhb(ali b, jf<byv> d, dgs e, byy.a f) implements dhd {
   public static final MapCodec<dhb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ali.a.fieldOf("id").forGetter(dhb::b),
               byv.a.fieldOf("attribute").forGetter(dhb::c),
               dgs.b.fieldOf("amount").forGetter(dhb::d),
               byy.a.f.fieldOf("operation").forGetter(dhb::e)
            )
            .apply($$0, dhb::new)
   );

   private ali a(bam $$0) {
      return this.b.g("/" + $$0.c());
   }

   public byy a(int $$0, bam $$1) {
      return new byy(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bxu $$6) {
         $$6.fa().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dgk $$0, bwt $$1, ffq $$2, int $$3) {
      if ($$1 instanceof bxu $$4) {
         $$4.fa().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jf<byv>, byy> a(int $$0, bxd $$1) {
      HashMultimap<jf<byv>, byy> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bam)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public jf<byv> c() {
      return this.d;
   }

   public dgs d() {
      return this.e;
   }

   public byy.a e() {
      return this.f;
   }
}
