import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddp(aku b, jr<bwj> d, ddg e, bwm.a f) implements ddr {
   public static final MapCodec<ddp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aku.a.fieldOf("id").forGetter(ddp::b),
               bwj.a.fieldOf("attribute").forGetter(ddp::c),
               ddg.b.fieldOf("amount").forGetter(ddp::d),
               bwm.a.f.fieldOf("operation").forGetter(ddp::e)
            )
            .apply($$0, ddp::new)
   );

   private aku a(azv $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bwm a(int $$0, azv $$1) {
      return new bwm(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bvg $$6) {
         $$6.eY().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dcy $$0, buk $$1, fba $$2, int $$3) {
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
   public MapCodec<ddp> a() {
      return a;
   }

   public jr<bwj> c() {
      return this.d;
   }

   public ddg d() {
      return this.e;
   }

   public bwm.a e() {
      return this.f;
   }
}
