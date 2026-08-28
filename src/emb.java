import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emb extends emd {
   public static final MapCodec<emb> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(emb::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(emb::b),
                     emc.c.optionalFieldOf("spread_type", emc.a).forGetter(emb::c)
                  )
               )
               .apply($$0, emb::new)
      )
      .validate(emb::a);
   private final int c;
   private final int d;
   private final emc e;

   private static DataResult<emb> a(emb $$0) {
      return $$0.c <= $$0.d ? DataResult.error(() -> "Spacing has to be larger than separation") : DataResult.success($$0);
   }

   public emb(kj $$0, emd.c $$1, float $$2, int $$3, Optional<emd.a> $$4, int $$5, int $$6, emc $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public emb(int $$0, int $$1, emc $$2, int $$3) {
      this(kj.g, emd.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public emc c() {
      return this.e;
   }

   public ddp a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      ebn $$5 = new ebn(new eap(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new ddp($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(dwq $$0, int $$1, int $$2) {
      ddp $$3 = this.a($$0.d(), $$1, $$2);
      return $$3.e == $$1 && $$3.f == $$2;
   }

   @Override
   public eme<?> e() {
      return eme.a;
   }
}
