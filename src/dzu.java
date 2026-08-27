import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dzu extends dzw {
   public static final Codec<dzu> a = atq.<dzu>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dzu::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dzu::b),
                        dzv.c.optionalFieldOf("spread_type", dzv.a).forGetter(dzu::c)
                     )
                  )
                  .apply($$0, dzu::new)
         ),
         dzu::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dzv e;

   private static DataResult<dzu> a(dzu $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dzu(jb $$0, dzw.c $$1, float $$2, int $$3, Optional<dzw.a> $$4, int $$5, int $$6, dzv $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dzu(int $$0, int $$1, dzv $$2, int $$3) {
      this(jb.g, dzw.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dzv c() {
      return this.e;
   }

   public csp a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dpi $$5 = new dpi(new dok(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new csp($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dky $$0, int $$1, int $$2) {
      csp $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dzx<?> e() {
      return dzx.a;
   }
}
