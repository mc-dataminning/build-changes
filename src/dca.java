import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dca(alc b, jn<bvm> d, dbr e, bvp.a f) implements dcc {
   public static final MapCodec<dca> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alc.a.fieldOf("id").forGetter(dca::b),
               bvm.a.fieldOf("attribute").forGetter(dca::c),
               dbr.b.fieldOf("amount").forGetter(dca::d),
               bvp.a.f.fieldOf("operation").forGetter(dca::e)
            )
            .apply($$0, dca::new)
   );

   private alc a(azz $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bvp a(int $$0, azz $$1) {
      return new bvp(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4, boolean $$5) {
      if ($$5 && $$3 instanceof buk $$6) {
         $$6.eV().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dbj $$0, bto $$1, eys $$2, int $$3) {
      if ($$1 instanceof buk $$4) {
         $$4.eV().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jn<bvm>, bvp> a(int $$0, btw $$1) {
      HashMultimap<jn<bvm>, bvp> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (azz)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   public jn<bvm> c() {
      return this.d;
   }

   public dbr d() {
      return this.e;
   }

   public bvp.a e() {
      return this.f;
   }
}
