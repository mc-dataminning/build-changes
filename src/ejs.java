import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ejs extends eju {
   public static final MapCodec<ejs> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(ejs::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(ejs::b),
                     ejt.c.optionalFieldOf("spread_type", ejt.a).forGetter(ejs::c)
                  )
               )
               .apply($$0, ejs::new)
      )
      .validate(ejs::a);
   private final int c;
   private final int d;
   private final ejt e;

   private static DataResult<ejs> a(ejs $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public ejs(ke $$0, eju.c $$1, float $$2, int $$3, Optional<eju.a> $$4, int $$5, int $$6, ejt $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public ejs(int $$0, int $$1, ejt $$2, int $$3) {
      this(ke.g, eju.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ejt c() {
      return this.e;
   }

   public dbn a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dzf $$5 = new dzf(new dyh(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dbn($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(duj $$0, int $$1, int $$2) {
      dbn $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ejv<?> e() {
      return ejv.a;
   }
}
