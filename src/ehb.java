import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ehb extends ehd {
   public static final Codec<ehb> a = axe.<ehb>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(ehb::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(ehb::b),
                        ehc.c.optionalFieldOf("spread_type", ehc.a).forGetter(ehb::c)
                     )
                  )
                  .apply($$0, ehb::new)
         ),
         ehb::a
      )
      .codec();
   private final int c;
   private final int d;
   private final ehc e;

   private static DataResult<ehb> a(ehb $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public ehb(jq $$0, ehd.c $$1, float $$2, int $$3, Optional<ehd.a> $$4, int $$5, int $$6, ehc $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public ehb(int $$0, int $$1, ehc $$2, int $$3) {
      this(jq.g, ehd.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public ehc c() {
      return this.e;
   }

   public czb a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dwp $$5 = new dwp(new dvr(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new czb($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(drw $$0, int $$1, int $$2) {
      czb $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ehe<?> e() {
      return ehe.a;
   }
}
