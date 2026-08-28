import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class end extends enf {
   public static final MapCodec<end> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(end::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(end::b),
                     ene.c.optionalFieldOf("spread_type", ene.a).forGetter(end::c)
                  )
               )
               .apply($$0, end::new)
      )
      .validate(end::a);
   private final int c;
   private final int d;
   private final ene e;

   private static DataResult<end> a(end $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public end(kl $$0, enf.c $$1, float $$2, int $$3, Optional<enf.a> $$4, int $$5, int $$6, ene $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public end(int $$0, int $$1, ene $$2, int $$3) {
      this(kl.g, enf.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ene c() {
      return this.e;
   }

   public des a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      ecp $$5 = new ecp(new ebr(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new des($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dxs $$0, int $$1, int $$2) {
      des $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.g == $$1 && $$3.h == $$2;
   }

   @Override
   public eng<?> e() {
      return eng.a;
   }
}
