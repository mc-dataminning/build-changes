import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgc extends ddt<dpo> implements dma {
   public static final MapCodec<dgc> b = b($$0 -> new dgc($$0, () -> dpj.b));
   public static final dsw c = div.aE;
   public static final dta<dsu> d = dss.bc;
   public static final dst e = dss.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ewk i = dez.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ewk j = dez.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ewk k = dez.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ewk l = dez.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ewk m = dez.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dhg.b<dpo, Optional<bqn>> n = new dhg.b<dpo, Optional<bqn>>() {
      public Optional<bqn> a(dpo $$0, dpo $$1) {
         return Optional.of(new bqm($$0, $$1));
      }

      public Optional<bqn> a(dpo $$0) {
         return Optional.of($$0);
      }

      public Optional<bqn> a() {
         return Optional.empty();
      }
   };
   private static final dhg.b<dpo, Optional<bqy>> o = new dhg.b<dpo, Optional<bqy>>() {
      public Optional<bqy> a(final dpo $$0, final dpo $$1) {
         final bqn $$2 = new bqm($$0, $$1);
         return Optional.of(new bqy() {
            @Nullable
            @Override
            public cpu createMenu(int $$0x, cmw $$1x, cmx $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cqb.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xp O_() {
               if ($$0.ag()) {
                  return $$0.O_();
               } else {
                  return (xp)($$1.ag() ? $$1.O_() : xp.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bqy> a(dpo $$0) {
         return Optional.of($$0);
      }

      public Optional<bqy> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dgc> a() {
      return b;
   }

   protected dgc(dsb.d $$0, Supplier<dpj<? extends dpo>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, je.c).a(d, dsu.a).a(e, Boolean.valueOf(false)));
   }

   public static dhg.a g(dsc $$0) {
      dsu $$1 = $$0.c(d);
      if ($$1 == dsu.a) {
         return dhg.a.a;
      } else {
         return $$1 == dsu.c ? dhg.a.b : dhg.a.c;
      }
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.b;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dsu $$6 = $$2.c(d);
         if ($$0.c(d) == dsu.a && $$6 != dsu.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dsu.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      if ($$0.c(d) == dsu.a) {
         return m;
      } else {
         switch (h($$0)) {
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

   public static je h(dsc $$0) {
      je $$1 = $$0.c(c);
      return $$0.c(d) == dsu.b ? $$1.h() : $$1.i();
   }

   @Override
   public dsc a(cya $$0) {
      dsu $$1 = dsu.a;
      je $$2 = $$0.g().g();
      env $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      je $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         je $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dsu.c : dsu.b;
         }
      }

      if ($$1 == dsu.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dsu.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dsu.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == enw.c));
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(e) ? enw.c.a(false) : super.b_($$0);
   }

   @Nullable
   private je a(cya $$0, je $$1) {
      dsc $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dsu.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      bqq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         bqy $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            clo.a($$3, true);
         }

         return bqu.c;
      }
   }

   protected awh<alf> c() {
      return awk.i.b(awk.ao);
   }

   public dpj<? extends dpo> d() {
      return this.a.get();
   }

   @Nullable
   public static bqn a(dgc $$0, dsc $$1, dby $$2, iz $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dhg.c<? extends dpo> a(dsc $$0, dby $$1, iz $$2, boolean $$3) {
      BiPredicate<dbz, iz> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dgc::a;
      }

      return dhg.a(this.a.get(), dgc::g, dgc::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dhg.b<dpo, Float2FloatFunction> a(final dqk $$0) {
      return new dhg.b<dpo, Float2FloatFunction>() {
         public Float2FloatFunction a(dpo $$0x, dpo $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dpo $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return $$0.B ? a($$2, this.d(), dpo::a) : null;
   }

   public static boolean a(dbz $$0, iz $$1) {
      return a((dbe)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dbe $$0, iz $$1) {
      iz $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dbz $$0, iz $$1) {
      List<cfi> $$2 = $$0.a(
         cfi.class, new evm((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cfi $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return cpu.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      dph $$4 = $$1.c_($$2);
      if ($$4 instanceof dpo) {
         ((dpo)$$4).l();
      }
   }
}
