import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class esw extends esy {
   public static final MapCodec<esw> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(esw::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(esw::b),
                     esx.c.optionalFieldOf("spread_type", esx.a).forGetter(esw::c)
                  )
               )
               .apply($$0, esw::new)
      )
      .validate(esw::a);
   private final int c;
   private final int d;
   private final esx e;

   private static DataResult<esw> a(esw $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public esw(ka $$0, esy.c $$1, float $$2, int $$3, Optional<esy.a> $$4, int $$5, int $$6, esx $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public esw(int $$0, int $$1, esx $$2, int $$3) {
      this(ka.i, esy.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public esx c() {
      return this.e;
   }

   public djc a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      eic $$5 = new eic(new ehe(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new djc($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(edd $$0, int $$1, int $$2) {
      djc $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public esz<?> e() {
      return esz.a;
   }
}
