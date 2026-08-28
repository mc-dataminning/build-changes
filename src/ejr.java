import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ejr extends ejt {
   public static final MapCodec<ejr> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(ejr::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(ejr::b),
                     ejs.c.optionalFieldOf("spread_type", ejs.a).forGetter(ejr::c)
                  )
               )
               .apply($$0, ejr::new)
      )
      .validate(ejr::a);
   private final int c;
   private final int d;
   private final ejs e;

   private static DataResult<ejr> a(ejr $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public ejr(ke $$0, ejt.c $$1, float $$2, int $$3, Optional<ejt.a> $$4, int $$5, int $$6, ejs $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public ejr(int $$0, int $$1, ejs $$2, int $$3) {
      this(ke.g, ejt.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ejs c() {
      return this.e;
   }

   public dbm a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dze $$5 = new dze(new dyg(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dbm($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dui $$0, int $$1, int $$2) {
      dbm $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public eju<?> e() {
      return eju.a;
   }
}
