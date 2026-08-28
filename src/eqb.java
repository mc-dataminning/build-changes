import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eqb extends eqd {
   public static final MapCodec<eqb> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eqb::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(eqb::b),
                     eqc.c.optionalFieldOf("spread_type", eqc.a).forGetter(eqb::c)
                  )
               )
               .apply($$0, eqb::new)
      )
      .validate(eqb::a);
   private final int c;
   private final int d;
   private final eqc e;

   private static DataResult<eqb> a(eqb $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eqb(kn $$0, eqd.c $$1, float $$2, int $$3, Optional<eqd.a> $$4, int $$5, int $$6, eqc $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eqb(int $$0, int $$1, eqc $$2, int $$3) {
      this(kn.i, eqd.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eqc c() {
      return this.e;
   }

   public dgw a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      efk $$5 = new efk(new eem(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dgw($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(eal $$0, int $$1, int $$2) {
      dgw $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public eqe<?> e() {
      return eqe.a;
   }
}
