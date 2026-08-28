import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elx extends elz {
   public static final MapCodec<elx> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(elx::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(elx::b),
                     ely.c.optionalFieldOf("spread_type", ely.a).forGetter(elx::c)
                  )
               )
               .apply($$0, elx::new)
      )
      .validate(elx::a);
   private final int c;
   private final int d;
   private final ely e;

   private static DataResult<elx> a(elx $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public elx(ki $$0, elz.c $$1, float $$2, int $$3, Optional<elz.a> $$4, int $$5, int $$6, ely $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public elx(int $$0, int $$1, ely $$2, int $$3) {
      this(ki.g, elz.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ely c() {
      return this.e;
   }

   public ddm a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      ebj $$5 = new ebj(new eal(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new ddm($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dwm $$0, int $$1, int $$2) {
      ddm $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ema<?> e() {
      return ema.a;
   }
}
