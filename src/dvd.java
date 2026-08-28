import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dvd extends dta {
   public static final MapCodec<dvd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebc.a.fieldOf("wood_type").forGetter(dta::d), t()).apply($$0, dvd::new));
   public static final eam<ja> b = dpt.e;
   private static final Map<ja.a, feq> c = fen.a(dlu.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<ja.a, feq> e = fen.a(fen.a(c.get(ja.a.c), dlu.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dvd> a() {
      return a;
   }

   public dvd(ebc $$0, dzn.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.B.b().b(b, ja.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$2.c_($$3) instanceof dyb $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bty.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dzo $$0, cqs $$1, fds $$2, dyb $$3, cys $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cyh && !this.a($$2, $$0);
   }

   private boolean a(fds $$0, dzo $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected feq b_(dzo $$0, dhv $$1, iu $$2) {
      return this.a($$0, $$1, $$2, feb.a());
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(dzo $$0, dis $$1, iu $$2) {
      ja $$3 = $$0.c(b).h();
      ja $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dis $$0, dzo $$1, iu $$2, ja $$3) {
      dzo $$4 = $$0.a_($$2);
      return $$4.a(axa.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dub.a);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = this.m();
      evv $$2 = $$0.q().b_($$0.a());
      dis $$3 = $$0.q();
      iu $$4 = $$0.a();

      for (ja $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ja $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == evw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dzo $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, d);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxo($$0, $$1);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.i, dyb::a);
   }
}
