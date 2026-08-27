import java.util.List;
import javax.annotation.Nullable;

public abstract class fgg<E extends fgg.a<E>> extends ffv<E> {
   public fgg(feb $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ffk a(fkc $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof fkc.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == fkd.a && $$2 != null) {
            return ffk.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fke $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aF_().indexOf($$2.aI_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fke.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fke.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            ffk $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aF_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return ffk.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fhw $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public fju.a t() {
      return this.aJ_() ? fju.a.c : super.t();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fjw $$0) {
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

      $$0.a(fjv.d, wx.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fgg.a<E>> extends ffv.a<E> implements fhv {
      @Nullable
      private fhw a;
      @Nullable
      private fju b;
      private boolean c;

      @Override
      public boolean aH_() {
         return this.c;
      }

      @Override
      public void b(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fhv.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fhw $$0) {
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
      public fhw aI_() {
         return this.a;
      }

      @Nullable
      public ffk a(fkc $$0, int $$1) {
         if (this.aF_().isEmpty()) {
            return null;
         } else {
            ffk $$2 = this.aF_().get(Math.min($$1, this.aF_().size() - 1)).a($$0);
            return ffk.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public ffk a(fkc $$0) {
         if ($$0 instanceof fkc.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ayf.a($$2 + this.aF_().indexOf(this.aI_()), 0, this.aF_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aF_().size(); $$4 += $$2) {
               fhw $$5 = this.aF_().get($$4);
               ffk $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return ffk.a(this, $$6);
               }
            }
         }

         return fhv.super.a($$0);
      }

      public abstract List<? extends fju> b();

      void a(fjw $$0) {
         List<? extends fju> $$1 = this.b();
         flz.b $$2 = flz.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fjv.b, wx.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fju.a.c) {
                  $$0.a(fjv.d, wx.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
