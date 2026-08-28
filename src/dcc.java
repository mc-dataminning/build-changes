import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcc(alh b, jp<bvy> d, dbt e, bwb.a f) implements dce {
   public static final MapCodec<dcc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alh.a.fieldOf("id").forGetter(dcc::b),
               bvy.a.fieldOf("attribute").forGetter(dcc::c),
               dbt.b.fieldOf("amount").forGetter(dcc::d),
               bwb.a.f.fieldOf("operation").forGetter(dcc::e)
            )
            .apply($$0, dcc::new)
   );

   private alh a(baf $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bwb a(int $$0, baf $$1) {
      return new bwb(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4, boolean $$5) {
      if ($$5 && $$3 instanceof buv $$6) {
         $$6.fa().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dbl $$0, btz $$1, ezh $$2, int $$3) {
      if ($$1 instanceof buv $$4) {
         $$4.fa().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jp<bvy>, bwb> a(int $$0, buh $$1) {
      HashMultimap<jp<bvy>, bwb> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (baf)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   public jp<bvy> c() {
      return this.d;
   }

   public dbt d() {
      return this.e;
   }

   public bwb.a e() {
      return this.f;
   }
}
