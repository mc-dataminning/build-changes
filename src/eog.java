import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eog extends eoi {
   public static final MapCodec<eog> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eog::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(eog::b),
                     eoh.c.optionalFieldOf("spread_type", eoh.a).forGetter(eog::c)
                  )
               )
               .apply($$0, eog::new)
      )
      .validate(eog::a);
   private final int c;
   private final int d;
   private final eoh e;

   private static DataResult<eog> a(eog $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eog(km $$0, eoi.c $$1, float $$2, int $$3, Optional<eoi.a> $$4, int $$5, int $$6, eoh $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eog(int $$0, int $$1, eoh $$2, int $$3) {
      this(km.h, eoi.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eoh c() {
      return this.e;
   }

   public dfn a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      edq $$5 = new edq(new ecs(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dfn($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dyt $$0, int $$1, int $$2) {
      dfn $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public eoj<?> e() {
      return eoj.a;
   }
}
