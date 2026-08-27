import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvx extends dvz {
   public static final Codec<dvx> a = arj.<dvx>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dvx::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dvx::b),
                        dvy.c.optionalFieldOf("spread_type", dvy.a).forGetter(dvx::c)
                     )
                  )
                  .apply($$0, dvx::new)
         ),
         dvx::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dvy e;

   private static DataResult<dvx> a(dvx $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dvx(hy $$0, dvz.c $$1, float $$2, int $$3, Optional<dvz.a> $$4, int $$5, int $$6, dvy $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dvx(int $$0, int $$1, dvy $$2, int $$3) {
      this(hy.g, dvz.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dvy c() {
      return this.e;
   }

   public cpi a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dll $$5 = new dll(new dkn(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cpi($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dhb $$0, int $$1, int $$2) {
      cpi $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dwa<?> e() {
      return dwa.a;
   }
}
