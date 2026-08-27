import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class coc extends cms {
   private static final Map<bly<? extends bmm>, coc> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bly<?> d;

   public coc(bly<? extends bmm> $$0, int $$1, int $$2, cms.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      if (!($$1 instanceof and)) {
         return bka.a;
      } else {
         cmx $$2 = $$0.n();
         hx $$3 = $$0.a();
         ic $$4 = $$0.k();
         djg $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof cug $$6) {
            bly<?> $$7 = this.a($$2.v());
            $$6.a($$7, $$1.F_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dnq.c, $$3);
            $$2.h(1);
            return bka.b;
         } else {
            hx $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bly<?> $$10 = this.a($$2.v());
            if ($$10.a((and)$$1, $$2, $$0.o(), $$8, bmo.m, true, !Objects.equals($$3, $$8) && $$4 == ic.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dnq.t, $$3);
            }

            return bka.b;
         }
      }
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      elo $$4 = a($$0, $$1, csx.b.b);
      if ($$4.c() != elq.a.b) {
         return bkb.c($$3);
      } else if (!($$0 instanceof and)) {
         return bkb.a($$3);
      } else {
         hx $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dbe)) {
            return bkb.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bly<?> $$7 = this.a($$3.v());
            blu $$8 = $$7.a((and)$$0, $$3, $$1, $$6, bmo.m, false, false);
            if ($$8 == null) {
               return bkb.c($$3);
            } else {
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(asb.c.b(this));
               $$0.a($$1, dnq.t, $$8.dk());
               return bkb.b($$3);
            }
         } else {
            return bkb.d($$3);
         }
      }
   }

   public boolean a(@Nullable sn $$0, bly<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static coc a(@Nullable bly<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<coc> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bly<?> a(@Nullable sn $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         sn $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bly.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public chr m() {
      return this.d.m();
   }

   public Optional<bmm> a(cfh $$0, bmm $$1, bly<? extends bmm> $$2, and $$3, els $$4, cmx $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bmm $$6;
         if ($$1 instanceof blp) {
            $$6 = ((blp)$$1).a($$3, (blp)$$1);
         } else {
            $$6 = $$2.a((cto)$$3);
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
