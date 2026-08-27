import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eaj extends eal {
   public static final Codec<eaj> a = atx.<eaj>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eaj::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(eaj::b),
                        eak.c.optionalFieldOf("spread_type", eak.a).forGetter(eaj::c)
                     )
                  )
                  .apply($$0, eaj::new)
         ),
         eaj::a
      )
      .codec();
   private final int c;
   private final int d;
   private final eak e;

   private static DataResult<eaj> a(eaj $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eaj(jb $$0, eal.c $$1, float $$2, int $$3, Optional<eal.a> $$4, int $$5, int $$6, eak $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eaj(int $$0, int $$1, eak $$2, int $$3) {
      this(jb.g, eal.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eak c() {
      return this.e;
   }

   public cte a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dpx $$5 = new dpx(new doz(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cte($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dln $$0, int $$1, int $$2) {
      cte $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public eam<?> e() {
      return eam.a;
   }
}
