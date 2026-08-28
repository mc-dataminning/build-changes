import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deh(aku b, jr<bxb> d, ddy e, bxe.a f) implements dej {
   public static final MapCodec<deh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aku.a.fieldOf("id").forGetter(deh::b),
               bxb.a.fieldOf("attribute").forGetter(deh::c),
               ddy.b.fieldOf("amount").forGetter(deh::d),
               bxe.a.f.fieldOf("operation").forGetter(deh::e)
            )
            .apply($$0, deh::new)
   );

   private aku a(azv $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bxe a(int $$0, azv $$1) {
      return new bxe(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bvy $$6) {
         $$6.eY().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(ddq $$0, bva $$1, fbx $$2, int $$3) {
      if ($$1 instanceof bvy $$4) {
         $$4.eY().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jr<bxb>, bxe> a(int $$0, bvj $$1) {
      HashMultimap<jr<bxb>, bxe> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (azv)$$1));
      return $$2;
   }

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   public jr<bxb> c() {
      return this.d;
   }

   public ddy d() {
      return this.e;
   }

   public bxe.a e() {
      return this.f;
   }
}
