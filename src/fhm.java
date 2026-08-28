import java.util.List;
import javax.annotation.Nullable;

public abstract class fhm<E extends fhm.a<E>> extends fhb<E> {
   public fhm(ffh $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fgq a(fli $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof fli.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == flj.a && $$2 != null) {
            return fgq.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            flk $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aD_().indexOf($$2.aG_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = flk.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = flk.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fgq $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aD_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fgq.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fjc $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public fla.a t() {
      return this.aH_() ? fla.a.c : super.t();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(flc $$0) {
      E $$1 = this.u();
      if ($$1 != null) {
         $$1.a($$0.a());
         this.a($$0, $$1);
      } else {
         E $$2 = this.j();
         if ($$2 != null) {
            $$2.a($$0.a());
            this.a($$0, $$2);
         }
      }

      $$0.a(flb.d, xp.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fhm.a<E>> extends fhb.a<E> implements fjb {
      @Nullable
      private fjc a;
      @Nullable
      private fla b;
      private boolean c;

      @Override
      public boolean aF_() {
         return this.c;
      }

      @Override
      public void b(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fjb.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fjc $$0) {
         if (this.a != null) {
            this.a.a(false);
         }

         if ($$0 != null) {
            $$0.a(true);
         }

         this.a = $$0;
      }

      @Nullable
      @Override
      public fjc aG_() {
         return this.a;
      }

      @Nullable
      public fgq a(fli $$0, int $$1) {
         if (this.aD_().isEmpty()) {
            return null;
         } else {
            fgq $$2 = this.aD_().get(Math.min($$1, this.aD_().size() - 1)).a($$0);
            return fgq.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fgq a(fli $$0) {
         if ($$0 instanceof fli.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ayz.a($$2 + this.aD_().indexOf(this.aG_()), 0, this.aD_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aD_().size(); $$4 += $$2) {
               fjc $$5 = this.aD_().get($$4);
               fgq $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fgq.a(this, $$6);
               }
            }
         }

         return fjb.super.a($$0);
      }

      public abstract List<? extends fla> b();

      void a(flc $$0) {
         List<? extends fla> $$1 = this.b();
         fnf.b $$2 = fnf.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(flb.b, xp.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fla.a.c) {
                  $$0.a(flb.d, xp.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
