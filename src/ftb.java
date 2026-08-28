import java.util.List;
import javax.annotation.Nullable;

public abstract class ftb<E extends ftb.a<E>> extends fsp<E> {
   public ftb(fpo $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ftb(fpo $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fse a(fwy $$0) {
      if (this.t() == 0) {
         return null;
      } else if (!($$0 instanceof fwy.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.r();
         if ($$1.b().a() == fwz.a && $$2 != null) {
            return fse.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fxa $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aE_().indexOf($$2.aI_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fxa.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fxa.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fse $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aE_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fse.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fus $$0) {
      if (this.r() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public fwq.a w() {
      return this.aJ_() ? fwq.a.c : super.w();
   }

   @Override
   protected boolean c(int $$0) {
      return false;
   }

   @Override
   public void a(fws $$0) {
      E $$1 = this.x();
      if ($$1 != null) {
         $$1.a($$0.a());
         this.a($$0, $$1);
      } else {
         E $$2 = this.r();
         if ($$2 != null) {
            $$2.a($$0.a());
            this.a($$0, $$2);
         }
      }

      $$0.a(fwr.d, wy.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends ftb.a<E>> extends fsp.a<E> implements fur {
      @Nullable
      private fus a;
      @Nullable
      private fwq b;
      private boolean c;

      @Override
      public boolean aH_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fur.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fus $$0) {
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
      public fus aI_() {
         return this.a;
      }

      @Nullable
      public fse a(fwy $$0, int $$1) {
         if (this.aE_().isEmpty()) {
            return null;
         } else {
            fse $$2 = this.aE_().get(Math.min($$1, this.aE_().size() - 1)).a($$0);
            return fse.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fse a(fwy $$0) {
         if ($$0 instanceof fwy.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = azm.a($$2 + this.aE_().indexOf(this.aI_()), 0, this.aE_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aE_().size(); $$4 += $$2) {
               fus $$5 = this.aE_().get($$4);
               fse $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fse.a(this, $$6);
               }
            }
         }

         return fur.super.a($$0);
      }

      public abstract List<? extends fwq> b();

      void a(fws $$0) {
         List<? extends fwq> $$1 = this.b();
         fyn.b $$2 = fyn.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fwr.b, wy.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fwq.a.c) {
                  $$0.a(fwr.d, wy.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
