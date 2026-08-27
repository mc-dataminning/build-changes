import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dwf extends dwh {
   public static final Codec<dwf> a = arh.<dwf>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dwf::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dwf::b),
                        dwg.c.optionalFieldOf("spread_type", dwg.a).forGetter(dwf::c)
                     )
                  )
                  .apply($$0, dwf::new)
         ),
         dwf::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dwg e;

   private static DataResult<dwf> a(dwf $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dwf(ib $$0, dwh.c $$1, float $$2, int $$3, Optional<dwh.a> $$4, int $$5, int $$6, dwg $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dwf(int $$0, int $$1, dwg $$2, int $$3) {
      this(ib.g, dwh.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dwg c() {
      return this.e;
   }

   public cpe a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dlt $$5 = new dlt(new dkv(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cpe($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dhj $$0, int $$1, int $$2) {
      cpe $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dwi<?> e() {
      return dwi.a;
   }
}
