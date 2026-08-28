import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eja extends ejc {
   public static final MapCodec<eja> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eja::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(eja::b),
                     ejb.c.optionalFieldOf("spread_type", ejb.a).forGetter(eja::c)
                  )
               )
               .apply($$0, eja::new)
      )
      .validate(eja::a);
   private final int c;
   private final int d;
   private final ejb e;

   private static DataResult<eja> a(eja $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eja(kd $$0, ejc.c $$1, float $$2, int $$3, Optional<ejc.a> $$4, int $$5, int $$6, ejb $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eja(int $$0, int $$1, ejb $$2, int $$3) {
      this(kd.g, ejc.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ejb c() {
      return this.e;
   }

   public dba a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dyo $$5 = new dyo(new dxq(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dba($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dtv $$0, int $$1, int $$2) {
      dba $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ejd<?> e() {
      return ejd.a;
   }
}
