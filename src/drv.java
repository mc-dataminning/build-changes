import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drv extends dmr implements dmu {
   public static final MapCodec<drv> a = b(drv::new);
   public static final ebk b = ebj.d;
   public static final ebr<ecg> c = ebj.aa;
   public static final ebr<ecg> d = ebj.Z;
   public static final ebr<ecg> e = ebj.ab;
   public static final ebr<ecg> f = ebj.ac;
   public static final Map<jb, ebr<ecg>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, c, jb.f, d, jb.d, e, jb.e, f)));
   private final Function<eat, ffw> h;

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   public drv(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, ecg.a).b(d, ecg.a).b(e, ecg.a).b(f, ecg.a));
      this.h = this.b();
   }

   @Override
   protected ffw d_(eat $$0) {
      return fft.a();
   }

   public Function<eat, ffw> b() {
      Map<jb, ffw> $$0 = fft.c(dmr.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<jb, ffw> $$1 = fft.d(dmr.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         ffw $$3 = $$2.c(b) ? $$1.get(jb.a) : fft.a();

         for (Entry<jb, ebr<ecg>> $$4 : g.entrySet()) {
            switch ((ecg)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = fft.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = fft.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? fft.b() : $$3;
      });
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : fft.a();
   }

   @Override
   protected boolean e_(eat $$0) {
      return true;
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(eat $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (ebr<ecg> $$1 : g.values()) {
            if ($$0.c($$1) != ecg.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(diq $$0, iv $$1, jb $$2) {
      return $$2 == jb.b ? false : drx.a($$0, $$1, $$2);
   }

   private static eat a(eat $$0, diq $$1, iv $$2, boolean $$3) {
      eat $$4 = null;
      eat $$5 = null;
      $$3 |= $$0.c(b);

      for (jb $$6 : jb.c.a) {
         ebr<ecg> $$7 = a($$6);
         ecg $$8 = a($$1, $$2, $$6) ? ($$3 ? ecg.b : $$0.c($$7)) : ecg.a;
         if ($$8 == ecg.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dmt.uf) && $$4.c($$7) != ecg.a && !$$4.c(b)) {
               $$8 = ecg.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dmt.uf) && $$5.c($$7) == ecg.a) {
                  $$8 = ecg.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(djn $$0, iv $$1, azv $$2, int $$3) {
      eat $$4 = dmt.uf.m();
      eat $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      eat $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         eat $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, @Nullable bxj $$3, czn $$4) {
      if (!$$0.C) {
         azv $$5 = $$0.C_();
         eat $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static eat a(diq $$0, iv $$1, BooleanSupplier $$2) {
      iv $$3 = $$1.d();
      eat $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dmt.uf);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         eat $$6 = dmt.uf.m().b(b, Boolean.valueOf(false));
         eat $$7 = a($$6, $$0, $$1.d(), true);

         for (jb $$8 : jb.c.a) {
            ebr<ecg> $$9 = a($$8);
            if ($$7.c($$9) != ecg.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, ecg.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dmt.a.m();
      } else {
         return dmt.a.m();
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmt.a.m();
      } else {
         eat $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dmt.a.m() : $$8;
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return switch ($$1) {
         case c -> (eat)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (eat)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (eat)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return switch ($$1) {
         case b -> (eat)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (eat)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static ebr<ecg> a(jb $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      eat $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
