import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elj extends ell {
   public static final MapCodec<elj> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(elj::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(elj::b),
                     elk.c.optionalFieldOf("spread_type", elk.a).forGetter(elj::c)
                  )
               )
               .apply($$0, elj::new)
      )
      .validate(elj::a);
   private final int c;
   private final int d;
   private final elk e;

   private static DataResult<elj> a(elj $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public elj(ki $$0, ell.c $$1, float $$2, int $$3, Optional<ell.a> $$4, int $$5, int $$6, elk $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public elj(int $$0, int $$1, elk $$2, int $$3) {
      this(ki.g, ell.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public elk c() {
      return this.e;
   }

   public dcy a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      eav $$5 = new eav(new dzx(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dcy($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dvy $$0, int $$1, int $$2) {
      dcy $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public elm<?> e() {
      return elm.a;
   }
}
