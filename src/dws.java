import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dws extends dum {
   public static final MapCodec<dws> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecs.a.fieldOf("wood_type").forGetter(dum::d), t()).apply($$0, dws::new));
   public static final ecc<jb> b = drd.e;
   private static final Map<jb.a, fgk> c = fgh.a(dnc.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<jb.a, fgk> e = fgh.a(fgh.a(c.get(jb.a.c), dnc.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dws> a() {
      return a;
   }

   public dws(ecs $$0, ebd.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, jb.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$2.c_($$3) instanceof dzq $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bur.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(ebe $$0, crx $$1, ffm $$2, dzq $$3, czy $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof czn && !this.a($$2, $$0);
   }

   private boolean a(ffm $$0, ebe $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected fgk b_(ebe $$0, djb $$1, iv $$2) {
      return this.a($$0, $$1, $$2, ffv.a());
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(ebe $$0, dka $$1, iv $$2) {
      jb $$3 = $$0.c(b).h();
      jb $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dka $$0, ebe $$1, iv $$2, jb $$3) {
      ebe $$4 = $$0.a_($$2);
      return $$4.a(axe.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dvn.a);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = this.m();
      exo $$2 = $$0.q().b_($$0.a());
      dka $$3 = $$0.q();
      iv $$4 = $$0.a();

      for (jb $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == exp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebe $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, d);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzd($$0, $$1);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.i, dzq::a);
   }
}
