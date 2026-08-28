import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqr extends diz {
   public static final MapCodec<dqr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cvn.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dqr((cvn)$$0x.orElse(null), $$1))
   );
   private static final wp d = wp.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fbv f = djn.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbv g = djn.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbv h = djn.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbv i = djn.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbv j = djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbv k = djn.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jn, fbv> l = af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, j);
      $$0.put(jn.f, i);
      $$0.put(jn.d, k);
      $$0.put(jn.e, h);
      $$0.put(jn.b, f);
      $$0.put(jn.a, g);
   });
   public static final dxv<jn> b = dlr.a;
   public static final akv c = akv.b("contents");
   @Nullable
   private final cvn m;

   @Override
   public MapCodec<dqr> a() {
      return a;
   }

   public dqr(@Nullable cvn $$0, dwx.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jn.b));
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvm(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.y, dvm::a);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$1 instanceof ard $$5 && $$1.c_($$2) instanceof dvm $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awk.aq);
         cnn.a($$5, $$3, true);
      }

      return bsl.a;
   }

   private static boolean a(dwy $$0, dgj $$1, ji $$2, dvm $$3) {
      if ($$3.k() != dvm.a.a) {
         return true;
      } else {
         faw $$4 = cmf.a(1.0F, $$0.c(b), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      dua $$4 = $$0.c_($$1);
      if ($$4 instanceof dvm $$5) {
         if (!$$0.C && $$3.b() && !$$5.c()) {
            cwq $$6 = b(this.b());
            $$6.b($$4.q());
            cld $$7 = new cld($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwq> a(dwy $$0, evv.a $$1) {
      dua $$2 = $$1.b(eym.h);
      if ($$2 instanceof dvm $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dua $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dvm) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kv.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cwq $$6 : $$0.a(kv.al, czi.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(wp.a("container.shulkerBox.itemCount", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(wp.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fbv b_(dwy $$0, dfo $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvm $$4 && !$$4.t()) {
         return l.get($$0.c(b).g());
      }

      return fbs.b();
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$1.c_($$2) instanceof dvm $$5 ? fbs.a($$5.a($$0)) : fbs.b();
   }

   @Override
   protected boolean e_(dwy $$0) {
      return false;
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return csd.a($$1.c_($$2));
   }

   public static djn a(@Nullable cvn $$0) {
      if ($$0 == null) {
         return djp.lr;
      } else {
         return switch ($$0) {
            case a -> djp.ls;
            case b -> djp.lt;
            case c -> djp.lu;
            case d -> djp.lv;
            case e -> djp.lw;
            case f -> djp.lx;
            case g -> djp.ly;
            case h -> djp.lz;
            case i -> djp.lA;
            case j -> djp.lB;
            case l -> djp.lD;
            case m -> djp.lE;
            case n -> djp.lF;
            case o -> djp.lG;
            case p -> djp.lH;
            case k -> djp.lC;
         };
      }
   }

   @Nullable
   public cvn b() {
      return this.m;
   }

   public static cwq b(@Nullable cvn $$0) {
      return new cwq(a($$0));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
