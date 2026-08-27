import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqi extends coy {
   private static final Map<bnw<? extends bok>, cqi> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bnw<?> d;

   public cqi(bnw<? extends bok> $$0, int $$1, int $$2, coy.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      if (!($$1 instanceof aow)) {
         return blw.a;
      } else {
         cpd $$2 = $$0.n();
         hz $$3 = $$0.a();
         ie $$4 = $$0.k();
         dlj $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof cwj $$6) {
            bnw<?> $$7 = this.a($$2.w());
            $$6.a($$7, $$1.F_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dpw.c, $$3);
            $$2.h(1);
            return blw.b;
         } else {
            hz $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bnw<?> $$10 = this.a($$2.w());
            if ($$10.a((aow)$$1, $$2, $$0.o(), $$8, bom.m, true, !Objects.equals($$3, $$8) && $$4 == ie.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dpw.t, $$3);
            }

            return blw.b;
         }
      }
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      env $$4 = a($$0, $$1, cva.b.b);
      if ($$4.c() != enx.a.b) {
         return blx.c($$3);
      } else if (!($$0 instanceof aow)) {
         return blx.a($$3);
      } else {
         hz $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof ddh)) {
            return blx.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bnw<?> $$7 = this.a($$3.w());
            bnq $$8 = $$7.a((aow)$$0, $$3, $$1, $$6, bom.m, false, false);
            if ($$8 == null) {
               return blx.c($$3);
            } else {
               if (!$$1.fU().d) {
                  $$3.h(1);
               }

               $$1.b(atv.c.b(this));
               $$0.a($$1, dpw.t, $$8.dk());
               return blx.b($$3);
            }
         } else {
            return blx.d($$3);
         }
      }
   }

   public boolean a(@Nullable sw $$0, bnw<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cqi a(@Nullable bnw<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cqi> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bnw<?> a(@Nullable sw $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         sw $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bnw.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cjw m() {
      return this.d.m();
   }

   public Optional<bok> a(chl $$0, bok $$1, bnw<? extends bok> $$2, aow $$3, enz $$4, cpd $$5) {
      if (!this.a($$5.w(), $$2)) {
         return Optional.empty();
      } else {
         bok $$6;
         if ($$1 instanceof bnl) {
            $$6 = ((bnl)$$1).a($$3, (bnl)$$1);
         } else {
            $$6 = $$2.a((cvr)$$3);
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
               if ($$5.B()) {
                  $$6.b($$5.z());
               }

               if (!$$0.fU().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
