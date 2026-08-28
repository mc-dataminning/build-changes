import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class esd extends esf {
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(esd::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(esd::b),
                     ese.c.optionalFieldOf("spread_type", ese.a).forGetter(esd::c)
                  )
               )
               .apply($$0, esd::new)
      )
      .validate(esd::a);
   private final int c;
   private final int d;
   private final ese e;

   private static DataResult<esd> a(esd $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public esd(ka $$0, esf.c $$1, float $$2, int $$3, Optional<esf.a> $$4, int $$5, int $$6, ese $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public esd(int $$0, int $$1, ese $$2, int $$3) {
      this(ka.i, esf.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ese c() {
      return this.e;
   }

   public dio a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      ehm $$5 = new ehm(new ego(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dio($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(ecn $$0, int $$1, int $$2) {
      dio $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public esg<?> e() {
      return esg.a;
   }
}
