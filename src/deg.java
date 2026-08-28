import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deg(alp b, jq<bxa> d, ddx e, bxd.a f) implements dei {
   public static final MapCodec<deg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alp.a.fieldOf("id").forGetter(deg::b),
               bxa.a.fieldOf("attribute").forGetter(deg::c),
               ddx.b.fieldOf("amount").forGetter(deg::d),
               bxd.a.f.fieldOf("operation").forGetter(deg::e)
            )
            .apply($$0, deg::new)
   );

   private alp a(baq $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bxd a(int $$0, baq $$1) {
      return new bxd(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bvx $$6) {
         $$6.eY().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(ddp $$0, bvb $$1, fbr $$2, int $$3) {
      if ($$1 instanceof bvx $$4) {
         $$4.eY().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jq<bxa>, bxd> a(int $$0, bvj $$1) {
      HashMultimap<jq<bxa>, bxd> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (baq)$$1));
      return $$2;
   }

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   public jq<bxa> c() {
      return this.d;
   }

   public ddx d() {
      return this.e;
   }

   public bxd.a e() {
      return this.f;
   }
}
