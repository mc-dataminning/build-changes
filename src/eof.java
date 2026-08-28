import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eof extends eoh {
   public static final MapCodec<eof> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eof::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(eof::b),
                     eog.c.optionalFieldOf("spread_type", eog.a).forGetter(eof::c)
                  )
               )
               .apply($$0, eof::new)
      )
      .validate(eof::a);
   private final int c;
   private final int d;
   private final eog e;

   private static DataResult<eof> a(eof $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eof(km $$0, eoh.c $$1, float $$2, int $$3, Optional<eoh.a> $$4, int $$5, int $$6, eog $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eof(int $$0, int $$1, eog $$2, int $$3) {
      this(km.h, eoh.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eog c() {
      return this.e;
   }

   public dfm a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      edp $$5 = new edp(new ecr(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dfm($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dys $$0, int $$1, int $$2) {
      dfm $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public eoi<?> e() {
      return eoi.a;
   }
}
