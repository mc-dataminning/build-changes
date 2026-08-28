import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dlu extends dsa {
   public static final MapCodec<dlu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eaa.a.fieldOf("wood_type").forGetter(dsa::d), t()).apply($$0, dlu::new));
   public static final dzm b = dzc.bd;
   public static final dzd c = dzc.a;
   private static final fdo e = dku.b(10.0, 0.0, 16.0);
   private static final Map<Integer, fdo> f = fdl.c(dku.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> dzs.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(eaa $$0, dyl.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$2.c_($$3) instanceof dwz $$7 && this.a($$4, $$6, $$7, $$0)) {
         return btq.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cqi $$0, fcq $$1, dwz $$2, cxy $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cxn && $$1.c().equals(jo.a);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jo.a, dtb.b);
   }

   @Override
   public dym a(dbn $$0) {
      dhp $$1 = $$0.q();
      eut $$2 = $$1.b_($$0.a());
      jj $$3 = $$0.a().d();
      dym $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awz.aD);
      jo $$6 = jo.a((double)$$0.i());
      boolean $$7 = !dku.a($$4.g($$1, $$3), jo.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dub.b)) {
            jo $$8 = $$4.c(dub.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jo> $$9 = dzs.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dzs.a($$6.g()) : dzs.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == euu.c));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected fdo b_(dym $$0, dgv $$1, jj $$2) {
      return this.a($$0, $$1, $$2, fcz.a());
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.b && !this.a($$0, $$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dym $$0) {
      return dzs.b($$0.c(b));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.i, dwz::a);
   }
}
