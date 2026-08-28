import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deo(alz b, jq<bxi> d, def e, bxl.a f) implements deq {
   public static final MapCodec<deo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alz.a.fieldOf("id").forGetter(deo::b),
               bxi.a.fieldOf("attribute").forGetter(deo::c),
               def.b.fieldOf("amount").forGetter(deo::d),
               bxl.a.f.fieldOf("operation").forGetter(deo::e)
            )
            .apply($$0, deo::new)
   );

   private alz a(bba $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bxl a(int $$0, bba $$1) {
      return new bxl(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bwf $$6) {
         $$6.eW().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(ddx $$0, bvj $$1, fbx $$2, int $$3) {
      if ($$1 instanceof bwf $$4) {
         $$4.eW().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jq<bxi>, bxl> a(int $$0, bvr $$1) {
      HashMultimap<jq<bxi>, bxl> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bba)$$1));
      return $$2;
   }

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   public jq<bxi> c() {
      return this.d;
   }

   public def d() {
      return this.e;
   }

   public bxl.a e() {
      return this.f;
   }
}
