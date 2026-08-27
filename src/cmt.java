import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmt extends clj {
   private static final Map<bkz<? extends bln>, cmt> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bkz<?> d;

   public cmt(bkz<? extends bln> $$0, int $$1, int $$2, clj.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      if (!($$1 instanceof ami)) {
         return bjb.a;
      } else {
         clo $$2 = $$0.n();
         hx $$3 = $$0.a();
         ib $$4 = $$0.k();
         dhn $$5 = $$1.a_($$3);
         if ($$5.a(cvh.ct)) {
            dfi $$6 = $$1.c_($$3);
            if ($$6 instanceof dgv $$7) {
               bkz<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.F_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), dlx.c, $$3);
               $$2.h(1);
               return bjb.b;
            }
         }

         hx $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         bkz<?> $$11 = this.a($$2.v());
         if ($$11.a((ami)$$1, $$2, $$0.o(), $$9, blp.m, true, !Objects.equals($$3, $$9) && $$4 == ib.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), dlx.t, $$3);
         }

         return bjb.b;
      }
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      ejv $$4 = a($$0, $$1, cro.b.b);
      if ($$4.c() != ejx.a.b) {
         return bjc.c($$3);
      } else if (!($$0 instanceof ami)) {
         return bjc.a($$3);
      } else {
         hx $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof czu)) {
            return bjc.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bkz<?> $$7 = this.a($$3.v());
            bkv $$8 = $$7.a((ami)$$0, $$3, $$1, $$6, blp.m, false, false);
            if ($$8 == null) {
               return bjc.c($$3);
            } else {
               if (!$$1.fU().d) {
                  $$3.h(1);
               }

               $$1.b(arf.c.b(this));
               $$0.a($$1, dlx.t, $$8.dl());
               return bjc.b($$3);
            }
         } else {
            return bjc.d($$3);
         }
      }
   }

   public boolean a(@Nullable sd $$0, bkz<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cmt a(@Nullable bkz<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cmt> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bkz<?> a(@Nullable sd $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         sd $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bkz.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cgi m() {
      return this.d.m();
   }

   public Optional<bln> a(cdz $$0, bln $$1, bkz<? extends bln> $$2, ami $$3, ejz $$4, clo $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bln $$6;
         if ($$1 instanceof bkq) {
            $$6 = ((bkq)$$1).a($$3, (bkq)$$1);
         } else {
            $$6 = $$2.a((csf)$$3);
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

               if (!$$0.fU().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
