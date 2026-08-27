import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eko extends ekq {
   public static final Codec<eko> a = axu.<eko>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eko::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(eko::b),
                        ekp.c.optionalFieldOf("spread_type", ekp.a).forGetter(eko::c)
                     )
                  )
                  .apply($$0, eko::new)
         ),
         eko::a
      )
      .codec();
   private final int c;
   private final int d;
   private final ekp e;

   private static DataResult<eko> a(eko $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eko(jv $$0, ekq.c $$1, float $$2, int $$3, Optional<ekq.a> $$4, int $$5, int $$6, ekp $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eko(int $$0, int $$1, ekp $$2, int $$3) {
      this(jv.g, ekq.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ekp c() {
      return this.e;
   }

   public dbh a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dzt $$5 = new dzt(new dyv(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dbh($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dva $$0, int $$1, int $$2) {
      dbh $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ekr<?> e() {
      return ekr.a;
   }
}
