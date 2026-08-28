import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dci(ali b, jq<bwd> d, dbz e, bwg.a f) implements dck {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ali.a.fieldOf("id").forGetter(dci::b),
               bwd.a.fieldOf("attribute").forGetter(dci::c),
               dbz.b.fieldOf("amount").forGetter(dci::d),
               bwg.a.f.fieldOf("operation").forGetter(dci::e)
            )
            .apply($$0, dci::new)
   );

   private ali a(bag $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bwg a(int $$0, bag $$1) {
      return new bwg(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bva $$6) {
         $$6.fa().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dbr $$0, bue $$1, ezn $$2, int $$3) {
      if ($$1 instanceof bva $$4) {
         $$4.fa().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jq<bwd>, bwg> a(int $$0, bum $$1) {
      HashMultimap<jq<bwd>, bwg> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bag)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   public jq<bwd> c() {
      return this.d;
   }

   public dbz d() {
      return this.e;
   }

   public bwg.a e() {
      return this.f;
   }
}
