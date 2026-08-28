import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dog extends dmg {
   public static final MapCodec<dog> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dog::new)
   );
   public static final ech d = dmg.b;
   private static final fgw e = fgt.a(dno.b(2.0, 8.0, 14.0), dno.b(14.0, 0.0, 8.0));
   private static final Map<dof, dog> f = Maps.newHashMap();
   private static final Iterable<fgc> g = List.of(new fgc(8.0, 16.0, 8.0).c(0.0625));
   private final dof h;

   @Override
   public MapCodec<dog> a() {
      return c;
   }

   protected dog(dno $$0, ebp.d $$1) {
      super($$1);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dof $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dof.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fgc> b(ebq $$0) {
      return g;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e;
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$0.a(dao.pg) || $$0.a(dao.vg)) {
         return bvc.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bvc.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      bvc $$5 = doc.a($$1, $$2, dnq.ex.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ffy $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(d);
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(dnq.ex);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return doc.d;
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   public static ebq a(dof $$0) {
      return f.get($$0).m();
   }

   public static boolean h(ebq $$0) {
      return $$0.a(axn.bn, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
