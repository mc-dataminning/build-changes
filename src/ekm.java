import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ekm extends eko {
   public static final MapCodec<ekm> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(ekm::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(ekm::b),
                     ekn.c.optionalFieldOf("spread_type", ekn.a).forGetter(ekm::c)
                  )
               )
               .apply($$0, ekm::new)
      )
      .validate(ekm::a);
   private final int c;
   private final int d;
   private final ekn e;

   private static DataResult<ekm> a(ekm $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public ekm(kh $$0, eko.c $$1, float $$2, int $$3, Optional<eko.a> $$4, int $$5, int $$6, ekn $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public ekm(int $$0, int $$1, ekn $$2, int $$3) {
      this(kh.g, eko.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ekn c() {
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
   public ekp<?> e() {
      return ekp.a;
   }
}
