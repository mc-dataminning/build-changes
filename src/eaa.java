import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eaa extends eac {
   public static final Codec<eaa> a = atv.<eaa>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> a($$0)
                  .and(
                     $$0.group(
                        Codec.intRange(0, 4096).fieldOf("spacing").forGetter(eaa::a),
                        Codec.intRange(0, 4096).fieldOf("separation").forGetter(eaa::b),
                        eab.c.optionalFieldOf("spread_type", eab.a).forGetter(eaa::c)
                     )
                  )
                  .apply($$0, eaa::new)
         ),
         eaa::a
      )
      .codec();
   private final int c;
   private final int d;
   private final eab e;

   private static DataResult<eaa> a(eaa $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public eaa(jb $$0, eac.c $$1, float $$2, int $$3, Optional<eac.a> $$4, int $$5, int $$6, eab $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public eaa(int $$0, int $$1, eab $$2, int $$3) {
      this(jb.g, eac.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public eab c() {
      return this.e;
   }

   public csv a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dpo $$5 = new dpo(new doq(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new csv($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dle $$0, int $$1, int $$2) {
      csv $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public ead<?> e() {
      return ead.a;
   }
}
