import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ekk extends ekm {
   public static final MapCodec<ekk> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(ekk::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(ekk::b),
                     ekl.c.optionalFieldOf("spread_type", ekl.a).forGetter(ekk::c)
                  )
               )
               .apply($$0, ekk::new)
      )
      .validate(ekk::a);
   private final int c;
   private final int d;
   private final ekl e;

   private static DataResult<ekk> a(ekk $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public ekk(kh $$0, ekm.c $$1, float $$2, int $$3, Optional<ekm.a> $$4, int $$5, int $$6, ekl $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public ekk(int $$0, int $$1, ekl $$2, int $$3) {
      this(kh.g, ekm.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ekl c() {
      return this.e;
   }

   public dcd a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dzx $$5 = new dzx(new dyz(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dcd($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dva $$0, int $$1, int $$2) {
      dcd $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ekn<?> e() {
      return ekn.a;
   }
}
