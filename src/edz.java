import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edz extends eeb {
   public static final Codec<edz> a = awe.<edz>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(edz::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(edz::b),
                        eea.c.optionalFieldOf("spread_type", eea.a).forGetter(edz::c)
                     )
                  )
                  .apply($$0, edz::new)
         ),
         edz::a
      )
      .codec();
   private final int c;
   private final int d;
   private final eea e;

   private static DataResult<edz> a(edz $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public edz(jg $$0, eeb.c $$1, float $$2, int $$3, Optional<eeb.a> $$4, int $$5, int $$6, eea $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public edz(int $$0, int $$1, eea $$2, int $$3) {
      this(jg.g, eeb.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eea c() {
      return this.e;
   }

   public cwi a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dtn $$5 = new dtn(new dsp(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cwi($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(doz $$0, int $$1, int $$2) {
      cwi $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public eec<?> e() {
      return eec.a;
   }
}
