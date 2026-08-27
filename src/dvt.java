import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvt extends dvv {
   public static final Codec<dvt> a = aqy.<dvt>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dvt::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dvt::b),
                        dvu.c.optionalFieldOf("spread_type", dvu.a).forGetter(dvt::c)
                     )
                  )
                  .apply($$0, dvt::new)
         ),
         dvt::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dvu e;

   private static DataResult<dvt> a(dvt $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dvt(hz $$0, dvv.c $$1, float $$2, int $$3, Optional<dvv.a> $$4, int $$5, int $$6, dvu $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dvt(int $$0, int $$1, dvu $$2, int $$3) {
      this(hz.g, dvv.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dvu c() {
      return this.e;
   }

   public cos a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dlh $$5 = new dlh(new dkj(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cos($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dgx $$0, int $$1, int $$2) {
      cos $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dvw<?> e() {
      return dvw.a;
   }
}
