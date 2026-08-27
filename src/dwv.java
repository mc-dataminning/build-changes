import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dwv extends dwx {
   public static final Codec<dwv> a = asg.<dwv>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dwv::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dwv::b),
                        dww.c.optionalFieldOf("spread_type", dww.a).forGetter(dwv::c)
                     )
                  )
                  .apply($$0, dwv::new)
         ),
         dwv::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dww e;

   private static DataResult<dwv> a(dwv $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dwv(iw $$0, dwx.c $$1, float $$2, int $$3, Optional<dwx.a> $$4, int $$5, int $$6, dww $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dwv(int $$0, int $$1, dww $$2, int $$3) {
      this(iw.g, dwx.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dww c() {
      return this.e;
   }

   public cqg a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dmj $$5 = new dmj(new dll(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cqg($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dhz $$0, int $$1, int $$2) {
      cqg $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dwy<?> e() {
      return dwy.a;
   }
}
