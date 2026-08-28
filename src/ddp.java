import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddp(akv b, jr<bwk> d, ddg e, bwn.a f) implements ddr {
   public static final MapCodec<ddp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akv.a.fieldOf("id").forGetter(ddp::b),
               bwk.a.fieldOf("attribute").forGetter(ddp::c),
               ddg.b.fieldOf("amount").forGetter(ddp::d),
               bwn.a.f.fieldOf("operation").forGetter(ddp::e)
            )
            .apply($$0, ddp::new)
   );

   private akv a(azv $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bwn a(int $$0, azv $$1) {
      return new bwn(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(ard $$0, int $$1, dcy $$2, bul $$3, fba $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bvh $$6) {
         $$6.eY().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dcy $$0, bul $$1, fba $$2, int $$3) {
      if ($$1 instanceof bvh $$4) {
         $$4.eY().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jr<bwk>, bwn> a(int $$0, but $$1) {
      HashMultimap<jr<bwk>, bwn> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (azv)$$1));
      return $$2;
   }

   @Override
   public MapCodec<ddp> a() {
      return a;
   }

   public jr<bwk> c() {
      return this.d;
   }

   public ddg d() {
      return this.e;
   }

   public bwn.a e() {
      return this.f;
   }
}
