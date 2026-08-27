import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnm extends cmc {
   private static final Map<blj<? extends blx>, cnm> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final blj<?> d;

   public cnm(blj<? extends blx> $$0, int $$1, int $$2, cmc.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      if (!($$1 instanceof amp)) {
         return bjl.a;
      } else {
         cmh $$2 = $$0.n();
         hv $$3 = $$0.a();
         ia $$4 = $$0.k();
         dip $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof ctq $$6) {
            blj<?> $$7 = this.a($$2.v());
            $$6.a($$7, $$1.F_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dmz.c, $$3);
            $$2.h(1);
            return bjl.b;
         } else {
            hv $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            blj<?> $$10 = this.a($$2.v());
            if ($$10.a((amp)$$1, $$2, $$0.o(), $$8, blz.m, true, !Objects.equals($$3, $$8) && $$4 == ia.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dmz.t, $$3);
            }

            return bjl.b;
         }
      }
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      ekx $$4 = a($$0, $$1, csh.b.b);
      if ($$4.c() != ekz.a.b) {
         return bjm.c($$3);
      } else if (!($$0 instanceof amp)) {
         return bjm.a($$3);
      } else {
         hv $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dao)) {
            return bjm.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            blj<?> $$7 = this.a($$3.v());
            blf $$8 = $$7.a((amp)$$0, $$3, $$1, $$6, blz.m, false, false);
            if ($$8 == null) {
               return bjm.c($$3);
            } else {
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(arm.c.b(this));
               $$0.a($$1, dmz.t, $$8.dk());
               return bjm.b($$3);
            }
         } else {
            return bjm.d($$3);
         }
      }
   }

   public boolean a(@Nullable sj $$0, blj<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cnm a(@Nullable blj<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cnm> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public blj<?> a(@Nullable sj $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         sj $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return blj.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public chb m() {
      return this.d.m();
   }

   public Optional<blx> a(cer $$0, blx $$1, blj<? extends blx> $$2, amp $$3, elb $$4, cmh $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         blx $$6;
         if ($$1 instanceof bla) {
            $$6 = ((bla)$$1).a($$3, (bla)$$1);
         } else {
            $$6 = $$2.a((csy)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.o_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               if ($$5.A()) {
                  $$6.b($$5.y());
               }

               if (!$$0.fT().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
