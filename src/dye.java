import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dye extends dkg {
   public static final MapCodec<dye> a = b(dye::new);
   public static final dzk<jo> b = dyg.a;
   public static final dzk<dzo> c = dyg.c;

   @Override
   public MapCodec<dye> a() {
      return a;
   }

   public dye(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(c, dzo.a));
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return null;
   }

   public static dvl a(jj $$0, dym $$1, dym $$2, jo $$3, boolean $$4, boolean $$5) {
      return new dyi($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.l, dyi::a);
   }

   @Override
   public void a(dhq $$0, jj $$1, dym $$2) {
      jj $$3 = $$1.a($$2.c(b).g());
      dym $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dyf && $$4.c(dyf.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return btq.c;
      } else {
         return btq.e;
      }
   }

   @Override
   protected List<cxy> a(dym $$0, exo.a $$1) {
      dyi $$2 = this.a($$1.a(), jj.a($$1.a(faf.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return fdl.a();
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      dyi $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fdl.a();
   }

   @Nullable
   private dyi a(dgv $$0, jj $$1) {
      dvl $$2 = $$0.c_($$1);
      return $$2 instanceof dyi ? (dyi)$$2 : null;
   }

   @Override
   protected drf a_(dym $$0) {
      return drf.a;
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return cxy.k;
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
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
