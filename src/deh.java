import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class deh extends dby<dnt> implements dkf {
   public static final MapCodec<deh> b = b($$0 -> new deh($$0, () -> dno.b));
   public static final drb c = dha.aE;
   public static final drf<dqz> d = dqx.bc;
   public static final dqy e = dqx.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eui i = dde.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eui j = dde.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eui k = dde.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eui l = dde.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eui m = dde.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dfl.b<dnt, Optional<bpf>> n = new dfl.b<dnt, Optional<bpf>>() {
      public Optional<bpf> a(dnt $$0, dnt $$1) {
         return Optional.of(new bpe($$0, $$1));
      }

      public Optional<bpf> a(dnt $$0) {
         return Optional.of($$0);
      }

      public Optional<bpf> a() {
         return Optional.empty();
      }
   };
   private static final dfl.b<dnt, Optional<bpq>> o = new dfl.b<dnt, Optional<bpq>>() {
      public Optional<bpq> a(final dnt $$0, final dnt $$1) {
         final bpf $$2 = new bpe($$0, $$1);
         return Optional.of(new bpq() {
            @Nullable
            @Override
            public cod createMenu(int $$0x, clg $$1x, clh $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cok.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wu O_() {
               if ($$0.ae()) {
                  return $$0.O_();
               } else {
                  return (wu)($$1.ae() ? $$1.O_() : wu.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bpq> a(dnt $$0) {
         return Optional.of($$0);
      }

      public Optional<bpq> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends deh> a() {
      return b;
   }

   protected deh(dqg.d $$0, Supplier<dno<? extends dnt>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, is.c).a(d, dqz.a).a(e, Boolean.valueOf(false)));
   }

   public static dfl.a g(dqh $$0) {
      dqz $$1 = $$0.c(d);
      if ($$1 == dqz.a) {
         return dfl.a.a;
      } else {
         return $$1 == dqz.c ? dfl.a.b : dfl.a.c;
      }
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.b;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dqz $$6 = $$2.c(d);
         if ($$0.c(d) == dqz.a && $$6 != dqz.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dqz.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      if ($$0.c(d) == dqz.a) {
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

   public static is h(dqh $$0) {
      is $$1 = $$0.c(c);
      return $$0.c(d) == dqz.b ? $$1.h() : $$1.i();
   }

   @Override
   public dqh a(cwi $$0) {
      dqz $$1 = dqz.a;
      is $$2 = $$0.g().g();
      ema $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      is $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         is $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dqz.c : dqz.b;
         }
      }

      if ($$1 == dqz.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dqz.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dqz.c;
         }
      }

      return this.n().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == emb.c));
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(e) ? emb.c.a(false) : super.b_($$0);
   }

   @Nullable
   private is a(cwi $$0, is $$1) {
      dqh $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dqz.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      bpi.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         bpq $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cjy.a($$3, true);
         }

         return bpm.b;
      }
   }

   protected avj<akh> c() {
      return avm.i.b(avm.ao);
   }

   public dno<? extends dnt> d() {
      return this.a.get();
   }

   @Nullable
   public static bpf a(deh $$0, dqh $$1, dad $$2, in $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dfl.c<? extends dnt> a(dqh $$0, dad $$1, in $$2, boolean $$3) {
      BiPredicate<dae, in> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = deh::a;
      }

      return dfl.a(this.a.get(), deh::g, deh::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dfl.b<dnt, Float2FloatFunction> a(final dop $$0) {
      return new dfl.b<dnt, Float2FloatFunction>() {
         public Float2FloatFunction a(dnt $$0x, dnt $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dnt $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$0.B ? a($$2, this.d(), dnt::a) : null;
   }

   public static boolean a(dae $$0, in $$1) {
      return a((czj)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(czj $$0, in $$1) {
      in $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dae $$0, in $$1) {
      List<cds> $$2 = $$0.a(
         cds.class, new etk((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cds $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return cod.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      dnm $$4 = $$1.c_($$2);
      if ($$4 instanceof dnt) {
         ((dnt)$$4).l();
      }
   }
}
