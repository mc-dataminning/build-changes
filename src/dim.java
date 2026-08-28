import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dim extends dgd<drz> implements dol {
   public static final MapCodec<dim> b = b($$0 -> new dim($$0, () -> dru.b));
   public static final dvi c = dlf.aF;
   public static final dvm<dvg> d = dve.bc;
   public static final dvf e = dve.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ezm i = dhj.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ezm j = dhj.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ezm k = dhj.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ezm l = dhj.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ezm m = dhj.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final djq.b<drz, Optional<bri>> n = new djq.b<drz, Optional<bri>>() {
      public Optional<bri> a(drz $$0, drz $$1) {
         return Optional.of(new brh($$0, $$1));
      }

      public Optional<bri> a(drz $$0) {
         return Optional.of($$0);
      }

      public Optional<bri> a() {
         return Optional.empty();
      }
   };
   private static final djq.b<drz, Optional<brr>> o = new djq.b<drz, Optional<brr>>() {
      public Optional<brr> a(final drz $$0, final drz $$1) {
         final bri $$2 = new brh($$0, $$1);
         return Optional.of(new brr() {
            @Nullable
            @Override
            public cqw createMenu(int $$0x, cnt $$1x, cnu $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.k);
                  $$1.e_($$1.k);
                  return crf.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xd Q_() {
               if ($$0.ak()) {
                  return $$0.Q_();
               } else {
                  return (xd)($$1.ak() ? $$1.Q_() : xd.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<brr> a(drz $$0) {
         return Optional.of($$0);
      }

      public Optional<brr> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dim> a() {
      return b;
   }

   protected dim(dun.d $$0, Supplier<dru<? extends drz>> $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(c, jj.c).b(d, dvg.a).b(e, Boolean.valueOf(false)));
   }

   public static djq.a h(duo $$0) {
      dvg $$1 = $$0.c(d);
      if ($$1 == dvg.a) {
         return djq.a.a;
      } else {
         return $$1 == dvg.c ? djq.a.b : djq.a.c;
      }
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.b;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dvg $$6 = $$2.c(d);
         if ($$0.c(d) == dvg.a && $$6 != dvg.a && $$0.c(c) == $$2.c(c) && i($$2) == $$1.g()) {
            return $$0.b(d, $$6.a());
         }
      } else if (i($$0) == $$1) {
         return $$0.b(d, dvg.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if ($$0.c(d) == dvg.a) {
         return m;
      } else {
         switch (i($$0)) {
            case c:
            default:
               return i;
            case d:
               return j;
            case e:
               return k;
            case f:
               return l;
         }
      }
   }

   public static jj i(duo $$0) {
      jj $$1 = $$0.c(c);
      return $$0.c(d) == dvg.b ? $$1.h() : $$1.i();
   }

   @Override
   public duo a(czk $$0) {
      dvg $$1 = dvg.a;
      jj $$2 = $$0.g().g();
      eqp $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jj $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jj $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dvg.c : dvg.b;
         }
      }

      if ($$1 == dvg.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dvg.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dvg.c;
         }
      }

      return this.o().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == eqq.c));
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(e) ? eqq.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jj a(czk $$0, jj $$1) {
      duo $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dvg.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      brl.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         brr $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cml.a($$3, true);
         }
      }

      return brp.a;
   }

   protected awl<alc> c() {
      return awo.i.b(awo.ao);
   }

   public dru<? extends drz> d() {
      return this.a.get();
   }

   @Nullable
   public static bri a(dim $$0, duo $$1, deg $$2, je $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public djq.c<? extends drz> a(duo $$0, deg $$1, je $$2, boolean $$3) {
      BiPredicate<deh, je> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dim::a;
      }

      return djq.a(this.a.get(), dim::h, dim::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static djq.b<drz, Float2FloatFunction> a(final dsx $$0) {
      return new djq.b<drz, Float2FloatFunction>() {
         public Float2FloatFunction a(drz $$0x, drz $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(drz $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new drz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0.B ? a($$2, this.d(), drz::a) : null;
   }

   public static boolean a(deh $$0, je $$1) {
      return a((ddl)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(ddl $$0, je $$1) {
      je $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(deh $$0, je $$1) {
      List<cgd> $$2 = $$0.a(
         cgd.class, new eyn((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cgd $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return cqw.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      drs $$4 = $$1.c_($$2);
      if ($$4 instanceof drz) {
         ((drz)$$4).k();
      }
   }
}
