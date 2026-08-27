import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ded extends ddi {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkn.a.fieldOf("wood_type").forGetter(ddi::d), u()).apply($$0, ded::new));
   public static final dka b = djq.ba;

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ded(dkn $$0, diz.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dkg.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eel.c));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.a($$0, $$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dja $$0) {
      return dkg.b($$0.c(b));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, f);
   }
}
