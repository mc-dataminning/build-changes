import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eab extends ead {
   public static final Codec<eab> a = atw.<eab>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eab::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(eab::b),
                        eac.c.optionalFieldOf("spread_type", eac.a).forGetter(eab::c)
                     )
                  )
                  .apply($$0, eab::new)
         ),
         eab::a
      )
      .codec();
   private final int c;
   private final int d;
   private final eac e;

   private static DataResult<eab> a(eab $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eab(jb $$0, ead.c $$1, float $$2, int $$3, Optional<ead.a> $$4, int $$5, int $$6, eac $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eab(int $$0, int $$1, eac $$2, int $$3) {
      this(jb.g, ead.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eac c() {
      return this.e;
   }

   public csw a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dpp $$5 = new dpp(new dor(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new csw($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dlf $$0, int $$1, int $$2) {
      csw $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public eae<?> e() {
      return eae.a;
   }
}
