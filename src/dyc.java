import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dyc extends dye {
   public static final Codec<dyc> a = asu.<dyc>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dyc::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dyc::b),
                        dyd.c.optionalFieldOf("spread_type", dyd.a).forGetter(dyc::c)
                     )
                  )
                  .apply($$0, dyc::new)
         ),
         dyc::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dyd e;

   private static DataResult<dyc> a(dyc $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dyc(iw $$0, dye.c $$1, float $$2, int $$3, Optional<dye.a> $$4, int $$5, int $$6, dyd $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dyc(int $$0, int $$1, dyd $$2, int $$3) {
      this(iw.g, dye.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dyd c() {
      return this.e;
   }

   public crh a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dnq $$5 = new dnq(new dms(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new crh($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(djg $$0, int $$1, int $$2) {
      crh $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dyf<?> e() {
      return dyf.a;
   }
}
