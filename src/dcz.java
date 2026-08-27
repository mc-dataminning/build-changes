import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcz extends dce {
   public static final MapCodec<dcz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dja.a.fieldOf("wood_type").forGetter(dce::d), u()).apply($$0, dcz::new));
   public static final din b = did.ba;

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dcz(dja $$0, dhm.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dit.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == ecy.c));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.a && !this.a($$0, $$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dhn $$0) {
      return dit.b($$0.c(b));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, f);
   }
}
