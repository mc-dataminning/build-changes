import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ejg extends eji {
   public static final MapCodec<ejg> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(ejg::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(ejg::b),
                     ejh.c.optionalFieldOf("spread_type", ejh.a).forGetter(ejg::c)
                  )
               )
               .apply($$0, ejg::new)
      )
      .validate(ejg::a);
   private final int c;
   private final int d;
   private final ejh e;

   private static DataResult<ejg> a(ejg $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public ejg(kd $$0, eji.c $$1, float $$2, int $$3, Optional<eji.a> $$4, int $$5, int $$6, ejh $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public ejg(int $$0, int $$1, ejh $$2, int $$3) {
      this(kd.g, eji.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ejh c() {
      return this.e;
   }

   public dbg a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dyu $$5 = new dyu(new dxw(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new dbg($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dub $$0, int $$1, int $$2) {
      dbg $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ejj<?> e() {
      return ejj.a;
   }
}
