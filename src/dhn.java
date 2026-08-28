import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhn(alr b, jg<bzg> d, dhe e, bzj.a f) implements dhp {
   public static final MapCodec<dhn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alr.a.fieldOf("id").forGetter(dhn::b),
               bzg.a.fieldOf("attribute").forGetter(dhn::c),
               dhe.b.fieldOf("amount").forGetter(dhn::d),
               bzj.a.f.fieldOf("operation").forGetter(dhn::e)
            )
            .apply($$0, dhn::new)
   );

   private alr a(bax $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bzj a(int $$0, bax $$1) {
      return new bzj(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4, boolean $$5) {
      if ($$5 && $$3 instanceof byf $$6) {
         $$6.fa().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dgw $$0, bxe $$1, fgc $$2, int $$3) {
      if ($$1 instanceof byf $$4) {
         $$4.fa().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jg<bzg>, bzj> a(int $$0, bxo $$1) {
      HashMultimap<jg<bzg>, bzj> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bax)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   public jg<bzg> c() {
      return this.d;
   }

   public dhe d() {
      return this.e;
   }

   public bzj.a e() {
      return this.f;
   }
}
