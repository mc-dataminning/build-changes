import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgn(alg b, jf<byk> d, dge e, byn.a f) implements dgp {
   public static final MapCodec<dgn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alg.a.fieldOf("id").forGetter(dgn::b),
               byk.a.fieldOf("attribute").forGetter(dgn::c),
               dge.b.fieldOf("amount").forGetter(dgn::d),
               byn.a.f.fieldOf("operation").forGetter(dgn::e)
            )
            .apply($$0, dgn::new)
   );

   private alg a(bak $$0) {
      return this.b.g("/" + $$0.c());
   }

   public byn a(int $$0, bak $$1) {
      return new byn(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bxj $$6) {
         $$6.eZ().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dfw $$0, bwi $$1, fex $$2, int $$3) {
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
   public MapCodec<dgn> a() {
      return a;
   }

   public jf<byk> c() {
      return this.d;
   }

   public dge d() {
      return this.e;
   }

   public byn.a e() {
      return this.f;
   }
}
