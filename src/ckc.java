import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckc extends cis {
   private static final Map<bim<? extends bja>, ckc> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bim<?> d;

   public ckc(bim<? extends bja> $$0, int $$1, int $$2, cis.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      if (!($$1 instanceof akk)) {
         return bgq.a;
      } else {
         cix $$2 = $$0.n();
         gu $$3 = $$0.a();
         ha $$4 = $$0.k();
         dez $$5 = $$1.a_($$3);
         if ($$5.a(csm.ct)) {
            dcl $$6 = $$1.c_($$3);
            if ($$6 instanceof ddx $$7) {
               bim<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.y_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), djj.c, $$3);
               $$2.h(1);
               return bgq.b;
            }
         }

         gu $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         bim<?> $$11 = this.a($$2.v());
         if ($$11.a((akk)$$1, $$2, $$0.o(), $$9, bjc.m, true, !Objects.equals($$3, $$9) && $$4 == ha.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), djj.t, $$3);
         }

         return bgq.b;
      }
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      egz $$4 = a($$0, $$1, cou.b.b);
      if ($$4.c() != ehb.a.b) {
         return bgr.c($$3);
      } else if (!($$0 instanceof akk)) {
         return bgr.a($$3);
      } else {
         gu $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof cwy)) {
            return bgr.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bim<?> $$7 = this.a($$3.v());
            bii $$8 = $$7.a((akk)$$0, $$3, $$1, $$6, bjc.m, false, false);
            if ($$8 == null) {
               return bgr.c($$3);
            } else {
               if (!$$1.fR().d) {
                  $$3.h(1);
               }

               $$1.b(apg.c.b(this));
               $$0.a($$1, djj.t, $$8.di());
               return bgr.b($$3);
            }
         } else {
            return bgr.d($$3);
         }
      }
   }

   public boolean a(@Nullable qr $$0, bim<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static ckc a(@Nullable bim<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<ckc> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bim<?> a(@Nullable qr $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         qr $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bim.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cdu m() {
      return this.d.m();
   }

   public Optional<bja> a(cbm $$0, bja $$1, bim<? extends bja> $$2, akk $$3, ehd $$4, cix $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bja $$6;
         if ($$1 instanceof bid) {
            $$6 = ((bid)$$1).a($$3, (bid)$$1);
         } else {
            $$6 = $$2.a((cpl)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.i_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               if ($$5.A()) {
                  $$6.b($$5.y());
               }

               if (!$$0.fR().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
