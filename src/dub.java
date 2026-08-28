import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dub extends dsa {
   public static final MapCodec<dub> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eaa.a.fieldOf("wood_type").forGetter(dsa::d), t()).apply($$0, dub::new));
   public static final dzk<jo> b = dot.e;
   private static final Map<jo.a, fdo> c = fdl.a(dku.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<jo.a, fdo> e = fdl.a(fdl.a(c.get(jo.a.c), dku.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dub> a() {
      return a;
   }

   public dub(eaa $$0, dyl.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.B.b().b(b, jo.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$2.c_($$3) instanceof dwz $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return btq.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dym $$0, cqi $$1, fcq $$2, dwz $$3, cxy $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cxn && !this.a($$2, $$0);
   }

   private boolean a(fcq $$0, dym $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected fdo b_(dym $$0, dgv $$1, jj $$2) {
      return this.a($$0, $$1, $$2, fcz.a());
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(dym $$0, dhs $$1, jj $$2) {
      jo $$3 = $$0.c(b).h();
      jo $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dhs $$0, dym $$1, jj $$2, jo $$3) {
      dym $$4 = $$0.a_($$2);
      return $$4.a(awz.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dtb.a);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = this.m();
      eut $$2 = $$0.q().b_($$0.a());
      dhs $$3 = $$0.q();
      jj $$4 = $$0.a();

      for (jo $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jo $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == euu.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dym $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, d);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwm($$0, $$1);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.i, dwz::a);
   }
}
