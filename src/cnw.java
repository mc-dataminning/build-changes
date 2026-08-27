import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnw extends cmm {
   private static final Map<blt<? extends bmh>, cnw> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final blt<?> d;

   public cnw(blt<? extends bmh> $$0, int $$1, int $$2, cmm.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      if (!($$1 instanceof amz)) {
         return bjv.a;
      } else {
         cmr $$2 = $$0.n();
         hx $$3 = $$0.a();
         ic $$4 = $$0.k();
         dja $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof cua $$6) {
            blt<?> $$7 = this.a($$2.v());
            $$6.a($$7, $$1.F_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dnk.c, $$3);
            $$2.h(1);
            return bjv.b;
         } else {
            hx $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            blt<?> $$10 = this.a($$2.v());
            if ($$10.a((amz)$$1, $$2, $$0.o(), $$8, bmj.m, true, !Objects.equals($$3, $$8) && $$4 == ic.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dnk.t, $$3);
            }

            return bjv.b;
         }
      }
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      eli $$4 = a($$0, $$1, csr.b.b);
      if ($$4.c() != elk.a.b) {
         return bjw.c($$3);
      } else if (!($$0 instanceof amz)) {
         return bjw.a($$3);
      } else {
         hx $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof day)) {
            return bjw.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            blt<?> $$7 = this.a($$3.v());
            blp $$8 = $$7.a((amz)$$0, $$3, $$1, $$6, bmj.m, false, false);
            if ($$8 == null) {
               return bjw.c($$3);
            } else {
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(arw.c.b(this));
               $$0.a($$1, dnk.t, $$8.dk());
               return bjw.b($$3);
            }
         } else {
            return bjw.d($$3);
         }
      }
   }

   public boolean a(@Nullable sl $$0, blt<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cnw a(@Nullable blt<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cnw> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public blt<?> a(@Nullable sl $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         sl $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return blt.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public chl m() {
      return this.d.m();
   }

   public Optional<bmh> a(cfb $$0, bmh $$1, blt<? extends bmh> $$2, amz $$3, elm $$4, cmr $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bmh $$6;
         if ($$1 instanceof blk) {
            $$6 = ((blk)$$1).a($$3, (blk)$$1);
         } else {
            $$6 = $$2.a((cti)$$3);
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
