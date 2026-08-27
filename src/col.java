import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class col extends cnb {
   private static final Map<bmc<? extends bmq>, col> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bmc<?> d;

   public col(bmc<? extends bmq> $$0, int $$1, int $$2, cnb.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      if (!($$1 instanceof ane)) {
         return bkc.a;
      } else {
         cng $$2 = $$0.n();
         hx $$3 = $$0.a();
         ic $$4 = $$0.k();
         djp $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof cup $$6) {
            bmc<?> $$7 = this.a($$2.v());
            $$6.a($$7, $$1.F_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dnz.c, $$3);
            $$2.h(1);
            return bkc.b;
         } else {
            hx $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bmc<?> $$10 = this.a($$2.v());
            if ($$10.a((ane)$$1, $$2, $$0.o(), $$8, bms.m, true, !Objects.equals($$3, $$8) && $$4 == ic.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dnz.t, $$3);
            }

            return bkc.b;
         }
      }
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      ely $$4 = a($$0, $$1, ctg.b.b);
      if ($$4.c() != ema.a.b) {
         return bkd.c($$3);
      } else if (!($$0 instanceof ane)) {
         return bkd.a($$3);
      } else {
         hx $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dbn)) {
            return bkd.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bmc<?> $$7 = this.a($$3.v());
            blw $$8 = $$7.a((ane)$$0, $$3, $$1, $$6, bms.m, false, false);
            if ($$8 == null) {
               return bkd.c($$3);
            } else {
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(asd.c.b(this));
               $$0.a($$1, dnz.t, $$8.dj());
               return bkd.b($$3);
            }
         } else {
            return bkd.d($$3);
         }
      }
   }

   public boolean a(@Nullable so $$0, bmc<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static col a(@Nullable bmc<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<col> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bmc<?> a(@Nullable so $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         so $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bmc.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cia m() {
      return this.d.m();
   }

   public Optional<bmq> a(cfq $$0, bmq $$1, bmc<? extends bmq> $$2, ane $$3, emc $$4, cng $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bmq $$6;
         if ($$1 instanceof blr) {
            $$6 = ((blr)$$1).a($$3, (blr)$$1);
         } else {
            $$6 = $$2.a((ctx)$$3);
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
