import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhd(alk b, jg<byx> d, dgu e, bza.a f) implements dhf {
   public static final MapCodec<dhd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alk.a.fieldOf("id").forGetter(dhd::b),
               byx.a.fieldOf("attribute").forGetter(dhd::c),
               dgu.b.fieldOf("amount").forGetter(dhd::d),
               bza.a.f.fieldOf("operation").forGetter(dhd::e)
            )
            .apply($$0, dhd::new)
   );

   private alk a(bao $$0) {
      return this.b.g("/" + $$0.c());
   }

   public bza a(int $$0, bao $$1) {
      return new bza(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4, boolean $$5) {
      if ($$5 && $$3 instanceof bxw $$6) {
         $$6.fa().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dgm $$0, bwv $$1, ffs $$2, int $$3) {
      if ($$1 instanceof bxw $$4) {
         $$4.fa().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jg<byx>, bza> a(int $$0, bxf $$1) {
      HashMultimap<jg<byx>, bza> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bao)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   public jg<byx> c() {
      return this.d;
   }

   public dgu d() {
      return this.e;
   }

   public bza.a e() {
      return this.f;
   }
}
