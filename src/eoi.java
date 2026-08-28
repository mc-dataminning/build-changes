import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eoi extends eok {
   public static final MapCodec<eoi> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eoi::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(eoi::b),
                     eoj.c.optionalFieldOf("spread_type", eoj.a).forGetter(eoi::c)
                  )
               )
               .apply($$0, eoi::new)
      )
      .validate(eoi::a);
   private final int c;
   private final int d;
   private final eoj e;

   private static DataResult<eoi> a(eoi $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eoi(km $$0, eok.c $$1, float $$2, int $$3, Optional<eok.a> $$4, int $$5, int $$6, eoj $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eoi(int $$0, int $$1, eoj $$2, int $$3) {
      this(km.h, eok.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eoj c() {
      return this.e;
   }

   public dfp a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      eds $$5 = new eds(new ecu(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dfp($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dyv $$0, int $$1, int $$2) {
      dfp $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public eol<?> e() {
      return eol.a;
   }
}
