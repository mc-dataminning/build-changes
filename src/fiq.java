import java.util.List;
import javax.annotation.Nullable;

public abstract class fiq<E extends fiq.a<E>> extends fif<E> {
   public fiq(fgm $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fhu a(fmm $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof fmm.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == fmn.a && $$2 != null) {
            return fhu.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fmo $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aK_().indexOf($$2.aN_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fmo.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fmo.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fhu $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aK_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fhu.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fkg $$0) {
      if (this.j() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public fme.a u() {
      return this.aO_() ? fme.a.c : super.u();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fmg $$0) {
      E $$1 = this.v();
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

      $$0.a(fmf.d, wz.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fiq.a<E>> extends fif.a<E> implements fkf {
      @Nullable
      private fkg a;
      @Nullable
      private fme b;
      private boolean c;

      @Override
      public boolean aM_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fkf.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fkg $$0) {
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
      public fkg aN_() {
         return this.a;
      }

      @Nullable
      public fhu a(fmm $$0, int $$1) {
         if (this.aK_().isEmpty()) {
            return null;
         } else {
            fhu $$2 = this.aK_().get(Math.min($$1, this.aK_().size() - 1)).a($$0);
            return fhu.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fhu a(fmm $$0) {
         if ($$0 instanceof fmm.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ayo.a($$2 + this.aK_().indexOf(this.aN_()), 0, this.aK_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aK_().size(); $$4 += $$2) {
               fkg $$5 = this.aK_().get($$4);
               fhu $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fhu.a(this, $$6);
               }
            }
         }

         return fkf.super.a($$0);
      }

      public abstract List<? extends fme> b();

      void a(fmg $$0) {
         List<? extends fme> $$1 = this.b();
         fob.b $$2 = fob.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fmf.b, wz.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fme.a.c) {
                  $$0.a(fmf.d, wz.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
