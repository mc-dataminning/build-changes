import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dwd extends dwf {
   public static final Codec<dwd> a = arf.<dwd>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dwd::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dwd::b),
                        dwe.c.optionalFieldOf("spread_type", dwe.a).forGetter(dwd::c)
                     )
                  )
                  .apply($$0, dwd::new)
         ),
         dwd::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dwe e;

   private static DataResult<dwd> a(dwd $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dwd(hy $$0, dwf.c $$1, float $$2, int $$3, Optional<dwf.a> $$4, int $$5, int $$6, dwe $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dwd(int $$0, int $$1, dwe $$2, int $$3) {
      this(hy.g, dwf.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dwe c() {
      return this.e;
   }

   public cpc a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dlr $$5 = new dlr(new dkt(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cpc($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dhh $$0, int $$1, int $$2) {
      cpc $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dwg<?> e() {
      return dwg.a;
   }
}
