import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eti extends etk {
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eti::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(eti::b),
                     etj.c.optionalFieldOf("spread_type", etj.a).forGetter(eti::c)
                  )
               )
               .apply($$0, eti::new)
      )
      .validate(eti::a);
   private final int c;
   private final int d;
   private final etj e;

   private static DataResult<eti> a(eti $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eti(kb $$0, etk.c $$1, float $$2, int $$3, Optional<etk.a> $$4, int $$5, int $$6, etj $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eti(int $$0, int $$1, etj $$2, int $$3) {
      this(kb.i, etk.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public etj c() {
      return this.e;
   }

   public djo a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      eio $$5 = new eio(new ehq(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new djo($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(edp $$0, int $$1, int $$2) {
      djo $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public etl<?> e() {
      return etl.a;
   }
}
