import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class esy extends eta {
   public static final MapCodec<esy> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(esy::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(esy::b),
                     esz.c.optionalFieldOf("spread_type", esz.a).forGetter(esy::c)
                  )
               )
               .apply($$0, esy::new)
      )
      .validate(esy::a);
   private final int c;
   private final int d;
   private final esz e;

   private static DataResult<esy> a(esy $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public esy(kb $$0, eta.c $$1, float $$2, int $$3, Optional<eta.a> $$4, int $$5, int $$6, esz $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public esy(int $$0, int $$1, esz $$2, int $$3) {
      this(kb.i, eta.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public esz c() {
      return this.e;
   }

   public dje a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      eie $$5 = new eie(new ehg(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dje($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(edf $$0, int $$1, int $$2) {
      dje $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public etb<?> e() {
      return etb.a;
   }
}
