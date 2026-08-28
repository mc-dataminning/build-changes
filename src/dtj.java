import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dtj extends drk {
   public static final MapCodec<dtj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzd.a.fieldOf("wood_type").forGetter(drk::d), t()).apply($$0, dtj::new));
   public static final dyo<jn> b = dod.e;
   private static final Map<jn.a, fcr> c = fco.a(dke.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<jn.a, fcr> e = fco.a(fco.a(c.get(jn.a.c), dke.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dtj> a() {
      return a;
   }

   public dtj(dzd $$0, dxp.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.B.b().b(b, jn.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dwf $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bsy.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dxq $$0, cpr $$1, fbt $$2, dwf $$3, cxh $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cww && !this.a($$2, $$0);
   }

   private boolean a(fbt $$0, dxq $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected fcr b_(dxq $$0, dgf $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fcc.a());
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(dxq $$0, dhc $$1, ji $$2) {
      jn $$3 = $$0.c(b).h();
      jn $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dhc $$0, dxq $$1, ji $$2, jn $$3) {
      dxq $$4 = $$0.a_($$2);
      return $$4.a(awp.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dsl.a);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = this.m();
      etw $$2 = $$0.q().b_($$0.a());
      dhc $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == etx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxq $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, d);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvs($$0, $$1);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$2, duu.i, dwf::a);
   }
}
