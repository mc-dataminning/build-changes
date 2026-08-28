import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eoh extends eoj {
   public static final MapCodec<eoh> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eoh::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(eoh::b),
                     eoi.c.optionalFieldOf("spread_type", eoi.a).forGetter(eoh::c)
                  )
               )
               .apply($$0, eoh::new)
      )
      .validate(eoh::a);
   private final int c;
   private final int d;
   private final eoi e;

   private static DataResult<eoh> a(eoh $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eoh(km $$0, eoj.c $$1, float $$2, int $$3, Optional<eoj.a> $$4, int $$5, int $$6, eoi $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eoh(int $$0, int $$1, eoi $$2, int $$3) {
      this(km.h, eoj.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eoi c() {
      return this.e;
   }

   public dfo a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      edr $$5 = new edr(new ect(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dfo($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dyu $$0, int $$1, int $$2) {
      dfo $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public eok<?> e() {
      return eok.a;
   }
}
