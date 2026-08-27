import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eie extends eig {
   public static final MapCodec<eie> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eie::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(eie::b),
                     eif.c.optionalFieldOf("spread_type", eif.a).forGetter(eie::c)
                  )
               )
               .apply($$0, eie::new)
      )
      .validate(eie::a);
   private final int c;
   private final int d;
   private final eif e;

   private static DataResult<eie> a(eie $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eie(js $$0, eig.c $$1, float $$2, int $$3, Optional<eig.a> $$4, int $$5, int $$6, eif $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eie(int $$0, int $$1, eif $$2, int $$3) {
      this(js.g, eig.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eif c() {
      return this.e;
   }

   public dae a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dxs $$5 = new dxs(new dwu(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dae($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dsz $$0, int $$1, int $$2) {
      dae $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public eih<?> e() {
      return eih.a;
   }
}
