import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ehk extends ehm {
   public static final Codec<ehk> a = axh.<ehk>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(ehk::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(ehk::b),
                        ehl.c.optionalFieldOf("spread_type", ehl.a).forGetter(ehk::c)
                     )
                  )
                  .apply($$0, ehk::new)
         ),
         ehk::a
      )
      .codec();
   private final int c;
   private final int d;
   private final ehl e;

   private static DataResult<ehk> a(ehk $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public ehk(jr $$0, ehm.c $$1, float $$2, int $$3, Optional<ehm.a> $$4, int $$5, int $$6, ehl $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public ehk(int $$0, int $$1, ehl $$2, int $$3) {
      this(jr.g, ehm.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ehl c() {
      return this.e;
   }

   public czk a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dwy $$5 = new dwy(new dwa(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new czk($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dsf $$0, int $$1, int $$2) {
      czk $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ehn<?> e() {
      return ehn.a;
   }
}
