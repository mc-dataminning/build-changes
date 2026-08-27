import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhu extends dgz {
   public static final MapCodec<dhu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dom.a.fieldOf("wood_type").forGetter(dgz::d), u()).apply($$0, dhu::new));
   public static final dnz b = dnp.ba;

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   public dhu(dom $$0, dmy.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dof.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eio.c));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.a($$0, $$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dmz $$0) {
      return dof.b($$0.c(b));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, f);
   }
}
