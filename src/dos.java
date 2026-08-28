import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dos extends dkg {
   public static final MapCodec<dos> a = b(dos::new);
   public static final dzk<jo> b = dzc.S;
   public static final dzd c = dzc.i;
   private final Function<dym, fdo> d;
   private final Map<jo, fdo> e;

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.a).b(c, Boolean.valueOf(true)));
      fdo $$1 = dku.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(fdl.c(fdl.a($$1, dku.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(jo.a, $$1).build();
   }

   private Function<dym, fdo> b(fdo $$0) {
      fdo $$1 = fdl.a(dku.b(16.0, 10.0, 16.0), dku.b(8.0, 4.0, 10.0));
      fdo $$2 = fdl.a($$1, $$0, fcy.e);
      Map<jo, fdo> $$3 = fdl.d(dku.a(4.0, 4.0, 8.0, 0.0, 8.0), new fcu(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> fdl.a($$2, fdl.a($$3.get($$2x.c(b)), fdl.b(), fcy.i)), new dzp[]{c});
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public dym a(dbn $$0) {
      jo $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jo.a.b ? jo.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0.C ? null : a($$2, dvn.s, dwo::a);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dwo $$5) {
         $$3.a($$5);
         $$3.a(awu.ad);
      }

      return btq.a;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dhp $$0, jj $$1, dym $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return ctn.a($$1.c_($$2));
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
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      dvl $$4 = $$1.c_($$2);
      if ($$4 instanceof dwo) {
         dwo.a($$1, $$2, $$0, $$3, (dwo)$$4);
      }
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
