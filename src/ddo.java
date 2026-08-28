import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddo(akv b, jr<bwj> d, ddf e, bwm.a f) implements ddq {
   public static final MapCodec<ddo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akv.a.fieldOf("id").forGetter(ddo::b),
               bwj.a.fieldOf("attribute").forGetter(ddo::c),
               ddf.b.fieldOf("amount").forGetter(ddo::d),
               bwm.a.f.fieldOf("operation").forGetter(ddo::e)
            )
            .apply($$0, ddo::new)
   );

   private akv a(azv $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bwm a(int $$0, azv $$1) {
      return new bwm(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bvg $$6) {
         $$6.eY().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dcx $$0, buk $$1, faz $$2, int $$3) {
      if ($$1 instanceof bvg $$4) {
         $$4.eY().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jr<bwj>, bwm> a(int $$0, bus $$1) {
      HashMultimap<jr<bwj>, bwm> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (azv)$$1));
      return $$2;
   }

   @Override
   public MapCodec<ddo> a() {
      return a;
   }

   public jr<bwj> c() {
      return this.d;
   }

   public ddf d() {
      return this.e;
   }

   public bwm.a e() {
      return this.f;
   }
}
