import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvs extends dvu {
   public static final Codec<dvs> a = aqw.<dvs>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dvs::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dvs::b),
                        dvt.c.optionalFieldOf("spread_type", dvt.a).forGetter(dvs::c)
                     )
                  )
                  .apply($$0, dvs::new)
         ),
         dvs::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dvt e;

   private static DataResult<dvs> a(dvs $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dvs(ia $$0, dvu.c $$1, float $$2, int $$3, Optional<dvu.a> $$4, int $$5, int $$6, dvt $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dvs(int $$0, int $$1, dvt $$2, int $$3) {
      this(ia.g, dvu.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dvt c() {
      return this.e;
   }

   public cor a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dlg $$5 = new dlg(new dki(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cor($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dgw $$0, int $$1, int $$2) {
      cor $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dvv<?> e() {
      return dvv.a;
   }
}
