import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dmu extends dta {
   public static final MapCodec<dmu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebc.a.fieldOf("wood_type").forGetter(dta::d), t()).apply($$0, dmu::new));
   public static final eao b = eae.bd;
   public static final eaf c = eae.a;
   private static final feq e = dlu.b(10.0, 0.0, 16.0);
   private static final Map<Integer, feq> f = fen.c(dlu.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> eau.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(ebc $$0, dzn.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$2.c_($$3) instanceof dyb $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bty.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cqs $$0, fds $$1, dyb $$2, cys $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cyh && $$1.c().equals(ja.a);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), ja.a, dub.b);
   }

   @Override
   public dzo a(dcl $$0) {
      dip $$1 = $$0.q();
      evv $$2 = $$1.b_($$0.a());
      iu $$3 = $$0.a().d();
      dzo $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axa.aD);
      ja $$6 = ja.a((double)$$0.i());
      boolean $$7 = !dlu.a($$4.g($$1, $$3), ja.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dvd.b)) {
            ja $$8 = $$4.c(dvd.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ja> $$9 = eau.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? eau.a($$6.g()) : eau.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == evw.c));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected feq b_(dzo $$0, dhv $$1, iu $$2) {
      return this.a($$0, $$1, $$2, feb.a());
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.b && !this.a($$0, $$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dzo $$0) {
      return eau.b($$0.c(b));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.i, dyb::a);
   }
}
