import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ekh extends ekj {
   public static final MapCodec<ekh> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(ekh::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(ekh::b),
                     eki.c.optionalFieldOf("spread_type", eki.a).forGetter(ekh::c)
                  )
               )
               .apply($$0, ekh::new)
      )
      .validate(ekh::a);
   private final int c;
   private final int d;
   private final eki e;

   private static DataResult<ekh> a(ekh $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public ekh(kh $$0, ekj.c $$1, float $$2, int $$3, Optional<ekj.a> $$4, int $$5, int $$6, eki $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public ekh(int $$0, int $$1, eki $$2, int $$3) {
      this(kh.g, ekj.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eki c() {
      return this.e;
   }

   public dcb a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dzu $$5 = new dzu(new dyw(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dcb($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(duy $$0, int $$1, int $$2) {
      dcb $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ekk<?> e() {
      return ekk.a;
   }
}
