import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ero extends erq {
   public static final MapCodec<ero> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(ero::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(ero::b),
                     erp.c.optionalFieldOf("spread_type", erp.a).forGetter(ero::c)
                  )
               )
               .apply($$0, ero::new)
      )
      .validate(ero::a);
   private final int c;
   private final int d;
   private final erp e;

   private static DataResult<ero> a(ero $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public ero(jz $$0, erq.c $$1, float $$2, int $$3, Optional<erq.a> $$4, int $$5, int $$6, erp $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public ero(int $$0, int $$1, erp $$2, int $$3) {
      this(jz.i, erq.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public erp c() {
      return this.e;
   }

   public dic a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      egx $$5 = new egx(new efz(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dic($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(eby $$0, int $$1, int $$2) {
      dic $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public err<?> e() {
      return err.a;
   }
}
