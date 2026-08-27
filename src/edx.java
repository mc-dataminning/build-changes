import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edx extends edz {
   public static final Codec<edx> a = awe.<edx>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(edx::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(edx::b),
                        edy.c.optionalFieldOf("spread_type", edy.a).forGetter(edx::c)
                     )
                  )
                  .apply($$0, edx::new)
         ),
         edx::a
      )
      .codec();
   private final int c;
   private final int d;
   private final edy e;

   private static DataResult<edx> a(edx $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public edx(jg $$0, edz.c $$1, float $$2, int $$3, Optional<edz.a> $$4, int $$5, int $$6, edy $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public edx(int $$0, int $$1, edy $$2, int $$3) {
      this(jg.g, edz.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public edy c() {
      return this.e;
   }

   public cwg a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dtl $$5 = new dtl(new dsn(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cwg($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dox $$0, int $$1, int $$2) {
      cwg $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public eea<?> e() {
      return eea.a;
   }
}
