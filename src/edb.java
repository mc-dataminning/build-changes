import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edb extends edd {
   public static final Codec<edb> a = avu.<edb>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(edb::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(edb::b),
                        edc.c.optionalFieldOf("spread_type", edc.a).forGetter(edb::c)
                     )
                  )
                  .apply($$0, edb::new)
         ),
         edb::a
      )
      .codec();
   private final int c;
   private final int d;
   private final edc e;

   private static DataResult<edb> a(edb $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public edb(jf $$0, edd.c $$1, float $$2, int $$3, Optional<edd.a> $$4, int $$5, int $$6, edc $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public edb(int $$0, int $$1, edc $$2, int $$3) {
      this(jf.g, edd.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public edc c() {
      return this.e;
   }

   public cvl a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dsp $$5 = new dsp(new drr(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cvl($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(doc $$0, int $$1, int $$2) {
      cvl $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ede<?> e() {
      return ede.a;
   }
}
