import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvl extends dmd implements dqd {
   public static final MapCodec<dvl> a = b(dvl::new);
   public static final ebr<ece> b = ebj.bF;

   public dvl(eas.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzl($$0, $$1);
   }

   @Override
   public eat a(ddg $$0) {
      dbn $$1 = $$0.n().a(kk.aq);
      eat $$2 = this.m();
      if ($$1 != null) {
         ece $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1.c_($$2) instanceof dzl $$6) {
         if (!$$3.gF()) {
            return bug.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return bug.a;
         }
      } else {
         return bug.e;
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      dzl $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      dzl $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != ece.a) {
            boolean $$7 = $$1.D($$2);
            boolean $$8 = $$6.c();
            if ($$7 && !$$8) {
               $$6.a(true);
               $$6.j();
            } else if (!$$7 && $$8) {
               $$6.a(false);
            }
         }
      }
   }

   @Nullable
   private static dzl a(djm $$0, iv $$1) {
      if ($$0 instanceof arq $$2) {
         dxr var4 = $$2.c_($$1);
         if (var4 instanceof dzl) {
            return (dzl)var4;
         }
      }

      return null;
   }

   @Override
   public int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      if ($$0.c(b) != ece.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof dzl $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      czn $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static czn a(czn $$0, ece $$1) {
      $$0.b(kk.aq, $$0.a(kk.aq, dbn.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<dvl> a() {
      return a;
   }
}
