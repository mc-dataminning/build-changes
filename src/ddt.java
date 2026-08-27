import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddt extends dcy {
   public static final MapCodec<ddt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkc.a.fieldOf("wood_type").forGetter(dcy::d), u()).apply($$0, ddt::new));
   public static final djp b = djf.ba;

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   public ddt(dkc $$0, dio.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(djv.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eea.c));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.a && !this.a($$0, $$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dip $$0) {
      return djv.b($$0.c(b));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, f);
   }
}
