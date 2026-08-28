import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmt extends dmf {
   public static final MapCodec<dmt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czi.q.fieldOf("color").forGetter(dmf::b), t()).apply($$0, dmt::new));
   public static final ecq b = ecg.bd;
   private static final Map<czi, dno> c = Maps.newHashMap();
   private static final fgw d = dno.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(czi $$0, ebp.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d;
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, Integer.valueOf(ecw.a($$0.i() + 180.0F)));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   public static dno a(czi $$0) {
      return c.getOrDefault($$0, dnq.jl);
   }
}
