import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dak(cwk d, ke e) implements czz {
   public static final MapCodec<dak> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwk.b.fieldOf("properties").forGetter(dak::b), ke.f.optionalFieldOf("offset", ke.g).forGetter(dak::c)).apply($$0, dak::new)
   );

   public dak(cwk $$0) {
      this($$0, ke.g);
   }

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      ja $$5 = ja.a($$4).a(this.e);
      dsh $$6 = $$3.dP().a_($$5);
      dsh $$7 = this.d.a($$6);
      if (!$$6.equals($$7)) {
         $$3.dP().a($$5, $$7, 3);
      }
   }

   @Override
   public MapCodec<dak> a() {
      return a;
   }

   public cwk b() {
      return this.d;
   }

   public ke c() {
      return this.e;
   }
}
