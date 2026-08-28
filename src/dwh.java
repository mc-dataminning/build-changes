import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dwh extends dub {
   public static final MapCodec<dwh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ech.a.fieldOf("wood_type").forGetter(dub::d), t()).apply($$0, dwh::new));
   public static final ebr<jb> b = dqs.e;
   private static final Map<jb.a, ffw> c = fft.a(dmr.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<jb.a, ffw> e = fft.a(fft.a(c.get(jb.a.c), dmr.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dwh> a() {
      return a;
   }

   public dwh(ech $$0, eas.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, jb.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if ($$2.c_($$3) instanceof dzf $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bug.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(eat $$0, crm $$1, fey $$2, dzf $$3, czn $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof czc && !this.a($$2, $$0);
   }

   private boolean a(fey $$0, eat $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected ffw b_(eat $$0, diq $$1, iv $$2) {
      return this.a($$0, $$1, $$2, ffh.a());
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(eat $$0, djp $$1, iv $$2) {
      jb $$3 = $$0.c(b).h();
      jb $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(djp $$0, eat $$1, iv $$2, jb $$3) {
      eat $$4 = $$0.a_($$2);
      return $$4.a(axc.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dvc.a);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = this.m();
      exa $$2 = $$0.q().b_($$0.a());
      djp $$3 = $$0.q();
      iv $$4 = $$0.a();

      for (jb $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == exb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eat $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, d);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dys($$0, $$1);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.i, dzf::a);
   }
}
