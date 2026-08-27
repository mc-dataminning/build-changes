import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxq extends dxs {
   public static final Codec<dxq> a = asq.<dxq>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dxq::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dxq::b),
                        dxr.c.optionalFieldOf("spread_type", dxr.a).forGetter(dxq::c)
                     )
                  )
                  .apply($$0, dxq::new)
         ),
         dxq::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dxr e;

   private static DataResult<dxq> a(dxq $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dxq(iw $$0, dxs.c $$1, float $$2, int $$3, Optional<dxs.a> $$4, int $$5, int $$6, dxr $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dxq(int $$0, int $$1, dxr $$2, int $$3) {
      this(iw.g, dxs.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dxr c() {
      return this.e;
   }

   public cqz a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dne $$5 = new dne(new dmg(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cqz($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(diu $$0, int $$1, int $$2) {
      cqz $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dxt<?> e() {
      return dxt.a;
   }
}
