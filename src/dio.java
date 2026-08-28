import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dio extends dgh {
   public static final MapCodec<dio> a = b(dio::new);
   public static final dur b = duq.bx;
   public static final dur c = duq.A;
   private static final duy<jl> d = duq.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final czu g = new czu(10);
   private static final int h = 17;

   public dio(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(d, jl.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dio> a() {
      return a;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return $$1.c_($$2) instanceof drs $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dre $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0.B ? null : a($$2, drg.P, drs::a);
   }

   private void a(@Nullable dre $$0, boolean $$1) {
      if ($$0 instanceof drs $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dre a(je $$0, dua $$1) {
      drs $$2 = new drs($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dua a(cyw $$0) {
      jj $$1 = $$0.d().g();

      jj $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jj.b;
      };
      return this.o().b(d, jl.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, buf $$3, cvl $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      brg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof drs $$5) {
         $$3.a($$5);
      }

      return brk.a;
   }

   protected void a(dua $$0, arg $$1, je $$2) {
      if ($$1.c_($$2) instanceof drs $$3) {
         czi var11 = $$3.aE_();
         Optional<czv<czj>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            czv<czj> $$7 = $$6.get();
            cvl $$8 = $$7.b().a(var11, $$1.F_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cvl $$9 : $$7.b().a(var11)) {
                  if (!$$9.f()) {
                     this.a($$1, $$2, $$3, $$9, $$0, $$7);
                  }
               }

               $$3.f().forEach($$0x -> {
                  if (!$$0x.f()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<czv<czj>> a(dds $$0, czi $$1) {
      return g.a($$0, $$1);
   }

   private void a(arg $$0, je $$1, drs $$2, cvl $$3, dua $$4, czv<czj> $$5) {
      jj $$6 = $$4.c(d).a();
      brd $$7 = dsf.a($$0, $$1.a($$6));
      cvl $$8 = $$3.u();
      if ($$7 != null && ($$7 instanceof drs || $$3.J() > $$7.f_($$3))) {
         while (!$$8.f()) {
            cvl $$9 = $$8.c(1);
            cvl $$10 = dsf.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.J();
            $$8 = dsf.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.J()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         eye $$12 = eye.b($$1);
         eye $$13 = $$12.a($$6, 0.7);
         kx.a($$0, $$8, 6, $$6, $$13);

         for (arh $$14 : $$0.a(arh.class, exz.a($$12, 17.0, 17.0, 17.0))) {
            an.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(d, c, b);
   }
}
