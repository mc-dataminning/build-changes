import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgd extends ddu<dpp> implements dmb {
   public static final MapCodec<dgd> b = b($$0 -> new dgd($$0, () -> dpk.b));
   public static final dsx c = diw.aE;
   public static final dtb<dsv> d = dst.bc;
   public static final dsu e = dst.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ewl i = dfa.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ewl j = dfa.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ewl k = dfa.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ewl l = dfa.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ewl m = dfa.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dhh.b<dpp, Optional<bqo>> n = new dhh.b<dpp, Optional<bqo>>() {
      public Optional<bqo> a(dpp $$0, dpp $$1) {
         return Optional.of(new bqn($$0, $$1));
      }

      public Optional<bqo> a(dpp $$0) {
         return Optional.of($$0);
      }

      public Optional<bqo> a() {
         return Optional.empty();
      }
   };
   private static final dhh.b<dpp, Optional<bqz>> o = new dhh.b<dpp, Optional<bqz>>() {
      public Optional<bqz> a(final dpp $$0, final dpp $$1) {
         final bqo $$2 = new bqn($$0, $$1);
         return Optional.of(new bqz() {
            @Nullable
            @Override
            public cpv createMenu(int $$0x, cmx $$1x, cmy $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cqc.b($$0, $$1, $$2);
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

      public Optional<bqz> a(dpp $$0) {
         return Optional.of($$0);
      }

      public Optional<bqz> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dgd> a() {
      return b;
   }

   protected dgd(dsc.d $$0, Supplier<dpk<? extends dpp>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, je.c).a(d, dsv.a).a(e, Boolean.valueOf(false)));
   }

   public static dhh.a g(dsd $$0) {
      dsv $$1 = $$0.c(d);
      if ($$1 == dsv.a) {
         return dhh.a.a;
      } else {
         return $$1 == dsv.c ? dhh.a.b : dhh.a.c;
      }
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.b;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dsv $$6 = $$2.c(d);
         if ($$0.c(d) == dsv.a && $$6 != dsv.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dsv.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      if ($$0.c(d) == dsv.a) {
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

   public static je h(dsd $$0) {
      je $$1 = $$0.c(c);
      return $$0.c(d) == dsv.b ? $$1.h() : $$1.i();
   }

   @Override
   public dsd a(cyb $$0) {
      dsv $$1 = dsv.a;
      je $$2 = $$0.g().g();
      enw $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      je $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         je $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dsv.c : dsv.b;
         }
      }

      if ($$1 == dsv.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dsv.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dsv.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == enx.c));
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(e) ? enx.c.a(false) : super.b_($$0);
   }

   @Nullable
   private je a(cyb $$0, je $$1) {
      dsd $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dsv.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      bqr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         bqz $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            clp.a($$3, true);
         }

         return bqv.c;
      }
   }

   protected awh<alf> c() {
      return awk.i.b(awk.ao);
   }

   public dpk<? extends dpp> d() {
      return this.a.get();
   }

   @Nullable
   public static bqo a(dgd $$0, dsd $$1, dbz $$2, iz $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dhh.c<? extends dpp> a(dsd $$0, dbz $$1, iz $$2, boolean $$3) {
      BiPredicate<dca, iz> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dgd::a;
      }

      return dhh.a(this.a.get(), dgd::g, dgd::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dhh.b<dpp, Float2FloatFunction> a(final dql $$0) {
      return new dhh.b<dpp, Float2FloatFunction>() {
         public Float2FloatFunction a(dpp $$0x, dpp $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dpp $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0.B ? a($$2, this.d(), dpp::a) : null;
   }

   public static boolean a(dca $$0, iz $$1) {
      return a((dbf)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dbf $$0, iz $$1) {
      iz $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dca $$0, iz $$1) {
      List<cfj> $$2 = $$0.a(
         cfj.class, new evn((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cfj $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return cpv.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      dpi $$4 = $$1.c_($$2);
      if ($$4 instanceof dpp) {
         ((dpp)$$4).l();
      }
   }
}
