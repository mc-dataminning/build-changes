import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class emr extends emu {
   public static final MapCodec<emr> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, emr::new));
   private final int c;
   private final int d;
   private final int e;
   private final ju<dgc> f;

   private static P9<Mu<emr>, kl, emu.c, Float, Integer, Optional<emu.a>, Integer, Integer, Integer, ju<dgc>> b(Instance<emr> $$0) {
      P5<Mu<emr>, kl, emu.c, Float, Integer, Optional<emu.a>> $$1 = a($$0);
      P4<Mu<emr>, Integer, Integer, Integer, ju<dgc>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(emr::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(emr::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(emr::c),
         kf.a(lz.aG).fieldOf("preferred_biomes").forGetter(emr::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public emr(kl $$0, emu.c $$1, float $$2, int $$3, Optional<emu.a> $$4, int $$5, int $$6, int $$7, ju<dgc> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public emr(int $$0, int $$1, int $$2, ju<dgc> $$3) {
      this(kl.g, emu.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public ju<dgc> d() {
      return this.f;
   }

   @Override
   protected boolean a(dxh $$0, int $$1, int $$2) {
      List<deh> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new deh($$1, $$2));
   }

   @Override
   public emv<?> e() {
      return emv.b;
   }
}
