import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cod extends cmt {
   private static final Map<blz<? extends bmn>, cod> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final blz<?> d;

   public cod(blz<? extends bmn> $$0, int $$1, int $$2, cmt.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      if (!($$1 instanceof and)) {
         return bkb.a;
      } else {
         cmy $$2 = $$0.n();
         hx $$3 = $$0.a();
         ic $$4 = $$0.k();
         djh $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof cuh $$6) {
            blz<?> $$7 = this.a($$2.v());
            $$6.a($$7, $$1.F_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dnr.c, $$3);
            $$2.h(1);
            return bkb.b;
         } else {
            hx $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            blz<?> $$10 = this.a($$2.v());
            if ($$10.a((and)$$1, $$2, $$0.o(), $$8, bmp.m, true, !Objects.equals($$3, $$8) && $$4 == ic.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dnr.t, $$3);
            }

            return bkb.b;
         }
      }
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      elp $$4 = a($$0, $$1, csy.b.b);
      if ($$4.c() != elr.a.b) {
         return bkc.c($$3);
      } else if (!($$0 instanceof and)) {
         return bkc.a($$3);
      } else {
         hx $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dbf)) {
            return bkc.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            blz<?> $$7 = this.a($$3.v());
            blv $$8 = $$7.a((and)$$0, $$3, $$1, $$6, bmp.m, false, false);
            if ($$8 == null) {
               return bkc.c($$3);
            } else {
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(asc.c.b(this));
               $$0.a($$1, dnr.t, $$8.dk());
               return bkc.b($$3);
            }
         } else {
            return bkc.d($$3);
         }
      }
   }

   public boolean a(@Nullable sn $$0, blz<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cod a(@Nullable blz<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cod> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public blz<?> a(@Nullable sn $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         sn $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return blz.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public chs m() {
      return this.d.m();
   }

   public Optional<bmn> a(cfi $$0, bmn $$1, blz<? extends bmn> $$2, and $$3, elt $$4, cmy $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bmn $$6;
         if ($$1 instanceof blq) {
            $$6 = ((blq)$$1).a($$3, (blq)$$1);
         } else {
            $$6 = $$2.a((ctp)$$3);
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
