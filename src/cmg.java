import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmg extends ckw {
   private static final Map<bkm<? extends bla>, cmg> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bkm<?> d;

   public cmg(bkm<? extends bla> $$0, int $$1, int $$2, ckw.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      if (!($$1 instanceof ama)) {
         return biq.a;
      } else {
         clb $$2 = $$0.n();
         ht $$3 = $$0.a();
         hx $$4 = $$0.k();
         dgw $$5 = $$1.a_($$3);
         if ($$5.a(cuv.ct)) {
            der $$6 = $$1.c_($$3);
            if ($$6 instanceof dge $$7) {
               bkm<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.E_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), dlg.c, $$3);
               $$2.h(1);
               return biq.b;
            }
         }

         ht $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         bkm<?> $$11 = this.a($$2.v());
         if ($$11.a((ama)$$1, $$2, $$0.o(), $$9, blc.m, true, !Objects.equals($$3, $$9) && $$4 == hx.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), dlg.t, $$3);
         }

         return biq.b;
      }
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      eje $$4 = a($$0, $$1, crb.b.b);
      if ($$4.c() != ejg.a.b) {
         return bir.c($$3);
      } else if (!($$0 instanceof ama)) {
         return bir.a($$3);
      } else {
         ht $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof czi)) {
            return bir.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bkm<?> $$7 = this.a($$3.v());
            bki $$8 = $$7.a((ama)$$0, $$3, $$1, $$6, blc.m, false, false);
            if ($$8 == null) {
               return bir.c($$3);
            } else {
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(aqx.c.b(this));
               $$0.a($$1, dlg.t, $$8.dj());
               return bir.b($$3);
            }
         } else {
            return bir.d($$3);
         }
      }
   }

   public boolean a(@Nullable rz $$0, bkm<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cmg a(@Nullable bkm<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cmg> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bkm<?> a(@Nullable rz $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         rz $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bkm.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cfv m() {
      return this.d.m();
   }

   public Optional<bla> a(cdm $$0, bla $$1, bkm<? extends bla> $$2, ama $$3, eji $$4, clb $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bla $$6;
         if ($$1 instanceof bkd) {
            $$6 = ((bkd)$$1).a($$3, (bkd)$$1);
         } else {
            $$6 = $$2.a((crs)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.n_()) {
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
