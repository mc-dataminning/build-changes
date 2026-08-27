import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvu extends dvw {
   public static final Codec<dvu> a = aqy.<dvu>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dvu::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dvu::b),
                        dvv.c.optionalFieldOf("spread_type", dvv.a).forGetter(dvu::c)
                     )
                  )
                  .apply($$0, dvu::new)
         ),
         dvu::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dvv e;

   private static DataResult<dvu> a(dvu $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dvu(hz $$0, dvw.c $$1, float $$2, int $$3, Optional<dvw.a> $$4, int $$5, int $$6, dvv $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dvu(int $$0, int $$1, dvv $$2, int $$3) {
      this(hz.g, dvw.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dvv c() {
      return this.e;
   }

   public cot a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dli $$5 = new dli(new dkk(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cot($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dgy $$0, int $$1, int $$2) {
      cot $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dvx<?> e() {
      return dvx.a;
   }
}
