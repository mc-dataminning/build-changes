import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvh extends dum {
   public static final MapCodec<dvh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecs.a.fieldOf("wood_type").forGetter(dum::d), t()).apply($$0, dvh::new));
   public static final ece b = ebu.bd;

   @Override
   public MapCodec<dvh> a() {
      return a;
   }

   public dvh(ecs $$0, ebd.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(eck.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == exp.c));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.a && !this.a($$0, $$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebe $$0) {
      return eck.b($$0.c(b));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, d);
   }
}
