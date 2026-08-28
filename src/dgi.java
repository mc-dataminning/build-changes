import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgi extends ddz<dpu> implements dmg {
   public static final MapCodec<dgi> b = b($$0 -> new dgi($$0, () -> dpp.b));
   public static final dtb c = djb.aE;
   public static final dtf<dsz> d = dsx.bc;
   public static final dsy e = dsx.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ews i = dff.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ews j = dff.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ews k = dff.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ews l = dff.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ews m = dff.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dhm.b<dpu, Optional<bpw>> n = new dhm.b<dpu, Optional<bpw>>() {
      public Optional<bpw> a(dpu $$0, dpu $$1) {
         return Optional.of(new bpv($$0, $$1));
      }

      public Optional<bpw> a(dpu $$0) {
         return Optional.of($$0);
      }

      public Optional<bpw> a() {
         return Optional.empty();
      }
   };
   private static final dhm.b<dpu, Optional<bqh>> o = new dhm.b<dpu, Optional<bqh>>() {
      public Optional<bqh> a(final dpu $$0, final dpu $$1) {
         final bpw $$2 = new bpv($$0, $$1);
         return Optional.of(new bqh() {
            @Nullable
            @Override
            public cpe createMenu(int $$0x, cmg $$1x, cmh $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cpm.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wu O_() {
               if ($$0.ag()) {
                  return $$0.O_();
               } else {
                  return (wu)($$1.ag() ? $$1.O_() : wu.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bqh> a(dpu $$0) {
         return Optional.of($$0);
      }

      public Optional<bqh> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dgi> a() {
      return b;
   }

   protected dgi(dsg.d $$0, Supplier<dpp<? extends dpu>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, jf.c).a(d, dsz.a).a(e, Boolean.valueOf(false)));
   }

   public static dhm.a g(dsh $$0) {
      dsz $$1 = $$0.c(d);
      if ($$1 == dsz.a) {
         return dhm.a.a;
      } else {
         return $$1 == dsz.c ? dhm.a.b : dhm.a.c;
      }
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.b;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dsz $$6 = $$2.c(d);
         if ($$0.c(d) == dsz.a && $$6 != dsz.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dsz.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      if ($$0.c(d) == dsz.a) {
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

   public static jf h(dsh $$0) {
      jf $$1 = $$0.c(c);
      return $$0.c(d) == dsz.b ? $$1.h() : $$1.i();
   }

   @Override
   public dsh a(cxk $$0) {
      dsz $$1 = dsz.a;
      jf $$2 = $$0.g().g();
      eob $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jf $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jf $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dsz.c : dsz.b;
         }
      }

      if ($$1 == dsz.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dsz.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dsz.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eoc.c));
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(e) ? eoc.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jf a(cxk $$0, jf $$1) {
      dsh $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dsz.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      bpz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         bqh $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cky.a($$3, true);
         }

         return bqd.c;
      }
   }

   protected avm<akk> c() {
      return avp.i.b(avp.ao);
   }

   public dpp<? extends dpu> d() {
      return this.a.get();
   }

   @Nullable
   public static bpw a(dgi $$0, dsh $$1, dcd $$2, ja $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dhm.c<? extends dpu> a(dsh $$0, dcd $$1, ja $$2, boolean $$3) {
      BiPredicate<dce, ja> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dgi::a;
      }

      return dhm.a(this.a.get(), dgi::g, dgi::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dhm.b<dpu, Float2FloatFunction> a(final dqq $$0) {
      return new dhm.b<dpu, Float2FloatFunction>() {
         public Float2FloatFunction a(dpu $$0x, dpu $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dpu $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$0.B ? a($$2, this.d(), dpu::a) : null;
   }

   public static boolean a(dce $$0, ja $$1) {
      return a((dbj)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dbj $$0, ja $$1) {
      ja $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dce $$0, ja $$1) {
      List<cer> $$2 = $$0.a(
         cer.class, new evu((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cer $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return cpe.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      dpn $$4 = $$1.c_($$2);
      if ($$4 instanceof dpu) {
         ((dpu)$$4).l();
      }
   }
}
