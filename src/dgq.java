import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgq(alg b, jf<byk> d, dgh e, byn.a f) implements dgs {
   public static final MapCodec<dgq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alg.a.fieldOf("id").forGetter(dgq::b),
               byk.a.fieldOf("attribute").forGetter(dgq::c),
               dgh.b.fieldOf("amount").forGetter(dgq::d),
               byn.a.f.fieldOf("operation").forGetter(dgq::e)
            )
            .apply($$0, dgq::new)
   );

   private alg a(bak $$0) {
      return this.b.g("/" + $$0.c());
   }

   public byn a(int $$0, bak $$1) {
      return new byn(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bxj $$6) {
         $$6.eZ().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dfz $$0, bwi $$1, ffc $$2, int $$3) {
      if ($$1 instanceof bxj $$4) {
         $$4.eZ().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jf<byk>, byn> a(int $$0, bws $$1) {
      HashMultimap<jf<byk>, byn> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bak)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public jf<byk> c() {
      return this.d;
   }

   public dgh d() {
      return this.e;
   }

   public byn.a e() {
      return this.f;
   }
}
