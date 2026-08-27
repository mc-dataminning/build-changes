import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class egl extends egn {
   public static final Codec<egl> a = awu.<egl>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(egl::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(egl::b),
                        egm.c.optionalFieldOf("spread_type", egm.a).forGetter(egl::c)
                     )
                  )
                  .apply($$0, egl::new)
         ),
         egl::a
      )
      .codec();
   private final int c;
   private final int d;
   private final egm e;

   private static DataResult<egl> a(egl $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public egl(ji $$0, egn.c $$1, float $$2, int $$3, Optional<egn.a> $$4, int $$5, int $$6, egm $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public egl(int $$0, int $$1, egm $$2, int $$3) {
      this(ji.g, egn.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public egm c() {
      return this.e;
   }

   public cyn a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dvz $$5 = new dvz(new dvb(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cyn($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(drg $$0, int $$1, int $$2) {
      cyn $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ego<?> e() {
      return ego.a;
   }
}
