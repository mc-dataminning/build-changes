import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dyh extends dyj {
   public static final Codec<dyh> a = asy.<dyh>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dyh::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(dyh::b),
                        dyi.c.optionalFieldOf("spread_type", dyi.a).forGetter(dyh::c)
                     )
                  )
                  .apply($$0, dyh::new)
         ),
         dyh::a
      )
      .codec();
   private final int c;
   private final int d;
   private final dyi e;

   private static DataResult<dyh> a(dyh $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public dyh(ja $$0, dyj.c $$1, float $$2, int $$3, Optional<dyj.a> $$4, int $$5, int $$6, dyi $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dyh(int $$0, int $$1, dyi $$2, int $$3) {
      this(ja.g, dyj.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dyi c() {
      return this.e;
   }

   public crm a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dnv $$5 = new dnv(new dmx(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new crm($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(djl $$0, int $$1, int $$2) {
      crm $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public dyk<?> e() {
      return dyk.a;
   }
}
