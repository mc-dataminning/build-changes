import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcd extends cur {
   public static final MapCodec<dcd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ckc.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new dcd((ckc)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final eks e = cvf.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eks f = cvf.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eks g = cvf.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eks h = cvf.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eks i = cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eks j = cvf.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ib, eks> k = ac.a(Maps.newEnumMap(ib.class), $$0 -> {
      $$0.put(ib.c, i);
      $$0.put(ib.f, h);
      $$0.put(ib.d, j);
      $$0.put(ib.e, g);
      $$0.put(ib.b, e);
      $$0.put(ib.a, f);
   });
   public static final dil<ib> b = cxi.a;
   public static final agm c = new agm("contents");
   @Nullable
   private final ckc l;

   @Override
   public MapCodec<dcd> a() {
      return a;
   }

   public dcd(@Nullable ckc $$0, dhm.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ib.b));
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgq(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.x, dgq::a);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.b;
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else if ($$3.P_()) {
         return bjb.b;
      } else if ($$1.c_($$2) instanceof dgq $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(arf.aq);
            ccq.a($$3, true);
         }

         return bjb.b;
      } else {
         return bjb.d;
      }
   }

   private static boolean a(dhn $$0, csf $$1, hx $$2, dgq $$3) {
      if ($$3.m() != dgq.a.a) {
         return true;
      } else {
         eju $$4 = cbt.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      dfi $$4 = $$0.c_($$1);
      if ($$4 instanceof dgq $$5) {
         if (!$$0.B && $$3.f() && !$$5.aj_()) {
            clo $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cas $$7 = new cas($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<clo> a(dhn $$0, efi.a $$1) {
      dfi $$2 = $$1.b(ehn.h);
      if ($$2 instanceof dgq $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dgq) {
            ((dgq)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dfi $$5 = $$1.c_($$2);
         if ($$5 instanceof dgq) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(clo $$0, @Nullable crl $$1, List<uv> $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      sd $$4 = cjh.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(uv.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            ip<clo> $$5 = ip.a(27, clo.b);
            biv.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (clo $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(uv.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(uv.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public eks b_(dhn $$0, crl $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dgq $$4 && !$$4.x()) {
         return k.get($$0.c(b).g());
      }

      return ekp.b();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      dfi $$4 = $$1.c_($$2);
      return $$4 instanceof dgq ? ekp.a(((dgq)$$4).a($$0)) : ekp.b();
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return cgr.a($$1.c_($$2));
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      clo $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dfk.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static ckc b(clj $$0) {
      return a(cvf.a($$0));
   }

   @Nullable
   public static ckc a(cvf $$0) {
      return $$0 instanceof dcd ? ((dcd)$$0).b() : null;
   }

   public static cvf a(@Nullable ckc $$0) {
      if ($$0 == null) {
         return cvh.kP;
      } else {
         switch ($$0) {
            case a:
               return cvh.kQ;
            case b:
               return cvh.kR;
            case c:
               return cvh.kS;
            case d:
               return cvh.kT;
            case e:
               return cvh.kU;
            case f:
               return cvh.kV;
            case g:
               return cvh.kW;
            case h:
               return cvh.kX;
            case i:
               return cvh.kY;
            case j:
               return cvh.kZ;
            case k:
            default:
               return cvh.la;
            case l:
               return cvh.lb;
            case m:
               return cvh.lc;
            case n:
               return cvh.ld;
            case o:
               return cvh.le;
            case p:
               return cvh.lf;
         }
      }
   }

   @Nullable
   public ckc b() {
      return this.l;
   }

   public static clo b(@Nullable ckc $$0) {
      return new clo(a($$0));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
