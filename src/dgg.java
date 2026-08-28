import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgg(alg b, je<byf> d, dfx e, byi.a f) implements dgi {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alg.a.fieldOf("id").forGetter(dgg::b),
               byf.a.fieldOf("attribute").forGetter(dgg::c),
               dfx.b.fieldOf("amount").forGetter(dgg::d),
               byi.a.f.fieldOf("operation").forGetter(dgg::e)
            )
            .apply($$0, dgg::new)
   );

   private alg a(bak $$0) {
      return this.b.g("/" + $$0.c());
   }

   public byi a(int $$0, bak $$1) {
      return new byi(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bxe $$6) {
         $$6.fa().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dfp $$0, bwf $$1, feq $$2, int $$3) {
      if ($$1 instanceof bxe $$4) {
         $$4.fa().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<je<byf>, byi> a(int $$0, bwp $$1) {
      HashMultimap<je<byf>, byi> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bak)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   public je<byf> c() {
      return this.d;
   }

   public dfx d() {
      return this.e;
   }

   public byi.a e() {
      return this.f;
   }
}
