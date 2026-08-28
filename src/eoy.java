import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eoy extends epa {
   public static final MapCodec<eoy> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eoy::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(eoy::b),
                     eoz.c.optionalFieldOf("spread_type", eoz.a).forGetter(eoy::c)
                  )
               )
               .apply($$0, eoy::new)
      )
      .validate(eoy::a);
   private final int c;
   private final int d;
   private final eoz e;

   private static DataResult<eoy> a(eoy $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eoy(kl $$0, epa.c $$1, float $$2, int $$3, Optional<epa.a> $$4, int $$5, int $$6, eoz $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eoy(int $$0, int $$1, eoz $$2, int $$3) {
      this(kl.h, epa.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eoz c() {
      return this.e;
   }

   public dgf a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      eei $$5 = new eei(new edk(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dgf($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dzl $$0, int $$1, int $$2) {
      dgf $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.h == $$1 && $$3.i == $$2;
   }

   @Override
   public epb<?> e() {
      return epb.a;
   }
}
