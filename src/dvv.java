import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dvv extends dtp {
   public static final MapCodec<dvv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebv.a.fieldOf("wood_type").forGetter(dtp::d), t()).apply($$0, dvv::new));
   public static final ebf<ja> b = dqg.e;
   private static final Map<ja.a, ffk> c = ffh.a(dmf.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<ja.a, ffk> e = ffh.a(ffh.a(c.get(ja.a.c), dmf.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dvv> a() {
      return a;
   }

   public dvv(ebv $$0, eag.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, ja.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$2.c_($$3) instanceof dyt $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bud.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(eah $$0, crc $$1, fem $$2, dyt $$3, czd $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cys && !this.a($$2, $$0);
   }

   private boolean a(fem $$0, eah $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected ffk b_(eah $$0, dig $$1, iu $$2) {
      return this.a($$0, $$1, $$2, fev.a());
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(eah $$0, djd $$1, iu $$2) {
      ja $$3 = $$0.c(b).h();
      ja $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(djd $$0, eah $$1, iu $$2, ja $$3) {
      eah $$4 = $$0.a_($$2);
      return $$4.a(axc.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, duq.a);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = this.m();
      ewo $$2 = $$0.q().b_($$0.a());
      djd $$3 = $$0.q();
      iu $$4 = $$0.a();

      for (ja $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ja $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == ewp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eah $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, d);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyg($$0, $$1);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$2, dxh.i, dyt::a);
   }
}
