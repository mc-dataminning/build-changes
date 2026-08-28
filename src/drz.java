import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class drz extends dkg {
   public static final MapCodec<drz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwv.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.f)), t())
            .apply($$0, ($$0x, $$1) -> new drz((cwv)$$0x.orElse(null), $$1))
   );
   private static final wv e = wv.c("container.shulkerBox.unknownContents");
   public static final Map<jo, fdo> b = fdl.d(dku.c(16.0, 0.0, 1.0));
   public static final dzk<jo> c = dmy.a;
   public static final ald d = ald.b("contents");
   @Nullable
   private final cwv f;

   @Override
   public MapCodec<drz> a() {
      return a;
   }

   public drz(@Nullable cwv $$0, dyl.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.B.b().b(c, jo.b));
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwy(this.f, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.y, dwy::a);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1 instanceof arn $$5 && $$1.c_($$2) instanceof dwy $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awu.aq);
         coy.a($$5, $$3, true);
      }

      return btq.a;
   }

   private static boolean a(dym $$0, dhp $$1, jj $$2, dwy $$3) {
      if ($$3.k() != dwy.a.a) {
         return true;
      } else {
         fcp $$4 = cnp.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      dvl $$4 = $$0.c_($$1);
      if ($$4 instanceof dwy $$5) {
         if (!$$0.C && $$3.gk() && !$$5.c()) {
            cxy $$6 = b(this.b());
            $$6.b($$4.q());
            cmn $$7 = new cmn($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxy> a(dym $$0, exo.a $$1) {
      dvl $$2 = $$1.b(faf.h);
      if ($$2 instanceof dwy $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.c(kx.ar)) {
         $$2.add(e);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cxy $$6 : $$0.a(kx.an, dan.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(wv.a("container.shulkerBox.itemCount", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(wv.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fdo b_(dym $$0, dgv $$1, jj $$2) {
      if ($$1.c_($$2) instanceof dwy $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return fdl.b();
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$1.c_($$2) instanceof dwy $$5 ? fdl.a($$5.a($$0)) : fdl.b();
   }

   @Override
   protected boolean e_(dym $$0) {
      return false;
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return ctn.a($$1.c_($$2));
   }

   public static dku a(@Nullable cwv $$0) {
      if ($$0 == null) {
         return dkw.lr;
      } else {
         return switch ($$0) {
            case a -> dkw.ls;
            case b -> dkw.lt;
            case c -> dkw.lu;
            case d -> dkw.lv;
            case e -> dkw.lw;
            case f -> dkw.lx;
            case g -> dkw.ly;
            case h -> dkw.lz;
            case i -> dkw.lA;
            case j -> dkw.lB;
            case l -> dkw.lD;
            case m -> dkw.lE;
            case n -> dkw.lF;
            case o -> dkw.lG;
            case p -> dkw.lH;
            case k -> dkw.lC;
         };
      }
   }

   @Nullable
   public cwv b() {
      return this.f;
   }

   public static cxy b(@Nullable cwv $$0) {
      return new cxy(a($$0));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
