import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddq(akv b, jr<bwl> d, ddh e, bwo.a f) implements dds {
   public static final MapCodec<ddq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akv.a.fieldOf("id").forGetter(ddq::b),
               bwl.a.fieldOf("attribute").forGetter(ddq::c),
               ddh.b.fieldOf("amount").forGetter(ddq::d),
               bwo.a.f.fieldOf("operation").forGetter(ddq::e)
            )
            .apply($$0, ddq::new)
   );

   private akv a(azv $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bwo a(int $$0, azv $$1) {
      return new bwo(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bvi $$6) {
         $$6.eY().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dcz $$0, bum $$1, fbb $$2, int $$3) {
      if ($$1 instanceof bvi $$4) {
         $$4.eY().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jr<bwl>, bwo> a(int $$0, buu $$1) {
      HashMultimap<jr<bwl>, bwo> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (azv)$$1));
      return $$2;
   }

   @Override
   public MapCodec<ddq> a() {
      return a;
   }

   public jr<bwl> c() {
      return this.d;
   }

   public ddh d() {
      return this.e;
   }

   public bwo.a e() {
      return this.f;
   }
}
